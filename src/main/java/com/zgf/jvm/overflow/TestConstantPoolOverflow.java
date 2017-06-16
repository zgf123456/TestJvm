package com.zgf.jvm.overflow;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试内容：常量池溢出（这个例子也可以说明运行时常量池为方法区的一部分）
 * <p>
 *
 * JDK1.7 虚拟机参数-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * 注意一下JDK1.7下是不会有这个异常的，while循环将一直下去，因为JDK1.7之后溢出了永久代并采用Native Memory来实现方法区的规划了
 */
public class TestConstantPoolOverflow {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
