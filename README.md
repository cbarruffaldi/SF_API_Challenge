# IBM CIC Challenge
This repository is meant for the code of an API for the San Francisco movie database corresponding of an IBM CIC Challenge.

## Database
For this exercise the following database was provided: https://data.sfgov.org/Culture-and-Recreation/Film-Locations-in-San-Francisco/yitu-d5am

## Exercise
The task is to implement a REST service server in Java. 
Service should suppor the JSON format and support a filter via an input parameter.

## Implementation
This REST service is implemented in Java using the spring boot framework and Maven to build.
As the given database for the movies filmed in San Francisco currently has it's own API for consulting the data, with the purpose of always having an up to date information for the movies it is implemented a Client API. For Client API I understand that my REST service will consult the given database via it's official API and work with that data.

This service only works with the film attributes : Title and Locations. This means this REST service will read and modify the external data during service.


## Running
To run the code
```bash
mvn spring-boot:run
```

The service will be hosted in 18.224.37.53 port 8083

## Usage
To get all the films in the data base: '/all'
To filter by title: '/film?title='

eg. 
```bash
http://18.224.37.53:8083/all
http://18.224.37.53:8083/film?title=180
``

