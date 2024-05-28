package nio.charset;

import java.nio.charset.Charset;

import org.junit.Test;

public class CharsetTest {

	// Charset
	// : 문자 인코딩을 위한 클래스
	
	@Test
	public void test() {
		
		// JVM 기본 인코딩 반환
		Charset.defaultCharset();
		
		// 인코딩 지원 여부 반환
		Charset.isSupported("EUC-KR");

		// JVM이 지원하는 인코딩 목록
		for (Charset charset : Charset.availableCharsets().values()) {
            System.out.println(charset);
        }
		
		Charset c = Charset.forName("US-ASCII");
		
		// 인코딩 지원 여부 반환
		c.canEncode();
		
		System.out.println(c.decode(c.encode("TEST")));
		System.out.println(c.decode(c.encode("테스트")));
		
		// CharsetEncoder 객체 반환
		c.newEncoder();
		
		// CharsetDecoder 객체 반환
		c.newDecoder();

	}
	
}