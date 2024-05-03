#!/bin/sh

# while inotifywait -r -e modify ./src;
# do 
#   ./mvnw clean install
# done >/dev/null 2>&1 &


while true; do
  inotifywait -e modify,create,delete,move -r ./src/ && ./mvnw spring-boot:stop && ./mvnw spring-boot:run
  # inotifywait -e modify,create,delete,move -r ./src/ && 
done

