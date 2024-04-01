# Java Program Structure
: 자바 프로그램 생성을 위한 표준 구조  
: 프로그램은 데이터와 기능으로 구성된 실행 가능한 코드  
: 자바 프로그램은 클래스로 구성하고 클래스는 데이터(변수)와 기능(메서드)으로 구성   

```java
// 1. package statement
package example.java;

// 2. import statement 
import java.*;

// 3. class definition 
public class Example {

	// 4. block statement 
	{ }

	// 5. class member 
	// - variable 
	// - constructor method
	// - method 


	// 프로그램 실행시 가장 먼저 호출되는 메서드로 자바 프로그램은 하나의 메인 메서드를 포함해야함
    // 프로그램 종료 = 메인 메서드 종료
	public static void main(String[] args) {}
	
}
```


- [package statement](#package-statement)
- [import statement](#import-statement)



## package statement
= named package  
: 동일한 디렉토리에 저장된 관련있는 자바 파일들(클래스, 인터페이스) 모음  
: 패키지에 하위 패키지가 포함될 수 있음  
: 자바 파일이 특정 패키지에 속한 경우 package문에 선언  
: 하나의 자바 파일은 하나의 package문만 선언 가능   

**종류**
- 내장 패키지
- 사용자 정의 패키지 


```java 
package a;
public class Example {}
---
package a.b.c;
public class Example {}
---

// FQCN (fully qualified class name)
// : 클래스가 속한 패키지명을 포함한 이름
Example e1 = new a.Example();
Example e2 = new a.b.c.Example();
```


**명명 규칙**
- 패키지는 모두 소문자 사용
- 마침표로 구분 
- 일반적으로 최상위 도메인부터 시작


**java21 all packages**  
https://docs.oracle.com/en/java/javase/21/docs/api/allpackages-index.html



### Unnamed Package 
= default package, anonymous package  
: 패키지를 생성하지 않은 경우 생기는 이름없는 패키지  
: 이름없는 패키지는 하위 패키지를 생성 할 수 없음  
: 이름없는 패키지에 존재하는 클래스들은 정식 이름이 없어 import문 사용 불가  
: 편의를 위해 제공하는 기능으로 프로그램 제작시 사용 지양  



## import statement
: 다른 패키지에 존재하는 클래스를 가져오기 위한 키워드  

```java
package example.java;

// 모든 클래스 가져오기 
import java.util.*;

// 단일 클래스 가져오기 
import java.util.Date;
```



### static import statement
: java5 부터 지원  
: 정적 멤버에(정적 변수, 정적 메서드) 접근하기 위해 사용  
: 정적 멤버는 클래스 명으로 접근해야 하지만 static import를 사용하면 클래스 명 생략 가능 

```java
import static java.lang.Math.*;

public class Example {
	public static void main(String[] args) {
		System.out.println(PI);
	}
}
```