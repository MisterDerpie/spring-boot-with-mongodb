# Spring Boot with MongoDB

This repository provides the sourcecode of my blog post [Spring Boot with MongoDB](https://misterderpie.com/posts/spring-boot-mongo-db/).

## Start MongoDB Instance

To run a MongoDB instance, you can use the script `start-mongodb.sh`.
It will be configured as in the blog post.
The container is named `mongodb`, in case you want to stop and delete it, run
```bash
docker container rm -f mongodb
```

## Start application

The application itself does not really do anything.
But to check that it is (not) booting when MongoDB is (not) there, you can try to run it

1. with started MongoDB
2. without started MongoDB.

```bash
./gradlew bootRun
```

## Start integration tests

```bash
./gradlew clean test --info
```