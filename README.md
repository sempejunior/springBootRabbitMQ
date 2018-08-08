# SpringBoot and RabbitMQ
Project integration with Spring Boot and RabbitMQ
This project is example to integration with Spring Boot and RabbitMQ.

For instal the RabbitMQ, use this flow:

1-	Install ErLang (https://www.erlang.org/downloads)
2-	Download RabbitMQ (https://www.rabbitmq.com/download.html)
3-	Open cmd
4-	Put cd (Your Rabbit Installtion Directory)/sbin    -Ex: cd C:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.7\sbin
5-	Put rabbitmq-plugins enable rabbitmq_management
6-	After this open the Windows services and restart RabbitMQ   
7-	Open http://localhost:15672 
8- The password and user default is guest.

After this, click in the tab Queue and add the queue with name ExampleQueue.

When you start the Spring Boot application, this project create the conector with the queue.

