package io;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class ReaderTest {

	// ReaderTest
	// : 입력 문자 스트림 클래스들을 위한 추상 클래스

	@Test
	public void test() {
		
		try {
			
			Reader r = Reader.nullReader();
		
			// 입력 스트림이 준비되었는지 여부 반환
			r.ready();

			// 하나의 문자를 읽고 0~65535 사이의 값 반환
			// 문자가 없으면 -1 반환
			r.read();
			
			// 문자를 읽어 주어진 char 배열에 저장하고 읽은 문자 개수 반환
			r.read(new char[1024]);
			
			// 모든 문자를 읽고 주어진 출력 스트림에 작성
			r.transferTo(Writer.nullWriter());
			
			// 주어진 크기만큼 문자 개수 스킵
			r.skip(0);
			
			// 마크 지원 여부 반환
			r.markSupported();
			
			// 주어진 크기에 마크  
			r.mark(0);
			
			// 마지막 마크를 설정한 위치로 이동 
			r.reset();
			
			// 스트림을 닫고 자원 반환
			r.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}