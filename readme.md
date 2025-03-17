# Spring Boot Demo

## Overview

Test spring boot capabilities with a game of client-server rock paper scissors.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Gradle

## Setup

1. Clone the repository:

    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. Ensure you have the required JDK installed. Set the `JAVA_HOME` environment variable to point to your JDK installation.

3. Verify Gradle is installed by running:

    ```sh
    gradle -v
    ```

    If Gradle is not installed, you can use the provided Gradle wrapper scripts (`gradlew` for Unix-based systems and `gradlew.bat` for Windows).

## Building the Project

To build the project, run:

```sh
./gradlew build
```

## Testing the Project

To run the project, run:

```sh
./gradlew bootRun
```

This will start a server instance on your machine at port `8080`.  
Ensure that no other processes are using the same port to avoid errors.  
  
Navigate to http://localhost:8080/ to view the client interface.