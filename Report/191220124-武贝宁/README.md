# 实验6 项目管理

191220124 武贝宁

### 1.安装git，在本地将你的开源项目目录初始化为git 仓库(如已有.git 文件夹请先删除)

`git init`后，用`git add .`命令将当项目中所有文件存入主分支（是为原始代码）

### 2.在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用git diff, git log, git status 等命令展示操作前后的区别

这里新建一个文件夹test，并进行init用于演示。

我们这里创建一个test.txt文件进行测试，并用`git add` 和`git commit -m "Initial commit"`命令将文件上传。

![1.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/1.png?raw=true)

然后利用命令`git checkout -b test1`，创建测试分支test1

然后将test1分支下的text.txt文件内容改为123456789，这里如果没有add和commit，输入`git status`就可以看到git的提示:text.txt没有被记录并commit。

![2.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/2.png?raw=true)

然后用`git log`命令，这里我们就能看到之前的两次commit记录。

![3.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/3.png?raw=true)

使用`git diff test1 master`，查看两个分支上文件的不同。

![4.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/4.png?raw=true)

为了进行回退操作，我们记录下想要回退到的最初版本Initial commit的commit id前四位9fd5，然后用

`git reset --hard 9fd5`进行版本回退。

![5.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/5.png?raw=true)

可以看到，test1分支已经回到了最初的版本，再次使用git diff命令，两个分支下的文件没有不同。

![6.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/6.png?raw=true)



### 3.根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各分支上进行开发，最终将所有修改合并到master 分支上；如有冲突请尝试解决。在报告中展示你的操作，并使用git log --graph 命令展示分支合并图

#### <1>子任务1：添加了一个跳转到关于界面的按钮

![7.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/7.jpg?raw=true)

在对Modify1分支下的文件完成修改操作后，在该分支下进行add,commit等一系列操作

![8.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/8.png?raw=true)

#### <2>子任务2：将文件名添加了浅黄背景色，并放大了字体。

![9.jpg](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/9.jpg?raw=true)

![10.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/10.png?raw=true)

#### <子任务3>添加了一个跳转到分享界面的按钮

![11.jpg](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/11.jpg?raw=true)

![12.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/12.png?raw=true)



#### 然后进行代码的合并

合并Modify1时成功。

![13.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/13.png?raw=true)

合并Modify2时发生冲突。

![14.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/14.png?raw=true)

根据给出的信息，我们去fragment_detail.xml文件下查看具体代码

![15.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/15.png?raw=true)

可以看到是这里发生了冲突，我们对发生问题的代码进行修改。

修改后编译运行，可以看到已经将子任务1和子任务2的修改合并了。

<img src="https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/16.png?raw=true" alt="16.png" style="zoom: 33%;" />



然后在合并Modify3分支时又发生了冲突。

![17.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/17.png?raw=true)

这次在java文件中也发生了冲突，同样进行修改。

修改后可以看到子任务3中做的改动也已经成功合并了。

<img src="https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/18.png?raw=true" alt="18" style="zoom: 33%;" />

`git log --graph`执行结果如下：

![19.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/19.png?raw=true)

### 4.给你的某个稳定版本的代码打上标签

![20.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/20.png?raw=true)

合并后，将所有分支都打上了v1.0.0的标签。

### 5.注册github 账号，在账号中创建远程仓库(权限请设置为public)；把本地的所有分支和标签推送到远端

这里因为我之前已经注册了账号，同时在作业刚开始做的时候就已经创建了远程仓库并关联了，所以这里就不再展示具体操作了。

这里是一张已经将所有分支和tag推送到远端的截图。

![21.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/21.png?raw=true)

### 6.使用pull request 提交自己的代码和报告

略

### 7.在报告中回答以下问题：

- #### 使用git 的好处？

能更加方便的管理代码的不同版本，能随时进行回退。

- #### 使用远程仓库(如github/gitee 等) 的好处？

将代码保存在远端会更加安全和方便。当本地文件丢失时也能从远程仓库拷贝一份最新版本的代码，当自己的设备不在身边时也能从远程仓库克隆进行开发。

- #### 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

可以方便的进行多人协同开发以及对不同子任务的同时开发。

当我在进行一个任务时，不用考虑其他任务的影响，只要分开进行最后再合并和处理冲突即可。

- #### 如果你额外学习并实践了关于git/github 的其他进阶操作(如merge 和rebase 的区别、reset 和revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示

  - #### reset和revert的区别

reset是将head指针直接指向之前的某一次commit，之后的commit会消失（当然还是能够恢复的，但是log里已经看不到了）

revert则是创建一次新的commit，其中的内容是之前某一次commit后的内容。

以我在第一题中创建的test文件夹为例



![22.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/22.png?raw=true)

初始状态有两个commit，其中Modify 1修改了test.txt文件的内容。

然后我们使用`git revert`命令进行回退，可以看到这里生成了一个新的commit` Revert "Modify 1"`，而此时test.txt文件的内容也回到了Initial commit。

![23.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/23.png?raw=true)

如果我们使用`git reset`命令进行回退，可以看到Head指针指向的位置发生了改变，Initial commit之后的所有commit都“消失“了

![24.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/24.png?raw=true)



### 8.在本机安装jenkins，并在全局工具配置和系统设置中配置好JDK 地址、Gradle 地址、ANDROID_HOME 地址和JAVA_HOME 地址

上网查询相关教程，成功在windows系统中安装jenkins，端口号设为7921，这样以后就可以通过域名`localhost:7921`进行访问。

![25.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/25.png?raw=true)

点击Manage Jenkins进入Global Tool Configuration界面进行配置。

首先是jdk的配置，这里选用的版本是`java1.8.0_231`

![26.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/26.png?raw=true)

然后配置gradle，这里我选用的版本号是5.4.1，与项目保持一致。

![27.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/27.png?raw=true)

`JAVA_HOME`和`ANDROID_HOME`之前已经配置过了，在这里我顺带配置了一下`GRADLE_HOME`。（好像就构建项目来说不需要，但还是顺带做了一下）

首先在本地文件中找到gradle的目录，然后添加系统变量，再将`%GRADLE_HOME%\bin`添加进环境变量。

![28.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/28.png?raw=true)

打开cmd，验证发现配置成功。

![29.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/29.png?raw=true)



- #### 新建任务，在源码管理中填写自己项目的github 地址，对项目进行一次构建

  新建一个任务名为`NJU-SE-lab3-AnExplorer`，类型为Freestyle project。

  ![30.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/30.png?raw=true)

  填写我们项目的github地址，并且在Credentials中填写自己github的账号密码，作为登录凭据。

  ![31.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/31.png?raw=true)

  然后就可以点击Build Now进行构建了。

  点击控制台输出可以看到构建过程的信息，结果构建成功。

  ![32.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/32.png?raw=true)

- #### 修改代码，再次推送到github 仓库中，再次对项目进行构建

因为我在使用jenkins之前已经将代码修改任务完成了，因此这里就随便修改了一点（如图，只向一个文件中添加了两行空行）

![33.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/33.png?raw=true)

然后再次进行项目构建。

![34.png](https://github.com/Baykin5/NJU-SE2021-autumn-Lab6/blob/main/Report/191220124-%E6%AD%A6%E8%B4%9D%E5%AE%81/ref/34.png?raw=true)