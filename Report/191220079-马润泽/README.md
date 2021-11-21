# 南京大学计算机科学与技术系

## 软件工程实验报告

**实验名称：项目协同开发管理与工具集成环境实验**                

**学**  **号：191220079**                 

**姓**  **名：马润泽**                 

**指导教师：张天**                 

**实验地点：实验楼乙211**                 

**实验时间：2021.11.20**  



### 一. 实验名称

项目协同开发管理与工具集成环境实验



### 二. 实验目的

1. 了解协同开发与持续集成过程。
2. 学会使用项目协同开发管理工具git/github。
3. 了解持续集成并使用jenkins自动构建项目。



### 三. 实验环境

1. 软件： Simple Explorer，Git

2. 硬件： Android版本：Android 11.0 x86_64

   ​			 虚拟机机型：Pixel 2 API 30



### 四. 实验内容

- 安装git，在本地将你的开源项目目录初始化为git仓库(如已有.git文件夹请先删除)。
- 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用git diff,git log,git status等命令展示操作前后的区别。
- 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各分支上进行开发，最终将所有修改合并到master分支上；如有冲突请尝试解决。在报告中展示你的操作，并使用git log --graph命令展示分支合并图。
- 给你的某个稳定版本的代码打上标签。
- 注册github账号，在账号中创建远程仓库(权限请设置为public)；把本地的所有分支和标签推送到远端。
- 使用pull request提交自己的代码和报告(作业提交说明里细)。
- 在报告中回答以下问题：
  - 使用git的好处？
  - 使用远程仓库(如github/gitee等)的好处？
  - 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？



### 五. 实验结果与说明

#### 1. 基础操作

1）在lab3-SimpleExplorer文件夹下新建test.txt文件并将其添加至暂存区，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/add.png)

使用git status命令可以看到暂存区内有等待提交的变化：新文件text.txt。

2）在lab3-SimpleExplorer文件夹下修改文件REANME.md文件中的内容，具体操作为在该文件末尾添加四行并在最后一行添加my test字符串，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/modify.png)

使用git diff命令可以看到文件更改过的位置与具体更改的内容。

3）在lab3-SimpleExplorer文件夹下将步骤1）中的操作进行提交，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/commit.png)

可以看到提交成功，且使用git log命令查看日志，日志中记录下了该操作。

4）想要回退到指定版本，则在日志中查看该版本的编号后使用git reset + 版本号进行版本回退，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/reset.png)

使用git log命令查看日志发现确实已回退到该版本。其中git reset --hard指将工作区也一起回退，此时可以发现在lab3-SimpleExplorer文件夹下的test.txt已经消失。



#### 2. 实验三相关操作

1）在不同的分支上进行修改并最后将其合并至主分支，查看日志文件并绘制点线图，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/log.png)

2）为稳定版本添加tag标签并更新至远程仓库，截图如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/tag.png)

3）关于Pull Request

​		Pull Request 是一种通知机制。你修改了他人的代码，将你的修改通知原来的作者，希望他合并你的修改，这就是 Pull Request。通过Pull Request机制我们可以将自己的实验汇总到一个远程仓库中，进行Pull Request的界面如下：

![](https://raw.githubusercontent.com/Mars-Z777/NJU-SE2021-autumn-Lab6/main/Report/191220079-%E9%A9%AC%E6%B6%A6%E6%B3%BD/ref/pr.png)

​		

在完成标题并留下留言后即可创建一个Pull Request。若取得原作者同意，则你修改的部分将并入主仓库，否则要求驳回。



#### 2. 问题

##### 1）使用git的好处？

- 具有本地版本库，可以随时进行版本回退。
- 具有分支功能，可以自由修改而不必担心污染源码。
- 与远程仓库交互方便。

##### 2）使用远程仓库(如github/gitee等)的好处？

- 将项目保存在云端，防止本地由于各种硬件原因而导致的数据丢失。
- 方便进行项目的协同开发。

##### 3）在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

**分支的好处：**

- 版本迭代清晰，隔离性好。
- 每个人都拥有独立分支，可以一起进行修改，开发效率高。
- 有利于代码回退，减少bug。

**个人体会**：git和github对于项目开发绝对是益处很大的。尽管现阶段对于git命令等使用还不熟悉，但早日熟悉这种开发手段肯定是有百利而无一害的。事实上，在另一门课Java高级程序设计中，我们所有的作业都是通过github保存并提交的，早期同样使用Pull Request，现在则使用Github Classroom。
