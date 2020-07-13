[![LinkedIn][linkedin-shield]][linkedin-url]
<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/github_username/repo">
    <img src="logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Spring Boot Crud Example</h3>

  <p align="center">
    <br />
    <a href="https://github.com/kivancbeser/spring-boot-crud-example-master"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/kivancbeser/spring-boot-crud-example-master/blob/master/ProjectDemo.webm">View Demo</a>
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
* [Done](#done)
* [TODO](#todo)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)

<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

It was created for the purpose of a web project from database to user.


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

### Installation
 
1. Clone the repo
```sh
git clone https://github.com/kivancbeser/spring-boot-crud-example-master.git
```
2. Install NPM packages
```sh
npm install
```
3. Download and Install MySql
4. After Installation Execute This Scripts For Create Database and Table
```sh
create database javatask;
use javatask;
```
```sh
'account_tbl', 'CREATE TABLE `account_tbl` (\n  `id` int NOT NULL,\n  `active` bit(1) DEFAULT NULL,\n  `birthdate` datetime DEFAULT NULL,\n  `email` varchar(255) DEFAULT NULL,\n  `firstname` varchar(255) DEFAULT NULL,\n  `lastname` varchar(255) DEFAULT NULL,\n  PRIMARY KEY (`id`)\n) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
```


<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

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

Improvement Points 

<!-- TODO -->
## TODO
* Form Input Validations 
* Form input birthday-> datepicker , active -> input-switch for user-friendly. 
* Using moment for beauthy showing date in table.(May be using moment library) 
* Asyc await usage -Add colorful buttons and add confirmation dialogs. 
* More comment for spring side.

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/github_username/repo/issues) for a list of proposed features (and known issues).



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
[product-screenshot]: screenshot.png
