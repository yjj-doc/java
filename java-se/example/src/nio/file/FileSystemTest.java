package nio.file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

import org.junit.Test;

public class FileSystemTest {

	// FileSystem
	// : 운영 체제의 파일 시스템에 접근하기 위한 인터페이스
	
	@Test
	public void test() {
		
		FileSystem fs = FileSystems.getDefault();
	
		// 디렉토리 구분자 반환
		fs.getSeparator();
		
		// 파일 시스템의 FileStore 객체 반복자 반환
		fs.getFileStores();
		
		for(FileStore store : fs.getFileStores()) {
			try {
				System.out.println(store.getTotalSpace());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 루트 디렉토리들을 Path 객체로 변환하고 반복자 반환
		fs.getRootDirectories(); 

	}
	
}