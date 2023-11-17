# TestAutomation
# Serenity BDD
Roche Gigya Test Automation Project using Serenity BDD framework
###Project Setup Requirement
- [JDK-11](https://www.oracle.com/java/technologies/downloads/) 
- [Maven-3.0.0](https://maven.apache.org/install.html)
- [Serenity-BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html)
- [GitLab Account](https://code.roche.com/users/sign_in)

###Setting Environment Variables
- Set environment variable for JAVA_HOME , MAVEN_HOME
- Set variable ROCHE_EMAIL to your proxy email e.g. sachin.jhadhav@rochepoc.com
- Set variable ROCHE_USERID to your Roche Windows user id e.g jhadhavs
- Set variable ROCHE_PASSWORD to your roche Windows password  (This is required for SSO login to Gmail)

###Getting Started
- Clone the [repo](https://code.roche.com/roche-gigya-automation/roche-gigya-bdd-test) from GitLab
- Run ```mvn clean install``` at the root of the folder
- This will install all the project related dependency

###Running test
- This is Serenity Cucumber BDD project 
- Run using Test Runner
- Run with tags ``mvn -q clean verify -Dtags="@UCAN,@LV"`` This will all the UCAN  testcases related to @LV
- We can run various possible combination of Cucumber tags


###Test Reports
- After test,  run  ```mvn serenity:aggregate```
- reports are published at [./target/site/serenity/index.html](./target/site/serenity/index.html) 
- After every run new test reports will be added 
###GitLab CI CD Pipeline
- Pipeline [CI CD job](https://code.roche.com/jhadhavs/roche-gigya-bdd-test/-/pipelines) is set for this project 
- After every changes pushed to the branch pipeline will be triggered
- Build and Test Jobs will run on CI
- Test Artifacts can be downloaded from pipeline archive

###Code Quality and Coding Standard 
- We aim to have production quality  code for this project
- We must follow all industry standard for JAVA & maven
- Package name : small letters e.g. package
- Class name : Start with capital  e.g. Class
- Method name : camel case e.g. methodName

###Git Merge and Branch 
- We follow protective policy for our code
- Push is not allowed in main / master branch
- Code can only be merged into the main / master
- Branch naming convention: GIGYA/branch-na
