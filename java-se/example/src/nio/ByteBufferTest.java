package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

import org.junit.Ignore;
import org.junit.Test;

public class ByteBufferTest {

	// ByteBuffer
	// : 바이트 데이터를 위한 버퍼 클래스
	
	@Test @Ignore
	public void test() {
		
		// JVM 메모리에 버퍼 생성 = 넌다이렉트 버퍼
		ByteBuffer.allocate(1024);
		ByteBuffer.wrap(new byte[1024]);
		
		// 운영 체제 커널에 버퍼 생성 = 다이렉트 버퍼
		ByteBuffer.allocateDirect(1024);
	
		ByteBuffer b = ByteBuffer.allocate(5);
		
		// 버퍼에 데이터를 쓰기 위해 준비
		b.compact();
		
		// 버퍼에 데이터를 입력하고 위치 1씩 증가
		b.put((byte) 11);
		b.put((byte) 12);
		b.put((byte) 13);

		// 버퍼의 데이터를 읽기 위해 준비
		b.flip();
		
		// 현재 위치의 데이터 반환하고 위치 1씩 증가
		b.get();
		
		// 주어진 인덱스에 위치한 데이터 반환하고 해당 인덱스부터 위치 1씩 증가
		b.get(2);
		
		// 버퍼 데이터 출력
		b.array();

		// IntBuffer 객체로 반환
		b.asIntBuffer();
		
	}
	
	@Test @Ignore
	public void fileInputStreamTest() {

		try {
		
			ByteBuffer b = ByteBuffer.allocate(1024);
			FileInputStream fis = new FileInputStream("C:\\Users\\yjj\\temp\\ouput.txt");
			FileChannel fc = fis.getChannel();
			
			int readByte = fc.read(b);
			while(readByte != -1) {	
				b.flip();
				
				// 버퍼에 읽을 데이터가 있는지 확인
				while(b.hasRemaining()) {
					String str = StandardCharsets.UTF_8.decode(b).toString();
					System.out.println(str);
				}
				
				b.clear();
				readByte = fc.read(b);
			}
			
			fc.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void fileOutputStreamTest() {
		
		try {
			
			String str = "버퍼 테스트";
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\yjj\\temp\\ouput.txt");
			FileChannel fc = fos.getChannel();
			ByteBuffer b = ByteBuffer.allocate(1024);
			b.clear();
			b.put(str.getBytes());
			
			b.flip();
			while(b.hasRemaining()) {
				fc.write(b);
			}
			
			fc.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}