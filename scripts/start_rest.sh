#!/bin/bash

sudo chmod +x psql/start.sh
sudo ./psql/start.sh
mvn clean install
mvn package
java -jar target/Precision_Instrument-1.0-SNAPSHOT.jar