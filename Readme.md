# Purpose

This is a simple Java Project Template for Netbeans which allows me to quickly
create a project with a unit test all set up.

## Cloud 9

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

```bash
sudo apt-get update
sudo apt-get install junit4 ant
```


## Run

```bash
ant run
```

## Test

You might have to fix the variable libs.junit_4.classpath in the file nbproject/project.properties