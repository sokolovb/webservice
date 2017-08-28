## Webservice for showing network devices on Linux OS.
### The testcase for the job application in YADRO. 
Written in Java, powered by Jetty.


Classes:
- AllRequestsServlet contains methods for handling HTTP-requests;
- ExecuteShellCommand gets the info about network devices by executing shell command <code>lshw -C net</code>;
- PageGenerator creates the HTML-page contains the info about network devices;
- Main rules them all and starts the server.

Run <code>mvn compile assembly:single</code> to compile the project.<br>
Launch <code>java -jar webservice.jar</code> to deploy the server.<br>
Then open <code>localhost:8080</code> to start working.<br><br>
Also available in Docker container in https://hub.docker.com/r/sokolovb/webservice/
