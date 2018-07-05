# MicroServices-Proj1

Hi All,

I am Krishna. I am a java developer and learning microservices architecture. This is my first project in github.

About the project:
I created a Eureka Service with name as EurekaDiscovery. 
Added three simple microservices customers, products and orders.

Customer Service endpoint URI: 
1. /customer/all (GET request)
    - List all customers from database.
    
2. /customer/customerdetails?<customernumber> (GET request)
     - Fetch customer details for the given customernumber.
     
Product Service endpointURI:
1. /products/all (GET request)
    - List all Products from database
    
2. /products/{productCode} (GET Request)
    - Fetch product details for the given productCode


Database:
I am connecting to MySQL database in this project. 
I have added the complete sql script file as mysqlsampledatabase.sql for your use.
