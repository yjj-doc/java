package io;

import java.io.IOException;
import java.io.Writer;

import org.junit.Test;

public class WriterTest {

	// Writer
	// : 출력 문자 스트림 클래스들을 위한 추상 클래스

	@Test
	public void test() {
			
		try {
	
			Writer w = Writer.nullWriter();
			
			// 주어진 문자 출력
			w.write(0);

			// 주어진 문자열 출력 
			w.write("");
			
			// 주어진 문자 추가 
			w.append((char)0);
			
			// 버퍼에 남아있는 문자 강제 출력
			w.flush();
			
			// 자원 반환
			w.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}