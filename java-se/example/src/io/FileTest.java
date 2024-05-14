package io;

import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class FileTest {

	// File
	// : 파일이나 디렉토리의 정보를 제공해 생성, 변경, 제거 
	// : 운영 체제의 파일 시스템에 의존 (파일 권한, 파일 위치 표기법 등 주의)
	
	@Test @Ignore
	public void test() {
		
		try {
			
			File f = new File("file.txt");
			
			// 주어진 경로나 파일이 존재하는지 여부 반환 
			f.exists();
			
			// 주어진 경로가 존재하는지 여부 반환
			f.isDirectory();
			
			// 절대 경로 반환
			f.getAbsolutePath();
			
			// 정규 경로 반환 
			f.getCanonicalPath();
	
			// 부모 경로 반환
			f.getParent();
			
			// 부모 파일 반환  
			f.getParentFile();
			
			// 경로가 존재한다면 크기 반환
			f.getTotalSpace();
			f.getFreeSpace();
			f.getUsableSpace();
	
			// 주어진 경로 내에 존재하는 파일을 문자열 배열로 반환
			f.list();
			
			// 주어진 경로 내에 존재하는 파일을 파일 배열로 반환
			f.listFiles();
	
			// 파일 존재 여부 반환
			f.isFile();
	
			// 경로를 포함한 파일명 반환
			f.getPath();
			f.getAbsolutePath();
			
			// 숨은 파일인지 여부 반환
			f.isHidden();
			
			// 확장자를 포함한 파일명 반환
			f.getName();
			
			// 파일명 수정 
			f.renameTo(new File("path", "renameFile.txt"));
			
			// 파일이 마지막으로 수정된 시간 반환 
			f.lastModified();
			
			// 파일이 마지막으로 수정된 시간 변경
			f.setLastModified(0);
			
			// 주어진 경로가 없다면 생성
			f.mkdir();
			f.mkdirs();
			
			// 주어진 파일이 없다면 생성하고 참 반환
			f.createNewFile();
			
			// 주어진 경로나 파일 삭제
			f.delete();
			
			// jvm 종료시 해당 경로나 파일 삭제 
			// 임시 파일을 사용한 경우 이를 제거하기 위해 사용 
			f.deleteOnExit();
		
			// 파일 시스템에 존재하는 루트 디렉토리를 파일 배열로 반환
			File.listRoots();
			
			// 임시 파일 생성 
			File.createTempFile("", "");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test @Ignore
	public void filePermissionTest() {
		
		File f = new File("path", "file");
		
		// 해당 파일을 읽을 수 있는지 여부 반환
		f.canRead();
		
		// 해당 파일을 변경할 수 있는지 여부 반환
		f.canWrite();
		
		// 해당 파일을 실행할 수 있는지 여부 반환
		f.canExecute();
		
		// 해당 파일의 읽기 권한 설정
		f.setReadable(true);
		
		// 해당 파일의 쓰기 권한 설정
		f.setWritable(true);
		
		// 해당 파일의 실행 권한 설정
		f.setExecutable(true);
		
	}
	
}