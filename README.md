# The Money Tree - Backend Api
The Money tree is a mobile application that allows users to see  and optimise their spending habits.

The app is designed for users to log in and upload a bank statement to the interface. The app breaks down their spend into the categories that they are spending in and tells them if they have reached their saving goal for the month.

## Structure

This repo contains the Backend application: 
* Controller - Manages REST interface and communicates with the mongoDB database.
* Model - Creates the desired data structure for data sent and received.
* Repository - Stores and retrieves a set of data.
* Services - Implements the logic of the application.

The backend application communicates with the frontend via HTTP requests, and need to be run separately.

## Getting Started

### Prerequisites:
If you haven't already, make sure you have a Java Development kit installed, so that you can run Java on your machine. 

This project has been build using Spring Initializer, built using Gradle-Groovy 

## Running the app
1. Run bootRun:
  `cd src`
  `./gradlew bootRun`
3. Enusre Mongodb is running:
  `mongod --dbpath {database name}`    


