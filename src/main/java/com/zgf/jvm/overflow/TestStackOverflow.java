package com.zgf.jvm.overflow;

/**
 * 测试内容：栈溢出测试（递归调用导致栈深度不断增加）
 * <p>
 * 虚拟机参数：-Xss128k
 */
public class TestStackOverflow {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        TestStackOverflow stackOverflow = new TestStackOverflow();
        try {
            stackOverflow.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + stackOverflow.stackLength);
            throw e;
        }
    }
}
