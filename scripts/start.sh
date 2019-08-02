cd /opt/fit2cloud-plugin2.0-test
echo going to start app
nohup java -jar plugin-test-1.0.0.jar > log.txt 2>&1 &
echo app started!
ps aux | grep java | grep -v grep
