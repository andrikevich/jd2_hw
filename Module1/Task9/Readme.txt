For deploying war via Maven
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
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
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
 
 
c:\hw\Module1\Task8>mvn tomcat7:deploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] >>> tomcat7-maven-plugin:2.2:deploy (default-cli) > package @ Task8 >>>
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
[INFO] <<< tomcat7-maven-plugin:2.2:deploy (default-cli) < package @ Task8 <<<
[INFO]
[INFO]
[INFO] --- tomcat7-maven-plugin:2.2:deploy (default-cli) @ Task8 ---
[INFO] Deploying war to http://localhost:8080/Task8
Uploading: http://localhost:8080/manager/text/deploy?path=%2FTask8
Uploaded: http://localhost:8080/manager/text/deploy?path=%2FTask8 (86 KB at 1978.2 KB/sec)

[INFO] tomcatManager status code:200, ReasonPhrase:
[INFO] OK - Deployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.463 s
[INFO] Finished at: 2020-12-20T20:16:28+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>mvn tomcat7:redeploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] >>> tomcat7-maven-plugin:2.2:redeploy (default-cli) > package @ Task8 >>>
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
[INFO]
[INFO] --- maven-war-plugin:3.3.1:war (default-war) @ Task8 ---
[INFO] Packaging webapp
[INFO] Assembling webapp [Task8] in [c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT]
[INFO] Processing war project
[INFO] Building war: c:\hw\Module1\Task8\target\Task8-1.0-SNAPSHOT.war
[INFO]
[INFO] <<< tomcat7-maven-plugin:2.2:redeploy (default-cli) < package @ Task8 <<<
[INFO]
[INFO]
[INFO] --- tomcat7-maven-plugin:2.2:redeploy (default-cli) @ Task8 ---
[INFO] Deploying war to http://localhost:8080/Task8
Uploading: http://localhost:8080/manager/text/deploy?path=%2FTask8&update=true
Uploaded: http://localhost:8080/manager/text/deploy?path=%2FTask8&update=true (86 KB at 2181.1 KB/sec)

[INFO] tomcatManager status code:200, ReasonPhrase:
[INFO] OK - Deployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.681 s
[INFO] Finished at: 2020-12-20T20:16:53+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>mvn tomcat7:undeploy
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< it.academy:Task8 >--------------------------
[INFO] Building Task8 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO]
[INFO] --- tomcat7-maven-plugin:2.2:undeploy (default-cli) @ Task8 ---
[INFO] Undeploying application at http://localhost:8080/Task8
[INFO] OK - Undeployed application at context path [/Task8]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.590 s
[INFO] Finished at: 2020-12-20T20:17:05+03:00
[INFO] ------------------------------------------------------------------------

c:\hw\Module1\Task8>
            