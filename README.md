### Gson容错扩展库 [![](https://www.jitpack.io/v/976112643/IKGson.svg)](https://www.jitpack.io/#976112643/IKGson)
> 改造后的Gson库，对常用的数据类型进行容错处理（若某一个字段由于数据类型不匹配，采用默认值处理）

- 集成方式
> 1. 添加jitpack仓库
```java
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```

> 2. 加入依赖
```java
	dependencies {
	        compile 'com.github.976112643.IKGson:gson:1.0'
	}
```

- 容错模式默认开启,若需要修改,可以使用如下方法配置:
```java
    GsonStrictMode.getInstance()
                 .setCheckTypeException(false)//是否检查类型异常,默认为false
                 .setBooleanVal(true)//设置各类型的默认值, 调用后默认不再检查类型
                 .setIntVal(-110)
                 .setStringVal("类型错啦,")
                 .setNullArray(true)//数组类型是否为null
                 .setNullObject(false);//对象类型是否为null
```

### 2. 容错模式下常用类型采用的默认值

类型 | 默认值
:---:|:---:
byte | 0
short | 0
int |0
long |0L
float | 0.0F
double | 0.0D
chat | '\0'
String | ""
Boolean |false
Array(数组) | [] 空数组
List(集合) | []  空集合
Objec(对象) | null

---















