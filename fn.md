
object representation of `Function<A, B>` is created using invokedynamic

[Why are Java 8 lambdas invoked using invokedynamic?](https://stackoverflow.com/a/30002627/432903)

https://stackoverflow.com/a/57016646/432903

http://cr.openjdk.java.net/~briangoetz/lambda/lambda-translation.html

```bash
λ javap -c ShippingFn.class 
Compiled from "ShippingFn.java"
public class ShippingFn {
  public ShippingFn();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: invokedynamic #2,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
       5: astore_1
       6: aload_1
       7: bipush        100
       9: invokestatic  #3                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      12: invokeinterface #4,  2            // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
      17: checkcast     #5                  // class java/lang/Integer
      20: astore_2
      21: getstatic     #6                  // Field java/lang/System.out:Ljava/io/PrintStream;
      24: aload_2
      25: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      28: return
}
```
