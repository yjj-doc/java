# java.io 
: 입출력을 위한 클래스와 객체 직렬화를 위한 클래스를 지원하는 패키지  
: 스트림 구조를 통해 입출력 수행  
: 최초 바이트 스트림(바이트 단위)만 지원했으나 이후 문자 스트림(2byte)지원  
: 블로킹 방식이므로 입출력이 빈번한 경우 별도 스레드로 구현하는 것이 좋음  
: java 4부터 Non-Blocking IO 지원  

**클래스 분류**
- 기본 스트림
  - 바이트 스트림
  - 문자 스트림
- 보조 스트림 


**스트림**  
: 데이터 흐름으로 바이트의 연속적인 흐름 의미  
: 단방향으로만 가능하여 입력과 출력이 별도로 존재  

**블로킹**  
: 데이터 입출력을 커널에 요청하고 응답받기 전까지 스레드 대기 상태  

**IO vs NIO**  
IO | NIO
---|---
Stream(단방향) | Buffer(단방향, 양방향) 
Blocking | Blocking, Non-Blocking
x        | Selectors
x        | Channels

**버퍼**  
: 입출력 중인 데이터를 임시 보관하는 메모리 영역  
: 입출력 작업을 최소화하기 위해 사용    


## Byte Stream 
: 바이트 단위(1byte)로 입출력하는 클래스

Stream | InputStream | OutputStream
---|---|---
1차 스트림 | FileInputStream				| FileOutputStream
1차 스트림 | ByteArrayInputStream		| ByteArrayOutputStream
1차 스트림 | PipedInputStream			| PipedOutputStream
2차 스트림 | SequenceInputStream		| -
1차 스트림 | StringBufferInputStream	| -
2차 스트림 | ObjectInputStream			| ObjectputStream 

**보조스트림**  
= 필터 스트림  
: 스트림과 연결되어 여러 보조 기능을 하는 클래스

Stream | InputStream | OutputStream
---|---|---
2차 스트림 | FilterInputStream			| FilterOutputStream
2차 스트림 | LineNumberInputStream	| -
2차 스트림 | DataInputStream			| DataOutputStream 
2차 스트림 | BufferedInputStream		| BufferedOutputStream
2차 스트림 | PushbackInputStream		| -
2차 스트림 | -									| PrintStream



## Character Stream
: 문자 단위(2byte)로 입출력하는 클래스  
: 문자 스트림은 바이트 스트림의 래퍼 클래스  

Stream | Reader | Writer
---|---|---
2차 스트림 | LineNumberReader	| -
1차 스트림 | CharArrayReader		| CharArrayWriter
2차 스트림 | InputStreamReader	| OutputStreamWriter
1차 스트림 | FileReader				| FileWriter 
1차 스트림 | PipedReader			| PipedWriter 
2차 스트림 | -							| PrintWriter
1차 스트림 | StringReader			| StringWriter  

**보조스트림**
Stream | Reader | Writer
---|---|---
2차 스트림 | FilterReader			| FilterWriter
2차 스트림 | BufferedReader		| BufferedWriter
2차 스트림 | PushbackReader		| -