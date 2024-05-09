package error;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OutOfMemoryErrorTest {

	// OutOfMemoryError
	// : 메모리 부족시 발생

	@Test
	public void test() {
		
		try {

			this.method();

		} catch ( OutOfMemoryError e){
			e.printStackTrace();
        }
		
	}
	
	private void method() {
		List<Object> list = new ArrayList<>();
		while (true) {
		    list.add(new Object());
		}
	}
	
}