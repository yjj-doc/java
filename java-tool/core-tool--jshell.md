# JShell
= Java Shell  
: java9 부터 도입된 REPL(읽기-평가-인쇄 루프) 도구  
: 자바 소스 코드를 파일로 생성 및 컴파일 단계없이 실행 가능  


**command**  
https://docs.oracle.com/en/java/javase/21/docs/specs/man/jshell.html


```bash 
java -version 

jshell
> /help

# 라이브러리 목록 
> /list -all

# import 패키지 목록
> /imports

# 생성한 변수 목록 
> /vars


> int num = 0
> System.out.println("hello world")


# 종료
> /exit
```