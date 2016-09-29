# JElastic
基于JFinal实现了ElasticSearch 基本api

初衷，在开始了解ElasticSearch时，发现网上的用java实现其api的例子很少，基于框架实现的更少。所以自己在学习elasticsearch写了这个项目。
该项目不是jfinal集成elasticSearch完美的解决方案，只是对elastic基本的api做了一些实现，供初学者借鉴。
抱砖引玉，希望会看到更好的Elastic集成项目

# 如何启动
该项目不需数据库，如果之间了解过Jfinal的话，就很简单。
导进eclipse，用jetty 启动InitConfig.java。
默认端口是9001，判断是否成功启动只需访问localhost:9001，浏览器出现hello woody，证明启动成功
是不是很简单。
注意：jdk是1.8

# 准备环境
在使用之前需要安装并启动elasticsearch
我在官网下载的版本是2.4.0，java环境用jdk1.8的，解压到D盘，启动bin文件夹的elasticsearch.bat

# 如何使用
创建索引,创建一个woodytest01索引：localhost:9001:/elastic/api/createIndices
创建配置属性索引,创建一个woodytest01索引：localhost:9001:/elastic/api/createIndicesSetting
插入或修改一条索引：localhost:9001:/elastic/api/insertRecords
获取一条索引：localhost:9001:/elastic/api/getIndice
根据条件查询索引：localhost:9001:/elastic/api/queryIndices
