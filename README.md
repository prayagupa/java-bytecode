
`javap` is the standard disassembler from JDK tools which can be used to view the mnemonical representation of the compiled Java class

bytecode for a class thats simply printing an Int

```java
$ javap -c Inventory.class //c = dis-assemble
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

aload_index - load ref from local var

[bipush 10 - byte push 10](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.bipush)

[istore_index - store Int into local var (local means method scope, ) at given index of array, 0 is already taken by this reference](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.istore_n)

[getstatic - load static field of class](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.getstatic)

[iload_index - Int load from local var at given index of array](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.iload_n)

[invoke_virtual - Invoke instance(virtual) method; dispatch based on class](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.invokevirtual)

[return - return void from method](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.return)

Verbose mode
--------------

```java
$ javap -v Inventory.class 
Classfile /Users/prayagupd/possibilities/programming/s2/bytecode-programming/Inventory.class
  Last modified Feb 16, 2017; size 395 bytes
  MD5 checksum 0b08cee6730e3aa9a7269d54212abe80
  Compiled from "Inventory.java"
public class Inventory
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #5.#14         // java/lang/Object."<init>":()V
   #2 = Fieldref           #15.#16        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = Methodref          #17.#18        // java/io/PrintStream.println:(I)V
   #4 = Class              #19            // Inventory
   #5 = Class              #20            // java/lang/Object
   #6 = Utf8               <init>
   #7 = Utf8               ()V
   #8 = Utf8               Code
   #9 = Utf8               LineNumberTable
  #10 = Utf8               main
  #11 = Utf8               ([Ljava/lang/String;)V
  #12 = Utf8               SourceFile
  #13 = Utf8               Inventory.java
  #14 = NameAndType        #6:#7          // "<init>":()V
  #15 = Class              #21            // java/lang/System
  #16 = NameAndType        #22:#23        // out:Ljava/io/PrintStream;
  #17 = Class              #24            // java/io/PrintStream
  #18 = NameAndType        #25:#26        // println:(I)V
  #19 = Utf8               Inventory
  #20 = Utf8               java/lang/Object
  #21 = Utf8               java/lang/System
  #22 = Utf8               out
  #23 = Utf8               Ljava/io/PrintStream;
  #24 = Utf8               java/io/PrintStream
  #25 = Utf8               println
  #26 = Utf8               (I)V
{
  public Inventory();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 2: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: bipush        10
         2: istore_1
         3: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         6: iload_1
         7: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
        10: return
      LineNumberTable:
        line 5: 0
        line 6: 3
        line 7: 10
}
SourceFile: "Inventory.java"
```

Refs
-----

https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html

https://www.beyondjava.net/blog/java-programmers-guide-java-byte-code/

http://arhipov.blogspot.com/2011/01/java-bytecode-fundamentals.html

https://zeroturnaround.com/rebellabs/java-bytecode-fundamentals-using-objects-and-calling-methods/

http://blog.jamesdbloom.com/JavaCodeToByteCode_PartOne.html

http://jasmin.sourceforge.net/instructions.html
