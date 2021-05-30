<h1 align="center">
Cities API
</h1>

<p align="justify">
Projeto desenvolvido a fins de estudos de desenvolvimento de API, todos os cursos que estou fazendo relacionado a plataforma da DIO, costumo montar um projeto base para medir a rotina de evolução, aqui listo alguns deles, com envolvimento de Backend e banco de dados, um futuro proximo irei desenvolver a interface front. Em especial aqui tem uma aplicação que faz consultas de duas cidades do Brasil e faz o calculo entre elas, trazendo o resultado de forma responsiva.
<p>

##### Requirements

- [x] - Linux (Qualquer distro baseada em Debian)
- [x] - Git
- [x] - Java 8 ++
- [x] - Docker
- [x] - IntelliJ Community
- [x] - Heroku CLI
- [x] - Maven (Baseado em XML) - Opcional
- [x] - Gradle (Baseado em **groovy**) Com suporte ao **Kotlin** - Opcional  

#### DataBase

##### Postgres

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

##### Populate

* [data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

```shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

* [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)
* [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)
* [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)
* [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)
* [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)

##### Access

```shell script
docker exec -it cities-db /bin/bash

psql -U postgres_user_city cities
```

##### Query Earth Distance

Point
```roomsql
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube
```roomsql
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

##### Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 8
+ Gradle Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ PostgreSQL Driver

##### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

##### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

##### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

##### Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

##### Code Quality

##### PMD

+ https://pmd.github.io/pmd-6.8.0/index.html

##### Checkstyle

+ https://checkstyle.org/

+ https://checkstyle.org/google_style.html

+ http://google.github.io/styleguide/javaguide.html

```shell script
wget https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
```
<a href="https://www.linkedin.com/in/mateus-macedo-937a32163/">
 <img style="border-radius:50%" width="100px; "src="https://avatars.githubusercontent.com/u/63172367?s=460&u=11fd26ea8a7f5663d7707d7ef254e4f8bfca1b05&v=4"/>
 <p>Mateus Macedo</p>
</a>
