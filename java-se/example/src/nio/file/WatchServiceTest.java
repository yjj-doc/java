package nio.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import org.junit.Ignore;
import org.junit.Test;

public class WatchServiceTest {

	// WatchService
	// : 디렉토리를 모니터링하는 인터페이스
	// : 디렉토리를 감시하고 변경이 감지되면 지정한 액션 수행
	// : 감시 대상이 될 객체는 Watchable 인터페이스를 구현해야함

	@Test @Ignore
	public void test() {
		
		try {
			
			WatchService ws = FileSystems.getDefault().newWatchService();
			
			Path p = Path.of("C:", "Users", "yjj", "temp");
			p.register(ws, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			
			// 변경이 감지되면 WatchKey 객체 반환
			ws.take();
			
			// 변경이 감지되면 WatchKey 객체를 반환하고 변경이 없으면 null 반환
			ws.poll();
			
			// 자원 반환
			ws.close();
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void example() {
		
		try {
			
			WatchService ws = FileSystems.getDefault().newWatchService();
			
			Path p = Path.of("C:", "Users", "yjj", "temp");
			p.register(ws, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			
			WatchKey key;
			while(true) {
				if((key = ws.take()) == null) break;
				
				for(WatchEvent<?> event : key.pollEvents()) {

					Kind<?> kind = event.kind();
					if(kind.equals(StandardWatchEventKinds.ENTRY_CREATE)) {
						System.out.println("파일 생성 : " + event.context());
						
					} else if(kind.equals(StandardWatchEventKinds.ENTRY_MODIFY)) {
						System.out.println("파일 수정 : " + event.context());
						
					} else if(kind.equals(StandardWatchEventKinds.ENTRY_DELETE)) {
						System.out.println("파일 삭제 : " + event.context());
					}
					
				}
				
				if(!key.reset()) break;
			}

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}