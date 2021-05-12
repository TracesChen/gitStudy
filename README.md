# gitStudy 学习git

一、git（version control system）版本控制系统
    什么是版本控制？（版本迭代）
        版本控制是指对软件开发过程中各种程序代码、配置文件及说明文档等文件变更的管理，是软件配置管理的核心思想之一

二、简单一些Linux基本命令操作（在版本控制命令中需要使用）
    1)、cd:改变目录
    2)、cd..回退到上一个目录,直接cd进入默认目录
    3)、pwd:显示当前所在的目录路径
    4)、ls(ll):都是列出当前目录中的所有文件,只不过(ll)列出的内容更为详细
    5)、touch:新建一个文件如 touch index.js就会在当前目录下新建一个 index.js文件
    6)、rm:删除一个文件, rm index.js就会把 index.js文件刪除
    7)、mkdir:新建一个目录就是新建一个文件夹。
    8)、rm -r:删除一个文件夹, rm -r src删除src目录
    9)、mv移动文件, mv index. html src index.html是我们要移动的文件,Src是目标文件夹当然这样写夹在同一目录下。
    10)、reset重新初始化终端/清屏。
    12)、history査看命令历史
    13)、help帮助。
    14)、exit退出
    15)、#排表示注释

三、Git版本控制可以分为
    在线的Git代码托管平台有很多，例如：
        1、码云Gitee
        2、GitHub
        3、GitLab
        4、Bitbucket

四、Git常用命令
    git需要必须要记住6个命令：
            1、push
            2、commit
            3、add
            4、checkout
            5、clone
            6、pull

五、Git配置
    1、 查看当前用户(global)配置
        $ git config --global --list

    2、 设置提交代码时的用户信息
        $ git config [--global] user.name "[name]"             #用户名
      $ git config [--global] user.email "[email address]"     #邮箱


六、Git创建仓库
    1、本地仓库搭建：在当前目录新建一个Git代码库
        $ git init

    2、远程克隆仓库搭建：下载一个项目和它的整个代码历史
        $ git clone [URL]

七、Git文件操作

    1、untracked    ：未跟踪
    2、unmodified   ：文件已经修改，但未入库
    3、modified     ：文件已经修改
    4、staged       ：文件进入暂存区状态，执行git commit 提交则修改同步到库中

八、Git查看文件状态
    1、查看指定文件状态
        $ git status [file_name]
    2、查看所有文件状态
        $ git status


九、本地仓库搭建
    1、添加所有文件到暂存区
        $ git add .
    2、提交暂存区内容到本地仓库  -m表示提交一些信息
        $ git commit -m “注释消息内容”

十、远程仓库搭建
    第一步:设置本机绑定SSH公钥，实现免密码登录！
            进入: C:\Users\Mr.Chen\.ssh   ##目录
            生成公钥 :ssh-keygen  -rsa    ##-rsa使用加密
    第二步：将本地仓库上传到远程仓库 例如：gitee、GitHub、gitlab等等
            将上传到远程仓库上
            $ git push

十一、git分支中常见指令：
    # 列出所有本地分支
        $ git branch

    #列出所有远程分支
        $ git branch -r

    #新建一个分支，但是依然停留在当前分支
        $ git branch [branch-name]

    #新建一个分支,并切换到该分支上
        $ git checkout -b [branch]

    #合并指定分支到当前分支
        $ git merge [branch]

    #删除分支
        $ git branch -d [branch-name]

    #删除远程分支
        $ git push origin --delete [branch-name]
        $ git branch -dr [remote/branch]


十二、本文参考：
    1、狂神聊Git：https://www.bilibili.com/video/BV1FE411P7B3?share_source=copy_web
    2、托管代码平台：码云gitee官网中Git大全，附带访问地址：https://gitee.com/all-about-git