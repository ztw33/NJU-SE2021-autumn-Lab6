# Lab 6

| 姓名   | 学号      |
| ------ | --------- |
| 卢润邦 | 191220072 |



## 实验流程

### 前置杂项

首先在`github`上建立一个`repo`，然后复制下面的命令将本地仓库和远程仓库进行一个关联。

![image-20211119210859743](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211119210859743.png)

### git基础操作展示

**我的设想是修改一个颜色，并且添加一个简单而无用的界面。所以打算开两个分支。**

+ git checkout

  使用如下图所示的命令从当前分支**新建并切换**一个新的分支，因为之前已经建立了，所以报错。

![image-20211123140308254](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123140308254.png)

+ git branch

  使用如下命令查看所有branch情况，如下图，我已经新建了两个branch，当前处于second-branch![image-20211123142125215](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123142125215.png)

+ git commit

  写的时候发现有个返回按钮没加，于是顺手commit一下，暂存到local。

  ![image-20211123142824003](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123142824003.png)

+ git diff

  展示second-change和main分支的区别，下面略去细节，这个意思是second-change的第1行起23行与main的第一行起51行有差别

  ![image-20211123143117898](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123143117898.png)

+ git log

  使用如下命令查看log记录，可以用下方向键浏览，按q退出，亦可输出重定向某个txt

  ![image-20211123143619703](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123143619703.png)

+ git status

  如下图，该命令用于显示工作目录和暂存区的状态，因为我刚刚commit了，所以现在很干净

  ![image-20211123144238903](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123144238903.png)

+ git reset

  **后悔药**，如下图，根据`hashid`，可以回退到我的bug fixed的版本。

  ![image-20211123144607887](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123144607887.png)

  更多option可以参考ide提供的ui界面

  ![image-20211123144710449](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123144710449.png)

+ git merge

  如下图，我将修改字体颜色的分支merge到main中了，接着将second-change也merge进来，因为没有冲突，所以可以直接merge。

  ![image-20211123144834444](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123144834444.png)

  ![image-20211123144950815](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123144950815.png)

+ git log --graph

  下面是完整的log图，比较线性

  ![image-20211123145146782](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123145146782.png)

+ git push

  最后push到远程仓库，奇怪的是，这里可以使用git push，好像从21年几月起一直要用token。

  ![image-20211123150747088](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123150747088.png)

+ git tag

  给merge后的版本打个tag，然后再push，这个时候因为没有更新的commit所以git push的参数不太一样（主要是最后演示push的时候忘了）

  ![image-20211123200943345](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123200943345.png)

​				![image-20211123201238504](C:\Users\runbanglu\AppData\Roaming\Typora\typora-user-images\image-20211123201238504.png)



### 更多

+ 使用git的好处，git本质上是一个DAG图，他的特性使得我们方便版本管理。
+ 远程仓库的引入使得多人协作开发变得更为便捷，代码在远程仓库的备份使得容灾能力上升。
+ 使用branch的好处，可以尝试添加一些新功能，在code review之前不会干涉到主分支，利于多人协作开发。

### 进阶操作

+ git rebase 和 git merge的区别

  git rebase不会像 merge 一样生成一个合并修改内容的 commit，相当于把 master 分支（当前所在分支）上的修改在 dev 分支（目标分支）上原样复制了一遍

+ git reset 和git revert

  reset相当于把在dag图中把head指针往回指，那么所有更新的更改就不见了。而git revert的作用是通过创建一个新的版本，这个版本的内容与我们要回退到的目标版本一样，但是HEAD指针是指向这个新生成的版本，而不是目标版本。

+ git stash

  用于保存当前的修改，同时回到之前最后一次提交的干净的工作仓库时进行的操作。

