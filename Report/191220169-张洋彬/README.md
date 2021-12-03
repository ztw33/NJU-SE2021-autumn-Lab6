# Report

[TOC]

## 1.实验目标

- 体会git管理代码的版本
- 探索git的各项操作



## 2.操作过程

### 2.1 git reset

![1](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/1.png)
![2](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/2.png)
​	因为之前删除了助教的目录文件和重命名了一些文件夹，使用`git reset`的相关操作回到了最初的版本，然后发现之前添加的库修改了git的配置文件（如下图所示），删除了对应的文件后，再重新添加子模块，git clone源代码。
![2](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/3.png)

### 2.2 git 分支（merge、checkout etc.）

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

### 2.3 git pull

使用`git pull`指令更新绑定的子库（源代码），结果如下：
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/changelines.png)

### 2.4 git diff

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

### 2.5 git status

​	修改工作区后，使用`git status`查看状态，提醒工作区修改未提交
![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/status.png)

### 2.6git merge和git rebase的区别

​	git rebase 和 git merge 一样都是用于从一个分支获取并且合并到当前分支，但是他们采取不同的工作方式：git merge记录了真实的commit情况，包括每个分支的详情，git rebase得到更简洁的项目历史，去掉了merge commit。保留如果想要一个干净的，没有merge commit的线性历史树，那么你应该选择git rebase，如果你想保留完整的历史记录，并且想要避免重写commit history的风险，你应该选择使用git merge

![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/rebase.png)

​	上图是使用git rebase合并后使用`git log --graph`指令查看的合并历史图，可发现与git merge合并不同，只有一条直线，合并了commit历史。



### 2.7 stash的使用

​	保存当前工作进度，会把暂存区和工作区的改动保存起来。执行完这个命令后，在运行`git status`命令，就会发现当前是一个干净的工作区，没有任何改动。使用`git stash save 'message...'`可以添加一些注释
​	`git stash pop `恢复最新的进度到工作区。git默认会把工作区和暂存区的改动都恢复到工作区。操作如下图所示：

![pics](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/stash.png)

## 3. 问题回答

### 3.1 使用git的好处?

- **版本库本地化，支持离线提交，相对独立不影响协同开发。**每个开发者都拥有自己的版本控制库，在自己的版本库上可以任意的执行提交代码、创建分支等行为。例如，开发者认为自己提交的代码有问题？没关系，因为版本库是自己的，回滚历史、反复提交、归并分支并不会影响到其他开发者。
- **更少的“仓库污染”。**git对于每个工程只会产生一个.git目录，这个工程所有的版本控制信息都在这个目录中，不会像SVN那样在每个目录下都产生.svn目录。
- **把内容按元数据方式存储，完整克隆版本库。**所有版本信息位于.git目录中，它是处于你的机器上的一个克隆版的版本库，它拥有中心版本库上所有的东西，例如标签、分支、版本记录等。
- **支持快速切换分支方便合并，比较合并性能好。**在同一目录下即可切换不同的分支，方便合并，且合并文件速度比SVN快。
- **分布式版本库，无单点故障，内容完整性好。**内容存储使用的是SHA-1哈希算法。这能确保代码内容的完整性，确保在遇到磁盘故障和网络问题时降低对版本库的破坏。

### 3.2 使用远程仓库(如github/gitee等)的好处?

- github或gitee是开源网站，可以关注项目，参与项目，关注大牛，积累知识库，可以多学习很多知识，提高学习效率
- 使用远程库管理本地库，本地如果出现问题可下载远程库的内容
- 利于多人合作，多人可以fork远程仓库并发出pull request申请融合本地修改
- 方便操作，管理者也可以设置权限，使得部分内容透明或部分内容对外不可见，管理项目十分方便

### 3.3 在开发中使用分支的好处?你在实际开发中有哪些体会和经验?

- 同时并行推进多个功能开发，提高开发效率

- 各个分支在开发过程中，如果某一个分支开发失败，不会对其他分支有任何影响。失败的分支删除重新开始即可
- 在实际开发中，多个分支可以支持多个版本的文件同时存在，在多人合作或者单人完成多个功能时，能快速进入相应分支做出相应改变，最后解决冲突后merge到主分支即可投入使用。比如这次完成3个功能就在3个分支中实现，最后再merge到主分支中。各个分支的聚合性不能过高，不然在冲突解决时十分麻烦，应该在程序设计初期将为不同的功能或者设计方向创建相应的分支，在相应分支完成相应内容。大大提高了程序开发的效率，节约了程序员的时间与精力






## 4. Pull Request

PR是你向开源社区贡献代码的方式，我们使用提交作业的方式让大家感受向开源项目提交代码的过程。当原作者同意合并时，你的代码就被合并入此项目了(merged)。

> "Pull Request 是一种通知机制。你修改了他人的代码，将你的修改通知原来的作者，希望他合并你的修改，这就是 Pull Request。"这个过程中，还可以进行讨论、审核和修改代码。





## 5. 实验感想

​	这次实验是和实验3一起进行的，但是做实验3的时候误会了实验6的意思，虽然使用了git来管理文件但并不满足实验6的要求，所以在本次实验的开始就git reset到初始版本重新开始，除开master分支外，创建了3个分支分别实现了3个功能，再merge到了master分支中。实验过程中也探索了很多其他的功能，对git的各项操作掌握更加熟悉了，为以后多人合作打好了基础。
