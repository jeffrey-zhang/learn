[Back to index page](README.md)  
# 回滚重置
提交代码后发现有问题，想撤销提交，有两种撤销方式。
## Rervert 撤销提交
    git revert < HEAD | commit id>
revert命令的原理是，在当前提交后面，新增一次提交，抵消掉上一次提交导致的所有变化。它不会改变过去的历史，没有任何丢失代码的风险.

--no-edit：执行时不打开默认编辑器，直接使用 Git 自动生成的提交信息。  
--no-commit：只抵消暂存区和工作区的文件变化，不产生新的提交。

## Reset 丢弃提交
    // 指定回退的版本并保留修改到暂存区
    git reset --hard HEAD^1  

    // 指定回退的commit并保留修改到暂存区
    git reset --soft <commit id> 
--soft 保留修改   
--hard清空修改

[Next page > 加入缓存](stash.md)  