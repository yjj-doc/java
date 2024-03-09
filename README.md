# Java  
: 응용 프로그램 개발을 위한 프로그래밍 언어와 개발 도구 및 실행 환경  

- [Java Platform](#java-platform)
  - [JDK](./jdk.md)
    - [JVM](./jvm.md)
  - [Java Programming Language](./java-lang/)
  - [Java SE](./java-api-se/)
  - [Java EE](./java-api-ee/)
- [Java Pattern](./java-pattern/)
- [Java Library](./java-lib/)
- [Java Framework](./java-framework/)
- [Java Tool](./java-tool/)



## Java Platform
: 자바 프로그램을 개발하고 실행하기 위한 표준 플랫폼   

플랫폼 | 특징 | 패키지
---|---|---
Java SE (Standard Edition)   | 기본 핵심 기능 | JDK
Java EE (Enterprise Edition) | 엔터프라이즈 애플리케이션 | Java EE SDK
Java ME (Mobile Edition)     | 임베디드, 모바일, IoT | Java ME SDK
Java Embedded                | Java ME Embedded + Java SE Embedded | Java Embedded Suite



## JCP  
Java Community Process  
: 자바 관리 조직   
: 자바 플랫폼 버전 및 기술 사양을 제안/검토/승인하는 커뮤니티    
: Java EE 경우 소유권이 Eclipse Foundation으로 넘어가면서 Jakarta EE으로 이름이 변경되고 기술 사양은 Jakarta EE Working Group에서 검토  

- JSR 
- JEP 

**EFSP**  
: Eclipse Foundation 사양 프로세스  
: Jakarta EE를 위한 사양 프로세스  



### JSR
Java Specification Requests  
: 자바 스펙 요구서  
: 자바 플랫폼에 추가된 사양 및 기술에 대한 공식 문서  

**JSR list**  
https://www.jcp.org/en/jsr/all


JSR-ID  | 기술
---|---
366 | Java SE 8
384 | Java SE 11
392 | Java SE 17
397 | Java SE 22
901 | JLS (Java Language Specification)
924 | JVM
926 | Java 3D API
927 | Java TV API



### JEP
JDK Enhancement Proposal  
: JDK 향상 제안  
: 기존 기능 개선이나 새로운 기능 제안  

**JEP list**  
https://openjdk.org/jeps/0