package com.course;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class RequestGet {

    private static String host;
    private static ResourceBundle config;

//    模拟一个带参数的请求
public static void main(String[] args) throws URISyntaxException, IOException{
    //        获取配置文件信息
    config = ResourceBundle.getBundle("Config");
//        拿到host值信息
    host = config.getString("test.host");
    String uri = config.getString("test.get.with.param");
    URI uri1 = new URIBuilder().setParameter("name","huhansan").setParameter("age","18").build();

    String url = host+uri+uri1;
    HttpGet get = new HttpGet(url);
    CloseableHttpClient client = HttpClients.createDefault();
    CloseableHttpResponse response = client.execute(get);
    HttpEntity entity = response.getEntity();
    String s = EntityUtils.toString(entity);
    System.out.println(s);
}



}
