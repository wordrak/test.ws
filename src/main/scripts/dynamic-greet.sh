#! /bin/bash

java -cp service/target/service-1.0-SNAPSHOT.jar:dynamic-client/target/dynamic-client-1.0-SNAPSHOT.jar  test.ws.client.Main $@
