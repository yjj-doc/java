# Java Lexical Structure   
: 자바 언어 어휘 구조  

**구성 요소**   
- [주석](#comments)
- [공백](#white-space)
- [토큰](#token)
  - [식별자](#identifier)
  - [키워드](#keyword)
  - [리터럴](#literals)
  - [구분 기호](#separators)
  - [연산자](#operators)


## Comments

```java
// 한 줄 주석

/* 여러 줄 주석 */
```



## White Space
: 모든 종류의 공백은 토큰을 구분하기 위해 사용  
: 식별자나 키워드에는 공백 금지  

**종류**
- 공백 (space)   
- 가로 탭 (horizontal tab)
- 폼 피드 (form feed)
- 줄 종결 (carriage return, line feed)

```java
@Test
public void test(){
  System.out.println(Character.isWhitespace('\n'));
}
```



## Token   
: 주석과 공백을 제외한 입력 요소  
: 공백, 세미콜론, 구분 기호로 토큰 구분  

**종류**
- [식별자](#identifier)
- [키워드](#keyword)
- [리터럴](#literals)
- [구분 기호](#separators)
- [연산자](#operators)



### Identifier
: 변수, 메서드, 레이블, 클래스, 패키지 등 식별을 위해 부여하는 이름  
: 공백, 키워드, boolean과 null 리터럴을 제외한 대소문자와 숫자 사용  
: 달러(\u0024) 기호는 사용 가능하나 컴파일러에서 사용하므로 사용 지양  
: 첫 문자로 숫자 사용 불가  


**Java Naming Conventions**
종류 | 설명 | 사용
---|---|---
camelCase  | 첫 글자는 소문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - variable <br>- method
PascalCase | 첫 글자는 대문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - class <br>- interface
SNAKE_CASE | 모든 글자는 대문자를 사용하고 단어는 언더스코어 기호로 구분 | static variable



### keyword
: 의미가 지정된 키워드로 식별자로 사용 불가능  

**Reserved Keyword**
키워드 | 설명 
--- |---
_            | (java9) 람다
abstract     | 추상 메서드와 추상 클래스 정의  
assert       | boolean expression, 코드 검증
boolean      | 데이터 타입   
break        | 조건문에서 흐름 중단, 스위치문과 반복문에서 종료하기 위한 키워드  
byte         | 데이터 타입 
case         | 스위치문에서 텍스트 블록 정의를 위한 키워드
catch        | 트라이문에서 생성된 예외를 잡기 위한 키워드
char         | 데이터 타입   
class        | 클래스 정의  
const        | (예약어)
continue     | 반복문에서 현재 흐름을 중단하기 위한 키워드
default      | 스위치문에서 기본 코드 블록 정의를 위한 키워드 
do           | 제어문에서 루프를 선언하기 위한 키워드 
double       | 데이터 타입
else         | 조건문에서 분기하기 위한 키워드
enum         | 이넘 정의
extends      | 클래스나 인터페이스가 확장됨을 정의하는 키워드
final        | 변수의 값을 변경 불가능하게 하기 위한 키워드
finally      | 트라이문에서 예외 발생 여부와 상관없이 마지막에 실행될 코드 블럭을 정의하는 키워드 
float        | 데이터 타입
for          | 반복문
if           | 조건문 
goto         | (예약어)
implements   | 인터페이스 구현을 위한 키워드
import       | 클래스와 인터페이스를 가져오기 위한 키워드
instanceof   | boolean expression, 객체의 타입을 확인하기 위한 키워드  
int          | 데이터 타입
interface    | 인터페이스
long         | 데이터 타입
native       | 메서드가 네이티브 코드로 구현 되도록 지정하기 위한 키워드
new          | 새로운 객체 생성을 위한 키워드
package      | 패키지 
private      | 접근 제어자
protected    | 접근 제어자
public       | 접근 제어자 
return       | 메서드 실행을 종료하고 값을 반환하기 위한 키워드
short        | 데이터 타입
static       | 클래스 변수, 클래스 메서드를 지정하기 위한 키워드
strictfp     | (미사용) 부동 소수점 계산 제한
super        | 상위 클래스 객체를 참조하기 위한 키워드
switch       | 스위치문
synchronized | 다중 스레드에서 동기화가 필요한 메서드나 코드 블럭을 지정하는 키워드 
this         | 현재 객체를 참조하기 위한 키워드
throw        | 예외를 명시적으로 발생하는 키워드
throws       | 예외 선언을 위해 사용하는 키워드
transient    | 직렬화 과정에서 제외할 경우 지정하는 키워드
try          | 트라이문
void         | 메서드에서 리턴 타입이 없음을 지정하는 키워드
volatile     | 필드를 메인 메모리에 저장하기 위한 키워드
while        | 루프문 


**Contextual Keyword**
키워드 | 설명 
--- |---
exports      | (java9) 모듈을 가져오거나 내보내기 위한 키워드   
module       | (java9) 모듈 선언 키워드 
non-sealed   | (java17) Sealed 클래스 
open         | (java9) 모듈 오픈 키워드
opens        | (java9) 특정 패키지 오픈 키워드
permits      | (java17) Sealed 클래스
provides     | (java9) 모듈 시스템
record       | (java14) Record 클래스 
requires     | (java9) 모듈 내부에서 필요한 라이브러리 지정
sealed       | (java17) Sealed 클래스
to           | (java9) 모듈 시스템
transitive   | (java9) 모듈 시스템
uses         | (java9) 모듈 시스템
var          | (java10) 로컬 변수의 타입 추론을 위한 키워드
when         | 
with         | (java9) 모듈 시스템
yield        | (java14) Switch 블록내에서 계산된 값을 반환하기 위한 키워드



### Literals 

- Null Literal
- Boolean Literal
- Integer Literal
- Floating Point Literal
- Character Literal
- String Literal

https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.10



### Separators

구분 기호 | 설명
---|---
( )  | 메서드 정의 및 호출, 매개 변수 목록, 표현식에서는 우선 순위 정의, 제어문에서는 표현식 정의
[ ]  | 배열 유형 선언, 배열 값 참조
{ }  | 배열의 초기 값, 클래스와 메서드 및 명령문을 묶는 블록 정의   
;    | 문장 분리나 종료
,    | 변수 연속 선언시 식별자 구분
.    | 패키지 구분, 객체의 필드와 메서드 참조
@    | 어노테이션
...  | 가변 인자
:    | 삼항 연산자, for-each 문, switch 문, label문, assertion에 사용
::   | 생성자 참조나 메서드 참조 	



### Operators
: 연산을 수행하는 기호로 38개 연산자 기호 존재  

```
=   >   <   !   ~   ?   :   ->
==  >=  <=  !=  &&  ||  ++  --
+   -   *   /   &   |   ^   %   <<   >>   >>>
+=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=
```