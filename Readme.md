# Purpose

This is a simple Java Project Template for Netbeans which allows me to quickly
create a project with a unit test all set up.

## Now with JDK-14 packaging}

With Gradle 6 and JDK/14 we get the jpackage task which creates RPM packages on Linux and msi packages on Windows.

## Gradelified

```bash
gradle run

# to build and run
gradle shadowJar
java -jar build/libs/JavaTemplateApplication-all.jar

gradle test

gradle javadoc
google-chrome ./build/docs/javadoc/index.html

gradle test jacocoTestReport
google-chrome ./build/reports/jacoco/test/html/index.html
```

## Ant

```bash
ant run
ant test
```


## Cloud 9

https://aws.amazon.com/cloud9

```bash
sudo vim /etc/apt/sources.list # then add
deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main
deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main

sudo apt-get update
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get install oracle-java8-installer junit4
#sudo apt-get install default-jdk
```

## Codenvy

https://codenvy.com

```bash
sudo apt-get update
sudo apt-get install junit4 ant
```


## Test

You might have to fix the variable libs.junit_4.classpath in the file nbproject/project.properties