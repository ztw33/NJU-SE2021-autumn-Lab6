#### 南京大学

#### 计算机科学与技术系

#### 软件工程实验报告

#### 实验名称：项目协同开发管理与工具集成环境实验

#### 学号：191220044

#### 姓名：荆绍祖

#### 指导教师：张天

#### 实验地点：实验楼乙117

#### 实验时间：2021.12.27







#### 一、实验目的：

• 了解协同开发与持续集成过程

• 学会使用项目协同开发管理工具 git/github

• 了解持续集成并使用 jenkins 自动构建项目



#### 二、实验内容：

• 安装 git，在本地将你的开源项目目录初始化为 git 仓库 (如已有.git 文件夹请先删除)

• 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别

• 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各 分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报 告中展示你的操作，并使用 git log --graph 命令展示分支合并

• 给你的某个稳定版本的代码打上标签

• 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；把本地的所有分支 和标签推送到远端

• 使用 pull request 提交自己的代码和报告 (作业提交说明里细 )

• 在报告中回答以下问题：

• 使用 git 的好处？

• 使用远程仓库 (如 github/gitee 等) 的好处？

• 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

• 如果你额外学习并实践了关于 git/github 的其他进阶操作 (如 merge 和 rebase 的区别、reset 和 revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示



#### 三、实验结果：

1. ##### 安装 git，在本地将你的开源项目目录初始化为 git 仓库

   初始化：![1](C:/Users/user/Desktop/ref/1.png)

   ![2](C:/Users/user/Desktop/ref/2.png)

2. ##### 在本地尝试修改、提交、回退等过程，在报告中展示你的操作，并使用 git diff, git log, git status 等命令展示操作前后的区别

   第一次提交：![3](C:/Users/user/Desktop/ref/3.png)

   第二次提交：![4](C:/Users/user/Desktop/ref/4.png)

   ![6](C:/Users/user/Desktop/ref/6.png)

   实验三对代码进行修改后

   git diff：![7](C:/Users/user/Desktop/ref/7.png)

   git status:![8](C:/Users/user/Desktop/ref/8.png)

   git log:![9](C:/Users/user/Desktop/ref/9.png)

   git add . :![10](C:/Users/user/Desktop/ref/10.png)

   git diff & git log :![11](C:/Users/user/Desktop/ref/11.png)

   git status :![12](C:/Users/user/Desktop/ref/12.png)

   git log:![13](C:/Users/user/Desktop/ref/13.png)

   git commit :![14](C:/Users/user/Desktop/ref/14.png)

   git diff & git status:![15](C:/Users/user/Desktop/ref/15.png)

   git log:![16](C:/Users/user/Desktop/ref/16.png)

   git reset:![17](C:/Users/user/Desktop/ref/17.png)

   git diff:![18](C:/Users/user/Desktop/ref/18.png)

   git status:![20](C:/Users/user/Desktop/ref/20.png)

   git log:![19](C:/Users/user/Desktop/ref/19.png)

   ​	在修改完代码后，使用git diff会产生提交的版本和现在修改的版本的不同，会把所有修改的部分都使用红色字体标出来。使用git status后会用红字标明修改的文件和添加的文件（提交的版本与当前的版本）并提示你add和commit。git log会标明在当前提交版本中的HEAD指针的位置和当前提交过的版本的相关信息。在git add .后。使用git diff未出现提示。使用git status后会用绿字标明修改的文件和添加的文件（提交的版本与当前的版本）并提示commit。使用git status后会用提示你不需要提交，工作区已清空。git log会产生新提交后的版本的相关信息。

3. ##### 根据实验三针对几个页面进行微调的任务，在本地为每个子任务创建一个分支并在各 分支上进行开发，最终将所有修改合并到 master 分支上；如有冲突请尝试解决。在报 告中展示你的操作，并使用 git log --graph 命令展示分支合并图

   我创建了三个分支，步骤如下

   （1）建立除master之外的分支![21](C:/Users/user/Desktop/ref/21.png)

   （2）进入branch1并提交![23](C:/Users/user/Desktop/ref/23.png)

   （3）进入branch2，对代码进行修改并提交![24](C:/Users/user/Desktop/ref/24.png)

   ![25](C:/Users/user/Desktop/ref/25.png)

   （4）对branch3分支做出同样的操作

   （5）切换到master分支，进行merge合并branch1、2、3![26](C:/Users/user/Desktop/ref/26.png)

   ![](C:/Users/user/Desktop/ref/28.png)

   （6）使用 git log --graph 命令展示分支合并图![27](C:/Users/user/Desktop/ref/27.png)

4. 给你的某个稳定版本的代码打上标签

   使用git tag命令给版本打上标签![29](C:/Users/user/Desktop/ref/29.png)

5. ##### 注册 github 账号，在账号中创建远程仓库 (权限请设置为 public)；把本地的所有分支 和标签推送到远端

   （1）创建远程仓库

   （2）推送![31](C:/Users/user/Desktop/ref/31.png)

6. ##### 使用git的好处：

   （1）使用git可以很方便地进行版本控制，便于项目的版本管理

   （2）可以创建分支进行修改，也可以回退版本

   （3）不仅能保存目录和文件的当前状态，还能够保存每一个提交过的历史状态。

   （4）可以查看修改人、修改时间、修改内容、日志信息。

   （5）便于比较代码修改前后的区别，观察各个版本之间的关系，梳理复杂的项目开发流程

7. ##### 使用远程仓库 (如 github/gitee 等) 的好处？

   （1）远程仓库保存了所有版本信息和数据，且更为稳定，在本地出现问题时便于恢复

   （2）不同成员可以高效便捷地实现代码分享与融合操作，便于代码的保存、共享和协同开发

8. ##### 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

   （1）使用分支可以同时并行推进多个功能开发，提高开发效率

   （2）如果某一个分支开发失败，不会对其他分支有任何影响，容错性高

   （3）使得开发过程的结构更加清晰，便于对代码进行管理和修改

   在本次开发过程中，通过对每个修改建立一个分支，可以在当前修改出现问题时进行回退而不需要重新开始，提高了效率

9. ##### 如果你额外学习并实践了关于 git/github 的其他进阶操作 (如 merge 和 rebase 的区别、reset 和 revert 的区别、stash, cherry-pick 的使用等)，可在报告中展示

   - git stash：能够将所有未提交的修改（工作区和暂存区）保存至堆栈中，用于后续恢复当前工作目录
   - merge和rebase的区别：rebase不会保留被merge分支上的所有commit，只讲被merge分支上的最后一次修改作为新的修改merge到当前分支
   - reset和revert的区别：reset是回退，将HEAD指针沿着链表指向要回退到的版本，取消该版本后的修改；revert是反做，在HEAD基础新建一个版本，这个版本通过修改当前HEAD版本的信息（逆向），使新的版本与要回退的版本一致，同时commit的这个新的版本，这样原来的版本的链表是不会改变的
   - cherry-pick：cherry-pick可以将多个分支合并起来，如果有冲突，在解决完冲突之后可以--continue继续合并，也可以--abort终止合并。

10. ##### 在本机安装 jenkins，并在全局工具配置和系统设置中配置好 JDK 地址、Gradle 地址、 ANDROID_HOME 地址和 JAVA_HOME 地址 • 新建任务，在源码管理中填写自己项目的 github 地址，对项目进行一次构建 • 修改代码再次推送到 github 仓库中，再次对项目进行构建

    - 安装jenkins![34](C:/Users/user/Desktop/ref/34.png)

    - 配置地址![35](C:/Users/user/Desktop/ref/35.png)

      ![36](C:/Users/user/Desktop/ref/36.png)

    - 新建任务![37](C:/Users/user/Desktop/ref/37.png)

    - 对项目进行一次构建，修改代码再次推送到 github 仓库中，再次对项目进行构建<img src="C:/Users/user/Desktop/ref/38.png" alt="38" style="zoom: 80%;" />

    