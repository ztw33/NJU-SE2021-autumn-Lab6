**软工实验报告**



一. 实验名称

项目协同开发管理与工具集成环境实验



二. 实验目的

了解协同开发与持续集成过程 

学会使用项目协同开发管理工具 git/github 

了解持续集成并使用 jenkins 自动构建项目



三. 实验环境

Pixel 2 API 30

JDK1.8.0_231



四. 实验内容

1. Git

   - 安装 git，在本地将你的开源项目目录初始化为 git 仓库 (如已有.git 文件夹请先删除) 
   - 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别 
   - 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各 分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报 告中展示你的操作，并使用 git log --graph 命令展示分支合并图
   - 给你的某个稳定版本的代码打上标签
   - 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；把本地的所有分支 和标签推送到远端
   - 使用 pull request 提交自己的代码和报告 (作业提交说明里细 )
   - 在报告中回答以下问题：
     - 使用 git 的好处？
     - 使用远程仓库 (如 github/gitee 等) 的好处？ 
     - 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？
   - 如果你额外学习并实践了关于 git/github 的其他进阶操作 (如 merge 和 rebase 的区 别、reset 和 revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示



五. 实验过程

1.安装 git，在本地将开源项目目录初始化为 git 仓库，并与github的仓库进行关联

<img src="ref\1.jpg" style="zoom:50%;" />

进行初始化提交，命名为“0”。

添加一个新文件test.txt，编辑文本test,尝试git add 以及git commit:

<img src="ref\2.jpg" style="zoom:66%;" />

重新修改test.txt，不提交，使用git status :

<img src="ref\3.jpg" style="zoom:62%;" />

重新修改test.txt，不进行git add，使用git diff：

<img src="ref\4.jpg" style="zoom:66%;" />

使用git log：

<img src="ref\5.jpg" style="zoom:67%;" />

​				(一共三次commit，第一次“0”，第二次“test1”，第三次“test0”)

使用git reset，发现本地文件未修改，使用git reset --hard可以同时回退本地文件。



2.此处仅考虑两个分支，通过修改test.txt文件来模拟实验修改。

branch1:

<img src="ref\6.jpg" style="zoom:67%;" />

branch2:

<img src="ref\7.jpg" style="zoom:67%;" />

切换回master，查看分支合并图：

<img src="ref\8.jpg" style="zoom:62%;" />

合并branch1：

<img src="ref\9.jpg" style="zoom:55%;" />

合并branch2，查看分支合并图：

<img src="ref\10.jpg" style="zoom:50%;" />

3. 打上标签：

<img src="ref\11.jpg" style="zoom:50%;" />

4.推送分支和标签：

<img src="ref\12.jpg" style="zoom:50%;" />





六. 回答下列问题：

1. 使用git的好处： 便于管理代码版本，便于离线开发等；
2. 使用远程仓库的好吃：保证数据完整性；便于多人开发使用；
3. 使用分支的好处：便于保存各类修改思路，便于分步开发相对较独立的功能，提高效率。