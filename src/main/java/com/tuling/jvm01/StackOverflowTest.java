package com.tuling.jvm01;
/**
 * 重写类加载方法，实现自己的加载逻辑，不委派给双亲加载
 *
 * @param name
 * @param resolve
 * @return
 * @throws ClassNotFoundException
 */
public class StackOverflowTest {
    static int count = 0;


    static void redo() {
        count++;
        redo();
    }

    public static void main(String[] args) {
        try {
            redo();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(count);
        }
    }
}
