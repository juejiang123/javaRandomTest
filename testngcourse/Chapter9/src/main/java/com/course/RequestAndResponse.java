package com.course;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

import java.util.ResourceBundle;

public class RequestAndResponse {

    public static void main(String[] args) throws IOException {
//        加载配置文件，拼接请求参数
        ResourceBundle config = ResourceBundle.getBundle("Config");
        String host = config.getString("test.host");
        String uri = config.getString("test.get.demo");
        String url = host + uri;
//        创建httpclient对象,进行方法执行
        HttpGet get = new HttpGet(url);
        CloseableHttpClient client = HttpClients.createDefault();
//        发送请求
        CloseableHttpResponse re = client.execute(get);
//        获取响应信息并打印
        HttpEntity entity = re.getEntity();
        String s = EntityUtils.toString(entity);
        System.out.println(s);

    }


}
