
[Back to index page](index.md)  

# 冲突解决

## manual
    手动去打开文件将冲突的地方解决

## automated

// keep local files  

    // all file
    git checkout --ours .
    // 
    git checkout --ours [file_name]

// keep remote files

    // all file
    git checkout --theirs .
    //
    git checkout --theirs [file_name]

[Next page > 加入缓存](stash.md)