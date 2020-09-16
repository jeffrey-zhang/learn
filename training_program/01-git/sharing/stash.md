[Back to index page](README.md)  
# 加入缓存
将我们正在更改的代码加入到缓存区,前提是已经通过git add将修改的文件添加到暂存区。
ID越小说明增加的时间越靠前。

## save
    git stash [save] [message]
## query
    git stash list
## restore
### pop
    git stash pop stash@{<number>}
    // 恢复缓存并删除记录，恢复一次
### apply
    git stash apply stash@{<number>}
    // 恢复缓存并保留记录,恢复多次
## drop
    git stash drop stash@{<number>}
    //丢弃一个保存
    git stash clear
    //丢弃所有缓存

[Next page > 版本发布](released.md)
