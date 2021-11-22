# 项目协同开发管理与工具集成环境实验实验报告



| 学号      | 姓名   |
| --------- | ------ |
| 191220162 | 张乐简 |

[TOC]

## 概述

​		实验三中，我添加两个功能“拓展背景颜色”和“优化权限描述”。本实验将在color和permission两个分支上完成它们的实现，并最终将这两个分支并入master。在此过程中，也将依次展示项目修改、项目回退、项目提交到过程。最后，本实验为稳定版本打上标签v1.0并提交。

## 实验过程

​		由于两个分支的创建、修改、合并过程没有太多不同，报告中将仅仅展示color分支的修改，也将用它演示回退和合并的操作。

### 仓库建立和分支建立

​		利用git init创建仓库，并用git add remote将本地仓库和远端的SE3仓库关联起来。接着，使用git checkout -b color，创建color分支。结束后，git的状态如下：

​	 ![image-20211122180742296](ref\image-20211122180742296.png)

​		接着，打开预订要修改的array.xml文件，做出一些修改并commit。代码修改前：

```xml
    <string-array name="themes">
        <item>@string/light</item>
        <item>@string/dark</item>
    </string-array>
```

```xml
    <string-array name="themes">
        <item>@string/light</item>
        <item>@string/dark</item>
   +    <item>@string/orange</item>
   +    <item>@string/red</item>
   +    <item>@string/blue</item>
    </string-array>
```

​	修改后如上。进行add，git状态如下：

![image-20211122181100002](ref\image-20211122181100002.png)

​	显示array.xml被修改了，再进行commit操作。

![image-20211122181214702](ref\image-20211122181214702.png)

​	![image-20211122181243263](\ref\image-20211122181243263.png)

​     这操作也被log记录下来了。接着，回滚到修改前的状态。

​		![image-20211122181405258](ref\image-20211122181405258.png)

​		成功。经过一大串代码修改，color分支的工作最终完成。进行add后，git状态如下：

![image-20211122181853860](ref\image-20211122181853860.png)

​		commit之后，将color分支merge回master。

![image-20211122182044088](ref\image-20211122182044088.png)

​		以同样的方式对“权限描述优化”做管理。一切修改结束后，给稳定版本打上v1.0的tag。

![image-20211122182747752](ref\image-20211122182747752.png)

​		最后，将修改push至远端仓库。

![image-20211122182643748](ref\image-20211122182643748.png)

## 反思

​		git是极为方便的工具，开发中我曾多次不慎将代码改出不知名又不知如何修复的错误，依靠git成功回退到正确版本。但是在多人协作中，需要尤其注意冲突的问题。之前与同学合作时我也曾用git进行过管理，但由于协商不到位，产生了多次冲突，最后到了无从解决的地步，只好强制推送到远端。