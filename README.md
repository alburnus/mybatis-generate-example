# mybatis-generate-example
Simple example how create Java model with CRUD operation using mybatis-generator.

## Fundamentals
* it is possible to run mybatis-generator as a task in ant or plugin in maven - in support iterative development process. 
* After each iterate it will generate new xml file which will merge with existing one. So any changes made before won't be overwritten. 
* Different situation is with Java class - all changes will be overwrite during build proess, so changes have to be marged manually. 

## Useful links
* http://www.mybatis.org/generator/
