# NJU-SE2021-autumn-Lab6

Nanjing University Software Engineering course lab6

## 作业提交流程

1. 在本地安装好`git`，在`github`上注册账号并登录；
2. fork本仓库至自己账户，假设仓库url为`https://github.com/example/NJU-SE2021-autumn-Lab6`；
3. 在本地clone自己fork的仓库 (`example/NJU-SE2021-autumn-Lab6`)
   - 对于实验报告
     - 在本机的仓库下，进入`Report`目录，新建子目录`学号-姓名`，如`191220000-张三`，将你的实验报告命名为`README.md`，新建文件夹`ref`用以放置引用的图表文件。将报告和引用文件拷贝至`191220000-张三`目录下，执行`git add`, `git commit`和`git push`等命令将本地代码推送到你fork的远程仓库里(`example/NJU-SE2021-autumn-Lab6`)
   - 对于实验三的代码
     - 在你的github账户中为你分配到的android项目新建一个单独的仓库 (如`example/lab3-goodweather`)，并将本地仓库与远程仓库关联；
     - 在开发过程中使用`git add`, `git commit`和`git push`等命令提交代码到`example/lab3-goodweather`仓库中；
     - 在本机进入到`Project`目录下，执行`git submodule add https://github.com/example/lab3-goodweather 191220000-张三` (以自己的学号姓名替换)
     - *注：在提交之前可能需要先更新fork的仓库，或者手动解决冲突*

4. 在`example/NJU-SE2021-autumn-Lab6`上创建`pull request`, 请确保提交时无冲突

## 作业提交要求

- 实验报告使用`markdown`格式

