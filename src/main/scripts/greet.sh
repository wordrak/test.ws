#! /bin/bash

java -cp service/target/service-1.0-SNAPSHOT.jar:client/target/client-1.0-SNAPSHOT.jar  test.ws.client.Main $@
