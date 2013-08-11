#!/bin/sh
source ./setenv.sh
java -cp $HSQLDB_HOME/lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:$MEMAC_HOME/db/test1 --dbname.0 test1 &


