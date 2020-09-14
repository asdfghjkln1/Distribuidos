#! /bin/bash

docker-compose down
cd Distribuidos
git pull origin master
sudo mvn package
cd ..
docker-compose up -d --build spring_api
