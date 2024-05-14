package io;

import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class OutputStreamTest {

	// OutputStream
	// : 출력 바이트 스트림 클래스들을 위한 추상 클래스 

	@Test
	public void test() {	
		
		try {
			
			OutputStream os = OutputStream.nullOutputStream();
			
			// 하나의 바이트에 데이터 출력
			os.write(0);
			
			// 주어진 바이트 배열에 데이터 출력 
			os.write(new byte[1024]);
			
			// 버퍼에 남아있는 데이터 강제 출력
			os.flush();
			
			// 자원 반환 
			// 내부적으로 flush() 호출
			os.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}