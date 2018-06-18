package com.oceanleo.springboot._4._7_converter;

import com.oceanleo.springboot._4._2_annotation.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author haiyang.li
 */
//返回到页面的数据转换器
public class DemoMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public DemoMessageConverter() {
        //自定义的媒体类型
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));
    }

    //判断是否执行国、转换
    @Override
    protected boolean supports(Class clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    //处理请求数据
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String string = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] split = string.split("-");
        return new DemoObj(new Long(split[0]), split[1]);
    }

    //处理返回数据
    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "Hello:" + demoObj.getId() + "-" + demoObj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}
