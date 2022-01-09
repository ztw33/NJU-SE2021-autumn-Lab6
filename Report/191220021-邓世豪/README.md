### Git 指令展示

> image0是编写本文件之前`git log`指令的截图

![](ref/image0.png)

​		在report/ref中添加了image0.png图片，并在README.md中写下以上内容后，分别执行 ``git status`` 和 ``git diff``：

#### git status		

`git status` 命令查看工作区的状态：![](ref/image1.png)

​		可以看到显示修改了README.md文件(也即当前编辑的文件)，并且没有将这个修改**staged**，[之后](#1)将使用 `git add` 指令将它从**工作区**添加到**暂存区**；另外还显示添加的image0.png是**untracked**状态，同样可用 `git add` 将其添加到**暂存区**。

#### git diff

`git diff` 命令查看

![](ref/image2.png)

​		

可以看到 `git diff` 指令显示了工作区文件的修改情况

