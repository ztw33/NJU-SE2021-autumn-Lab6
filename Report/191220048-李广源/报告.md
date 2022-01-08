## <center><font size="8" style="font-family:楷体">南京大学</font></center>

## <center><font size="7" style="font-family:华文行楷">计算机科学与技术系</font></center>

## <center><font size="6" style="font-family:华文新魏">软件工程实验报告</font></center>



<font size="4" style="font-family:楷体">				实验名称：软件实现和构建实验<br>				学&nbsp;&nbsp;&nbsp;&nbsp;号：191220048<br>				姓&nbsp;&nbsp;&nbsp;&nbsp;名：李广源<br>				指导老师：张天<br>				实验地点：实验楼乙208<br>				实验时间：2021.11.18<br>
</font> 

<font style="font-family:楷体">

### <font style="font-family:楷体">一、实验名称</font>

​	项目协同开发管理与工具集成环境实验

### <font style="font-family:楷体">二、实验目的</font>

+ 了解协同开发与持续集成过程
+ 学会使用项目协同开发管理工具git/github
+ 了解持续集成并使用jenkins自动构建项目

### <font style="font-family:楷体">三、实验要求</font>

+ 安装 git，在本地将你的开源项目目录初始化为 git 仓库
+ 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别
+ 针对实验三针对几个页面进行修改的任务，在本地为每个子任务创建一个分支并在各 分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报告中展示你的操作，并使用 git log --graph 命令展示分支合并图
+ 给你的某个稳定版本的代码打上标签
+ 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；把本地的所有分支 和标签推送到远端
+ 使用 pull request 提交自己的代码和报告

### <font style="font-family:楷体">四、实验内容</font>

1、初始化git仓库

​	在空文件夹下，使用命令git init，把当前目录变为Git管理的仓库

​	将开源app2 FileManagerPro初始源码拷贝到当前目录

​	然后依次执行命令git add . ，git commit -m "begin exp"将文件提交到仓库中

2、git diff、git log、git status命令

+ git diff：不带参数用于查看暂存区快照和工作目录的差异

​	修改build.gradle文件，执行git diff结果如图

![NJU-SE2021-autumn-Lab6/1.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/1.png)

+ git log：用于显示提交日志，如图

![NJU-SE2021-autumn-Lab6/2.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/2.png)

+ git status：用于显示工作目录和暂存区的状态，如图

![NJU-SE2021-autumn-Lab6/3.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/3.png)

工作区目录修改有：

​	未提交文件：build.gradle文件，相较于上一次提交有修改但未被提交

​	未跟踪文件：example4gitdiff.txt，指新加入的未被git add的文件

3、创建分支与合并

创建分支：

+ 分支addButton，about界面添加返回按钮

![NJU-SE2021-autumn-Lab6/4.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/4.png)

+ 分支changeButton，修改按钮图标

![NJU-SE2021-autumn-Lab6/5.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/5.png)

+ 分支addActivity，添加界面

![NJU-SE2021-autumn-Lab6/6.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/6.png)

合并分支：

![NJU-SE2021-autumn-Lab6/8.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/8.png)

​		合并分支过程中存在冲突，在res/menu/folder_browser.xml处，手动解决冲突后，重新提交发生冲突的文件

![NJU-SE2021-autumn-Lab6/7.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/7.png)

分支间git log图：  

![NJU-SE2021-autumn-Lab6/9.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/9.png)

4、添加标签：在需要添加的标签的分支处使用命令git tag "标签名"即可

5、推送仓库至远端

![NJU-SE2021-autumn-Lab6/10.png at main · li112358/NJU-SE2021-autumn-Lab6 (github.com)](https://github.com/li112358/NJU-SE2021-autumn-Lab6/blob/main/Report/191220048-李广源/ref/10.png)

### <font style="font-family:楷体">五、实验感想</font>

使用git的好处：

①使用git最大的好处在于可以在本地离线工作实现分布式开发，开发人员将远程代码pull到本地上，然后可以直接在本地离线进行代码编写。编写完成后，在push到远程。

②对于多人开发中冲突问题的解决，git提供了良好的冲突检测以及冲突解决方法，可以先pull到本地，在本地合并分支解决冲突后在push到远程。

③git的本地拥有版本库，随时能进行版本后退，能更好地管理代码。

④git的分支本质是一个指针，这使得git通过指针修改来创建、修改分支，使得分支切换更加灵活便捷。

使用github的好处：

能帮助我们更好的管理代码，同时便捷了我们进行多人分布式开发的步骤，大大提高开发效率。

开发中使用分支的好处：

①开发中创建分支能够保证在程序发生不可挽回的错误时回退到上一个稳定的版本

②分支的创建能使得对同一程序互不影响的多个功能同步开发
