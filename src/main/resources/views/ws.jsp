<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
</head>
<body onload="disconnect()">
<noscript><h2>不支持</h2></noscript>
<div>
    <div>
        <button id="connect" onclick="connect()">连接</button>
        <button id="disconnect" disabled="disabled" onclick="disconnect()">断开</button>
    </div>
    <div id="conversationDiv">
        <label>输入你的名字</label>
        <input type="text" id="name"/>
        <button id="sendName" onclick="send()">发送</button>
        <p id="response"></p>
    </div>
</div>
<script src="http://cdn.jsdelivr.net/sockjs/1.0.1/sockjs.min.js"></script>
<script src="http://cdn.bootcss.com/stomp.js/2.3.3/stomp.min.js"></script>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>


<script type="text/javascript">
    var stompClient = null;

    function setConnect(connected) {
        document.getElementById('connect').disabled = connected;
        document.getElementById('disconnect').disabled = !connected;
        document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
        $('#response').html();

    }

    function disconnect() {
        if (stompClient != null) {
            stompClient.disconnect();
        }
        setConnect(false);
        console.log("connect closed")
    }

    function connect() {
        var socket = new SockJS('/endpoint');
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function (frame) {
            setConnect(true);
            console.log("connect:" + frame);
            stompClient.subscribe(('/topic/getResponse', function (response) {
                showResponse(JSON.parse(response.body).message);
            }))
        })
    }

    function send() {
        var name = $('#name').val();
        stompClient.send('/welcome', {}, JSON.stringify({'name': name}));
    }

    function showResponse(message) {
        var response = $('#response');
        response.html(message);
    }
</script>
</body>
</html>
