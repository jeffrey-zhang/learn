[ 首页](/README.md)
## <div id="1">1 Java 语言特点</div>
* 简单易学 
* 面向对象
* 无关平台性
* 分布式
* 可靠性
* 安全性
* 支持多线程
* 支持网络编程
* 编译与解释并存

```
package com.trendmicro

public class Demo{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

`书写规范`    

    package：公司域名倒置  
    trendmicro.com -->package com.trendmicro  

    类名：类名必须使用名词，如果一个类名内含多个单词，那么各个单词第一个字母大写，后续字母小写， 起伏呈驼峰状，人称驼峰式命名。给类名命名时，必须保证准确、简洁且容易理解。尽量使用完整单词， 避免使用缩写词（除了大家公认的）
        ```
        public class HelloWorld{

        }
        ```
    变量名：参照java驼峰命名法，首字母以小写开头，每个单词首字母大写（第一个单词除外）

        String stuName;

        printEmployeePaychecks();
        print_employee_paychecks();

       第一个函数名使用了骆驼式命名法，函数名中的每一个逻辑断点都有一个大写字母来标记；第二个函数名使用了下划线法，函数名中的每一个逻辑断点都有一个下划线来标记。