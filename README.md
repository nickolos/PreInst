# PreInst

# Option service
  -  1) create record
    
POST http://localhost:9000/org.product/create

Body data:
 {
    "name" : "Banana",
    "cost": 15
 }
    
- 2) find all records

GET http://localhost:9000/org.product/findAll

- 3) delete record by id

DELETE http://localhost:9000/org.product/{id_product}    

- 4) find one record by id

GET http://localhost:9000/org.product/{id_product}

# Dependences

* lombok - for easy generation objects (data)
* spring boot - framework for rest api
* hibernate - for ORM


# Building

```sh
$ mvn clean install
$ mvn package
```

