# Lab6 Report

## 1.使用修改、提交、回退功能

### （1）修改

​	将原中文README文件最后添加一行，然后git add，可以看到：

![](./ref/6.png)

![](./ref/1.png)

​	README文件已被修改，提示的警告是结尾的换行符被自动替换，没有什么影响。

​	使用git status可以看到：

![](./ref/2.png)

​	README_zh-CN已被修改，但还没有被提交。

### （2）提交

​	再使用git commit提交，可以看到：

![](./ref/3.png)

​	一个文件已被修改，有添加和删除。

​	此时使用git log可以看到：

​	![](./ref/4.png)

​	最新的HEAD版本已经是init x版本，即README_zh-CN被修改过的版本，而由于没有使用git push，远程库仍然是init版本，即README_zh-CN没有被修改过的版本。

​	使用git status可以看到：

![](./ref/5.png)

​	没有需要提交的更改了。

### （3）回退

​	使用git reset可以看到：

![](./ref/7.png)

​	最新HEAD版本又回到了init版本。

​	使用git log可以看到：

![](./ref/8.png)

​	本地的HEAD版本和远程库的版本相同了，均为init版本。

​	再看看README_zh-CN文件，可以看到：

![](./ref/9.png)

​	最后被添加的那一行又消失了。

## 2.分支

### （1）创建一个dev分支

​	使用git checkout -b dev命令，可以看到：

![](./ref/10.png)

​	一个新的分支名叫dev已经被创建，并且已经切换到该分支。

​	使用git log，可以看到：

![](./ref/11.png)

​	HEAD分支是dev分支，除此之外还有远程库和master分支。

### （2）合并分支

​	在本次实验中，我主要创建了三个dev分支，分别为dev1、dev2和dev3，其中dev1和dev3修改的是同一个文件的不同地方，而dev2修改的是另外的文件。如图：

![12](./ref/12.png)

​	其中original是原版，下面要做的就是将三个dev分支合并到master上。

​	切换到master分支，首先使用git merge dev1，可以看到：

![](./ref/13.png)

​	合并成功，且没有冲突，是一个fast forward。

​	再使用git merge dev2，可以看到：

![](./ref/14.png)

​	由于dev2与dev1修改的是不同的文件，所以合并成功，没有冲突，且使用的是递归的合并策略。

​	最后使用git merge dev3，可以看到：

![](./ref/15.png)

​	由于dev3与dev1修改的是同一文件的不同地方，所以存在冲突，无法合并，需要手动解决冲突。

​	使用git status，可以看到冲突文件：

![](./ref/16.png)

![](./ref/17.png)

​	其中HEAD即为master分支，其中是我dev1修改过的部分，需要保留，故删除下面dev3的部分。

​	最后再git add和git commit可以看到：

![](./ref/18.png)

​	合并成功。

​	输入git log --graph，可以看到：

![](./ref/19.png)

​	可以看到从最初的init，到dev1是fast forward的，直接切换HEAD，然后与dev2合并，没有冲突，最后与dev3再合并，解决冲突，合并成一个master分支。

## 3.问题

### （1）

​	git可以帮助我们高效地管理自己的代码，便于大家协同开发但又不会影响各自的开发，可以自由地创建和切换分支，并可以容易地进行分支合并。

### （2）

​	便于大家协同开发，也可以让某个人使用不同的机器，在不同的场景下通过远程仓库进行工作。

### （3）

​	使用分支可以保证有一个稳定可用的主分支，大家同时基于主分支进行开发，各自之间独立，不会产生影响，所以出错也可以很容易地回退到之前的版本。在这次开发中，便可以发现，在更改不同空间时创建不同的分支，可以方便调试，即使出错也可以直接退回之前的版本。
