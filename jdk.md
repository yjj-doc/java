# JDK
Java Development Kit   
: 자바 프로그램 개발을 위한 패키지  
: 자바 프로그램을 개발하고 실행, 테스트, 배포하기 위한 라이브러리와 도구들로 구성  

- Dev Tools 
- [JRE](#jre)
  - [Java Class Library](#java-class-library)
  - [Java Virtual Machine](./jvm.md)


**무료 구현체**
- OpenJDK
- Temurin(Eclipse)
- Zulu(Azul)
- Corretto(Amazon)

**유료 구현체**
- Oracle JDK
- Zing(Azul)


**java8 directory structure**  
```bash
jdk/
├── bin        # 컴파일러, 런처, 디버거 등 개발 도구
├── include    # 네이티브 코드 프로그래밍을 지원하는 헤더 파일들
├── jre        # 개발 도구에서 사용하는 자바 실행 환경, JVM, 클래스 라이브러리들
└── lib        # tools.jar, dt.jar, 추가 클래스 라이브러리  
```


**oracle java8 tools** 
도구 | 설명
---|---
javac    | 자바 컴파일러로 자바 파일을 클래스 파일로 컴파일
java     | 자바 인터프리터로 바이트코드를 해석하고 실행
javap    | 자바 역어셈블러로 클래스 파일을 자바 파일로 변환
jdeps    | 자바 패키지와 클래스의 종속성 분석  
javadoc  | 자바 문서 생성기
javah    | 헤더 파일 생성
jdb      | 자바 디버거
jar      | 자바 압축 파일 생성 및 관리
extcheck | 이전 JAR 파일과 현재 설치될 JAR 파일간의 버전 충돌 감지  
jmc      | (오라클) JVM 모니터링 도구
jfr      | (오라클) jmc를 통해 수집된 정보를 저장하고 문제 분석하는 도구


**java21 directory structure**
```bash
jdk/
├── bin        
├── conf
├── include    
├── jmods    
├── legal          
└── lib        
```


**oracle java21 tools**  
https://docs.oracle.com/en/java/javase/21/docs/specs/man/index.html


**openJDK tools**  
https://openjdk.org/tools/ 



## JRE
Java Runtime Environment  
: 자바 런타임 환경  
: 자바 프로그램 실행을 위한 패키지로 일종의 메타 운영 체제  
: 오라클 경우 java8 까지는 2개의 JRE를 지원했으나 java9 부터는 별도로 지원하지 않음  
: java11 부터는 jlink 도구를 사용해 사용자 정의 JRE를 생성할 수 있음  


**런타임 환경**  
: 프로그램을 실행할 수 있는 환경  
: 예전에는 운영 체제를 런타임 환경으로 사용해 파일 시스템, 네트워크 등에 접근시 운영 체제에 의존하게 됨  

**메타 운영 체제**   
: 운영 체제 위에 구축되어 운영 체제와 유사한 서비스를 제공하는 시스템   


```
Java Program
------------
JRE (JVM)
------------
OS
```


**구성**  
- Java Class Library
- Java Virtual Machine



### rt.jar 
: 자바 런타임 환경을 위한 클래스 파일  
: 부트스트랩 클래스 로더에 의해 가장 먼저 로드되며 JVM이 검사하지 않음  
: java9 부터 모듈 시스템이 도입되며 제거되고 jrt-fs.jar로 대체   

**java8**
- Public JRE : 독립 구성 요소 ($JAVA_HOME/jre/lib/rt.jar)
- Private JRE : JDK 일부 ($JAVA_HOME/jdk/jre/lib/rt.jar)

**jrt-fs.jar**  
: 자바 런타임 파일 시스템  



### Java Class Library
: JVM이 런타임에 호출할 수 있는 동적으로 로드 가능한 라이브러리 모음  
: 운영 체제, 하드웨어에 접근하기 위한 인터페이스 제공  
: java8 에서는 rt.jar에 포함되었으나 java9 이후에는 모듈화하여 지원  