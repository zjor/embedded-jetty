# Embedded Jetty with Spring Web MVC #

This one of the sample projects from the series of researches on the `suitable embeddable server`.

Suitable embeddable server should have the following properties:
- runnable form code bound to a specific port
- completely configurable from spring context
- outer context should be accessible within inner context
- should handle cookies correctly (unlike with Jersey & Grizzly)
- can serve static files
- can server views in a standard way 
- (optional) should handle jsp

This embeddable combination will be further used for purposes like:
- single-jar web applications
- as a part of bigger existing application
- unit tests

# Next steps #

1. Move jetty configuration to another spring context (to make it usable in existing spring applications)
2. Check that outer scope (where jetty was configured) is accessible from the inner scope (e.i. it's possible to inject services to controllers)
3. Check cookies handling
4. Serve html/jsp
5. Use the configuration within unit test

# Ideas of alternative combinations #

Jetty & Spring
- try to install spring servlet in Jetty
- try to set cookie in request and return in from controller

Jetty & Jersey
- install Jersey resources into embedded Jersey server
- run jersey from Spring Context

http://undertow.io/

Jersey-Server
- http://crunchify.com/how-to-start-embedded-http-jersey-server-during-java-application-startup/

http://sparkjava.com/
