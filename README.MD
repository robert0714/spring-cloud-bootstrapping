### Relevant Articles:
- [Spring Cloud – Bootstrapping](http://www.baeldung.com/spring-cloud-bootstrapping)
- [Spring Cloud – Securing Services](http://www.baeldung.com/spring-cloud-securing-services)
- [Spring Cloud – Tracing Services with Zipkin](http://www.baeldung.com/tracing-services-with-zipkin)
- [Spring Cloud Series – The Gateway Pattern](http://www.baeldung.com/spring-cloud-gateway-pattern)
- [Spring Cloud – Adding Angular 4](http://www.baeldung.com/spring-cloud-angular)
- [Zipkin for apps presented in the samples to the top](https://docssleuth-zipkin-server.cfapps.io/zipkin/)

- To run the project:
  - copy the appliction-config folder to c:\Users\{username}\ on Windows or /Users/{username}/ on *nix. Then open a git bash terminal in application-config and run:
    - git init
    - git add .
    - git commit -m "First commit"
  - start the config server
  - test url  ( http://localhost:8081/book-service/default/master ,http://localhost:8081/discovery/default/master , http://localhost:8888/gateway/default/master, http://localhost:8888/rating-service/default/master , http://localhost:8888/zipkin/default/master ) in browser 
  - $ docker run -p 6379:6379 -d --name redis-cache  redis:3.2
  - start the discover server
  - start all the other servers in any order (gateway, svc-book, svc-rating, zipkin)
