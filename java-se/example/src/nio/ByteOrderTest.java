package nio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.junit.Ignore;
import org.junit.Test;

public class ByteOrderTest {

	// ByteOrder
	// : 엔디안과 관련된 기능 지원 클래스 
	
	// Endianness
	// : 데이터를 저장하거나 전송할 때 바이트 순서
	// : 운영 체제마다 다르게 동작하며 JVM은 Big Endian으로 동작
	
	// - Big Endian 
	// - Little Endian 
	// - Middle Endian
	
	@Test @Ignore
	public void test() {
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		// 운영 체제의 엔디안
		buffer = buffer.order(ByteOrder.nativeOrder());
		
		// 메모리 첫 주소에 상위 바이트부터 저장
		buffer = buffer.order(ByteOrder.BIG_ENDIAN);
		
		// 메모리 첫 주소에 하위 바이트부터 저장
		buffer = buffer.order(ByteOrder.LITTLE_ENDIAN);
		
	}
	
}