# 软件工程实验六: 项目协同开发管理与工具集成环境实验

## 1.安装git

一开始尝试在`windows`上直接使用`git`，后考虑到使用习惯和管理的不便，遂使用`wsl1+ohmyzsh`的组合。
    
## 2.git使用

### 2.1 `git init`

当前目录下创建`git`仓库，或重新初始化，是开始使用`git`管理代码的第一步，本地分支初始默认为`master`。

```bash
➜  seg-03 git init
hint: Using 'master' as the name for the initial branch. This default branch name
...
Initialized empty Git repository in /mnt/c/Users/kw9w/desktop/seg-03/.git/
➜  seg-03 git:(master) ✗ git init
Reinitialized existing Git repository in /mnt/c/Users/kw9w/desktop/seg-03/.git/
```

### 2.2 `git remote`

对远程仓库进行操作

#### 2.2.1 `git remote add name url`
    
这条命令我比较常用，用于添加远程主机，相较`git clone`我更喜欢使用`git remote` + `git pull`

```bash
➜  seg-03 git:(master) ✗ git remote add orgin git@github.com:kevin999wang/lab3-AmazeFileManager.git
```

#### 2.2.1 `git remote -v`


### 2.3 `git pull`

该命令取回远程主机某个分支的更新，再与本地的指定分支合并。

一般情况下，只需使用`git pull name branch`，该命令是

### 2.4 `git branch`


## 3.github远程仓库


## 4.PR提交


## 5.回答问题

1.使用 git 的好处？
 - 

2.使用远程仓库 (如 github/gitee 等) 的好处？
 - 哪怕本地使用git记录了日志，备份了每一个版本，但仍旧不能避免本地环境崩溃可能带来的严重后果，所以将本地git推送到远程仓库，

3.

## 6.总结


自己平时也已经养成了使用git和远程仓库的习惯，但因为大多数场景下都是一个人的场景，多用于保存，备份代码，很少像实际开发那样有版本迭代，回退，合并等，使用的命令大多就那几个，所以对git的认知算不上完备，这次实验也算是拓展并稍微实践了一些更贴经工程场景的使用吧。
git发展至今，功能已经很完善了，我们可以通过-h来查看说明和参数的使用，很难将它们全部记住，要做的就是记住尽量多的常用命令，以及多实践使用，这样下一次-h之后可以很快上手。
