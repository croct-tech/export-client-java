<p align="center">
    <a href="https://croct.com">
        <img src="https://cdn.croct.io/brand/logo/repo-icon-green.svg" alt="Croct" height="80"/>
    </a>
    <br />
    <strong>Java Project Title</strong>
    <br />
    A brief description about the project.
</p>
<p align="center">
    <img alt="Language" src="https://img.shields.io/badge/language-Java-blue" />
    <img alt="Build" src="https://img.shields.io/badge/build-passing-green" />
    <img alt="Coverage" src="https://img.shields.io/badge/coverage-100%25-green" />
    <img alt="Maintainability" src="https://img.shields.io/badge/maintainability-100-green" />
    <img alt="License" src="https://img.shields.io/badge/license-proprietary-lightgrey" />
    <br />
    <br />
    <a href="https://github.com/croct-tech/project-java/releases">📦 Releases</a>
    ·
    <a href="https://github.com/croct-tech/project-java/issues">🐞 Report Bug</a>
    ·
    <a href="https://github.com/croct-tech/project-java/issues">✨ Request Feature</a>
</p>

# Instructions

Follow the steps below to create a new repository:

1. Customize the repository
   1. Click on the _Use this template_ button at the top of this page
   2. Clone the repository locally 
   3. Update the `README.md` and `pom.xml` with the new module information. Remember to update the `url` and `distributionManagement.repository.url` entries in the `pom.xml` with the actual name of the repository.
2. Setup Code Climate
   1. Add the project to [Croct's code climate organization](https://codeclimate.com/accounts/5e714648faaa9c00fb000081/dashboard)
   2. Go to **Repo Settings > Badges** and copy the maintainability and coverage badges to the `README.md` 
   3. Go to **Repo Settings > Test coverage** and copy the "_TEST REPORTER ID_"
   4. On the Github repository page, go to **Settings > Secrets** and add a secret with name `CODECLIMATE_TESTREPORTER_ID` and the ID from the previous step as value
3. Configure Apache Maven for use with GitHub Packages
   1. Copy `.gihub/settings.xml` to `~/.m2/settings.xml`
   2. Create a personal access token to authenticate with your username directly to GitHub Packages
         - Go to *GitHub > Settings > Developer Settings > Personal access tokens > Generate new token*
         - Generate a new token with `read:packages` scope
   3. Replace `${env.MAVEN_GITHUB_USER}` and `${env.MAVEN_GITHUB_TOKEN}` with your GitHub username and personal token, respectively

## Installation

We recommend using [Maven](https://maven.apache.org/) to install the module:

```xml
<dependencies>
    <dependency>
        <groupId>com.croct</groupId>
        <artifactId>project-java</artifactId>
        <version>${respository-template-java.version}</version>
    </dependency>
</dependencies>
```

## Basic usage

```java
import com.croct.project.Example;

final Example example = new Example();
example.displayBasicUsage();
```

## Contributing

Contributions to the module are always welcome! 

- Report any bugs or issues on the [issue tracker](https://github.com/croct-tech/project-java/issues).
- For major changes, please [open an issue](https://github.com/croct-tech/project-java/issues) first to discuss what you would like to change.
- Please make sure to update tests as appropriate.

## Testing

Before running the test suites, the development dependencies must be installed:

```sh
mvn clean install
```

Then, to run all tests:

```sh
mvn test
```

## Copyright Notice

Copyright © 2015-2020 Croct Limited, All Rights Reserved.

All information contained herein is, and remains the property of Croct Limited. The intellectual, design and technical concepts contained herein are proprietary to Croct Limited s and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law. Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from Croct Limited.
