var accountList;
$(document).ready(function () {
    $.ajax({
        type: "post",
        url: "http://localhost:8080/accountMgmt",
        dataType: "json",
        data: {},
        success: function (response) {
            accountList = response;
            initData(response);
            // if (data.toString() == 'ok') {
            //     console.log("success");
            //     window.location.href = "/html/home.html";

            // } else {
            //     alert("Username or password is wrong!");
            //     console.log("error");

            // }
        },
        error: function () {
            alert("请求服务器失败!");
        }
    });
});

function initData(info) {
    str = ''
    for (var i = 0; i <= info.length - 1; i++) {
        str += '<tr>';
        str += `<td>${i + 1}</td>`;
        str += `<td>${info[i].accountname}</td>`;
        str += `<td>${info[i].sex}</td>`;
        str += `<td>${info[i].score}</td>`;
        str += `<td><button onclick='action()'>update</button></td>`;
        str += '</tr>';
    }

    $("#tb").html(str);


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
    var input = $("#name").val(); //获取text值 
    console.log(input);
    if (input == "") {  //判断搜索框内的值
        console.log("null----");
        initData(accountList); //为空初始化list
    } else {
        var str = '';
        var count = 0;
        for (var a = 0; a < accountList.length; a++) {
            if (accountList[a].accountname == input) {  //匹配输入的text值返回对应list
                count++;
                str += `<tr><td>${count}</td>`;
                str += `<td>${accountList[a].accountname}</td>`;
                str += `<td>${accountList[a].sex}</td>`;
                str += `<td>${accountList[a].score}</td>`;
                str += `<td><button onclick='action()'>update</button></td>`;
                str += '</tr>';
            }
        }
        $("#tb").html(str);
    }




}
