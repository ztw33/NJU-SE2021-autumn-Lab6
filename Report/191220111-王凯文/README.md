# 软件工程实验六: 项目协同开发管理与工具集成环境实验

191220111 王凯文

mailto:191220111@smail.nju.edu.cn

## 1.安装git

一开始尝试在`windows`上直接使用`git`，后考虑到使用习惯和管理的不便，遂使用`wsl1+ohmyzsh`的组合。
    
## 2.git使用

### 2.1 `git init`

当前目录下创建`git`仓库，或重新初始化，是开始使用`git`管理代码的第一步，本地分支初始默认为`master`。

![](./ref/git_init/1.png)
![](./ref/git_init/2.png)

### 2.2 `git remote`

对远程仓库进行操作

#### 2.2.1 `git remote add name url`
    
这条命令我比较常用，用于添加远程主机，相较`git clone`我更喜欢使用`git remote` + `git pull`

可以同时为一个本地仓库添加多个远程主机

![](./ref/git_remote/1.png)

#### 2.2.2 `git remote -v`

这条命令可以查看远程主机的详细信息

![](./ref/git_remote/2.png)


### 2.3 `git pull`

该命令取回远程主机某个分支的更新，再与本地的指定分支合并。

一般情况下，只需使用`git pull name branch`，该命令是获取远程分支，再与本地分支进行合并，相当于先`git fetch`，再`git merge`

![](./ref/git_pull/1.png)


### 2.4 `git branch`

#### 2.4.1 `git branch -m name`

修改当前分支的名字，有时候默认本地仓库初始化为`master`分支，而远端为`main`，我们可以修改分支名让本地远端对应分支命名保持一致，以简化后续操作。

![](./ref/git_branch/1.png)

#### 2.4.2 `git branch newBranchName`

创建新分支，也可使用`git checkout -b name`(创建新分支并切换到该分支)

想要在远端创建新分支，等同于在本地创建后推送到远端。

![](./ref/git_branch/2.png)

#### 2.4.3 `git branch -a`

该命令可以查看当前本地和远端的所有分支，并指出当前所在分支（*号指示）。

![](./ref/git_branch/3.png)

![](./ref/git_branch/4.png)


### 2.5 `git checkout`

#### 2.5.1 `git ckeckout name`

切换到该分支

![](./ref/git_checkout/1.png)

实验3中我们增加一个新功能，就是先创建一个分支，如上图切换到该分支，进行常规的开发即可

#### 2.5.2 `git ckeckout -b name`

创建分支并切换到该分支

![](./ref/git_checkout/2.png)

### 2.6 `git add && git commit`

`git add`作用为将修改的文件添加到暂存区，`git add .`是将当前目录下所有更改，`git add fileName`是添加某个文件或文件夹等，一般直接使用`git add .`。

`git commit`作用是提交暂存区的内容，

![](./ref/git_add_commit/1.png)

修改内容没有`add`前，我们可以用`git diff`和`git status`查看，会显示内容修改

`git diff`会比较当前文件和暂存区的不同，此时当前已修改，变化还未添加到暂存区

`git status`会显示上次提交后对文件有没有修改，也会提醒我们是`add`了，还是没`add`

![](./ref/git_add_commit/3.png)

![](./ref/git_add_commit/4.png)

修改内容`add`后，`git diff`会清空，`git status`状态发生改变

![](./ref/git_add_commit/6.png)

修改提交后，我们可以通过`git log`查看修改的日志，`git status`发生改变

![](./ref/git_add_commit/5.png)

![](./ref/git_add_commit/2.png)


### 2.7 `git merge && git rebase`

两者都是用来合并分支，当主分支提交了新分支，而你的个人分支还是从老的版本的主分支创建的，这时候你要将主分支的更新内容合并到你的个人分支，就有两个选择使用`git merge`还是`git rebase`。

本地写了一个小`sample`，我们可以通过`git log`查看`merge`和`rebase`两种操作的区别。

 - git merge

`git merge`使用非破环性的操作，所有的`commit`记录都会被保留，个人分支使用时会显得很混乱，如果5个人合作，那么你的代码历史树就会有5个`branch`和主分支交织在一起。

![](./ref/git_merge_rebase/1.png)

 - git rebase

`git rebase`会将个人分支移动到主分支的顶端，主要好处是可以获得更清晰的项目历史，会产生线性的历史记录，但`rebase`会丢失合并提交的上下文。我们需要遵循黄金规则，即永远不要在公共分支上使用它，而是在个人分支上使用它。

![](./ref/git_merge_rebase/2.png)

当然，`git rebase`还有交互式等进阶功能，此处不再复述。

总之，主分支为了显示不同分支的合并等需要`merge`操作，而个人分支为了保证代码历史数的纯洁清爽，最好使用`rebase`操作。


### 2.8 `git reset && git revert`

当我们发现提交了错误代码，就需要使用`git reset`或`git revert`回退版本。

本地写了一个小`sample`。

删除前`git log`如下： ![](./ref/git_reset_revert/1.png)

 - git reset

`git reset`会直接删除掉某次提交，以此来回退，是不可反悔的，永久删除，如果修改已经提交到远程，我们还需要使用`git push -f`强制推送。

![](./ref/git_reset_revert/2.png)

![](./ref/git_reset_revert/3.png)

 - git revert

`git revert`会通过生成一次新的提交来回退到之前的版本，如果我们后悔了，还可以回退到该放弃的`commit`版本。

`git revert`回退需要从新版本想老版本逐个回退，可以使用`git revert old_commit^..new_commit`批量回退

![](./ref/git_reset_revert/4.png)

![](./ref/git_reset_revert/5.png)


在企业的现实场景中，都是尽量使用git revert，毕竟就算是错误的版本，也得把完整的log留下来。


### 2.9 `git stash && git cherry-pick`

`git stash`用来暂存当前已修改但还没有`commit`的代码，回到上一次的`commit`版本。

`git cherry-pick`不同于合并，它可以选择某个分支的某一个`commit`应用到其他分支。

一个实际的场景就是，你在`dev`上工作，但之前从`dev`合并到`master`的代码出现了`bug`，你先将`dev`上的修改`stash`起来，切换到`master`去修改`bug`，修改完了你会到`dev`，取出之前的`stash`继续工作，这时候可以通过`cherry-pick`把修改`bug`的那一次提交拿过来修复`dev`上的`bug`。


## 3.实验三相关

实验三微调三个任务，所以创建了三个分支，分别是`addNewFunc-01`，`addNewFunc-02`，`addNewFunc-03`，前两个是修改了控件，第三个是创建了一个新控件并关联一个新页面，为了清晰地展示`git log`，每个分支只进行了少量的`commit`操作，

先换到主分支，再用`git merge`合并其他分支到主分支。

合并`addNewFunc-01`如下，没有遇到冲突，自动合并：

合并`addNewFunc-02`，因为初始分支都是由`master`的`init`创建出来，分支一作了部分修改后合并到主分支，再合并分支二时同一个文件产生了冲突，如下：

![](./ref/git_merge/1.png)

产生冲突后，在相应文件中可以看到冲突的具体位置，我们选择要接受的修改，手动解决冲突后。

![](./ref/git_merge/2.png)

使用`git status`可以查看当前的`git`状态，再做一次`git add/commit`提交即可解决冲突，完成合并。

![](./ref/git_merge/3.png)

合并`addNewFunc-03`如下，没有遇到冲突，自动合并：

![](./ref/git_merge/4.png)

`git log --graph` 命令展示分支合并图如下：

其中`*`表示一次`commit`，`|`表示分支前进，`/`表示分叉，`\`表示合入

![](./ref/git_merge/5.png)


## 4.版本打标签

对每一个更新的相对稳定的版本的`commit`，我们可以为其打上标签来标记，

```bash
## 可以使用如下命令打tag，-a会创建注释，并标明何人何时所打，-m添加注释，commit版本可以让我们对以前的版本追加标签
git tag -a <tagname> -m "message" <某个commit版本>
```

可以通过git log查看先前某个commit版本的版本号，只取其前几位可以区分即可。

![](./ref/git_tag/2.png)

之后，即可创建自己想要的tag

![](./ref/git_tag/1.png)

创建完后，我们可以通过git log查看tag。

![](./ref/git_tag/3.png)

可以使用git tag查看本地已经打的所有标签。

![](./ref/git_tag/4.png)


## 5.github远程仓库

使用github也有挺久的了（虽然可能不是很熟练），账号里新建public权限的仓库，与本地实验三建立链接后，使用git push将分支和tag都push到github仓库即可，

```bash
## 如下命令推送分支，name为远程仓库标签，branch_local是对应本地分支，branch_remote是要推送到远端的对应分支
git push name branch_local:branch_remote

## 如下命令将所有tags推送到远端
git push name --tags
```

![](./ref/git_push/1.png)

可以在github仓库内看到，已同步。

![](./ref/github/1.png)

![](./ref/github/2.png)


## 6.Jenkins持续集成

近期以来，在各种代码托管平台，都能看到持续集成（CI/CD等）作为一个突出功能作为宣传，但自己因为没有使用场景，所以对其的了解很少，只是经常看到这样关键词，也大概了解到持续集成在真实场景中是团队经常使用的功能。

之前使用的最接近的场景可能就是使用github action根据分支的commit自动构建部署网站了。

1.安装Jenkins
 - 因为之前已经安装了JDK，所以直接安装Jenkins
 - 去[jenkins官方网站](jenkins.io)下载并安装windows版本即可
 - 按照安装流程设置一个自己喜欢的端口
 - 通过{127.0.0.1:port}访问Jenkins继续完成设置，![](./ref/jenkins/1.png)
 - ANDROID_HOME 地址和 JAVA_HOME 地址在课程初始就已经设置，现设置Gradle地址
   - 先在[gradle官方网站](https://gradle.org/releases/)下载6.7.1版本（与项目版本一致）
   - 安装gradle：下载后解压到指定目录
   - 在系统环境变量中添加路径{C:\Program Files\Gradle\gradle-6.7.1\bin}
   - 重启终端中，查看gradle是否生效 ![](./ref/jenkins/2.png)

2.配置Jenkins
 - 在Jenkins网页管理面板Global Tool Configuration中设置Jdk和Gradle，还有git 
    ![](./ref/jenkins/3.png)
    ![](./ref/jenkins/4.png)
    ![](./ref/jenkins/8.png)

3.构建
 - create a job，新建任务，选择Freestyle ![](./ref/jenkins/5.png)
 - 链接到github仓库 ![](./ref/jenkins/6.png)
 - 源代码管理中添加远程连接 ![](./ref/jenkins/9.png)
 - 添加github poll trigger（当github有push时，自动构建） ![](./ref/jenkins/7.png)
 - 第一次手动构建，成功 ![](./ref/jenkins/10.png)

4.commit后构建
 - 之前更改已提交，为了演示，添加一行空行并commit ![](./ref/jenkins/12.png)
 - 本想在github工程的settings中设置webhook实现自动构建，后发现需要Jenkins暴露外网，本地机器无IP地址，遂放弃，服务器部署应当可行。 ![](./ref/jenkins/11.png)
 - 只能采取手动构建，成功，通过输出日志，发现已经拉取了最新版本。 ![](./ref/jenkins/13.png)



## 7.PR提交

Pull request是我们在github上参与别人项目的方式，我们fork别人的仓库，自己做了某些修改，觉得很不错，想要贡献出去，就要提PR，但是在我们修改的过程中，fork的原仓库，即upstream可能做了某些更新，我们可以在本地添加上游仓库的远程，来fetch/rebase更新，也可以借助github网页的fetch and merge

![](./ref/PR/1.png)

我在本地fetch并rebase远端，存在冲突，解决后，提交即可

![](./ref/PR/2.png)

![](./ref/PR/3.png)


## 8.回答问题

1.使用 git 的好处？
 - 可以方便我们管理代码，及时地备份代码
 - 当出了问题时，我们可以采用回退的方式，回退到上一个稳定的版本
 - 可以更好地记录自己的进度，安排工作的流程

2.使用远程仓库 (如 github/gitee 等) 的好处？
 - 哪怕本地使用git记录了日志，备份了每一个版本，但仍旧不能避免本地环境崩溃可能带来的严重后果，所以将本地git推送到远程仓库，可以拥有备份，以防万一，可以将同一份代码同时推送到多个不同的远程仓库
 - 可以更好地进行团队协作
 - 可以分享自己的项目（开源）
 - 可以参与/学习别人的项目

3.在开发中使用分支的好处？你在实际开发中有哪些体会和经验？
 - 使用分支，可以想沙盒一样将每个功能场景的开发分开，保证了开发某一个场景时是独立的，不会产生混乱的管理等问题，一个人按序开发不同的功能可能没有什么感觉，但如果很多人同时开发不同的功能分支就显得很必要。
 - 此外，分支也可以清晰地区分不同的版本等，比如stable，beta，dev等。
 - 平时自己也使用git，但多是一个人项目的记录等，这次实际的开发让自己认识到了git在正式多人协同场景的必要性和方便性。


## 9.总结


自己平时也已经养成了使用`git`和远程仓库的习惯，但因为大多数场景下都是一个人的场景，多用于保存，备份代码，很少像实际开发那样有版本迭代，回退，合并等，使用的命令大多就那几个，所以对`git`的认知算不上完备，这次实验也算是拓展并稍微实践了一些更贴经工程场景的使用吧。

`git`发展至今，功能已经很完善了，我们可以通过`-h`来查看说明和参数的使用，很难将它们全部记住，要做的就是记住尽量多的常用命令，以及多实践使用，这样下一次`-h`之后可以很快上手。

持续集成蛮有意思的，而且在实际工程场景中也得到了广泛的应用。
