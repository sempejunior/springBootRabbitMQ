# SpringBoot and RabbitMQ
Project integration with Spring Boot and RabbitMQ<br />
This project is example to integration with Spring Boot and RabbitMQ.<br />

For install the RabbitMQ, use this flow:<br />

1-	Install ErLang (https://www.erlang.org/downloads)<br />
2-	Download RabbitMQ (https://www.rabbitmq.com/download.html)<br />
3-	Open cmd<br />
4-	Put cd (Your Rabbit Installtion Directory)/sbin   <br /> -Ex: cd C:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.7\sbin<br />
5-	Put rabbitmq-plugins enable rabbitmq_management<br />
6-	After this open the Windows services and restart RabbitMQ  <br /> 
7-	Open http://localhost:15672 <br />
8- The password and user default is guest.<br />

After this, click in the tab Queue and add the queue with name ExampleQueue.

When you start the Spring Boot application, this project create the conector with the queue.

