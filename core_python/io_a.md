## 文件操作 --> 文件流

### 读文件
`
f = open('in.txt','r')
`
### 读取所有内容到内存中

`
f.read()
`
### 按行读取
`
f.readlines()
`

### 关闭文件流
`
f.close()
`

#
### 思考一个问题，万一打开文件失败，怎么办？
~~~~
try:
    f = open('in.txt','r')
    print(f.read())
finally:
    if f:
        f.close()
~~~~

#
### 有没有更优雅的方式做文件读写呢？

~~~~
with open('in.txt','r') as f:
    print(r.read())
~~~~

### 写文件，只是把读流改成写流
r --> w

### 二进制文件流，比如图片 'rb'

### 带编码读写，加参数 encoding='gbk', errors='ignore'

#

## String 流 和 二进制流BytesIO
~~~~
from io import StringIO
f = StringIO('Hello!\nHi!\nGoodbye!')
while True:
    s = f.readline()
    if s == '':
        break
    print(s.strip())
~~~~

~~~~
from io import BytesIO
f = BytesIO(b'\xe4\xb8\xad\xe6\x96\x87')
f.read()
~~~~

#

## 跨平台文件和目录操作 
`
import os
`

#

## 序列化
~~~~
import pickle
d = dict(name='Bob', age=20, score=88)
pickle.dumps(d)
~~~~
结合文件io
~~~~
f = open('dump.txt', 'wb')
pickle.dump(d, f)
f.close()
~~~~

~~~~
f = open('dump.txt', 'rb')
d = pickle.load(f)
f.close()
~~~~

## Json 序列化
