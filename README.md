# shopping-object2
电商项目2   SOA面向服务分布式架构

1、项目描述：

        电商项目1中的各个模块有一些通用的业务逻辑无法共用。电商项目2基于SOA面向服务的架构。把工程拆分成服务层、表现层两个工程。服务层中包含业务逻辑，只需要对外提供服务。表现层处理和页面的交互，调用服务层的服务来实现业务逻辑。使用dubbo利用rpc协议进行远程调用，使用zookeeper注册中心。

2、主要技术：

        Dubbo、zookeeper、FastDFS服务器、ActiveMQ消息队列、Spring、SpringMVC、Mybatis、freemarker页面静态化、KindEditor（富文本编辑器）、Redis（缓存服务器）、Solr（搜索）、Mysql、Nginx（web服务器）

3、开发工具和环境：

        Eclipse、Maven 、Tomcat 7、JDK 1.7、Mysql 、Nginx 、Redis 

4、系统模块：

          1）后台管理系统：管理商品、订单、类目、商品规格属性、内容发布等功能。

          2）前台系统：用户可以在前台系统中进行注册、登录、浏览商品、首页、下单等操作。

         3）订单系统：提供下单、查询订单。

         4）搜索系统：提供商品的搜索功能。

         5）单点登录系统：为多个系统之间提供用户登录凭证以及查询登录用户的信息。
