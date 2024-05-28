package nio.charset;

import java.nio.charset.StandardCharsets;

import org.junit.Ignore;
import org.junit.Test;

public class StandardCharsetsTest {

	// StandardCharsets
	// : 표준 문자 인코딩에 대한 상수 클래스
	
	@Test @Ignore
	public void test() {
		
		StandardCharsets.UTF_8.aliases();

		StandardCharsets.UTF_8.displayName();
		StandardCharsets.UTF_8.name();
		StandardCharsets.UTF_8.toString();
		
		// 인코딩 지원 여부 반환
		StandardCharsets.UTF_8.canEncode();
		
		// 인코딩이 IANA에 등록되었는지 여부 반환
		// IANA : 문자 인코딩 표준화 기구
		StandardCharsets.UTF_8.isRegistered();

	}
	
	@Test
	public void example() {
		
		// JVM 기본 인코딩 정보 반환
		System.getProperty("file.encoding");

		String str = "테스트";
		String newStr = new String(str.getBytes(), StandardCharsets.UTF_16);
		System.out.println(newStr);
		
	}
	
}