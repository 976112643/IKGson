package com.google.gson;

/**
 * Created by WQ on 2018/2/10.
 */

public class TestGson {
    //正常json 測試
    public static String JSON_1="{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"address\":{\"street\":\"科技园路.\",\"city\":\"江苏苏州\",\"country\":\"中国\"},\"links\":[{\"name\":\"Google\",\"url\":\"http://www.google.com\"},{\"name\":\"Baidu\",\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"url\":\"http://www.SoSo.com\"}]}";

    //字符串 類型錯誤 對象類型錯誤 測試
    public static String JSON_2="{\"name\":{\"name\":\"Google\",\"url\":\"http://www.google.com\"},\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"address\":[],\"links\":[{\"name\":\"Google\",\"url\":\"http://www.google.com\"},{\"name\":\"Baidu\",\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"url\":\"http://www.SoSo.com\"}]}";

    /**
     * 所有类型不匹配错误 測試
     */
    public static String JSON_3="{\"name\":{\"name\":\"Google\",\"url\":\"http://www.google.com\"},\"url\":\"http://www.bejson.com\",\"page\":\"\",\"isNonProfit\":1,\"address\":[],\"links\":[{\"name\":\"Google\",\"url\":\"http://www.google.com\"},{\"name\":\"Baidu\",\"url\":\"http://www.baidu.com\"},{\"name\":\"SoSo\",\"url\":\"http://www.SoSo.com\"}],\"links2\":{\"name\":\"Google\",\"url\":\"http://www.google.com\"}}";


    public static void main(String []args){
        Gson gson=new GsonBuilder().create();
//        GsonStrictMode.getInstance().setCheckTypeException(true);
        //测试json解析输出
        System.out.println(gson.fromJson(JSON_1, TestBean.class));
        System.out.println(gson.fromJson(JSON_2, TestBean.class));
        System.out.println(gson.fromJson(JSON_3, TestBean.class));

        //测试出错时, 的自定义默认类型值的输出情况
        GsonStrictMode.getInstance().setBooleanVal(true).setIntVal(-110).setStringVal("类型错啦,")
                .setNullArray(true).setNullObject(false);
        System.out.println(gson.fromJson(JSON_1, TestBean.class));
        System.out.println(gson.fromJson(JSON_2, TestBean.class));
        System.out.println(gson.fromJson(JSON_3, TestBean.class));

    }

}
