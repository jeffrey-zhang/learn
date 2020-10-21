
var info = [
    ['admin', 'male', '98', '<button id="update" onclick="action()">Update</button>',],
    ['joyee', 'female', '88', '<button id="update" onclick="action()">Update</button>',],
    ['naomi', 'female', '74', '<button id="update" onclick="action()">Update</button>',],
    ['feifei', 'female', '83', '<button id="update" onclick="action()">Update</button>',],
    ['xiaobai', 'male', '30', '<button id="update" onclick="action()">Update</button>',],
    ['lili', 'female', '80', '<button id="update" onclick="action()">Update</button>',],
    ['xiaoming', 'male', '90', '<button id="update" onclick="action()">Update</button>',],
];
function init() {
    console.log("进入了初始化");


    var str = '';
    console.log("ready");
    //定义tr标签,外层循环生成tr标签
    for (var i = 0; i <= info.length - 1; i++) {
        str += '<tr>';
        str += `<td>${i + 1}</td>`; // 第一个单元格是单独生成的,不参与内层循环,是当前外层循环 索引下标+1
        //内循环定义td标签
        //获取二维数组，一维索引是i 二维索引是j,arr[i][j]
        for (var j = 0; j <= info[i].length - 1; j++) {
            str += `<td>${info[i][j]}</td>`;
        }
        str += '</tr>';
    }

    tb.innerHTML = str; // 将定义好的内容,写入到tbody标签中
}


//定义onclick，action操作方法
function action() {
    alert("Update successfully!");
}

//点击search按钮触发事件
function accountSearch() {
    console.log("accountSearch")
    // var tb = document.getElementById("tb");
    // tb.innerHTML = "";
    var input = document.getElementById("name").value; //获取text值       
    //document.getElementById("tb").innerHTML = "New text!";
    console.log(input);
    var str = '';
    for (var a = 0; a < info.length; a++) {
        console.log(info[a].length);
        if (info[a][0] == input) {
            str += `<tr><td>${a + 1}</td>`;
            for (var j = 0; j < info[a].length; j++) {
                // console.log("值");
                str += '<td>' + info[a][j] + '</td>';
            }
            str += '</tr>';
            console.log(str);

        }
    }
    console.log("value:" + str);
    tb.innerHTML = str;
    //console.log("c:" + nameresult);


}
