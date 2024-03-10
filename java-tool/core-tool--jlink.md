# jlink
https://docs.oracle.com/en/java/javase/21/docs/specs/man/jlink.html

: java9 부터 지원하는 사용자 정의 자바 런타임 생성 도구  
: 기존 JRE는 약 5000개의 클래스가 포함되어 메모리가 낭비되는데 jlink를 사용해 애플리케이션에 필요한 클래스만 포함된 작은 JRE를 만들 수 있어 메모리 낭비를 줄이고 성능을 최적화할 수 있음  


```java 
module exampleModule {
    requires java.logging;
}
```

```bash
# jdeps 도구를 사용해 의존되는 모듈 확인 
jdeps --module-path out -s --module exampleModule

# 사용자 정의 JRE 생성
jlink --module-path "모듈경로" --add-modules exampleModule,java.base --output 이름

# 실행
java -m exampleModule/패키지.클래스 
```