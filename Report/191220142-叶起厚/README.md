# 软件工程实验六: 项目协同开发管理与工具集成环境实验

## git操作

### 修改文件后查看变化

`git diff`

![](ref\diff.png)

`git status`

![](ref\status.png)

### 回退操作

- 把git add多余的取消缓存

  `git reset file`

  ![](ref\reset_file.png)

- 返回上一次commit

  `git reset --hard [hash]`

![](ref\reset_commit.png)

### 分支创建、切换与删除

`git checkout -b`：`git branch ...`创建和`git checkout`切换的组合。

`git branch -d`：分支删除

`git branch`：查看分支

![](ref\branch.png)

### 分支合并

`git merge`

![](ref\merge.png)

### 查看合并情况

`git log --graph`

![](ref\log.png)

### 打标签

`git tag`

![](ref\tag.png)

### 添加缓存并提交

`git add`、`git commit`、`git push`：

![](ref\push.png)

## 问题

- 使用 git 的好处？

使用git可以方便的管理自己的代码，并将代码回退到自己所希望的版本，以防修改代码时出错后无法挽回；同时也可以创建分支将不同任务分开进行管理。

- 使用远程仓库 (如 github/gitee 等) 的好处？

可以将自己的代码保存在远程仓库中，以防代码丢失；可以与他人在不同地方进行远程项目的开发和合作。

- 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

使用分支可以 将不同的任务分开管理，而不会将所有任务集合在一起以防一个没有做好而连累其他任务。

感悟到了在项目的开发过程中通过使用分支，能够合理有规划地管理自己的任务。