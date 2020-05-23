# Quarkus Samples

A set of sample projects to master Quarkus. This project is primarily a vagrant workspace with a CentOS VM with all the Quarkus dependencies and other dev/deployment tools such as GraalVM, Docker, Maven, Git etc. bundled inside. 

You may configure your IDE on your local host machine and perform the build and deployment activities inside the VM (ssh into it) without polluting your local machine. 

You can easily generate new Quarkus projects using the commad-line tool provided - Details below.

## Pre-requisites for this repo

 1. Install VirtualBox on your Mac or PC
 2. Install Vagrant on your Mac or PC

## Steps to use/try the sample projects

 1. Open vagrant/Vagrantfile and make sure the VM configuration(IP Addresses and port no.s) doesn't conflict with any other existing setup.
 
 2. From command line, start up vagrant environment(VM):
 	> cd vagrant
 	> vagrant up
 
 	This will take a while to complete. Be patient.
 
 3. Restart the vagrant environment(VM) - Only the first time:
 	> vagrant halt
 	> vagrant up
 
 4. SSH into the VM as the default 'vagrant' user
 	> vagrant ssh
 
 	You will be inside the default user home - /home/vagrant
 
 5. Navigate to a sample project, say, quarkus-kafka-reactive
 	> cd workspace/quarkus-kafka-reactive
 
 6. Start the kafka services
 	> cd infra
 	> docker-compose up
 
 	This will take some time to download the docker images and start the services

 7. Start the app, quarkus-kafka-reactive
 	> ./mvnw quakus-dev
 	
 	This will take some time to download all the maven dependencies and build the project
 
 8. Open the Front-end in a browser to see it is working
 	> http://localhost:8382/prices.html
 
# Generating new Quakus Projects

 1. Generate the Quarkus Web Project from the project directory
 	> cd workspace
 	> ./createWebProject.sh
 
 	Answer the questions asked, your project will be created.
 
 2. Start up the newly generated App [from the project root that you just created]: 
 	> cd &lt;projectArtifactId&gt;
 	> ./mvnw quarkus:dev
 
 3. Open a browser window on your local PC, enter the following:
 	> http://localhost:8180
  
 