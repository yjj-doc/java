package nio.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;

public class FilesTest {

	// Files
	// : 유틸리티 클래스
	// : 디렉토리 또는 파일의 생성, 복사, 이동 등 기능 지원
	
	@Test @Ignore
	public void test() {
	
		try {
			
			Path p = Path.of("C:", "Users", "yjj", "temp");
			
			// 디렉토리인지 여부 반환
			Files.isDirectory(p);
			
			// 디렉토리 또는 파일이 존재하는지 여부 반환
			Files.exists(p);
			Files.exists(p, LinkOption.NOFOLLOW_LINKS);

			// 주어진 디렉토리나 파일을 FileStore 객체로 반환
			Files.getFileStore(p);

			// 주어진 디렉토리나 파일의 소유자를 UserPrincipal 객체로 반환
			Files.getOwner(p);
			
			// 주어진 디렉토리나 파일이 실행 가능한지 여부 반환
			Files.isExecutable(p);
			
			// 주어진 파일의 사이즈를 바이트 단위로 반환
			Files.size(p);
			
			// 주어진 파일들의 사이즈를 비교
			Files.mismatch(Path.of("파일1"), Path.of("파일2"));
			
			// 주어진 파일을 읽어 문자열로 반환
			Files.readString(p, StandardCharsets.UTF_8);

			// 주어진 파일에 주어진 문자열을 추가
			Files.writeString(p, "추가", StandardCharsets.UTF_8);
			
			// 주어진 파일을 OutputStream 객체로 반환
			Files.newOutputStream(p);
			
			// 주어진 파일을 BufferedWriter 객체로 반환
			Files.newBufferedWriter(p);
			
			// 주어진 디렉토리 생성
			Files.createDirectory(p);
			
			// 주어진 디렉토리를 임시 생성
			Files.createTempDirectory("디렉토리");
			
			// 주어진 파일 생성
			Files.createFile(p);
			
			// 주어진 파일을 임시 생성
			Files.createTempFile("파일", "확장자");
			
			// 심볼릭 링크 생성
			Files.createSymbolicLink(Path.of("심볼릭 링크 경로"), Path.of("대상"));
			
			// 주어진 디렉토리나 파일을 지정된 경로로 복사
			Files.copy(p, Path.of("대상"));
			
			// 이미 존재하는 파일을 덮어쓰는 경우
			Files.copy(p, Path.of("대상"), StandardCopyOption.REPLACE_EXISTING);
			
			// 주어진 디렉토리나 파일을 지정된 경로로 이동
			Files.move(p, Path.of("대상"));
			
			// 주어진 디렉토리나 파일을 삭제
			Files.delete(p);

			// 리눅스 경우 주어진 디렉토리나 파일에 대한 권한 반환 
			Files.getPosixFilePermissions(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test @Ignore
	public void newDirectoryStreamTest() {
		
		try {

			// 주어진 디렉토리를 순회해 존재하는 파일의 Path 객체 반환
			DirectoryStream<Path> ds = Files.newDirectoryStream(Path.of("C:", "Users", "yjj", "temp"));
			for(Path p : ds) {
				System.out.println(p.getFileName());
			}
			
			ds.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void walkTest() {
	
		try {
			
			Stream<Path> stream = Files.walk(Path.of("C:", "Users", "yjj", "temp", "test"));
			stream.sorted(Comparator.reverseOrder()).forEach(path -> {
				try {
					Files.delete(path);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			stream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}