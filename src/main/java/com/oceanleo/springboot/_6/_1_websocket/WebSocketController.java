package com.oceanleo.springboot._6._1_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author haiyang.li
 */
@Controller
public class WebSocketController {

    //映射地址
    @MessageMapping("/welcome")
    //对订阅了服务的路径浏览器发送消息
    @SendTo("/topic/getResponse")
    public WebSocketResponse say(WebSocketMessage message) throws Exception {
        Thread.sleep(3000);
        WebSocketResponse webSocketResponse = new WebSocketResponse();
        webSocketResponse.setMessage("Welcome," + message.getName() + " !");
        return webSocketResponse;
    }

    @RequestMapping("/ws")
    public String ws(){
        return "/ws";
    }
}
