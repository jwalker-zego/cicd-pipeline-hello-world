# cicd-pipeline-hello-world
Java project to be used in CICD example


Automatically build application and docker image 
	1. Build application and docker image, then automatically push image to Docker Hub
		a. mvn -s settings.xml clean install


Start Docker Containers using Docker-compose
	1. From terminal: 
		a. docker-compose up
	2. Manual test of the running containers
		a. Check running web server: http://localhost:9000/
		b. Logging into container: 
			i. docker container ls -a
			ii. docker exec -I -t <container name> bash
		c. Check REST Service
			i. GET http://localhost:9000/fruits
			ii. POST http://localhost:9000/fruits
			{
			    "name": "green",
			    "color": "lime"
			}
			

Shutdown all the containers with Docker-compose
	1. From terminal: 
		a. docker-compose down

