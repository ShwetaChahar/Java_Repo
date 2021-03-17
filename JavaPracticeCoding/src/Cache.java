package com.apex.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*; 
import java.lang.*; 
import java.io.*;

class cacheB {
    public LinkedHashMap<Integer, Integer> hm;
    int size;

    cacheB(int s) {
        hm = new LinkedHashMap<Integer, Integer>();
        this.size = s;
    }
     
    public int get(int k) {
        if (hm.containsKey(k)) {
            int v = hm.get(k);
            hm.remove(k);
            hm.put(k, v);
            return v;
        }
        return -9999;
    }

    public void put(int k, int v) {
        if (hm.containsKey(k)) {
            hm.remove(k);
        } else if (hm.size() == size) {
            Integer fkey = hm.entrySet().iterator().next().getKey();
            hm.remove(fkey);
        }
        hm.put(k, v);
    }

}

public class Cache {

    //cache test
    public void test4() {
        cacheB c = new cacheB(5);
        c.put(1,1);c.put(2,2);c.put(3,3);c.put(4,4);c.put(5,5);
        System.out.println(c.hm);
        c.get(1);
        System.out.println(c.hm);
        c.put(6,6);
        System.out.println(c.hm);
    }

    public static void main(String[] args) {
        Cache o = new Cache();
        o.test4();
    }
}
