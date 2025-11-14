#  Java Daily Learning Repository  

Welcome to my **Java Daily & Spring Learning** journey!  
Every day, I explore new Java concepts — from **advanced core features** to **modern Spring Framework updates** — and commit **practical, hands-on code examples** here.  

---

##  Topics Covered  

| Day | Topic | Highlights |
|-----|--------|-------------|
| 1 | **Spring Learning** | Dependency Injection and IoC Container |
| 2 | **Spring Beans** | Bean Lifecycle, Scopes, and Configuration |
| 3 | **Autowiring in Spring** | Field, Constructor, and Setter Injection |



## ioc -> inversion of controle  -> It is a Core feature of Spring in this instate we creating object spring creating object for us is called as inversion of controle 
we can achive ioc with the help of ioc conatiner and Depandancy Injection 

## IoC Container -> when start the application the spring scan all classes and and those classes who have sterotype Annonation that classes object is created this object are store in the form of 
key and value in the logical memory block and this block are called as ioc conatiner
there are two types of ioc containers
1)application context 
2)bean.factory


##  Dependency Injection -> it's a core feature of spring with the help  of spring we can make our application loosly coupled with thelp di we can inject the object into directly into required field 
instate of creating by using new keyword it create object automatically with the help of ioc container

##Ther are for ways to do dependancy Injection
1)Field Injection
2)Setter Injection 
3)Construtor Injection
4)lookup Injection

1)Field injection 
it is optional injection 
it get baically more time to create object because it use reflection concept internally 

2)setter injection
If we want  to make dependency injection optional then we go for setter injection

3)Construtor Injection
if we want to make dependeny injection mandatory then go with this 

but most use injection type is filed injection 







 

