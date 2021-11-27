# NJU-SE2021-autumn-Lab6

## 文件删除

1. 在修改文件删除功能时，首先利用git checkout -b DeleteModule，创建DeleteModule分支并切换；输入git branch可以看到目前的分支情况，随后在此分支下修改场景

2. 修改完成并调试通过后，利用git status可以看到被修改的文件

   ![](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\删除模块1.PNG)

3. 之后git add真正需要被提交的dialog_delete.xml文件，再输入git status可以看到此文件已经不在列表中

   ![删除模块2](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\删除模块2.PNG)

4. 此时利用git log --graph查看分支情况

   ![删除模块3](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\删除模块3.PNG)

5. 这时如果发现版本内容出现问题，可以使用git reset --hard HEAD^回到上一个版本，其中HEAD^表示头指针的上一个版本，^^即上上个版本，以此类推；查看分支图，发现已经回到了v1.0的最初稳定版本

   ![删除模块4](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\删除模块4.PNG)

6. 在重新审视代码后，发现原来是虚惊一场，这时候可以用git reset --hard d7fd7回到最新的版本，d7fd7是根据之前的分支图中的commit代码得出的，不用输出完整代码，只需要保证输入的开头独一无二即可；此时查看分支，确实位于之前的最新版本

   ![删除模块5](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\删除模块5.PNG)



## 查看文件属性

1. 修改文件属性场景时，同理建立并切换PropertiesModule分支；修改并调试场景完毕，利用git status可以看到被修改的文件；此时输入git diff，显示出工作区与暂存区的共同文件

   ![](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\属性模块1.PNG)

   ![属性模块2](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\属性模块2.PNG)

2. 之后利用git add和git commit提交被修改的文件

   ![属性模块3](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\属性模块3.PNG)



## 合并分支与最终提交

1. 全部修改完成后，查看分支情况，可以看到目前存在的三个分支，利用git merge合并两个支线到main；此时再查看分支图，可以看到分支的合并历史

   ![](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\合并分支.PNG)

   ![合并分支2](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\合并分支2.PNG)

2. 利用git tag打上v2.0的稳定版本标签

   ![](E:\SE\NJU-SE2021-autumn-Lab6\Report\191220037-胡雨阳\ref\标签.PNG)

