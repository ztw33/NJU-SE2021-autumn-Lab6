# Report

[TOC]

## 实验目标

- 体会git管理代码的版本
- 探索git的各项操作



## 操作过程

### git reset

![1](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/1.png)
![2](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/2.png)
​	因为之前删除了助教的目录文件和重命名了一些文件夹，使用`git reset`的相关操作回到了最初的版本，然后发现之前添加的库修改了git的配置文件（如下图所示），删除了对应的文件后，再重新添加子模块，git clone源代码。
![2](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/3.png)

### Git 分支（merge、checkout etc.）

- 使用`git checkout -b work1`***创建并切换***到work1分支
  
  - 完成**图表修改**后使用`git add .`与`git commit -m "add icon"`提交修改,之后使用`git checkout master`切换回master分支
  
- 使用`git checkout -b work2`***创建并切换***到work2分支
  - 完成**更新系统**后使用`git add .`与`git commit -m "add update"`提交修改,之后使用`git checkout master`切换回master分支

- 使用`git checkout -b work3`***创建并切换***到work3分支
  - 完成**重启应用**后使用`git add .`与`git commit -m "add restart"`提交修改,之后使用`git checkout master`切换回master分支
  
       在完成三项更改后，使用`git merge work1` ,`git merge work2`,`git merge work3`三条指令融合所有修改，使用`git log --graph`查看，结果如下：

![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/merge.png)

​	可见 work1、work2、work3都成功merge到了master分支上

> 由上图可见，给初始版本打的tag也显示了出来

### git pull

使用`git pull`指令更新绑定的子库（源代码），结果如下：
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/changelines.png)

###git diff
> 首先明确3个概念，工作区（working tree），暂存区（index/stage）与本地仓库（repository）
>
> 1.git diff:查看working tree和index的区别
>
> 2.git diff --cached：查看index与repository的区别
>
> 3.git diff HEAD：查看working tree和repositoy的差别

更新代码后，不使用git add，使用`git diff`指令查看区别，结果如下：
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/diff.png)
先使用`git diff --cached`指令，因为没有提交到暂存区，本地库和暂存区一致，然后使用`git add .`指令将所有文件添加到暂存区，再使用`git diff --cached`查看，结果如下：
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/diff_cached.png)
然后检查`git diff HEAD`的指令，HEAD指最新commit的版本，然后修改工作区的内容，使用该指令查看区别，结果如下：
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/diff_HEAD.png)

可见，diff三种参数形式对应不同的diff检查，经探索，在合适的情况使用合适的参数即可。

### git status

​	修改工作区后，使用`git status`查看状态，提醒工作区修改未提交
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/status.png)


## Pull Request

PR是你向开源社区贡献代码的方式，我们使用提交作业的方式让大家感受向开源项目提交代码的过程。当原作者同意合并时，你的代码就被合并入此项目了(merged)。

> "Pull Request 是一种通知机制。你修改了他人的代码，将你的修改通知原来的作者，希望他合并你的修改，这就是 Pull Request。"这个过程中，还可以进行讨论、审核和修改代码。
