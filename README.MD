#### 物流路径优化系统需求分析报告
组长：戴林甫


####一、	系统功能需求
前期通过详细的系统调查和分析，了解到用户要求系统实现以下功能
系统主页 

主页包含系统Logo，信息导入模块，地图标注和计算模块，算法实现模块， 绘制地图模块。
其他页面
除了每个页面具体的功能，都包含主页上面的头部，可以点击页面上的相应基础模块，跳转至主页。 

1.基本信息录入功能：
导入中心点和服务点


2.地图标注和计算模块功能：

将中心点标注为红点，将服务点用小红旗标注。计算各个点之间的时间和距离。




3.算法实现模块功能：执行算法，运行程序。



4．绘制地图模块功能：
得到一个可以选择距离最近或时间最短的表格，点击你想要的表格中的结果，会将通过算法计算出来的最优路径在地图上标记出来。

（二）系统安全需求
1.系统使用人员拟分为2类：教师和开发人员，教师具有操作权限，包括各个功能，开发人员可以修改源代码。
2.系统代码不能用明码表示，即网站浏览者不能通过另存为等方式查看网站后台代码
3.网站内的资源不能用迅雷、快车、qq旋风等下载工具下载
4.网页屏蔽鼠标右键功能
5.系统具备定期自动备份数据的功能
（三）系统运行环境要求
1.服务器运行环境
设备名称
设备描述
PC服务器
CPU:1.0Hz；内存:2GB；硬盘:40GB
操作系统
Windows 2003 Server 简体中文版
数据库
SQL Server 2000 标准版或企业版（支持高版本SQL）
服务器Web支持
IIS 5.0及以上，.NET 4.0框架
带宽
100Mbps独享带宽

2.客户端运行环境
设备名称
设备描述
PC
CPU:1.0Hz；内存:2GB；硬盘:40GB
操作系统
Windows 2000/XP/Vista/7,64bit操作系统、Mac系统
浏览器
IE6.0以上版本、谷歌浏览器、FireFox、Opera、Safari等

（四）系统性能及可靠性需求分析
1. 在10个用户并发下，事务响应时间小于3秒，服务器CPU峰值在70%左右；
2. 系统提供5*24小时的连续运行，平均年故障时间<10天，平均故障修复时间<3天；
3. 系统须能够防止各类误操作可能造成的数据丢失或破坏。

