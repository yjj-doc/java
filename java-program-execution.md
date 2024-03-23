# Java Program Execution
: 자바 프로그램은 컴파일 타임과 런타임 단계를 걸쳐 실행  

![java program execution](https://i.ibb.co/9GVCXL2/java-program-execution.jpg)


```
[컴파일 타임]
1. 소스 코드가 컴파일러에 의해 바이트 코드로 변환 
   1-1. *.java 파일을 읽어 컴퓨터가 이해할 수 있는 구조로 변경 = 바이트 코드 생성
   1-2. *.class 파일 생성 


[런타임]
2. 바이트 코드는 JVM 의해 로드되고 실행
   2-1. 클래스 로더를 통해 참조된 모든 클래스를 메모리에 로드 
   2-2. 바이트 코드를 검증하고 초기화하는 등 준비 과정이 이루어지고 
   2-3. 이후 인터프리터와 JIT 컴파일러가 바이트 코드를 기계 코드로 변환하고 실행함
```



## Java Compiler
: 자바 코드를 자바 바이트 코드로 변환하는 프로그램  


**컴파일러 종류**   
- javac (Java Compiler) 
- ECJ (Eclipse Compiler for Java)
- GCJ (GNU Compiler for Java)
 


## Java Interpreter
: 바이트 코드를 기계 코드로 변환하는 프로그램  

JVM | Compiler 
---|---
HotSpot  | JIT Compiler(C1), Server Compiler(C2)
OpenJ9   | JIT Compiler, AOT Compiler
GraalVM  | JIT Compiler, GraalVM Compiler, GraalVM Native Image(AOT)


**JIT Compiler**  
Just in Time Compiler  
: 동적 컴파일러  
: 런타임 단계에 바이트 코드를 기계 코드로 변환  


**AOT Compiler**  
Ahead of Time Compiler  
: 정적 컴파일러  
: 바이트코드 단계없이 실행 전에 기계 코드 생성  
: 클라우드 네이티브 환경에서 사용하기 적합  
: HotSpotVM에서 AOT 컴파일러는 java9에서 실험적으로 도입되고 java16부터 제거  


**JVMCI**  
: JVM Compiler Interface  
: JVMCI를 통해 JVM에 새로운 컴파일러를 연결 할 수 있음 (ex. HotSpot + Graal)

```java
System.getProperty("java.vm.version");
System.getProperty("jvmci.Compiler");
```



## Java Bytecode
: JVM이 실행할 수 있는 명령 집합  
: 피연산자와 Opcode로 구성  


**Opcode**  
: 바이트 코드 명령어  
: 약 200개의 명령어가 사용되며 약 50개는 디버깅용  
https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-6.html


**invokedynamic**   
: java7 부터 도입된 Opcode    
: JVM을 런타임으로 사용하는 동적 타입 언어를 위해 도입    

```java
public class Example {
    public void 메소드(){
        클래스 변수 = new 클래스();
    }
}


compiled from "Example.java"
public class Example extends java.lang.Object {
public Example();
    code :
        0 : aload_0
        1 : invokespecial  
        4 : return

public void 메소드();
    code :
        0 : new  
        3 : dup
        4 : invokespecial  
        7 : astore_1
        8 : return
}
```



### Java Bytecode Manipulation
: 성능 최적화를 위해 자바 바이트 코드를 조작하고 분석

**라이브러리**
- ASM
- Byte Buddy
- Javassist
- Apache bcel
