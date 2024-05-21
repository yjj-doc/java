package nio.file;

import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class StandardOpenOptionTest {

	// StandardOpenOption
	// : 파일 열기 옵션 이넘 클래스
	
	@Test
	public void test() {
	
		// 파일 읽기 전용
		StandardOpenOption.READ.toString();
		
		// 파일 쓰기 전용
		StandardOpenOption.WRITE.toString();
		
		// 파일이 없으면 생성
		StandardOpenOption.CREATE.toString();
		
		// 파일이 없으면 생성하고 존재하면 예외 발생
		StandardOpenOption.CREATE_NEW.toString();
		
		// 파일 끝부터 데이터 기록
		StandardOpenOption.APPEND.toString();
		
		// 파일 시작부터 데이터 기록 (파일 덮어쓰기)
		StandardOpenOption.TRUNCATE_EXISTING.toString();
		
		// 동기화된 파일 내용과 메타데이터 보존
		StandardOpenOption.SYNC.toString();

		// 동기화된 파일 내용 보존
		StandardOpenOption.DSYNC.toString();
		
		// 채널을 닫으면 파일 삭제
		StandardOpenOption.DELETE_ON_CLOSE.toString();
		
	}
	
}