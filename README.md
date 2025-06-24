# Batch Processing Application

## Description

This application is designed to demonstrate batch processing using Spring Batch with a PostgreSQL database. The application leverages a Docker container to run PostgreSQL, and it initializes the database with necessary tables and data from a CSV file located in the `resources` directory. The application exposes an HTTP endpoint that can be used to trigger batch jobs.

## Prerequisites

- Docker installed on your machine
- Java Development Kit (JDK) installed
- Maven installed (for building the Spring application)

## Setup Instructions

Follow the steps below to run the application:

### 1. Start the PostgreSQL Docker Container

Run the following command to start a PostgreSQL container:

````bash
docker run --name postgres-container -e POSTGRES_USER=yourusername -e POSTGRES_PASSWORD=yourpassword -e POSTGRES_DB=batchDb -p 5432:5432 -d postgres




