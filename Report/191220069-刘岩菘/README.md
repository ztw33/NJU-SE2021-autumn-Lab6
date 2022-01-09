report
# 软件工程第六次实验报告
## 使用git的好处
1. git可以方便的处理文件并管理
2. 可以回退找到以前的记录防止追悔莫及的错误
## 使用远程仓库的好处
1. 使用远程仓库可以自动备份
2. 可以进行安全二次加密
## 使用分支的好处
1. 方便了多人同时开发
2. 可以记录自己的不同想法
3. 方便对不同方向做出尝试而不用畏手畏脚
## 体会
1. 回退功能挽救了大部分的错误
2. 可以说除了网连不上之外没有缺点
## git的使用
1. 总体合并
   
   ![log--graph.jpg](https://s2.loli.net/2022/01/08/E1YxzV8hF6wlvPr.jpg)
2. 标签
   
   ![tag.jpg](https://s2.loli.net/2022/01/08/mxoa1yqfRBjJZhp.jpg)
3. status检查
   
   ![status.jpg](https://s2.loli.net/2022/01/08/iuchLEHnbNKAywg.jpg)
## 修改代码
    我在实验三中添加了新页面AlertActivity其代码刷新机制如下
    ```
    class AlertActivity : AppCompatActivity() {
        private var mWasProtectionHandled4alert = false
        private lateinit var fragment: ItemsFragment
        private var wasBackJustPressed = false
        private val BACK_PRESS_TIMEOUT = 5000
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_alert)
            if (savedInstanceState == null) {
                handleAppPasswordProtection {
                    mWasProtectionHandled4alert = it
                    if (it) {
                        Gleave_no()
                    } else {
                        finish()
                    }
                }
            }
        }


        private fun Gleave_no(){
            button_no.setOnClickListener(){
                startActivity(Intent(this,MainActivity::class.java))
            }

        }


    }
    ```  
    并添加了页面activity_alert如下

    
    ```
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".AlertActivity">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="1dp">

        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="A file manager object lets you examine the contents of the file system and make changes to it. The FileManager class provides convenient access to a shared file manager object that is suitable for most types of file-related manipulations. A file manager object is typically your primary mode of interaction with the file system. You use it to locate, create, copy, and move files and directories. You also use it to get information about a file or directory or change some of its attributes."
            android:textSize="20sp" />

        <Button
            android:id="@+id/button_no"
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:background="@drawable/divider"
            android:text="OK Let's START" />
    </LinearLayout>
    </androidx.constraintlayout.widget.ConstraintLayout>
    ```


