package io;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileTest {

	// RandomAccessFile
	// : 입출력 모두 지원 (DataInput, DataOutput 인터페이스 구현)
	// : 파일에 비순차적으로 접근 가능
	
	@Test
	public void test( ) {
		
		try {
			
			// mode : r, rw, rws, rwd
			RandomAccessFile r = new RandomAccessFile("file", "mode");
			
			// 현재 파일 포인터 반환 
			r.getFilePointer();
			
			// 주어진 바이트만큼 파일 포인터 이동
			r.skipBytes(0);
			
			// 주어진 위치로 파일 포인터 이동
			r.seek(0);

			// 파일 크기 반환
			r.length();
			
			// 주어진 크기로 파일 크기 지정
			r.setLength(0);
			
			// 파일 채널 반환
			r.getChannel();
			
			// 파일 디스크립터 반환
			r.getFD();
			
			// 자원 해제
			r.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}