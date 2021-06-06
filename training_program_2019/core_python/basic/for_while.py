attributes = ['name', 'dob', 'gender']
values = [
    ['jason', '2000-01-01', 'male'], 
    ['mike', '1999-01-01', 'male'],
    ['nancy', '2001-02-01', 'female']
]


# version A
print('Version A: 嵌套循环实现我们给定的功能')
l = []
for v in values:
    d = {}
    for i in range(0,len(attributes)):
        d[attributes[i]] = v[i]
    l.append(d)
print(l)


# version B one line to implement the function.
print('Version B: 一行代码完成我们给定的功能')
print([{attributes[i]:v[i] for i in range(0,len(attributes))} for v in values])

#version C one line to implement the function by build-in zip function
print('Version C: 一行代码完成我们给定的功能（利用内置函数）')
print([dict(zip(attributes,v))for v in values])
