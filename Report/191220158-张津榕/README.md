# 实验6 项目协同开发管理与工具集成环境试验

191220158 张津榕

首先进行`git init`初始化为git仓库    ![1](ref/1.png)

  

再远程连接git仓库  

![2](ref/2.png)

`git add --all`后`git commit` ，很多文件都被commit进去了   

![3](ref/3.png)

查看`git status `   

![4](ref/4.png)



  作为测试，新建文本文档111.txt，内容为111并执行`git add, git status `    

![5](ref/5.png)  

可以看到，出现提示,111.txt未被commit  



输入`git log`查看  

![6](ref/6.png)

输入`git diff`，没反应，将111.txt内容修改为191220158后再`git diff ` 

![7](ref/7.png)

输入`git reset 111.txt` ，再git status查看  

![8](ref/8.png)

  

`git push`,将未修改的代码push入github  

![9](ref/9.png)



`                       git branch` 构建分支  

![10](ref/10.png)

  

`                     git checkout change2`切换分支  

![11](ref/11.png)

  

在构建两个分支的前提下，完成实验，并合并分支  

![12](ref/12.png)

  

随后采用 `git log --graph` 查看合并情况  

![13](ref/13.png)

  

此时已是稳定版本，`git tag`打上标签  

![14](ref/14.png)

  

执行`git push`，将修改好的代码push入仓库即可  

![15](ref/15.png)