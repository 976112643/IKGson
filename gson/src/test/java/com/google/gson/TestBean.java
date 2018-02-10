package com.google.gson;

import java.util.List;

/**
 * Created by WQ on 2018/2/10.
 */

public class TestBean {

    /**
     * name : BeJson
     * url : http://www.bejson.com
     * page : 88
     * isNonProfit : true
     * address : {"street":"科技园路.","city":"江苏苏州","country":"中国"}
     * links : [{"name":"Google","url":"http://www.google.com"},{"name":"Baidu","url":"http://www.baidu.com"},{"name":"SoSo","url":"http://www.SoSo.com"}]
     */

    public String name;
    public String url;
    public int page;
    public boolean isNonProfit;
    /**
     * street : 科技园路.
     * city : 江苏苏州
     * country : 中国
     */

    public AddressBean address;
    /**
     * name : Google
     * url : http://www.google.com
     */

    public List<LinksBean> links;

    public static class AddressBean {
        public String street;
        public String city;
        public String country;

        @Override
        public String toString() {
            return "AddressBean{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

    public static class LinksBean {
        public String name;
        public String url;

        @Override
        public String toString() {
            return "LinksBean{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", page=" + page +
                ", isNonProfit=" + isNonProfit +
                ", address=" + address +
                ", links=" + links +
                '}';
    }
}
