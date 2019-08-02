#!/bin/bash

echo install dependencies
if [ -d /opt/fit2cloud-plugin2.0-test ];then
    echo /opt/fit2cloud-plugin2.0-test exists
else
    mkdir -p /opt/fit2cloud-plugin2.0-test
fi
echo install dependencies done!
