package error;

import org.junit.Test;

public class OutOfMemoryErrorTest {

	// OutOfMemoryError
	// : 메모리 부족시 발생

	// - Heap 
	// - PermGen
	// - GC Overhead limit
	// - VM limit
	// - etc.
	
	// Heap
	// : 힙 영역이 충분하지 않은 경우   
	// : finalize 메서드를 과도하게 사용해 GC가 지연되며 메모리가 부족해지는 경우 

	// PermGen
	// : 과도하게 많은 클래스 로딩으로 인해 PermGen 영역이 충분하지 않은 경우 
	// -XX:PermSize=
	// -XX:MaxPermSize= 
	
	@Test
	public void test() {
		
		try {

			final int[] array = new int[Integer.MAX_VALUE];
			for(int i = 0; i < array.length; ++i)
				array[i] = i + 1;
			
		} catch ( OutOfMemoryError e){
			e.printStackTrace();
		}
		
	}

}