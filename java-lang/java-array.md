# Java Array   
: 자바에서 배열은 객체  
: 유효하지 않은 인덱스 사용시 컴파일 타임에는 알 수 없으며 런타임에 오류 발생


**배열 선언**
```java
// 배열로 선언한 변수는 객체에 대한 참조 보유 
// 배열 선언시 객체가 생성되거나 공간이 할당된 것은 아님
int[] 식별자;
int 식별자[];
```


**배열 생성** 
```java
// new 키워드를 사용해 요소의 데이터 타입과 길이를 지정해야 함
// 메모리를 확보하고 요소를 할당
식별자 = new int[3];
식별자 = new int[] {1,2,3};
```


**배열 선언과 생성** 
```java  
// 명시적 배열 크기 지정
// 배열의 크기만 지정할 경우 선언된 데이터 타입 초기값으로 초기화
int[] arr = new int[3];

// 묵시적 배열 크기 지정 = 배열 리터럴
// 컴파일러가 배열의 길이 계산
int[] arr = {1,2,3};
int[] arr = new int[]{1,2,3};
```


**무명 배열**
```java
// 배열의 이름없이 초기값으로 배열 생성 
// 일회성으로 사용할 경우 사용
System.out.println(Arrays.toString(new int[]{1,2,3}));
```


**배열 순회**
```java
for(int i=0 ; i<arr.length; i++)
    System.out.println(arr[i]);

for(int i : arr)
    System.out.println(i);
```


**배열 복사**
```java
// 배열이 생성되면 배열의 크기 변경이 불가능하나 배열을 복제하는 방법으로 배열의 크기를 늘릴 수 있음

// 1. 배열 부분 복사
// System.arraycopy(원본배열, 시작, 복사될배열, 시작, 개수)
int[] arr = {1,2,3,4,5};
int[] target = {0,0,0,0,0};
System.arraycopy(arr, 1, target, 1,2); 
System.out.println(Arrays.toString(target));

// 2. 배열 전체 복사 
int[] arr = {1,2,3,4,5};
int[] target = arr.clone();
```


**java.lang.reflect.Array**  
: 배열 동적 생성과 배열에 접근하기 위한 클래스    


**java.util.Arrays**  
: 배열을 다루기 위한 기능이 존재하는 클래스  
: 배열 조작, 배열 복사, 항목 정렬, 항목 검색 등



## Multidimensional Array
: 자바의 다차원 배열은 테이블 형태의 배열이 아닌 배열의 배열


**2차원 배열**
```java
int[][] arr = new int[3][4];

or

int[][] arr = new int[3][];
arr[0] = new int[4];
arr[1] = new int[4];
arr[2] = new int[4];
```

&nbsp; | 컬럼1 | 컬럼2 | 컬럼3 | 컬럼4
---|---|---|---|---
<b>열1</b> | [0][0] | [0][1] | [0][2] | [0][3]
<b>열2</b> | [1][0] | [1][1] | [1][2] | [1][3]
<b>열3</b> | [2][0] | [2][1] | [2][2] | [2][3]


```java
int[][] arr = {
    {1},
    {3, 4, 5, 6},
    {7, 8},
};

for(int[] inner : arr) {
    for(int i : inner) {
        System.out.println(i);
    }
}
```

&nbsp; | 컬럼1 | 컬럼2 | 컬럼3 | 컬럼4
---|---|---|---|---
<b>열1</b> | 1 | | | |
<b>열2</b> | 3 | 4 | 5 | 6
<b>열3</b> | 7 | 8 | | |



## Array + JVM
: 자바에서 배열은 객체이지만 다른 객체와 달리 생성자가 없음  
: 배열 기호를 발견하면 JVM이 배열을 생성하는 바이트코드를 호출함    
: 배열의 length 속성은 컴파일러에 의해 호출되는 특수 바이트코드  


**바이트 코드**
- newarray : 기본 유형 배열
- anewarray : 객체 참조 배열
- multinewarray : 다차원 배열 
- arraylength


**배열 클래스**
```java
int[] arr = {1,2,3};
System.out.println(arr.getClass());
System.out.println(arr.getClass().getName());
```

Element Type | Encoding | Class
---|---|---
boolean   | Z | [Z
byte      | B | [B
char      | C | [C
short     | S | [S
int       | I | [I
long      | J | [J
float     | F | [F
double    | D | [D
Object    | Lclassname | [L


https://blogs.oracle.com/javamagazine/post/java-array-objects