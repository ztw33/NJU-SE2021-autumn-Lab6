# Report

![1](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/1.png)

​	因为之前删除了助教的目录文件和重命名

## 操作过程

- 使用`git checkout -b work1`***创建并切换***到work1分支
  - 完成**图表修改**后使用`git add .`与`git commit -m "add icon"`提交修改,之后使用`git checkout master`切换回master分支

- 使用`git checkout -b work2`***创建并切换***到work2分支
  - 完成**更新系统**后使用`git add .`与`git commit -m "add update"`提交修改,之后使用`git checkout master`切换回master分支

- 使用`git checkout -b work3`***创建并切换***到work3分支
  - 完成**重启应用**后使用`git add .`与`git commit -m "add restart"`提交修改,之后使用`git checkout master`切换回master分支
  
  ​     在完成三项更改后，使用`git merge work1` ,`git merge work2`,`git merge work3`三条指令融合所有修改，使用`git log --graph`查看，结果如下：
  ![4](https://raw.githubusercontent.com/bbzunyi/NJU-SE2021-autumn-Lab6/main/Report/191220169-张洋彬/ref/4.png)

## Pull Request

PR是你向开源社区贡献代码的方式，我们使用提交作业的方式让大家感受向开源项目提交代码的过程。当原作者同意合并时，你的代码就被合并入此项目了(merged)。

> "Pull Request 是一种通知机制。你修改了他人的代码，将你的修改通知原来的作者，希望他合并你的修改，这就是 Pull Request。"这个过程中，还可以进行讨论、审核和修改代码。

