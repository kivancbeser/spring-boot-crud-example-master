[![LinkedIn][linkedin-shield]][linkedin-url] [![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-white.svg)](https://sonarcloud.io/dashboard?id=kivancbeser_spring-boot-crud-example-master)

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/kivancbeser/spring-boot-crud-example-master">
    <img src="logo.png" alt="Logo" width="80" height="80">
  </a>
  <h3 align="center">Spring Boot Crud Example</h3>
  <br />
 
  <p align="center">
    <br />
    <a href="https://github.com/kivancbeser/spring-boot-crud-example-master"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/kivancbeser/spring-boot-crud-example-master/blob/master/ProjectDemo.mp4">View Demo Video</a>
    ·
    <a href="https://github.com//kivancbeser/spring-boot-crud-example-master/issues">Report Bug</a>
    ·
    <a href="https://github.com//kivancbeser/spring-boot-crud-example-master/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Explore Rest APIs](#explorerestapis)
  * [Account](#account)
* [Done](#done)
* [TODO](#todo)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)

<!-- ABOUT THE PROJECT -->
## About The Project
 <a href="https://github.com/kivancbeser/spring-boot-crud-example-master">
      <img src="/screenshots/DemoApplication.gif" alt="Demo Gif" width="1600">
 </a>

It was created for the purpose of a web project from database to user. You can see the done features in [Done](#done) sections. 


### Built With

* [SpringBoot](https://start.spring.io/)
* [Vue.js](https://vuejs.org/)
* [Vuetify](https://vuetifyjs.com/en/) - Vue Material Design Component Framework
* [MySql](https://www.mysql.com/)

## Why Spring Boot 

Easy choice for small project spring boot is best choice.I did not have difficulty using it because I actively use it in my business life.

## Why Vue 

I search about front-end techs after i read this article https://tekkiwebsolutions.com/blog/comparison-of-angular-vs-react-vs-vue. 
I decided Vue because my project is samll and vue learning curve is better React and Angular. 
Before I haven't coded vue , but always wondered. So this project my first vue project.
Vue project folder name is task-vue-side. I added without node modules you need to npm install for modules.

## Why Vuetify

Vuetify most used material design framework in vue side and also documentation page is awesome for beginner like me that's why I chose it.

## Why MySql

Here I chose my-sql relational database that I did not use before because I was wondering because it was used a lot and I wanted to use it.
I added CreateTableScript.sql for create table.

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* npm
```sh
npm install npm@latest -g
```

* Install JDK 1.8 version or more higher version.
```sh
https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
```

### Installation
 
1. Clone the repo
```sh
git clone https://github.com/kivancbeser/spring-boot-crud-example-master.git
```
### Installation For Backend

1. Open the project in the IDE. (I Prefer Intellij Idea)

2. Execute Maven Clean & Install

3. Start the Spring Boot Application

### Installation For Frontend

1. Change directory and go to task-vue-side
```sh
cd task-vue-side
```

2. npm install
```sh
npm install
```

3. npm run serve
```sh
npm run serve
```

### Installation For Database
1. Download and Install MySql
```sh
Please check root and password for connecting java-side. If you choose different password, you have to change "application.properties" file.
```
2. Run Create Database Script
```sh
create database javatask;
```

3. Run Create Table Script
run 
```src/main/resources/createaccounttablescript.sql```

OR        
```sh
use javatask;
CREATE TABLE `account_tbl` ( `id` int NOT NULL, `active` bit(1) DEFAULT NULL, `birthdate` datetime DEFAULT NULL, `email` varchar(255) DEFAULT NULL,`firstname` varchar(255) DEFAULT NULL,`lastname` varchar(255) DEFAULT NULL, PRIMARY KEY (`id`)) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```
4. Change mysql username and password as per your installation

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

<!-- USAGE EXAMPLES -->
## Usage

1. After all installations start spring boot application, start vue project with "npm run serve" command and don't forget to start mysql server.

2. Go to chrome or other browser and go to:(If you haven't changed the port)

```sh
http://localhost:8086/datatable
```
3. And DONE. You can easily use this application.

<!-- Explore Rest APIs -->
## Explore Rest APIs

The app defines following CRUD APIs.

### Account

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | /api/accounts | Get all accounts | |
| GET    | /api/accounts/{id} | Get account by id | |
| POST   | /api/accounts | Create new account  | [JSON](#accountcreate) |
| PUT    | /api/accounts/{id} | Update account | [JSON](#accountupdate) |
| DELETE | /api/accounts/{id} | Delete account | |

##### <a id="accountcreate">Create Account -> /api/accounts</a>
```json
{
  "firstname": "newaccountfirstname",
  "lastname": "newaccountllastname",
  "email": "test@gmail.com",
  "birthdate": "2010-05-05T00:00:00.000+0000",
  "active": true
}
```

##### <a id="accountupdate">Update Account -> /api/accounts{id}</a>
```json
{
  "firstname": "updatedfirstname",
  "lastname": "updatedlastname",
  "email": "updated@gmail.com",
  "birthdate": "2010-05-05T00:00:00.000+0000",
  "active": true
}
```
You can test them using postman.



<!-- Done -->
## Done
* Mvc Architecture 
* Backend-Frontend
* Db Connection 
* Add Product 
* Edit Product 
* Delete Product 
* Showing in Table 
* Sorting in Table (Click Header) 
* Searching in Table
* Adding Unit Test 20.07.2020
* Using Moment for formatDate 21.07.2020
* Birthday-> Datepicker , Active -> Input Switch 21.07.2020
* Sonar Scan
<!-- TODO -->
## TODO
* Form Input Validations 
* ~~Form input birthday-> datepicker , active -> input-switch for user-friendly~~
* ~~Using moment for beauthy showing date in table.(May be using moment library)~~ 
* Asyc await usage -Add colorful buttons and add confirmation dialogs. 
* More comment for spring side.
* Add More Unit Test
* Swagger
* ~~Sonar~~ 
<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/kivancbeser/spring-boot-crud-example-master/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Kıvanç Enes Beşer - [@Linkedin_handle](https://www.linkedin.com/in/kivancenesbeser/) - beserkivanc@gmail.com

Project Link: [https://github.com/kivancbeser/spring-boot-crud-example-master](https://github.com/kivancbeser/spring-boot-crud-example-master)

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/kivancenesbeser
[project-screenshot]: /screenshots/screenshot.png
