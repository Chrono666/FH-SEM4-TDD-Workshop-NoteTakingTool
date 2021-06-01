# com.example.Note-Taking Tool

This repository contains a simple project for the final paper assigned by the TDD workshop on the FH-Campus Vienna.

## Description  

A simple project containing one user story with at least two test cases, implemented through the TDD approach.  
Important metrics that have to be measured are the code coverage, and the mutation test coverage of the code.  

## User Storys

As a user I want to save a note in a journal.
As a user I want to sort my notes by date.

## Required Tools

For the project the use of multiple  tools are required:

* Maven
* JUnit 5
* Jacoco
* Pitest
* SonarCloud
* SonarQube
* Jenkins

## Jenkins and Sonarqube
### Allocate more virtual memory

```
sudo sysctl -w vm.max_map_count=524288
sudo sysctl -w fs.file-max=131072
ulimit -n 131072
ulimit -u 8192
```

### Start the docker-compose file

```
docker-compose up
```

### SonarQube IP address for jenkins

```
http://sonarqube:9000/
```

### Expose jenkins

```
ngrok http 8080
```

### Add webhook to github

```
http://*****.ngrok.io/github-webhook/
```

## Maven goals
### Run the unit tests
```
mvn clean test
```

### Generate javadoc for the source code
```
mvn javadoc:javadoc
```

### Generate javadoc for the test code
```
mvn javadoc:test-javadoc
```

### Generate Jacoco source code coverage report
```
mvn test jacoco:report
```

### Check if thresholds limits are achieved
```
mvn test jacoco:check
```

### Generates a PIT Mutation coverage report to target/pit-reports/YYYYMMDDHHMI
```
mvn org.pitest:pitest-maven:mutationCoverage
```

### Generates a quicker PIT Mutation coverage report to target/pit-reports/YYYYMMDDHHMI
```
mvn org.pitest:pitest-maven:mutationCoverage -DwithHistory
```

### Complete example

``` 
mvn clean test jacoco:report org.pitest:pitest-maven:mutationCoverage -DhistoryInputFile=target/fasterPitMutationTesting-history.txt -DhistoryOutputFile=target/fasterPitMutationTesting-history.txt -Dsonar.pitest.mode=reuseReport -Dthreads=4 -DtimestampedReports=false
```
