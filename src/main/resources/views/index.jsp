<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <script type="text/javascript" src="/assets/js/jquery.js"></script>
</head>
<body>
<pre>
    <h1>Welcome to Spring MVC World</h1>

    <div class="upload">
        <form action="/_6/upload" enctype="multipart/form-data" method="post">
            <input type="file" name="file"/>
            <input type="submit" value="上传"/>
        </form>
    </div>
</pre>
<div id="converter">
    <div id="msg"></div>
    <input type="button" onclick="converter()" value="请求"/>
</div>

<div id="msgFromePush">

</div>
<script type="text/javascript">
    function converter() {
        $.ajax({
            url: '/_7/converter',
            data: '3-haiyang.li',
            type: 'post',
            contentType: 'application/x-wisely',
            success: function (data) {
                $('#msg').html(data);
            }
        });
    }

    if (!!window.EventSource) {
        var source = new EventSource('/_8/push');
        s = '';
        source.addEventListener('message', function (e) {
            s += e.data + '<br/>';
            $('#msgFromePush').html(s);
        });
        source.addEventListener('open', function (e) {
            console.log('open');
        });
        source.addEventListener('error', function (e) {
            if (e.currentTarget.readyState == EventSource.CLOSED) {
                console.log('连接关闭');
            } else {
                console.log(e.currentTarget.readyState);
            }
        })
    } else {
        console.log('你的浏览器不支持')
    }
</script>
</body>
</html>
