<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/include/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<button onclick="gettronweb()">login</button>
<script>

    function makeid(length) {
        var result           = '';
        var characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
        var charactersLength = characters.length;
        for ( var i = 0; i < length; i++ ) {
            result += characters.charAt(Math.floor(Math.random() * charactersLength));
        }
        return result;
    }


    function gettronweb(){
        if(window.tronWeb && window.tronWeb.defaultAddress.base58){
            var address = window.tronWeb.defaultAddress.base58;
            document.write("获取到钱包地址:",address);
            tronWeb.trx.getBalance(address).then(result => document.write("balance:",tronWeb.fromSun(result),"<br>") );
            //window.tronWeb.defaultAddress.base58.then(result => document.write("balance:",result));
            document.write("<br>");
            var obj = setInterval(async ()=>{
                document.write("你好:b01",makeid(8),"<br>");


                clearInterval(obj);
            }, 2000);
            document.write("登陆中....");
            document.write("<br>");
            tronWeb.trx.getBalance(window.tronWeb.defaultAddress.base58).then(result => console.log(result))

        }else
        {
            document.write("请先登录tronlink钱包....");
        }
    }
</script>
</body>
</html>