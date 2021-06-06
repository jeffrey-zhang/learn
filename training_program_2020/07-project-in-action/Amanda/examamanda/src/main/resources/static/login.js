

function validate() {
    // var text = '{"userinfo": [ ' +
    //     '{"username": "admin" , "pwd" : "123456"},' +
    //     '{"username": "amanda","pwd": "123456"}]}';

    // var obj = JSON.parse(text);

    // var x = document.getElementById("username").value;
    // var y = document.getElementById("pwd").value;


    $.ajax({
        type: "GET",
        url: "http://localhost:8080/loginVerify",
        data: {
            "username": $("#username").val(),
            "password": $("#password").val(),
        },
        success: function (data) {
            console.log(data);
            if (data != "login") {
                alert("Username or password is wrong");
                console.log("error")
            } else {
                console.log("login success");
                alert(data)
                window.location.href = "HomePage.html";
            }
        },
        error: function (data) {
            alert("请求服务失败")
        }

    })

}