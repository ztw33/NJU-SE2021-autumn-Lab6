# NJU-SE2021-exp6-Report

**实验名称：项目协同开发管理与工具集成环境实验**

**学 号：191220024**

**姓 名： 董森**

**指导教师：张天**

**实验地点：基础实验楼乙**

**实验时间：2021.11.18-2022.1.5**



## 一、实验名称

项目协同开发管理与工具集成环境实验



## 二、实验要求

- 了解协同开发与持续集成过程 
- 学会使用项目协同开发管理工具 git/github 
- 了解持续集成并使用 jenkins 自动构建项目



## 三、实验环境

软件：

- Android 11.0 (Google APIs)x86_64
- Appium 1.18.3
- Android Studio Arctic Fox



## 四、实验内容

### 1、协同开发：

1. 安装 git，在本地将你的开源项目目录初始化为 git 仓库 
2. 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别
3. 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报告中展示你的操作，并使用 git log --graph 命令展示分支合并图
4. 给你的某个稳定版本的代码打上标签
5. 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；
6. 把本地的所有分支和标签推送到远端
7. 使用 pull request 提交自己的代码和报告 (作业提交说明里细 )
8. 在报告中回答以下问题：
   - 使用 git 的好处？
   - 使用远程仓库 (如 github/gitee 等) 的好处？
   - 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？
9. 如果你额外学习并实践了关于 git/github 的其他进阶操作 (如 merge 和 rebase 的区别、reset 和 revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示

### 2、持续集成：

1. 在本机安装 jenkins，并在全局工具配置和系统设置中配置好 JDK 地址、Gradle 地址、 ANDROID_HOME 地址和 JAVA_HOME 地址
2. 新建任务，在源码管理中填写自己项目的 github 地址，对项目进行一次构建
3. 修改代码再次推送到 github 仓库中，再次对项目进行构建



## 五、实验结果

### 1、在本地尝试修改、提交、回退

- 首先修改README.md文件，在其中添加一行 “五、实验结果”，使用`git diff`命令查看修改：

![diff](ref\diff.png)

- 使用`git add`命令将修改加入到暂存区中，并使用`git status`查看状态，可见有修改未被commit：

![add](ref\add.png)

- 使用`git commit`命令提交暂存区内容，然后使用`git log`查看版本状态，可见已经有了一个新的版本，并且HEAD指针也已经指向改版本：

![commit](ref\commit.png)

- 使用`git reset`命令进行版本回退，并使用`git log`查看版本信息，可见HEAD指针已经回退到上一版本了：

  ![reset](D:\SoftwareEngineering\exp6\NJU-SE2021-autumn-Lab6\Report\191220024-董森\ref\reset.png)

- 查看README.md文件，可见修改已被撤销

  ![reset_result](ref\reset_result.png)
