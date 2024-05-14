package nio.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PathTest {

	// Path
	// : 경로 조작을 위한 인터페이스  

	@Test
	public void test() {
		
		try {
			
			Path p = Paths.get("C:", "Users", "yjj", "temp");
			
			// 절대 경로인지 여부 반환
			p.isAbsolute();
			
			// 경로에서 주어진 인덱스만큼 경로 추출
			p.subpath(0, 1);
			
			// 상대 경로를 절대 경로로 변환
			p.toAbsolutePath();
			
			// 실제 경로를 Path 객체로 반환
			p.toRealPath();
			
			// 경로 추가
			p.resolve("path");
		
			// 두 경로를 비교해 같으면 0 반환
			// 상위 경로면 음수, 하위 경로면 양수 반환 
			p.compareTo(Paths.get("C:", "Users"));
		
			// 경로에 존재하는 요소 개수 반환
			p.getNameCount();
			
			// 디렉토리나 파일 이름을 Path 객체로 반환
			p.getFileName();
			
			// 부모 디렉토리를 Path 객체로 반환 
			p.getParent();
			
			// 루트 디렉토리를 Path 객체로 반환 
			p.getRoot();
			
			// 객체를 File 객체로 변환해 반환
			p.toFile();
			
			// 객체를 URI 객체로 변환해 반환
			p.toUri();
			
			// 경로에 존재하는 요소들을 Path 객체로 변환하고 반복자 반환 
			p.iterator();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}