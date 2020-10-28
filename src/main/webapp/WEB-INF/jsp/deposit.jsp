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
我的账户:<input id="mywallet" size="50">
我的余额:<input id="mybalance" size="50">

<br>
to
<br>
公司账户:<input value="TC4PqQHT8uyED2oTdnSAzXoJawUcbXzae5" id="cwallet" size="50" readonly>
公司余额:<input id="cbalance" size="50">
<br>
金额:<input value="1" id="v">
<br>
<button onclick="deposit()">存款</button>
<script>

    function init()
    {
        var address ="";
        if(window.tronWeb && window.tronWeb.defaultAddress.base58) {
             address = window.tronWeb.defaultAddress.base58;
             tronWeb.trx.getBalance(address).then(result => document.getElementById("mybalance").value=tronWeb.fromSun(result) );
             tronWeb.trx.getBalance(document.getElementById("cwallet").value).then(result => document.getElementById("cbalance").value=tronWeb.fromSun(result) );
        }else
        {
            alert("请先登录tronlink钱包....");
        }
        document.getElementById("mywallet").value = address;
    }
    setInterval(async ()=>{
       init();
    }, 500)

    function deposit()
    {
        var mywallet = document.getElementById("mywallet").value;
        var cwallet = document.getElementById("cwallet").value;
        var v = document.getElementById("v").value;

        var obj = setInterval(async ()=>{
            if (window.tronWeb && window.tronWeb.defaultAddress.base58) {
                clearInterval(obj)
                var tronweb = window.tronWeb
                var vsun = tronWeb.toSun(v);
                //console.log(vsun+"-------")
                var tx = await tronweb.transactionBuilder.sendTrx(cwallet, vsun, mywallet)
                var signedTx = await tronweb.trx.sign(tx)
                var broastTx = await tronweb.trx.sendRawTransaction(signedTx)
                console.log(broastTx)
            }
        }, 10);
    }

</script>
</body>
</html>