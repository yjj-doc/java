package nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import org.junit.Ignore;
import org.junit.Test;

public class BufferTest {

	// Buffer 
	// : 정의한 크기의 데이터를 보관하는 컨테이너 클래스
	// : 데이터 입출력시 바로 데이터를 읽지 않고 일정 크기만큼 버퍼에 보관했다가
	//   한 번에 데이터를 읽어 입출력 성능을 향상
	
	@Test @Ignore
	public void test() {
		
		Buffer b = ByteBuffer.allocate(10);
			
		// 버퍼 크기 반환
		// 객체 생성시 지정한 크기로 변경 불가
		b.capacity();
		
		// 현재 버퍼에서 읽거나 쓸 수 있는 한계 반환 
		b.limit();
		
		// 읽거나 쓸 한계 지정
		b.limit(0);
		
		// 현재 읽거나 쓰는 위치 반환
		b.position();
		
		// 읽거나 쓸 위치 지정
		b.position(0);
		
		// position 위치부터 limit 까지의 남은 크기 반환
		b.remaining();
		
		// position 위치부터 limit 까지의 크기가 있는지 여부 반환
		b.hasRemaining();
		
		// 현재 position 마크 
		// reset하는 경우 position이 가르킬 위치 설정
		b.mark();
		
		// mark된 위치로 position 재설정
		b.reset();
		
		// position을 0으로 바꾸고 mark 삭제
		b.rewind();
				
		// 버퍼 초기화하고 새로 쓰기 위해 준비
		b.clear();

		// 버퍼를 읽기 위해 준비
		b.flip();
		
	}

}