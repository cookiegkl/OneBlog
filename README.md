 **怀念时光** 一个简洁美观、功能强大并且自适应的Java博客。使用springboot开发，前端使用Bootstrap。支持移动端自适应，配有完备的前台和后台管理功能。    

![JDK](https://img.shields.io/badge/JDK-1.8-green.svg)
![Maven](https://img.shields.io/badge/Maven-3.3.1-green.svg)
![MySQL](https://img.shields.io/badge/MySQL-5.6.4-green.svg)
![Redis](https://img.shields.io/badge/Redis-3.0.503-green.svg)
[![license](https://img.shields.io/badge/license-GPL%20v3-yellow.svg)](#/blob/master/LICENSE)

----

**如果喜欢，请多多分享！！多多Star！！**

----

# 模块划分

| 模块  | 释义 | 备注 |
| :------------: | :------------: | :------------: |
| blog-core | 核心业务类模块，提供基本的数据操作、工具处理等 | 该模块只是作为核心依赖包存在 |
| blog-admin | 后台管理模块 | 该模块作为单独项目打包部署 |
| blog-web | 前台模块 | 该模块作为单独项目打包部署 |
| blog-file | 文件存储功能模块 | 支持local、七牛云和阿里云OSS |
| ~~blog-spider~~ | 爬虫相关代码模块 | 已使用[blog-hunter](https://gitee.com/yadong.zhang/blog-hunter)插件替代 |


# 技术栈

- Springboot 2.0.8
- Apache Shiro 1.2.2
- Logback
- Redis
- Lombok
- Websocket
- MySQL、Mybatis、Mapper、Pagehelper
- Freemarker
- Bootstrap 3.3.0
- wangEditor
- jQuery 1.11.1、jQuery Lazyload 1.9.7、fancybox、iCheck
- 阿里云OSS
- kaptcha
- Qiniu
- webMagic
- ...

# 功能简介

- 支持wangEditor和Markdown两种富文本编辑器，可以自行选择
- 在线申请友情链接，无需站长手动配置，只需申请方添加完站长的连接后自行申请即可
- 支持将文件提交到百度站长收录平台，加快百度引擎的收录
- 自研评论系统
- 后台配备完善的权限管理
- 自带robots、sitemap等seo模板，实现自动生成robots和sitemap
- 集成七牛云，实现文件云存储
- 系统配置支持快速配置。可通过后台手动修改诸如域名信息、SEO优化、赞赏码、七牛云以及更新维护通知等。
- 管理员可向在线的用户发送实时消息（需用户授权 - 基于websocket实现，具体参考[DBlog建站之Websocket的使用](#/article/111)）
- “文章搬运工”功能，支持一键同步imooc、csdn、iteye或者cnblogs上的文章，可抓取列表和单个文章


# 使用方法(以blog-web项目为例)

1. 使用IDE导入本项目
2. 新建数据库`CREATE DATABASE dblog;`
3. 导入数据库`docs/db/dblog.sql`
4. 初始化数据库`docs/db/init_data.sql`
5. 修改配置文件
   1. 数据库链接属性(在`[blog-core]/resources/config/application-center-{env}.yml`配置文件中搜索`datasource`或定位到L.5) 
   2. redis配置(在`[blog-core]/resources/config/application-center-{env}.yml`配置文件中搜索`redis`或定位到L.14)
   3. 以上两个必备的配置项修改完成后就能启动项目了。关于其他配置项，请参考后台“系统配置”页面
6. 运行项目(三种方式，任选其一)
   1. 项目根目录下执行`mvn -X clean package -Dmaven.test.skip=true -Ptest`编译打包（注：-Ptest中的test为环境标识），然后cd到blog-web目录下执行`java -jar target/blog-web.jar`
   2. 在`blog-web`项目根目录下执行`mvn spring-boot:run`(注，如果报依赖错误，可在相关的依赖模块先执行install操作)
   3. 直接运行`BlogWebApplication.java`
7. 浏览器访问`http://127.0.0.1:8443`
8. `blog-admin`项目的启动方式与`blog-web`类似，请参考上面的使用说明

# 后续扩展
- [ ] 1. 页面缓存
- [ ] 2. cc防护
- [ ] 3. 配套小程序
- [ ] 4. 待续...
...

----

# 交流


 **QQ群** 

[![](https://images.gitee.com/uploads/images/2019/0129/191256_a40bceba_784199.png)](https://shang.qq.com/wpa/qunwpa?idkey=7d23cc6bf35386d5b2f3a0f5ed3067105c57c2da327a091d09692f605aaf3a97)


# 特别感谢

- 广大的开源爱好者
- 无私的网友
- [gentelella](https://github.com/puikinsh/gentelella): 一款开源的Bootstrap3后台管理模板
- [七牛云](https://portal.qiniu.com/signup?code=3l8yx2v0f21ci): 强大的对象存储、CDN等服务提供商
- [emoji表情列表](https://github.com/caiyongji/emoji-list#nature): emoji表情列表
- [blog-hunter](https://github.com/zhangyd-c/blog-hunter): 博客猎手，基于webMagic的博客爬取工具，支持慕课、csdn、iteye、cnblogs、掘金和V2EX等各大主流博客平台。
- 待续...

# 开源协议

[![license](https://img.shields.io/badge/license-GPL%20v3-yellow.svg)](#/blob/master/LICENSE)
