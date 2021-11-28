---
typora-root-url: ref
---

# 实验6 191220087 钱思辰

#### 实验内容

###### 安装git

由于开发的需要，git早在本机上已经安装完毕，故忽略此步骤。

###### 初始化

`git init`即可。由于开发的代码内容是远程下载，故忽略此步骤。由下载远程仓库内容替代。

###### ------>下载远程仓库内容

![1](https://github.com/PetraEcho/NJU-SE2021-autumn-Lab6/blob/main/Report/191220087-钱思辰/ref/1.png)

> 说明：
>
> `git remote add [shortname] [url]`添加远程版本库
>
> `git remote`显示所有远程分支
>
> `git remote -v`显示所有远程仓库

![2](2.png)

> 说明：
>
> `git clone [url]` 拷贝一个 Git 仓库到本地
>
> 需要注意的是，有时候github的链接不稳定，需要手动添加sshkey来辅助链接：可以参考[CDSN:windows git：添加SSH key.](https://blog.csdn.net/weixin_43344725/article/details/83388291)来添加SSHKEY

<img src="15.png" alt="15" style="zoom: 50%;" />

###### 修改和提交

![](4.png)

> 说明：
>
> `git add`：
>
> ```c
> git add [file1] [file2] ...//添加一个或多个文件到暂存区
> git add [dir]//添加指定目录到暂存区，包括子目录
> git add .//添加当前目录下的所有文件到暂存区
> ```
>
> `git commit`
>
> 需要先设置提交的用户信息，包括用户名和邮箱：
>
> ​	`$ git config --global user.name 'runoob'`
> ​	`$ git config --global user.email test@runoob.com`
>
> ```c
> git commit -m [message]//提交暂存区到本地仓库中
> git commit [file1] [file2] ... -m [message]
>     //[message] 可以是备注信息，提交暂存区的指定文件到仓库区
> git commit -a//-a 参数设置修改文件后不需要执行 git add 命令，直接来提交
> ```
>
> `git push`
>
> ```c
> git push <远程主机名> <本地分支名>:<远程分支名>//将本地的分支版本上传到远程并合并
> git push <远程主机名> <本地分支名>//如果本地分支名与远程分支名相同，则可以省略冒号
> git push --force origin master//强制推送可以使用 --force 参数
> git push origin --delete master//删除主机的分支可以使用 --delete 参数
> ```

###### 回退

<img src="12.png" alt="12" style="zoom: 80%;" />

<img src="5.png" style="zoom:67%;" />

> 说明：
>
> `git log`列出历史提交记录
>
> `git reset [--soft | --mixed | --hard] [HEAD]`回退版本，可以指定退回某一次提交的版本

###### 一些其他的操作

`git diff`:

git diff 命令比较文件的不同，即比较文件在暂存区和工作区的差异。

git diff 命令显示已写入暂存区和已经被修改但尚未写入暂存区文件对区别。

git diff 有两个主要的应用场景。

- 尚未缓存的改动：**git diff**

- 查看已缓存的改动： **git diff --cached**

- 查看已缓存的与未缓存的所有改动：**git diff HEAD**

- 显示摘要而非整个 diff：**git diff --stat**

- ```c
  $ git diff [file]
  $ git diff [first-branch]...[second-branch]
  ```

![11](11.png)

![13](13.png)

![14](14.png)

`git status`:

![10](10.png)

##### 分支开发

![6](6.png)

![7](8.png)

创建分支命令：`git branch (branchname)`

切换分支命令:`git checkout (branchname)`

当你切换分支的时候，Git 会用该分支的最后提交的快照替换你的工作目录的内容， 所以多个分支不需要多个目录。

合并分支命令:`git merge` 

> 分支合并图的检查
>
> `git log --graph`:拓扑图查看历史中什么时候出现了分支、合并
>
> <img src="7.png" alt="8" style="zoom: 67%;" />

##### GIT相关问答

• 使用 git 的好处？

本地拥有版本库，随时进行版本后退、非常简单的建立分支。

在分布式版本控制系统中，客户端并不只提取最新版本的文件快照，而是把原始的代码仓库完整地镜像下来。这么一来，任何一处协同工作用的服务器发生故障，事后都可以用任何一个镜像出来的本地仓库恢复。这类系统都可以指定和若干不同的远端代码仓库进行交互。籍此，你就可以在同一个项目中，分别和不同工作小组的人相互协作。你可以根据需要设定不同的协作流程。

 • 使用远程仓库 (如 github/gitee 等) 的好处？

一是可以作为本地仓库的一个备份，这样项目会更有保险。 

二是有了远程仓库更方便团队的协作开发。分布式开发时，可以git clone克隆一个本地版本，然后在本地进行操作提交，本地可以完成一个完整的版本控制。在发布的时候，使用git push来推送到远程即可。

 • 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

用简单且便捷的方式管理版本：git分支的本质是一个指向提交快照的指针，速度快、灵活，分支之间可以任意切换。支持同时并行推进多个功能的开发，提高开发效率。各个分支在开发过程中，如果某一个分支开发失败，不会对其他分支有任何影响。.失败的分支删除重新开始即可。

