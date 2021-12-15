# 实验六报告

#### 徐思源

#### 191220133

因为我一开始在ubuntu装了android studio，实验六我直接用终端实现了

##### 一、实验探索功能部分

- 新建文件test.txt作为测试文件，并在txt文件中输入“123”

- 查看缓存的文件可以发现多了test.txt

- ![image-20211215154148402](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154148402.png)

- 我们提交这个test

- ![image-20211215154404358](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154404358.png)

- 查看log可以看到提交情况

- ![image-20211215154428094](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154428094-1639554268368.png)

- 更改test中的内容，增加test change

- ![image-20211215154528028](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154528028.png)

- 输入git diff可以查看改变

- ![image-20211215154741334](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154741334.png)

- 用git reset回退可以发现回到最初版本test.txt没有了，回退成功

- ![image-20211215154921433](D:\Desktop\studing\software engineering\lab6\ref\image-20211215154921433-1639554561630.png)

  

##### 二、实验三部分

- 创建分支b1：
- **![image-20211215155012104](D:\Desktop\studing\software engineering\lab6\ref\image-20211215155012104.png)**
- 在该分支下面进行功能更改
- 更改完成后提交b1分支
- 切换到b2进行相同操作
- ![image-20211215160136788](D:\Desktop\studing\software engineering\lab6\ref\image-20211215160136788.png)
- 合并分支
- ![image-20211215160345021](D:\Desktop\studing\software engineering\lab6\ref\image-20211215160345021.png)
- 对分支进行合并，没有冲突
- 之后再查看git log的时候发现了问题，只有commit信息而没有merge信息,再往上查阅了资料之后发现，因为默认使用了fast-forward模式，当前分支合并另一个分支的时候，如果合并的过程中没有Conflict冲突的时候，则会通过直接移动两个分支的指针，来达到合并的过程。因为我的分支恰好没有冲突，所以使用了快速合并，合并之后删除了无用分支，这时候就丢失了分支信息，造成下图的情况
- ![image-20211215165540953](D:\Desktop\studing\software engineering\lab6\ref\image-20211215165540953.png)
- 之后我对分支进行了一些修改，因为功能已经改过了，所以我只是简单的加了一些注释，为了看分支的和合并情况，使用非快速合并之后，就可以看到merge信息了，如下
- ![image-20211215165825576](D:\Desktop\studing\software engineering\lab6\ref\image-20211215165825576.png)
- ![image-20211215165847802](D:\Desktop\studing\software engineering\lab6\ref\image-20211215165847802.png)
- 然后对稳定版本打上标签v0.0
- ![image-20211215165952045](D:\Desktop\studing\software engineering\lab6\ref\image-20211215165952045.png)
- 最后push到远端即可

