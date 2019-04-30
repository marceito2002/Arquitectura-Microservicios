# Arquitectura-Microservicios


Contiene los proyectos bçasicos para una arquitectura de microservicios.

Docker directories.
==================
Docker docker-base-image Dockerfile. This file is a text document that contains all the commands a user could call on the command line to assemble an image. This images is the base for all API. user.Keytab. File keytab for access to kafka and hbase with kerberos. To generate see the nex link. krb5.conf. File for the access to kafka an hbase with kerberos. assets entrypoint.sh. bath with the comands to begin the microserve into container docker base_arq.

This component has all common dependecies for all API's Properties more important. <docker.repository> Contains the name of the repository where the images docker will be loaded. <package.finalName>. This properties is for the name of the jar file for all APIS. Plugins dockerfile-maven-plugin. The plugin is used for building a Docker image and pushing a Docker image to the Registry specific in the previus property swagger-codegen-maven-plugin Swagger allows to visualize and interact with the API’s resources without having any of the implementation logic in place. From the Swagger Editor we make the definition of the intefaz and generated the diferent model's y the API skeleton. The name of the yaml file has to be {project.artifactId}-api.yml build-helper-maven-plugin Allow to add more sources folders to maven. This sources are then Interfaz API and models

rest-api-arq
============
  Project for restfull services who containts all dependencies specifics for MICROSERVICES Type RESTFULL SERVICE.

base-domain
===========
  Proyect for the model for the persistance in mongoDB.

Configserver
============
  ConfigServer microservice to provide all the configurations to the rest of APIs. The configuracíon Stay in a bitbucker repository.

Profile variables
  GIT_PASS. Password to access to repository
  GIT_USER. User to access to repository
  GIT_URI. url of the repository where the property files are located

partner
=======
  This API performs all operations for the partner mongoDB. Profile variables CONFIG_SERVER_ENDPOINT. Endpoint where API Configserver are located. Properties file: TO access to MongoDB data: mongodb: host: mongo port: 27017 database: fraudwall username: alf password: alf

tracking
========
  API microservice for tracking events. This component has the typical layer of a rest service. Intefaz swagger, models, controller and services. Profile variables CONFIG_SERVER_ENDPOINT. Endpoint where API Configserver are located. There are three profiles: local, docker annd openshift Properties file: TO access to MongoDB data.mongodb.host=

data.mongodb.hostport=
data.mongodb.host.datatabase:
data.mongodb.hostusername:
password:

To access kafka kafka.bootstrap-servers: localhost
==================================================
kafka.port: 9092
kafka.topic: HDP_FW_TRACK
kafka.security: PLAINTEXT
kafka.useKeyTab: false (to kerberos)
kafka.storeKey: false (to kerberos)
kafka.clientIdConfig: fraudwall-spring
kafka.keyTabPlace: place where is the file keytab.
kafka.keyTabUser: hdp_b2bp_app@AD.DOCOMODIGITAL.COM

To acces HBase:
===============
hbase.zookeeper:.quorum:
hbase.zookeeper:.lientPort:
hbase.kerberos.name:
hbase.kerberos.user:
hbase.kerberos..principal:
hbase.kerberos..keytab:
hbase.hbase.table:
hbase.hbase.t.name:
hbase.hbase.nameSpace:

To call to API Partner is necesary the next values:
 call.partner:.endpoint:

To diferent msg
  msg.partnerNameNoExist: Error to generating session, then partner name not exist.
  msg.ssesionSuccess: Session generated Successfully
  msg.sessionOrPartnerNoExist: Session/partner Name not exist
  msg.tokenOrPartnerNoExist: Session/partner Name not exist
  msg.tokenSuccess: Session generated Successfully
  msg.sessionBadPartnerName: There are some partned with the same name
  msg.msgDataInvalid: Date format not valid. Example. 20171216 10:20:34:653

tracking-persistance
====================
  API microservice for tracking events who has the typical layer for the business, repository, access to kafka, and hbase..

Access to KAFKA with spring boot and Kerberos

To access to kafka from the API microservices need: Config's properties to jaas config. Config's Properties to access type producer To Generate the keytab file File krb5.conf

Access to HBASE with spring boot and Kerberos

To access to kafka from the API microservices need: Config's Properties to access To Generate the keytab file File krb5.conf
