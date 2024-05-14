package nio.file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

import org.junit.Test;

public class FileStoreTest {

	// FileStore
	// : 드라이버 (파티션, 볼륨) 접근을 위한 클래스

	@Test
	public void test() {
		
		FileSystem fs = FileSystems.getDefault();
	
		for(FileStore store : fs.getFileStores()) {
			try {
				
				// 드라이브 이름 반환
				System.out.println(store.name());
				
				// 파일 시스템 반환
				System.out.println(store.type());
				
				// 전체 공간 반환
				System.out.println(store.getTotalSpace());
				
				// 사용 가능한 공간 반환 
				System.out.println(store.getUnallocatedSpace());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}