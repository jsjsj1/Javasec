## Java cc链分析commons collections

cc 是java扩展包里面有很多集合

方便我们操作各种集合，有很多高级操作，由apache开源

```
ConstantTransformer InvokerTransformer  ChainedTransformer
```

ConstantTransformer InvokerTransformer  ChainedTransformer

```
ChainedTransformerRuntime.getRuntime()  InvokerTransformer("exec",new Class[]{String.class},new Object[]{"calc"} transformAnnotationInvocationHandler
```