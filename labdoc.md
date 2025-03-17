## High Level Purpose Statement
I want to test Spring Boot capabilities by creating a simple communication route between client and server.

## Experimental Design
I will create a simple game of rock, paper, scissors using HTML for the client interface to show how Spring Boot can use routing to both send and recieve data from a client.

## Resources Available
Spring Boot Docs, Internet

## Time Estimate
5-6 Hours. I will spend much of this time researching Spring Boot documentation and routing.

## Experiment Notes
It was interesting to me how easy it was to set up a server. I have done so in the past using other frameworks, and Spring Boot was among the easier methods.

## Results
A client is able to send and recieve data through POST requests in their browser to play rock, paper, scissors with the server. They send their move in through the routing mechanism, appended onto the URL. The server recieves their move and sends back a new page with the result of the game, and also keeps track of wins.

## Consequences for the Future
Spring Boot seems like an extremely quick way to set up a backend for a web-app. It did not take me long from initializing the project to getting a basic route to work. If I need Java to do any kind of backend work for a project in the future, I will likely go with Spring Boot.