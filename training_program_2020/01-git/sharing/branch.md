[Back to index page](README.md)  
# 分支管理

## command help
    git <operation name> <-h | --help>

    //such as
    git branch -h
    git switch --help
    ....


## Local branch
### Query

    git branch [-a | --all]

### Rename

    //rename
    git branch -m <old name> <new name>

### Add
    
    git branch <name>

### Switch / Checkout

    git checkout [-b] <name>


    git switch [-c] <name>

### Delete

    git branch -d <name>

### Merge

    git merge [--no-ff] <name>

### Commit

    git commit -m "message"

    //查看commit提交日志
    git log 

-p	按补丁格式显示每个更新之间的差异。  
--stat	显示每次更新的文件修改统计信息。  
--name-status	显示新增、修改、删除的文件清单。

## Remote branch
### Clone

    git clone <server>

###  Pull 
    
    git pull origin master

### push

    git push [-u | ...] <remote name> <repo name>
    
    // delete remote branch
    git push -d origin <remote name>

    // create remote branch
    git push origin <local name>:<remote name>
    
[Next page > 回滚重置](reset.md)