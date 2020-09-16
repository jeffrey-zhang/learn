
[Back to index page](README.md)  
# 准备工作
## Create Repository
    // init
    git init [repo dir]

创建成功的话，能看到.git目录。其中的各个文件的作用可参考 [网上资源](https://juejin.im/post/6844903986839945229)介绍。

## Configuration

git config  work envrioment

git config four levels

| name | description |
| ---- | ---- |
| --global | 使用全局配置文件 |
| --system | 使用系统级配置文件 |
| --local | 使用仓库级配置文件 |
| --worktree | 使用工作区级别的配置文件 |

config use scope and priority

> global
>> system  
>>> lcoal
>>>> worktree  

    // global config
    git config --global user.name <name>
    git config --gloabl user.email <email>

    //配置目的是要记录哪个用户操作的，配置的email如果在server中已经注册，会展示 用户对用display name，如果没有注册就会展示config的user.name。
    
    // verify
    // 1. command
    git config --global --list
    git config --gloabl user.name
    // 2. config file
    cat ~/.gitconfig
    
    // local config 
    git config --local user.name <name>
    git config --local user.email <mail>

    //veriry
    // 1. command
    git config --local --list
    git config --local user.name
    // 2. config file
    cat .git/config
config 相关的更多命令可以在Terminal输入git config --help查看和学习



## Connection Remote Repository
    
    // select 
    git remote [-v | --verbose]

    // add 
    git remote add <name> <server>

    // rename
    git remote rename <older name> <new name>

    // remove
    git remote remove <name>

    //更多命令参照remote相关命令
    git remote <--help | -h>


### Https Connect

    adc.github.com
    username & personal access token
    github.com
    username & password

### SSH Connect

    //generate
    ssh-keygen -C “test ssh github”
-t 指定密钥类型，默认是 rsa  
-C 设置注释文字，比如邮箱  
-f 指定密钥文件存储文件名,默认id_rsa

    //verify
    ssh —T git@github.com

### Tips

adc.github / github  
ssh key可以用在不同的server中，但是同一个server中，key只能对应一个account，如果有多个account并且都想通过ssh协议来进行访问，我们就需要进行配置，如果不进行配置，它默认匹配的是id_rsa，私钥和公钥会不匹配。
    
    //生成多个ssh key对应不同的server
    ssh-keygen -f id_rsa_person -C “example@trendmicro.com”
    
    //进行config，不然默认还是读取id_rsa.

    touch ~/.ssh/config
    vi  ~/.ssh/config
    
config content

    # personal account
    Host github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa
    #office account
    Host github.work.com
    HostName github.com
    User git
    IdentityFile ~/.ssh/github_work_rsa

Such as  
git@github.com:YanXu19/Demo.git   
git@github.work.com:XuYan-ETS/Demo.git

[Next page > 分支管理](branch.md)