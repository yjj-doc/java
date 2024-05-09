# Java Generic
: 범용 데이터 타입 정의  
: 클래스, 인터페이스, 메서드 정의시 변수의 데이터 타입을 명시하지 않음  
: 컴파일 타임에 데이터 타입 확정  

**종류**
- [Generic Classes](#generic-classes)
- [Generic Interface](#generic-interface)
- [Generic Methods](#generic-methods)
- [Multiple Type Parameters](#multiple-type-parameters)
- [Bounded Type Parameters](#bounded-type-parameters)
- [Unbounded Wildcard](#unbounded-wildcard)
- [Upper Bounded Wildcard](#upper-bounded-wildcard)
- [Lower Bounded Wildcard](#lower-bounded-wildcard)


**Type Parameter Naming Conventions**
타입 매개 변수 | 의미
---|---
E  | element
K  | key
V  | value
N  | number
T  | type -- 첫번째 타입 매개 변수로 사용
S  | type -- 두번째 타입 매개 변수로 사용
U  | type -- 세번째 타입 매개 변수로 사용
V  | type -- 네번째 타입 매개 변수로 사용


**Type Erasure**  
: 타입 소거  
: 컴파일 타임에 데이터 타입을 체크하고 타입을 삭제 (List<String> => List)  



## Generic Classes
= Parameterized type  

```java
// 이전 방식
class Box {
	private Object value;
}


// 제네릭
class Box<T> {
	private T value;
	public void setValue(T value) { this.value = value; }
	public T getValue(){ return this.value; }
}

Box<String> box = new Box<>();
```



## Generic Interface

```java
interface Box<T> {
	public T getValue();
}

class BoxImpl implements Box<T> {
	private T value;

	@Override
	public T getValue() { return this.value; }
}
```



## Generic Methods  

```java
class Box {

	public <T> T getValue(T value) {
		return value;
	}

	public <E> void printArray(E[] array) {
		for(E element : array){
			System.out.print(element);
		}
	}

}
```



## Multiple Type Parameters

```java
class Box<K, V> {
	private K key;
	private V value;

	public Box(K key, V value){
		this.key = key;
		this.value = value;
	}
}

Box<String, String> box = new Box<>("key", "value");
```



## Bounded Type Parameters
: 경계 유형 매개 변수  
: 특정 데이터 타입 제한  

```java
// Number 타입 혹은 Number 하위 타입만 가능
class Box<T extends Number> {
	private T value;
}


class Box {
	public <T extends Comparable> T getArray(T[] array);
}


class Box {
	public <T extends Number & Comparable<T>> T getArray(T[] array);
}


// 여러 데이터 타입 제한
class Box<T extends Number & Integer> {
	private T value;
}
```



## Unbounded Wildcard
: 와일드 카드를 사용하여 데이터 타입을 느슨하게 정의    

```java
class Box {

	public void print(Collection<?> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```



## Upper Bounded Wildcard
: 상위 경계 와일드카드    

```java
class Box {

	public void print(Collection<? extends Number> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```



## Lower Bounded Wildcard
: 하위 경계 와일드카드     

```java
class Box {

	public void print(Collection<? super Integer> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```