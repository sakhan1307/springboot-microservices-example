# springboot-microservices-example

Steps-

1. Run the Discovery microservice application (Eureka Server) with right click and run as Spring Boot Application and open in browser http://localhost:1111/

2. Now run the account microservice application as Spring Boot application and after few seconds refresh the browser to the home page of Eureka Discovery Server at http://localhost:1111/ in previous Step 1. 
   Now one Service registered to the Eureka registered instances with Service Name “ACCOUNT-MICROSERVICE” .

3. Now run the webclient account microservice application as Spring Boot application and after few seconds refresh the browser to the home page of Eureka Discovery Server at http://localhost:1111/ in previous Step 1. 
   Now one more Service registered to the Eureka registered instances with Service Name “ACCOUNTS-WEB” .
   
4. Let’s open web application which is a client of the account microservice registered at Eureka Discovery Server.

   http://localhost:8080/
   
   Now click on View Account List then fetch all accounts from account microservice.

   http://localhost:8080/accountList
   
   Now click on any account from the list of accounts to fetch the details of the account for account number from account microservice.

   http://localhost:8080/accountDetails?number=1
