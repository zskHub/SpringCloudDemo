# SpringCloudDemo #
Simple study notes for springcloud

## 1 目录结构 ##
    -SpringCloudDemo
    --- 1-db
    --- common-api
    --- consumer-dept-8002
    --- provider-dept-8001
    --- eureka-server-7001
## 2 目录说明 ##
- ***因为牵涉到消费者，服务者等相关内容，每次测试可能会牵涉多个模块，这里分组介绍***。
### 2.1 公共模块 ###
#### 2.1.1 common-api ####
##### a.说明 ##### 
   - 公共模块，目前提供了公共实体类。
### 2.2 简单的调用 ###
- ***注意：本组未使用springcloud相关组件。***
#### 2.2.1 consumer-dept-8002 ####
- 基础模块，为以后集成springcloud组件做准备。
#### 2.2.2 provider-dept-8002 ####
- 基础模块，为以后集成springcloud组件做准备。
### 2.3 eureka ###
- ***模块说明：使用eureka进行服务注册与发现***
#### 2.3.1 eureka-server-7001:服务注册 ####
##### a.说明 #####
- 用于eureka的服务注册
##### b.注意事项 #####
    1. 注意版本的对应关系，建议使用父pom集中管理版本信息。
    2. 有些模块用不到有关数据库的相关信息（例如：服务消费者），需要手动关闭springboot的数据库的自动装载。并且尽量不要导入多余的包
        (例如：有关使用druid的包)，否则有些包也会自动去寻找配置文件中的相关信息，项目启动就会报错。
##### c.实现方式 #####
1. pom文件增加依赖
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency> 
```
2. 主启动类增加注解:`@EnableEurekaServer`
##### d.测试启动 #####
1. 启动本地项目
2. 然后，在浏览器中输入：`localhost:7001`
3. 然后会打开eureka的管理页面：
<img src="2-image/eureka-server-7001-1.png" width = "800" height = "500" align=center />

