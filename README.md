
javap is the standard disassembler from JDK tools which can be used to view the mnemonical representation of the compiled Java class

bytecode for a class thats simply printing an Int

```
$ javap -c Inventory.class 
Compiled from "Inventory.java"
public class Inventory {
  public Inventory();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: iload_1
       7: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
      10: return
}
```

Note;

instruction;

[bipush 10 - byte push 10](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.bipush)

istore_index - store Int into local var

aload_index - load ref from local var

[getstatic - load static field of class](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.getstatic)

[iload_index - Int load from local var at given index of array](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.iload_n)


Refs
-----

https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html

https://www.beyondjava.net/blog/java-programmers-guide-java-byte-code/

https://zeroturnaround.com/rebellabs/java-bytecode-fundamentals-using-objects-and-calling-methods/

http://jasmin.sourceforge.net/instructions.html
