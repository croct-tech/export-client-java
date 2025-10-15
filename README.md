<p align="center">
    <a href="https://croct.com">
        <img src="https://cdn.croct.io/brand/logo/repo-icon-green.svg" alt="Croct" height="80"/>
    </a>
    <br />
    <strong>Export API Java Client</strong>
    <br />
    Java client for the Croct Export API.
</p>

<p align="center">
    <a href="https://search.maven.org/artifact/com.croct.client/croct-export-client"><img alt="Version" src="https://img.shields.io/maven-central/v/com.croct.client/croct-export-client"/></a>
    <a href="https://github.com/croct-tech/export-client-java/actions/workflows/branch-validations.yaml"><img alt="Validations" src="https://github.com/croct-tech/export-client-java/actions/workflows/branch-validations.yaml/badge.svg"/></a>
    <br />
    <br />
    <a href="https://github.com/croct-tech/exporter-client-java/releases">📦 Releases</a>
    ·
    <a href="https://github.com/croct-tech/exporter-client-java/issues">🐞 Report Bug</a>
    ·
    <a href="https://github.com/croct-tech/exporter-client-java/issues">✨ Request Feature</a>
</p>

## Introduction

The Export API Client for Java is a high-level HTTP client for exporting events, sessions, and users from a Croct workspace.

## Getting Started

The following steps will walk you through installing the client and integrating it into your application.

### Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.croct.client</groupId>
  <artifactId>croct-export-client</artifactId>
  <version>0.3.1</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    compile "com.croct.client:croct-export-client:0.3.1"
}
```

### Usage

Now the library is installed, you need to initialize the client using the API key of the application you want to 
export data:

```java
final ApiClient client = new ApiClient();
client.setApiKey("00000000-0000-0000-0000-000000000000");

final ExportApi api = new ExportApi(client);
```

From this point, you are all set to export data using one of the [export methods](#api-reference). However, developers 
are usually interested in implementing a routine to export data periodically. If that is the case, there are two 
approaches you can take to fetch data incrementally, as you will find out in the following sections.

#### Incremental export

The following sections present different approaches for exporting data incrementally so you can choose the one that 
best suits your needs.

###### Stateful approach 

Every request to the Export API returns a cursor that you can use in subsequent requests to fetch the next 
batch of data. You can keep making calls until no data is left to export – at that point, you can store the cursor and 
resume the export later.

The following example illustrates how you can fetch data incrementally using cursors:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Event;
import com.croct.client.export.model.EventResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = loadCursor();

        // The maximum number of events per request
        final int pageSize = 100;

        // The maximum number of events to export
        int limit = 1000;

        while (limit >= pageSize) {
            final EventResponse response = api.exportEvents(null, null, pageSize, cursor, null);
            final List<Event> events = response.getItems();

            System.out.println(events);

            cursor = response.getNextCursor();
            limit = events.isEmpty() ? 0 : limit - events.size();
        }

        saveCursor(cursor);
    }

    private static String loadCursor() {
        // Read the previous cursor from a database, file, or somewhere else
    }

    private static void saveCursor(final String cursor) {
        // Write the current cursor to a database, file, or somewhere else
    }
}
```

By reusing the previous cursor on subsequent requests, you guarantee that no data is missed between exports. However, 
it requires some extra work to store the cursor between exports so that the next export can start from where the 
previous one left off.

###### Stateless approach

If storing cursors is not an option, you can alternatively fetch data based on a time interval. For example, you can 
set up a job to daily export data from the previous day:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Event;
import com.croct.client.export.model.EventResponse;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        final LocalDate today = LocalDate.now(ZoneOffset.UTC);
        final LocalDate yesterday = today.minusDays(1);
        final long start = today.atStartOfDay().toEpochSecond(ZoneOffset.UTC);
        final long end = yesterday.atStartOfDay().toEpochSecond(ZoneOffset.UTC);

        String cursor = null;
        boolean running = true;

        while (running) {
            final EventResponse response = api.exportEvents(start, end, 100, cursor, null);
            final List<Event> events = response.getItems();

            System.out.println(events);

            cursor = response.getNextCursor();
            running = !events.isEmpty();
        }
    }
}
```

The disadvantage of this approach is that there are no guarantees that the data relative to the specified time window 
have been processed by the time you make the subsequent request. Such cases can happen when events arrive late, 
recent data was not processed fast enough, or during maintenance windows.

#### Exporting Events

The `exportEvents` method exports events from the application associated with the API key, optionally filtered by type 
and a time window relative to the event timestamp.

The following example demonstrates how to export events of a particular type in batches of 100:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Event;
import com.croct.client.export.model.EventResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final EventResponse response = api.exportEvents(null, null, 100, cursor, null);
            final List<Event> events = response.getItems();

            System.out.println(events);

            cursor = response.getNextCursor();
            running = !events.isEmpty();
        }
    }
}
```

#### Exporting Sessions

The `exportSessions` method exports sessions from the application associated with the API key, optionally filtered by 
a time window relative to the session's close time.

The following example demonstrates how to export sessions in batches of 100: 

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Session;
import com.croct.client.export.model.SessionResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final SessionResponse response = api.exportSessions(null, null, 100, cursor);
            final List<Session> sessions = response.getItems();

            System.out.println(sessions);

            cursor = response.getNextCursor();
            running = !sessions.isEmpty();
        }
    }
}
```

#### Exporting Users

The `exportUsers` method exports users from the workspace associated with the API key, optionally filtered by 
a time window relative to the user's last modified time.

The following example demonstrates how to export sessions in batches of 100:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.User;
import com.croct.client.export.model.UserResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final UserResponse response = api.exportUsers(null, null, 100, cursor);
            final List<User> users = response.getItems();

            System.out.println(users);
            
            cursor = response.getNextCursor();
            running = !users.isEmpty();
        }
    }
}
```

## API Reference

This reference documents all the methods available in the Export API.

### constructor

The constructor initializes the Export API client with the API key to use for requests.

#### Signature

The constructor has the following signature:

```java
// ExportApi(Configuration.getDefaultApiClient())
public ExportApi();

public ExportApi(ApiClient apiClient);
```

#### Code Sample

Here's a minimal example showing how initialize the client:

```java
final ApiClient client = new ApiClient();
client.setApiKey("00000000-0000-0000-0000-000000000000");

final ExportApi api = new ExportApi(client);
```

### exportEvents

This method exports events from an application.

#### Signature

The `exportEvents` method has the following signature:

```java
public EventResponse exportEvents(Long start, Long end, Integer pageSize, String cursor, List<EventType> events) throws ApiException;
```

These are the currently supported options:

| Option     | Type        | Description
|------------|-------------|-----------------------------------------------------------------------------------------------------------------------------------------------
| `pageSize` | int32       | The maximum number of events to export per request, limited to 1000. By default, 100.
| `cursor`   | string      | The cursor from the previous request to use as a starting point for export. By default, it points to the initial page.
| `start`    | int64       | The start timestamp in seconds since epoch relative to the event timestamp, inclusive. By default, the start of the time window is unbounded.
| `end`      | int64       | The end timestamp in seconds since epoch relative to the event timestamp, exclusive. By default, the end of the time window is unbounded.
| `events`   | EventType[] | The types of events to export. By default, include all types listed bellow.

The list possible event types are:

| Event                  | Since Version |
|------------------------|---------------|
| `userSignedUp`         | 1.0.0         |
| `userSignedIn`         | 1.0.0         |
| `userSignedOut`        | 1.0.0         |
| `tabOpened`            | 1.0.0         |
| `tabUrlChanged`        | 1.0.0         |
| `tabVisibilityChanged` | 1.0.0         |
| `locationDetected`     | 1.0.0         |
| `clientDetected`       | 1.0.0         |
| `pageOpened`           | 1.0.0         |
| `pageLoaded`           | 1.0.0         |
| `productAbandoned`     | 1.0.0         |
| `productViewed`        | 1.0.0         |
| `cartAbandoned`        | 1.0.0         |
| `cartViewed`           | 1.0.0         |
| `cartModified`         | 1.0.0         |
| `checkoutStarted`      | 1.0.0         |
| `orderPlaced`          | 1.0.0         |
| `nothingChanged`       | 1.0.0         |
| `goalCompleted`        | 1.0.0         |
| `eventOccurred`        | 1.0.0         |
| `slotPersonalized`     | 1.1.0         |

#### Code Sample

Here's a full example showing how to export events:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Event;
import com.croct.client.export.model.EventResponse;
import com.croct.client.export.model.EventType;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final EventResponse response = api.exportEvents(
                1440990000L,
                1440990000L + 86_400,
                100,
                cursor,
                List.of(
                    EventType.PRODUCT_VIEWED,
                    EventType.CHECKOUT_STARTED,
                    EventType.ORDER_PLACED
                )
            );

            final List<Event> events = response.getItems();

            System.out.println(events);

            cursor = response.getNextCursor();
            running = !events.isEmpty();
        }
    }
}
```

### exportSessions

This method exports sessions from an application.

#### Signature

The `exportSessions` method has the following signature:

```java
public SessionResponse exportSessions(Long start, Long end, Integer pageSize, String cursor) throws ApiException;
```

These are the currently supported options:

| Option     | Type     | Description
|------------|----------|---------------------------------------------------------------------------------------------------------------------------------------------------
| `pageSize` | int32   | The maximum number of sessions to export per request, limited to 1000. By default, 100.
| `cursor`   | string   | The cursor from the previous request to use as a starting point for export. By default, it points to the initial page.
| `start`    | int64   | The start timestamp in seconds since epoch relative to the session's close time, inclusive. By default, the start of the time window is unbounded.
| `end`      | int64   | The end timestamp in seconds since epoch relative to the session's close time, exclusive. By default, the end of the time window is unbounded.

#### Code Sample

Here's a full example showing how to export sessions:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.Session;
import com.croct.client.export.model.SessionResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final SessionResponse response = api.exportSessions(
                1440990000L,
                1440990000L + 86_400,
                100,
                cursor
            );

            final List<Session> sessions = response.getItems();

            System.out.println(sessions);

            cursor = response.getNextCursor();
            running = !sessions.isEmpty();
        }
    }
}
```

### exportUsers

This method exports users from a workspace.

#### Signature

The `exportUsers` method has the following signature:

```java
public UserResponse exportUsers(Long start, Long end, Integer pageSize, String cursor) throws ApiException;
```

These are the currently supported options:

| Option     | Type    | Description
|------------|---------|--------------------------------------------------------------------------------------------------------------------------------------------------------
| `pageSize` | int32   | The maximum number of users to export per request, limited to 1000. By default, 100.
| `cursor`   | string  | The cursor from the previous request to use as a starting point for export. By default, it points to the initial page.
| `start`    | int64   | The start timestamp in seconds since epoch relative to the user's last modified time, inclusive. By default, the start of the time window is unbounded.
| `end`      | int64   | The end timestamp in seconds since epoch relative to the user's last modified time, exclusive. By default, the end of the time window is unbounded.

#### Code Sample

Here's a full example showing how to export sessions:

```java
package com.croct;

import com.croct.client.export.ApiClient;
import com.croct.client.export.ApiException;
import com.croct.client.export.api.ExportApi;
import com.croct.client.export.model.User;
import com.croct.client.export.model.UserResponse;
import java.util.List;

public class Example {
    public static void main(String[] args) throws ApiException {
        final ApiClient client = new ApiClient();
        client.setApiKey("00000000-0000-0000-0000-000000000000");

        final ExportApi api = new ExportApi(client);

        String cursor = null;
        boolean running = true;

        while (running) {
            final UserResponse response = api.exportUsers(
                1440990000L,
                1440990000L + 86_400,
                100,
                cursor
            );

            final List<User> users = response.getItems();

            System.out.println(users);

            cursor = response.getNextCursor();
            running = !users.isEmpty();
        }
    }
}
```

## Support

If this documentation has not answered all your questions, don't worry. 
Here are some alternative ways to get help from the Croct community.

### Stack Overflow

Someone else from the community may have already asked a similar question or may be able to help with your problem.

The Croct team will also monitor posts with the "croct" tag. If there aren't any existing questions that help,
please [ask a new one](https://stackoverflow.com/questions/ask?tags=croct%20export).

### GitHub

If you have what looks like a bug, or you would like to make a feature request, please
[open a new issue on GitHub](https://github.com/croct-tech/export-client-java/issues/new/choose).

Before you file an issue, a good practice is to search for issues to see whether others have the same or similar problems.
If you are unable to find an open issue addressing the problem, then feel free to open a new one.

### Slack Channel

Many people from the Croct community hang out on the Croct Slack Group.
Feel free to [join us and start a conversation](https://croct.link/community).

## License

This project is released under the [MIT License](LICENSE).
