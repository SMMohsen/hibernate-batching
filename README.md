# hibernate-batching
Demo for describing how hibernate manage INSERT/UPDATE batch using spring boot demo  


How Hibernate execute statements without batching ?

without hibernate batching every SQL statement will take a round trip to DB to be executed 

when enabling the batching hibernate will group a certain number of INSERT/UPDATE statements and then go to DB in one round trip to execute them

to enable hibernate batching in spring boot you have to use this property in properties file :

spring.jpa.properties.hibernate.jdbc.batch_size=2 

the number you provide here is how many statements hibernate will take them to DB in one round trip

you can use this property to sort the insert statements 

spring.jpa.properties.hibernate.order_inserts=true

and with this property also hibernate will provide statics about the session to compare results 

spring.jpa.properties.hibernate.generate_statistics=true


BUT there are 2 points you have to take care of : 

1 - using IDENTITY id strategy generation will silently disable batch inserts/updates because it needs to call specific sequence to generate id for each record

2 - managing batching it takes time and resources so if you have like 10 or 20 record and you enable batching
you will see that executing with batching is worst regarding to time comparing to without batching , so if you want to get benefit of batching
use them if you have hundreds of records or more
