# bytecode of Mickas class

notice `bark1` has the `ATHROW` instruction but `bark2` don't.

you can check it by running the tests of `DifferentBehaviour`, 
the `bark2` runs but does not print anything in other hand the `bark1` throws an `NoWhenBranchMatchedException`


```
// ================cocos/dd/Mickas.class =================
// class version 50.0 (50)
// access flags 0x31
public final class cocos/dd/Mickas {


  // access flags 0x11
  public final bark1(Lcocos/dd/Beagle;)V
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 1
    LDC "beagle"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 5 L1
    ALOAD 1
    ASTORE 2
   L2
    LINENUMBER 6 L2
    ALOAD 2
    GETSTATIC cocos/dd/Beagle$Tricolor.INSTANCE : Lcocos/dd/Beagle$Tricolor;
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L3
   L4
    LDC "Au au"
    ASTORE 3
   L5
    ICONST_0
    ISTORE 4
   L6
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 3
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L7
   L8
    GOTO L9
   L3
    NEW kotlin/NoWhenBranchMatchedException
    DUP
    INVOKESPECIAL kotlin/NoWhenBranchMatchedException.<init> ()V
    ATHROW
   L10
    LINENUMBER 7 L10
   L9
    RETURN
   L11
    LOCALVARIABLE this Lcocos/dd/Mickas; L0 L11 0
    LOCALVARIABLE beagle Lcocos/dd/Beagle; L0 L11 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x11
  public final bark2(Lcocos/dd/Beagle;)V
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 1
    LDC "beagle"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 10 L1
    ALOAD 1
    ASTORE 2
   L2
    LINENUMBER 11 L2
    ALOAD 2
    GETSTATIC cocos/dd/Beagle$Tricolor.INSTANCE : Lcocos/dd/Beagle$Tricolor;
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
    IFEQ L3
   L4
    LDC "Au au"
    ASTORE 3
   L5
    ICONST_0
    ISTORE 4
   L6
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 3
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
   L7
   L8
    GOTO L9
   L3
    LINENUMBER 12 L3
   L9
    LINENUMBER 13 L9
    RETURN
   L10
    LOCALVARIABLE this Lcocos/dd/Mickas; L0 L10 0
    LOCALVARIABLE beagle Lcocos/dd/Beagle; L0 L10 1
    MAXSTACK = 2
    MAXLOCALS = 5

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 3 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Lcocos/dd/Mickas; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  @Lkotlin/Metadata;(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"}, d2={"Lcocos/dd/Mickas;", "", "()V", "bark1", "", "beagle", "Lcocos/dd/Beagle;", "bark2", "Cocos2dWhen"})
  // compiled from: Mickas.kt
  // debug info: SMAP
Mickas.kt
Kotlin
*S Kotlin
*F
+ 1 Mickas.kt
cocos/dd/Mickas
*L
1#1,16:1
*E

}


// ================META-INF/Cocos2dWhen.kotlin_module =================
         
```

