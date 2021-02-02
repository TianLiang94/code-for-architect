package com.tuling.jvm01;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryTest {
    public static void main(String[] args) {
        String[][]  str = new String[10000][20000];
        List list = new ArrayList();
        list.add(new OutOfMemoryTest());

    }
}
