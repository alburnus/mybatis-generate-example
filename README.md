# mybatis-generate-example
Simple example how create Java model with CRUD operation using mybatis-generator.

## Fundamentals
* it is possible to run mybatis-generator as a task in ant or plugin in maven - in support iterative development process. 
* After each iterate it will generate new xml file which will merge with existing one. So any changes made before won't be overwritten. 
* Different situation is with Java class - all changes will be overwrite during build process, so changes must be marge manually. 

## 
* Run maven plugin: mvn mybatis-generator:generate

## Useful links
* http://www.mybatis.org/generator/
* https://gist.github.com/user20161119/f7e5d69b66834c105cff
* http://www.henryxi.com/mybatis-generator-maven-example 
