Backbone.js + Java Wine Cellar Application
==========================================

Mavenized project of the original sample: https://github.com/ccoenraets/backbone-jax-cellar

The Wine Cellar application is documented here http://coenraets.org/blog/2012/01/backbone-js-lessons-learned-and-improved-sample-app/

This application provides an example of

1. Building a complete RESTful API in Java using JAX-RS and Jersey 2.
2. Consuming these services using Backbone.js client application

Set Up:

    Create a MySQL database name "cellar".

    Execute cellar.sql to create and populate the "wine" table:

    mysql cellar -uroot < cellar.sql

    Locate cellar.properties and make sure the JDBC connection string matches your database configuration

    Run the project using mvn jetty:run
