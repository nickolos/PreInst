#!/bin/bash
#use from project directory
psql -U postgres postgres -f psql/db_create.sql
psql -U postgres postgres -d preinst -f psql/db_create_table.sql
mvn clean install
mvn package
java -jar target/Precision_Instrument-1.0-SNAPSHOT.jar