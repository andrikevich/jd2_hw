Automatical unpacking and deployment of *.war  was achieved due to:

 -- settings in c:\java\apache-tomcat-9.0.41\conf\server.xml

 in next setting:

 <Host name="localhost"  appBase="webapps"
             unpackWARs="true" autoDeploy="true">



 ------------------
 unpackWARs="true"  ---  made it possible.