package com.google.gson;

/**
 * Created by WQ on 2018/2/10.
 */

public class TestGson {
    //正常json
    public static String JSON_1="{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"address\":{\"street\":\"科技园路.\",\"city\":\"江苏苏州\",\"country\":\"中国\"},\"links\":[{\"name\":\"Google\",\"url\":\"http://www.google.com\"},{\"name\":\"Baidu\",\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"url\":\"http://www.SoSo.com\"}]}";
    public static void main(String []args){
        Gson gson=new GsonBuilder().create();
        TestGson testGson = gson.fromJson(JSON_1, TestGson.class);


    }

}
