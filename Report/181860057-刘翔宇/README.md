# 软件工程实验6

## 181860057 刘翔宇

### 一 git本地修改，提交，回退

#####  1. filemanager-0.5 目录下执行git init，创建仓库

<img src=".\ref\init.png" style="zoom:80%;" />

##### 2. 在master分支下进行首次commit

<img src=".\ref\initial_commit.png" alt="image-20211118185857098" style="zoom:80%;" />

##### 3. 使用git log查看日志，此时有initial commit记录

<img src=".\ref\initial_log.png" alt="image-20211118185957191" style="zoom:80%;" />

##### 4. 修改源代码，（添加一个函数）

<img src=".\ref\revise_code.png" alt="image-20211118190310027" style="zoom: 50%;" />

##### 5.使用git status查看修改的文件

<img src=".\ref\git_status.png" alt="image-20211118190435470"  />

##### 6. 使用git diff 比较文件不同，可以看到添加的函数

<img src=".\ref\git_diff.png" alt="image-20211118190546232" style="zoom: 80%;" />

##### 7.将新的修改commit到master分支，可以看到log中有两条commit记录

<img src=".\ref\git_log2.png" alt="image-20211118190657812" style="zoom: 67%;" />

##### 8.将代码回滚到initial版本，git log可以看到只有一条commit记录了

![image-20211118190819523](.\ref\git_reset.png)

##### 9. 工作区的代码也成功恢复到上一版本了

<img src=".\ref\code2.png" alt="image-20211118190910357" style="zoom: 67%;" />



### 二 git创建分支并合并

##### 1. git branch创建新的分支first_branch，并切换到新分支中。

![image-20211118192026273](.\ref\git_branch.png)

##### 2. 在first_branch上提交代码

![git_add_first_branch](.\ref\git_add_first_branch.png)

##### 3. 创建second_branch，并切换

![second_branch](.\ref\second_branch.png)

##### 4. 在second_branch上提交

![git_add_second_branch](.\ref\git_add_second_branch.png)

##### 5. 创建thrid_branch并切换

![third_branch](.\ref\third_branch.png)

##### 6. 在thrid_branch上提交

![git_add_third_branch](.\ref\git_add_third_branch.png)

##### 7. 合并分支

![merge](.\ref\merge.png)

##### 8. git log --graph展示分支图

![git_log_graph](.\ref\git_log_graph.png)



### 三 git为稳定版本打tag

![git_tag](.\ref\git_tag.png)



### 四 相关问题

##### 1 使用git的好处

(1) 本地可进行版本管理，更加便捷进行代码版本的修改和回退。与SVN相比分布式管理，更加方便。当本地代码相对完善后，再选择要提交的版本，提交到远程仓库。

（2）快速建立与合并分支，在分支上进行修改，最终合并到主干上。便于大型项目协作开发和管理。

（3）可以方便地同各种远程仓库进行交互，便于社区交流

##### 2 使用远程仓库的好处

（1）可以将本地代码push到远程仓库进行保存，避免本地项目丢失

（2）便于进行远程的团队协作开发，便于开发者相互交流

（3）形成github等开源社区，便于开发者相互交流学习，资源共享。

##### 3 在开发中使用分支的好处

（1）当进行团队协作开发时，在原版本代码基础上进行分组开发，就可以使用分支维护代码。不同分支上的开发过程相互独立。添加一个新功能时，也可以使用新分支，避免污染源代码。当该分支代码进行检查和测试后，再合并到主分支上，维护了master分支上代码的完整性和可用性，保证主线代码时稳定的。由此规范了整个软件开发的流程。

（2）同时git可以fork不同软件项目的分支，从开发者fork下原repo后，在自己的软件仓库中建立分支并开发测试，当测试完毕后，可以向主仓库提交merge request，从而将新开发的内容合并到主仓库，推动了开源社区的发展。

##### 4 merge与rebase的区别

merge会生成新的commit，并且将新的commit添加到当前分支的提交记录上。rebase不会生成新的合并的commit，提交记录里只有原有commit，没有分支合并的commit。

##### 5 reset和revert的区别

reset为回退，将指定的commit信息回退，此时Head指针反向移动，之前的commit信息消除。revert用于反转提交，回滚到之前的commit记录中，反转过程会生成新的commit记录，因此Head指针将继续向前移动。

##### 6 stash

stash用于保存工作“现场”，在未来可以恢复工作现场。可以多次stash，并查看stash的列表来选择性恢复。

##### 7 cherry-pick

当我们希望将一个branch的部分工作，合并到另一个branch时，可以使用cherry-pick。cherry-pick可以选择一个分支的一个或多个commit，提交到另一个分支中。





