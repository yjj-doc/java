package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class InputStreamTest {

	// InputStream
	// : 입력 바이트 스트림 클래스들을 위한 추상 클래스

	@Test
	public void test() {		
		
		try {
			
			InputStream is = InputStream.nullInputStream();

			// 읽을 수 있는 바이트 크기 반환 
			is.available();
			
			// 하나의 바이트를 읽고 0~255 사이의 값 반환
			// 데이터가 없으면 -1 반환
			is.read();
			
			// 데이터를 읽고 주어진 바이트 배열에 저장
			// 하드 디스크 섹터 사이즈가 512 바이트이므로 512 배수 사용 
			is.read(new byte[1024]);
			
			// 모든 바이트를 읽어 바이트 배열로 반환
			is.readAllBytes();
		
			// 주어진 크기만큼 바이트를 읽고 바이트 배열로 반환
			is.readNBytes(0);
			
			// 모든 바이트를 읽고 주어진 출력 스트림에 작성
			is.transferTo(OutputStream.nullOutputStream());
			
			// 주어진 크기만큼 데이터를 건너 뛰고 바이트를 읽어 반환
			is.skip(0);
			
			// 마크 지원 여부 확인
			is.markSupported();
			
			// 주어진 크기에 마크 설정
			is.mark(0);
			
			// 마지막으로 마크를 설정한 위치로 이동
			is.reset();
			
			// 자원 해제
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}