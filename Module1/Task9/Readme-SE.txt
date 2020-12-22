===========================================
For deploying war via Maven second edition
===========================================

Setting all enviroment:
1. c:\java\apache-tomcat-9.0.41\conf\tomcat-users.xml
    Checking if added next users:
    
           <role rolename="manager-gui"/>
          <role name="manager-script"/>
          <user username="tomcat" password="tomcat" roles="manager-gui,manager-script"/>
     
2. c:\java\apache-maven-3.6.3\conf\settings.xml

<server>
    <id>TomcatServer</id>
    <username>tomcat</username>
    <password>tomcat</password>
</server>

3. Add to POM next plugin:

            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>tomcat-maven-plugin</artifactId>
                <version>1.1</version>
                <configuration>
                    <url>http://localhost:8080/manager/text</url>
                    <server>TomcatServer</server>
                    <path>/Task8</path>
                    <username>tomcat</username>
                    <password>tomcat</password>
                </configuration>
            </plugin>
 
 
 =====================================
 RESULTS in CMD:
 =====================================
 
Microsoft Windows [Version 10.0.17763.1637]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\dmitry_an>set Path=%Path%;c:\java\jdk-11\bin;c:\java\apache-maven-3.6.3\bin

C:\Users\dmitry_an>set JAVA_HOME=c:\java\jdk-11

C:\Users\dmitry_an>cd c:\java\apache-tomcat-9.0.41\bin

c:\java\apache-tomcat-9.0.41\bin>startup.bat
Using CATALINA_BASE:   "c:\java\apache-tomcat-9.0.41"
Using CATALINA_HOME:   "c:\java\apache-tomcat-9.0.41"
Using CATALINA_TMPDIR: "c:\java\apache-tomcat-9.0.41\temp"
Using JRE_HOME:        "c:\java\jdk-11"
Using CLASSPATH:       "c:\java\apache-tomcat-9.0.41\bin\bootstrap.jar;c:\java\apache-tomcat-9.0.41\bin\tomcat-juli.jar"
Using CATALINA_OPTS:   ""
c:\java\apache-tomcat-9.0.41\bin>cd c:\hw\Module1\Task8\

c:\hw\Module1\Task8>mvn --version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: c:\java\apache-maven-3.6.3\bin\..
Java version: 11, vendor: Oracle Corporation, runtime: c:\java\jdk-11
Default locale: en_US, platform encoding: Cp1251
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

c:\hw\Module1\Task8>mvn clean install tomcat:undeploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Task8 ---
[INFO] Deleting c:\hw\Module1\Task8\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Task8 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to c:\hw\Module1\Task8\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory c:\hw\Module1\Task8\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Task8 ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ Task8 ---
[INFO] Installing c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.war
[INFO] Installing c:\hw\Module1\Task8\pom.xml to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.pom
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:undeploy (default-cli) @ Task8 ---
[INFO] Undeploying application at http://localhost:8080/Task8
[INFO] OK - Undeployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.117 s
[INFO] Finished at: 2020-12-22T15:20:53+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>mvn clean install tomcat:deploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Task8 ---
[INFO] Deleting c:\hw\Module1\Task8\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Task8 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to c:\hw\Module1\Task8\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory c:\hw\Module1\Task8\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Task8 ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ Task8 ---
[INFO] Installing c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.war
[INFO] Installing c:\hw\Module1\Task8\pom.xml to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.pom
[INFO]
[INFO] >>> tomcat-maven-plugin:1.1:deploy (default-cli) > package @ Task8 >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory c:\hw\Module1\Task8\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Task8 ---
[INFO] No tests to run.
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] <<< tomcat-maven-plugin:1.1:deploy (default-cli) < package @ Task8 <<<
[INFO]
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:deploy (default-cli) @ Task8 ---
[INFO] Deploying war to http://localhost:8080/Task8
[INFO] OK - Deployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.978 s
[INFO] Finished at: 2020-12-22T15:21:07+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>mvn clean install tomcat:redeploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Task8 ---
[INFO] Deleting c:\hw\Module1\Task8\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Task8 ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to c:\hw\Module1\Task8\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory c:\hw\Module1\Task8\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Task8 ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ Task8 ---
[INFO] Installing c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.war
[INFO] Installing c:\hw\Module1\Task8\pom.xml to C:\Users\dmitry_an\.m2\repository\it\academy\Task8\1.0-SNAPSHOT\Task8-1.0-SNAPSHOT.pom
[INFO]
[INFO] >>> tomcat-maven-plugin:1.1:redeploy (default-cli) > package @ Task8 >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Task8 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory c:\hw\Module1\Task8\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Task8 ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Task8 ---
[INFO] No tests to run.
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] <<< tomcat-maven-plugin:1.1:redeploy (default-cli) < package @ Task8 <<<
[INFO]
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:redeploy (default-cli) @ Task8 ---
[INFO] Deploying war to http://localhost:8080/Task8
[INFO] OK - Deployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.450 s
[INFO] Finished at: 2020-12-22T15:21:20+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>
