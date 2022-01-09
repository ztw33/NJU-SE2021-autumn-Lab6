# 实验6 项目协同开发管理与工具集成环境实验

**191220141 叶怀泽**

## 1.实验目的

• 了解协同开发与持续集成过程

• 学会使用项目协同开发管理工具 git/github 

• 了解持续集成并使用 jenkins 自动构建项目

## 2.实验内容

• 安装 git，在本地将你的开源项目目录初始化为 git 仓库 (如已有.git 文件夹请先删除) 

• 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别 

• 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报告中展示你的操作，并使用 git log --graph 命令展示分支合并图 

• 给你的某个稳定版本的代码打上标签 

• 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；把本地的所有分支和标签推送到远端 

• 使用 pull request 提交自己的代码和报告 (作业提交说明里细 ) 

• 在报告中回答以下问题： 

• 使用 git 的好处？ 

• 使用远程仓库 (如 github/gitee 等) 的好处？ 

• 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？ 

• 如果你额外学习并实践了关于 git/github 的其他进阶操作 (如 merge 和 rebase 的区别、reset 和 revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示

## 3.实验过程

### 3.1初始化仓库

<img src="ref\capture_20211123162209384.bmp" alt="capture_20211123162209384" style="zoom: 50%;" />

在github网站上创建lab3的repository。

### 3.2将所有文件添加到暂存区

使用add命令。

<img src="ref\capture_20211123195801481.bmp" alt="capture_20211123195801481" style="zoom: 50%;" />

警告原因为windows换行与linux不同。

### 3.3提交第一次

使用commit命令。

<img src="ref\capture_20211123200057130.bmp" alt="capture_20211123200057130" style="zoom: 50%;" />

### 3.4链接到远程仓库

使用push命令。

<img src="ref\capture_20211123200535635.bmp" alt="capture_20211123200535635" style="zoom:50%;" />

本次提交后，可以在github网站上看到提交的文件。

<img src="ref\capture_20211123201020751.bmp" alt="capture_20211123201020751" style="zoom: 33%;" />

### 3.5修改文件查看结果

将ActivityAbout.java文件注释。

<img src="ref\capture_20211123201308493.bmp" alt="capture_20211123201308493" style="zoom:50%;" />

使用diff指令查看更改。

<img src="ref\capture_20211123201736980.bmp" alt="capture_20211123201736980" style="zoom:50%;" />

最后再次add，commit。

<img src="ref\capture_20211123202042761.bmp" alt="capture_20211123202042761" style="zoom:50%;" />

### 3.6查看提交记录

使用log指令。

<img src="ref\capture_20211123203200304.bmp" alt="capture_20211123203200304" style="zoom:50%;" />

可以看到之前的2次记录和commit的说明。

### 3.7查看状态

使用status指令。

<img src="ref\capture_20211123212454177.bmp" alt="capture_20211123212454177" style="zoom:50%;" />

再次修改文件。

<img src="ref\capture_20211123213940332.bmp" alt="capture_20211123213940332" style="zoom:50%;" />

再次使用status命令

<img src="ref\capture_20211123214118897.bmp" alt="capture_20211123214118897" style="zoom:50%;" />

可以看到我们在上一次commit后做了修改的信息。

### 3.8版本回退

再次add和commit，此时我们有3次commit记录。

<img src="ref\capture_20211123234908326.bmp" alt="capture_20211123234908326" style="zoom:50%;" />

此时用reset指令进行版本切换。

<img src="ref\capture_20211123235125868.bmp" alt="capture_20211123235125868" style="zoom:50%;" />

<img src="ref\capture_20211123235056052.bmp" alt="capture_20211123235056052" style="zoom:50%;" />

可见我们的修改又被还原了。

### 3.9创建分支

#### 3.9.1查看分支

使用branch查看

<img src="ref\capture_20211123235508572.bmp" alt="capture_20211123235508572" style="zoom:50%;" />

可以看到前面的操作均在main进行。

#### 3.9.2创建新的分支并切换

使用checkout -b指令或者branch和checkout指令或者switch -c创建分支并切换到分支。

<img src="ref\capture_20211124204454501.bmp" alt="capture_20211124204454501" style="zoom:50%;" />

可见我们创建了branch2此时在branch2上工作。

### 3.10在分支上操作

这次在newactivity上新增一个按钮。

<img src="ref\capture_20211124204818132.bmp" alt="capture_20211124204818132" style="zoom:50%;" />

使用diff指令可以看到已经检测到了文件变化。

<img src="ref\capture_20211124205002111.bmp" alt="capture_20211124205002111" style="zoom:50%;" />

在当前分支进行add和commit操作。

<img src="ref\capture_20211124205229861.bmp" alt="capture_20211124205229861" style="zoom:50%;" />

同时创建branch3对ActivityAbout增加一行注释并commit，截图省略。

### 3.11合并分支

#### 3.11.1快速合并

使用merge指令，将branch2与main合并。先用switch指令切换到main分支，在对branch2进行合并。

<img src="ref\capture_20211124210829902.bmp" alt="capture_20211124210829902" style="zoom:50%;" />

可见合并成功

#### 3.11.2解决冲突

此时重新在branch2提交一次，switch到main上，main删除按钮，commit提交。

切换到main，使用merge指令，此时将main和branch2合并，则会出现冲突，因为main和branch2在同一文件分别有一次提交。

<img src="ref\capture_20211124211900082.bmp" alt="capture_20211124211900082" style="zoom:50%;" />

使用status查看冲突。

<img src="ref\capture_20211124212008482.bmp" alt="capture_20211124212008482" style="zoom:50%;" />

可以看到有2次提交对同一文件。

<img src="ref\capture_20211124212137412.bmp" alt="capture_20211124212137412" style="zoom:50%;" />

冲突位置也能在文件中看到。

手动更新后commit，就能解决冲突。

#### 3.11.3分支合并关系

使用log --graph指令可以看到分支的操作流程。

<img src="ref\capture_20211124212855002.bmp" alt="capture_20211124212855002" style="zoom:50%;" />

可以看到我们创建了3个分支，数次提交合并并解决冲突后合并到了main中。

### 3.12创建标签

#### 3.12.1对当前分支打标签

切换到当前分支使用tag直接标注就可以了。

<img src="ref\capture_20211124213556482.bmp" alt="capture_20211124213556482" style="zoom:50%;" />

使用tag可以查看打过的标签。

#### 3.12.2对以前的分支打标签

找到直接的commit id，对其进行tag操作就可以。

<img src="ref\capture_20211124213856852.bmp" alt="capture_20211124213856852" style="zoom:50%;" />

### 3.13推送远程仓库

使用push指令即可。

## 4.实验问题

### 4.1使用git的好处是什么？

- 能在本地拥有版本库，可以随时进行版本回退，迁移等操作。
- 能够建立很多分支，可以进行并行开发或者bug，feature开发等等。
- 效率高，使用方便，操作简单。

### 4.2使用远程仓库的好处是什么？

github可以帮助我们托管各种git库，其有强大的克隆功能和分支功能，能够自由参与各种开源项目。同时可以给开源社区贡献自己的代码。

### 4.3在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

分支开发允许大型项目的开发可以并行进行，能够在新的分支上开发新功能而不会影响原有分支的操作，同时能让多人同时在不同的分支上进行开发。让软件开发的效率更高，安全性更好。在本次实验中，使用分支对不同页面进行开发，可以避免以为其中之一出现错误而影响整个开发过程，提高了软件的开发效率。

## 5.其他问题

### 5.1merge和rebase的区别

merge和rebase都是用来合并分支的，区别在于merge不会保留merge的分支的commit，而且会将两个分支的结合起来组成一次新的commit，而rebase会将rebase所在分支的每次依次commit取出，在放置到所合并的分支上。merge能够体现时间线，而rebase会打乱时间线。

### 5.2reset和revert的区别

revert会增加一次commit从而回到之前的commit，而reset会删除指定的commit，而且revert更像是往前commit，reset是返回到之前的commit。

