

# 软件工程实验六: 项目协同开发管理与工具集成环境实验

黄盛 191840104



## 基本操作

### **1. 修改、提交和回退**

- 添加一个选项：

  ```xml
  <item
          android:id="@+id/action_set_topping"
          android:title="@string/file_item_action_set_topping" />
  ```

- 查看修改

  ```shell
  C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git diff
  diff --git a/app/src/main/res/menu/file_item.xml b/app/src/main/res/menu/file_item.xml
  index 876aa3b..5d24812 100644
  --- a/app/src/main/res/menu/file_item.xml
  +++ b/app/src/main/res/menu/file_item.xml
  @@ -7,6 +7,10 @@
  
   <menu xmlns:android="http://schemas.android.com/apk/res/android">
  
  +    <item
  +        android:id="@+id/action_set_topping"
  +        android:title="@string/file_item_action_set_topping" />
  
  ```

- 提交修改

  ```shell
  C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git add .
  
  C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git commit -m "add field isTopping"
  [master 90d939d] add field isTopping
   1 file changed, 2 insertions(+)
  ```

- 查看记录

  ```shell
  C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git log
  commit 512f567d2961209f9ef47eab7610675a1b242f9e (HEAD -> master)
  Author: Hassium74 <54799447+Hassium74@users.noreply.github.com>
  Date:   Sat Jan 8 21:08:39 2022 +0800
  
      add field isTopping
  
  commit e929a72d828d93cd2dfdbe29fd989eee9db4368f
  Author: Hassium74 <54799447+Hassium74@users.noreply.github.com>
  Date:   Sat Jan 8 21:08:06 2022 +0800
  
      init
  ```

### **2.**在分支上开发

**1. 创建分支dev**

```shell
C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git checkout -b dev
Switched to a new branch 'dev'
```

**2. 在分支dev上增加新功能并提交**

```shell
C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git commit -m "增加了置顶功能"
[dev 10dde0a] 增加了置顶功能
 3 files changed, 24 insertions(+)
```

**3. 在分支master上修改资源文件并提交**

```shell
C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git commit -m "更新了资源文件"
[master be1e0d7] 更新了资源文件
 2 files changed, 2 insertions(+)
```

**4. 合并分支**

``` shell
C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git merge dev
Updating 512f567..10dde0a
Fast-forward
 .../me/zhanghai/android/files/filelist/FileListAdapter.kt  |  5 +++++
 .../me/zhanghai/android/files/filelist/FileListFragment.kt | 14 ++++++++++++++
 .../me/zhanghai/android/files/filelist/FileSortOptions.kt  |  5 +++++
 3 files changed, 24 insertions(+)
```

**5. 查看分支合并图**

```shell
C:\Users\10499\Desktop\myUni\Cs\SoftEngineering\lab\1\filemanage-app-repo-master\ky\4\MaterialFiles-1.3.1>git log --graph --decorate --oneline --all
*   01a4b3d (HEAD -> master) Merge branch 'dev'
|\
| * 10dde0a (dev) 增加了置顶功能
* | be1e0d7 更新了资源文件
|/
* 512f567 add field isTopping
* e929a72 init
```



## 问题回答

### 1. 使用git的好处？

使用Git可以很便捷高效地进行代码管理和版本控制工作；当完成某个阶段性任务时，可以使用git commit进行保存提交，当开发出错时，可以使用git reset进行版本回退，利用分支功能，还有利于协同开发。

### 2. 使用远程仓库 (如 github/gitee 等) 的好处？

使用原远程仓库，一方面可以把项目代码托管在远程服务器上，作为备份防止代码丢失；另一方面可以有利于开发成员利用远程仓库进行协同开发。

### 3. 在开发中使用分支的好处？你在实际开发中有哪些体会和经验？

使用分支开发，可以将项目各个模块的开发过程分离开来，减少不同开发成员同时修改代码时带来的干扰；开发成员在各自负责的分支上进行开发，代码经审核后合并至主分支，提高了项目开发的质量，减少了错误操作带来的风险。



