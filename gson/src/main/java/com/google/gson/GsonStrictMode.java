package com.google.gson;

/**
 * 严苛模式设置
 * Created by WQ on 2018/2/10.
 */

public class GsonStrictMode {
    /**
     * 默认设置
     */
    private static GsonStrictMode defaultInstance=new GsonStrictMode();
    /**
     * 是否检查类型异常
     */
    private boolean checkTypeException = false;
    /**
     * jsonObject类型字段默认值是否为 null
     */
    private boolean isNullObject=true;
    /**
     * jsonArray类型字段默认值是否为null
     * 包括Array 和 List
     */
    private boolean isNullArray=false;

    /**
     * 基本数据类型和字符串默认值
     */
    private  byte byteVal = 0;
    private short shortVal = 0;
    private int intVal = 0;
    private long longVal = 0L;
    private  float floatVal = 0.0F;
    private double doubleVal = 0.0D;
    private char charVal = '\0';
    private String stringVal = "";
    private boolean booleanVal = false;


    /**
     * 设置是否检查类型异常,默认false ,开启的话默认类型的设置就失效了
     * @param checkTypeException
     * @return
     */
    public GsonStrictMode setCheckTypeException(boolean checkTypeException) {
        this.checkTypeException = checkTypeException;
        return this;
    }

    /**
     * 设置对象默认值是否为null , 默认true
     * @param nullObject
     * @return
     */
    public GsonStrictMode setNullObject(boolean nullObject) {
        setCheckTypeException(false);
        isNullObject = nullObject;
        return this;
    }

    /**
     * 设置数组默认值是否为null, 默认false []
     * @param nullArray
     * @return
     */
    public GsonStrictMode setNullArray(boolean nullArray) {
        setCheckTypeException(false);
        isNullArray = nullArray;
        return this;
    }

    public GsonStrictMode setByteVal(byte byteVal) {
        setCheckTypeException(false);
        this.byteVal = byteVal;
        return this;
    }

    public GsonStrictMode setShortVal(short shortVal) {
        setCheckTypeException(false);
        this.shortVal = shortVal;
        return this;
    }

    public GsonStrictMode setIntVal(int intVal) {
        setCheckTypeException(false);
        this.intVal = intVal;
        return this;
    }

    public GsonStrictMode setLongVal(long longVal) {
        setCheckTypeException(false);
        this.longVal = longVal;
        return this;
    }

    public GsonStrictMode setFloatVal(float floatVal) {
        setCheckTypeException(false);
        this.floatVal = floatVal;
        return this;
    }

    public GsonStrictMode setDoubleVal(double doubleVal) {
        setCheckTypeException(false);
        this.doubleVal = doubleVal;
        return this;
    }

    public GsonStrictMode setCharVal(char charVal) {
        setCheckTypeException(false);
        this.charVal = charVal;
        return this;
    }

    public GsonStrictMode setStringVal(String stringVal) {
        setCheckTypeException(false);
        this.stringVal = stringVal;
        return this;
    }

    public  GsonStrictMode setBooleanVal(boolean booleanVal) {
        setCheckTypeException(false);
        this.booleanVal = booleanVal;
        return this;
    }

    public static boolean isCheckTypeException() {
        return getInstance().checkTypeException;
    }

    public static boolean isNullObject() {
        return getInstance().isNullObject;
    }

    public static boolean isNullArray() {
        return getInstance().isNullArray;
    }

    public static byte getByteVal() {
        return getInstance().byteVal;
    }

    public static short getShortVal() {
        return getInstance().shortVal;
    }

    public static int getIntVal() {
        return getInstance().intVal;
    }

    public static long getLongVal() {
        return getInstance().longVal;
    }

    public  static float getFloatVal() {
        return getInstance().floatVal;
    }

    public static double getDoubleVal() {
        return getInstance().doubleVal;
    }

    public static char getCharVal() {
        return getInstance().charVal;
    }

    public static String getStringVal() {
        return getInstance().stringVal;
    }

    public static boolean getBooleanVal() {
        return getInstance().booleanVal;
    }

    public static GsonStrictMode getInstance() {
        return defaultInstance;
    }
}
