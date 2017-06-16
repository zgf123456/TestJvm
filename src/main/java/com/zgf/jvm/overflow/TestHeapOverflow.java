package com.zgf.jvm.overflow;

import java.util.ArrayList;

/**
 * Created by zgf on 17/6/16.
 * <p>
 * 测试内容：堆溢出
 * <p>
 * 虚拟机参数：-Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 */
public class TestHeapOverflow {
    public static void main(String[] args) {
        ArrayList<TestHeapOverflow> arrList = new ArrayList<>();
        while (true) {
            arrList.add(new TestHeapOverflow());
        }
    }
}
