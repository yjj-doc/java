package nio.file;

import java.nio.file.StandardCopyOption;

import org.junit.Test;

public class StandardCopyOptionTest {

	// StandardCopyOption
	// : 파일 복사 옵션 이넘 클래스
	
	@Test
	public void test() {
		
		// 파일이 이미 존재하면 파일 내용을 복사해서 덮어씀
		StandardCopyOption.REPLACE_EXISTING.toString();
		
		// 파일 속성 복사
		StandardCopyOption.COPY_ATTRIBUTES.toString();
	
		// 파일 이동을 원자적으로 처리
		// 이동 작업 중간에 실패없이 완전하게 실행됨을 보장
		StandardCopyOption.ATOMIC_MOVE.toString();
	
	}

}