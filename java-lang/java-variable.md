# Java Variable
= 필드, 속성, 상태, 특성  
: 메모리에 저장된 데이터의 위치를 가르키는 기호        
: 변수에 선언된 이름을 통해 메모리에 데이터를 저장 및 핸들링함      


```java
// 변수 선언 
// 1. 데이터 타입 지정 : 데이터 타입에 따라 메모리 공간 확보   
// 2. 변수명 지정 : 이름과 메모리 위치를 연결 
int num;

// 3. 식별자를 통해 메모리에 접근하고 할당 연산자를 사용해 데이터 할당 
num = 0;

// 변수 선언 및 초기화 
int num = 0;
```



## final variable 
= 최종 변수  
: final 키워드로 선언된 변수  
: 할당된 메모리 주소를 변경할 수 없음      
: 프리미티브 타입일 경우 할당된 데이터를 변경할 수 없음 (= 상수)  

```java
public class Example {
    // 값 변경 불가
    final int NUM = 0;
}
```



## static variable 
= 정적 변수, 클래스 변수  
: static 키워드로 선언된 변수  
: 클래스가 메모리에 로드될 때 생성되며 클래스가 제거되면 함께 제거됨   
: 항상 값이 있는 상태로 초기화하지 않을 경우 컴파일러에 의해 기본 값 할당  
: 클래스에 속하는 변수로 클래스의 인스턴스들이 공유하는 변수  
: 클래스 명을 통해 참조  


```java
public class Example {
    static int num;
}
```



## instance variable
= 멤버 변수  
: 클래스 내부에 메서드 외부에 선언된 변수  
: 클래스의 객체 생성시 생성되며 객체가 제거되면 함께 제거됨  
: 항상 값이 있는 상태로 초기화하지 않을 경우 컴파일러에 의해 기본 값 할당  
: 클래스의 객체를 통해 참조  

```java
public class Example {
    int num;
} 
```



## local variable  
: 생성자나 메서드 내에서 선언된 변수  
: 생성자나 메서드가 실행될 때 생성되며 생성자나 메서드가 제거되면 함께 제거  
: 초기화하지 않으면 컴파일 오류가 발생하므로 초기화 필수  
: 선언된 범위 내에서만 참조 가능   
: java10 부터 var 키워드를 통해 데이터 타입을 지정하지 않는 변수 지원   


```java
public class Example {
    public void test(){
        int num = 0;
    }
}
```

**java 10**
```java
public class Example {
    public void test(){
        // 컴파일러에 의해 데이터 타입 추론  
        var num = 0;
    }
}
```



## parameter variable   
= 매개 변수, 형식 매개 변수  
: 생성자나 메서드의 시그니처에 선언된 변수   
: 생성자나 메서드가 실행될 때 생성되며 생성자나 메서드가 제거되면 함께 제거됨  
: 초기화하지 않으면 컴파일 오류가 발생하므로 초기화 필수  
: 선언된 범위 내에서만 참조 가능  


```java
public class Example {
    public void test(int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 0;
        test(num); // 인수, 실제 매개 변수
    }
}
```