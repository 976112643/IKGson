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
    boolean checkTypeException = false;
    /**
     * jsonObject类型字段默认值是否为 null
     */
    boolean isNullObject=false;
    /**
     * jsonArray类型字段默认值是否为null
     * 包括Array 和 List
     */
    boolean isNullArray=false;

    /**
     * 基本数据类型和字符串默认值
     */
    byte byteVal = 0;
    short shortVal = 0;
    int intVal = 0;
    long longVal = 0L;
    float floatVal = 0.0F;
    double doubleVal = 0.0D;
    char charVal = '\0';
    String stringVal = "";
    boolean booleanVal = false;

//    public GsonStrictMode checkTypeException(boolean isCheck) {
//        checkTypeException = isCheck;
//        return this;
//    }


    public GsonStrictMode setCheckTypeException(boolean checkTypeException) {
        this.checkTypeException = checkTypeException;
        return this;
    }

    public GsonStrictMode setNullObject(boolean nullObject) {
        setCheckTypeException(false);
        isNullObject = nullObject;
        return this;
    }

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
