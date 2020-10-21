function validate() {
    var text = '{"userinfo": [ ' +
        '{"username": "admin" , "pwd" : "123456"},' +
        '{"username": "amanda","pwd": "123456"}]}';

    var obj = JSON.parse(text);

    var x = document.getElementById("username").value;
    var y = document.getElementById("pwd").value;

    if ( x ==null || y ==null || x == "" || y == "") {
        alert ("You need to input username and password");
    }
     if ( x == obj.username[0].username || x == obj.username[1].username || x == obj.username[2].username || y == obj.userinfo[0].password || y == obj.userinfo[1].password || y == obj.userinfo[2].password){
         window.location.href = "LoginPage.html";

     }
     alert ("Username or password is wrong");
}