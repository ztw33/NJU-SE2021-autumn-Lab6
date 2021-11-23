# lab 6 report

## git diff, git log, git status

下面我将展示我在实验3中的探索

    git diff

![](ref/git_diff.jpg)

    git log

![](ref/git_log.jpg)


    git status

![](ref/git_status.jpg)

也展示下回退的情况
    git reset

![](ref/git_reset.jpg)

## 实验3中的git 使用

首先创建3个分支用于修改

    git checkout -b first
    git checkout -b second
    git checkout -b third

在完成修改后进行commit

    git commit -am "update"

![](ref/git_commit.jpg)

切换回main 分支

    git checkout main

![](ref/git_checkout.jpg)

进行merge操作

    git merge first
    git merge second
    git merge third

最后展示分支图

    git log --graph

![](ref/git_log_graph.jpg)

## 打上标签

    git tag v1.0

![](ref/git_tag.jpg)

## 问题回答

1.可以有效、高速地处理项目版本管理，分布式的控制处理，可以克隆别人的仓库，在自己的机器上个性化创建分支，修改代码。可以合并分支，提交代码，完成合作项目的功能。

2.远程仓库指托管在因特网或其他网络中的你的项目的版本库，是管理软件开发以及发现已有代码的首选方法。可以完成与他人协作涉及管理远程仓库。让你可以在其它位置通过远程仓库工作，仍然可以进行推送、拉取和抓取操作。

3.利用分支处理不同的任务，减少代码相互间的影响。保证主分支的完整性和可用性，无论你在分支进行了怎样的修改，主分支的代码都是稳定的。同时便于协同开放，比如有A、B、C等三个开发者，他们可以每人分别创建一个分支进行开发，最后合并。我们实验三中也有这样的要求，每一控件的修改创建一个分支，互不干涉，一旦出现问题也很容易回退解决。



