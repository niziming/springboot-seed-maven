# SpringBoot-Seed种子项目
涵盖了开发的基本启动框架,用于其他项目的快速开发使用.

## 配置内容:
- Swagger
    - 访问地址http://localhost:8080/swagger-ui.html
- 框架: springboot
    - 权限框架
        - Shiro
    - DLL持久层
        - tk.Mybatis
            - mybatis 逆向工程 mbg
- 数据库
    - mysql5.7.22
        - 路径:src/main/resources/seeddb.sql
- 日志工具 
    - log4j2
- 项目管理工具
    - Maven
        
## 各个框架介绍

### springboot
SpringBoot 不是 Spring 官方的框架模式，而是一个团队在 Spring4.0 版本上二次开发并开源公布出来的。简而言之，SpringBoot 就是一个轻量级，简化配置和开发流程的 web 整合框架。SpringBoot 是最近这几年才火起来的，那么它到底与 Spring 有啥区别呢？想了解区别，其实就是 SpringBoot 提供了哪些特性：

Spring Boot 可以建立独立的 Spring 应用程序；
内嵌了如 Tomcat，Jetty 和 Undertow 这样的容器，也就是说可以直接跑起来，用不着再做部署工作了；
无需再像 Spring 那样搞一堆繁琐的 xml 文件的配置；
可以自动配置 Spring。SpringBoot 将原有的 XML 配置改为 Java 配置，将 bean 注入改为使用注解注入的方式 (@Autowire)，并将多个 xml、properties 配置浓缩在一个 appliaction.yml 配置文件中。
提供了一些现有的功能，如量度工具，表单数据验证以及一些外部配置这样的一些第三方功能；
整合常用依赖（开发库，例如 spring-webmvc、jackson-json、validation-api 和 tomcat 等），提供的 POM 可以简化 Maven 的配置。当我们引入核心依赖时，SpringBoot 会自引入其他依赖。

### Swagger - 强大的 API 文档工具
1. 是一款让你更好的书写 API 文档的规范且完整框架。
2. 提供描述、生产、消费和可视化 RESTful Web Service。
3. 是由庞大工具集合支撑的形式化规范。这个集合涵盖了从终端用户接口、底层代码库到商业 API 管理的方方面面。

### MyBatisPlus 逆向生成增删改查

代码生成器
AutoGenerator 是 MyBatis-Plus 的代码生成器，通过 AutoGenerator 可以快速生成 Entity、Mapper、Mapper XML、Service、Controller 等各个模块的代码，极大的提升了开发效率。