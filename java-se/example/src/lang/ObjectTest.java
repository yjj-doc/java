package lang;

import org.junit.Ignore;
import org.junit.Test;

public class ObjectTest {

	// Object
	// : 슈퍼 클래스, 최상위 클래스
	// : 모든 클래스는 Object 클래스를 자동으로 상속
	// : Object 클래스는 모든 클래스가 공통으로 포함해야하는 기능 제공
	// : 객체를 위한 메서드는 오버라이딩 가능하고 스레드를 위한 메서드는 오버라이딩 불가

	@Test @Ignore
	public void cloneTest() throws CloneNotSupportedException {
		
		// clone()
		// 객체의 복사본을 만들어 반환 
		
		// 복제할 클래스는 Cloneable 인터페이스를 구현
		class Example implements Cloneable {
			public Example copy() throws CloneNotSupportedException {
				return (Example) super.clone();
			}
		}
		
		Object obj = new Example().copy();
		System.out.println(obj);
		
	}
	
	@Test @Ignore
	public void equalsTest() {
		
		// equals()
		// 두 객체의 참조 값 비교
		// String, Date, File 등 일부 클래스에서는 값을 비교
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);

	}

	@Test @Ignore
	public void getClassTest() {
		
		// getClass()
		// 객체의 클래스 반환 
		
		String str = new String("test");
		Class<? extends String> cls = str.getClass();
		System.out.println(cls);
		
	}
	
	@Test @Ignore
	public void hashCodeTest() {
		
		// hashCode()
		// 객체의 해시 코드 반환 
		
		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(System.identityHashCode(obj));
		
	}
	
	@Test @Ignore
	public void toStringTest() {
		
		// toString()
		// 객체의 정보를 문자열로 반환 
		// 패키지명.클래스명@16진수해시코드
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

	}

	@Test
	public void waitTest() {
		
		// wait()
		// 스레드를 지정 시간까지 일시적으로 중지
		
		// notify()
		// wait()된 스레드 실행 재개시 호출
		
		class Example {
			synchronized void waitTest() {
				try {
					wait(1000);
					System.out.println("wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		Example ex = new Example();
		ex.waitTest();
		
	}

}