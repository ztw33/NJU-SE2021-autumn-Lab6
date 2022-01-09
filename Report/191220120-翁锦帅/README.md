一 实验名称 软件工程实验六: 项目协同开发管理与工具集成环境实验

二 git diff,git log,git stastus等命令演示

1.将selab6这个文件夹进行git init初始化为git仓库 

2.新建readme.txt文件，并进行编辑“this is for selab6” 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image001.png)

3.git add readme.txt，添加到暂存区

4.git commit -m "first commit"将暂存区文件提交到master分支中 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image002.png)

5.git log查看历史提交记录

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image003.png)

6.返回工作区修改readme文件，添加一行“show what I learn about git” 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image004.png)

7.git diff查看修改与上个版本的区别，显示添加了一行

8.再次git add并git commmit“second commit” 

9.再次git log查看历史提交记录，显示有两次commit 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image006.jpg)

10.继续在工作区修改readme文件，添加一行“hello world” 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image007.png)

11.进行git status命令，告诉我们readme文件被修改了，但是还没有提交， 

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image008.png)

12.我们并不想进行这次提交，因为hello world和se实验关系不大，遂使用git checkout -- readme.txt进行回退，发现文件回到了second commit的版本

![img](file:///C:/Users/86153/AppData/Local/Temp/msohtmlclip1/01/clip_image009.png)

三 将初始版本与修改版本推送到远端

1.在账户上新建一个仓库，取名为lab6-filemanagerpro，将本地仓库与该新仓库相链接

2.本地master分支上git add并git commit初始代码；新建分支modi，在新分支上git add并git commit修改后代码；

3.使用git merge合并分支后git push推送到远程仓库

4.从[longxueyuehuazhan](https://github.com/longxueyuehuazhan)/NJU-SE2021-autumn-Lab6上git clone样本，修改report与project文件夹后push到远程仓库

5.pull request请求合并

四 一些问题

1.使用git的好处

git优点在于方便进行分支管理，创建、切换、删除分支都很快（相对SYN等版本控制系统而言）

熟悉git指令后操作很迅捷

2.使用远程仓库的好处

本地拥有版本库，版本后退非常方便；

远程仓库不占用本地资源，便于软件开源，代码共享，群智化编程，集齐众智

3.在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

使用分支可以用不同分支处理不同的任务，减少不同任务的相互影响；同时也可以清晰看到代码的迭代更新过程。在新的分支上面编写代码，在编写完成测试完成后再合并到主分支中，可以保证主分支的完整性和可用性，确保了主分支的代码都是稳定的可以发布的代码。

实际开发中就是发现分支管理的特色就是维持一个稳定的代码主分支，保障他是可以运行的，其他添加的功能代码需要验证确认之后才会并入主分支，保证了分支的稳定性，也使得模块化的程序设计更凸显了层次化与结构化。

 