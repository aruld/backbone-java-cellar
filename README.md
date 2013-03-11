Backbone.js + Java Wine Cellar Application
==========================================

Mavenized project of the original example developed by Christophe Coenraets https://github.com/ccoenraets/backbone-jax-cellar

The Wine Cellar application is documented here:
* http://coenraets.org/blog/2011/12/backbone-js-wine-cellar-tutorial-part-1-getting-started/
* http://coenraets.org/blog/2011/12/backbone-js-wine-cellar-tutorial-part-2-crud/
* http://coenraets.org/blog/2011/12/backbone-js-wine-cellar-tutorial-part-3-deep-linking-and-application-states/
* http://coenraets.org/blog/2012/01/backbone-js-lessons-learned-and-improved-sample-app/

This application provides an example of

1. Building a complete RESTful API in Java using JAX-RS and Jersey 2.
2. Consuming these services using Backbone.js client application.

Requirements:

    Java 7
    MySQL
    IDE (Intellij or Eclipse)

Set Up:

    Create a MySQL database name "cellar".

    Execute cellar.sql to create and populate the "wine" table:

    mysql cellar -uroot < cellar.sql

    Locate cellar.properties and make sure the JDBC connection string matches your database configuration

    Or, you can run using in-memory datastore by uncommenting <script src="js/memorystore.js"></script> in index.html.

    Import the Web Project in Intellij.

    Run the project using mvn jetty:run.

    Package it as a web application using mvn package.