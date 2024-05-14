package io;

public class SerializableTest {

	// Serializable
	// : 직렬화 인터페이스 
	
	// : 메모리에 존재하는 객체를 파일로 저장하거나 네트워크를 통해 전송하기 위해서는
	//   객체를 직렬 형태(스트림)로 변환해 전송 가능한 형태로 만들어야함 
	//   이를 위해 직렬화 인터페이스를 구현
	
	// : 객체는 인스턴스 변수로만 구성되므로 static 변수와 메서드는 직렬화에서 제외됨
	// : transient 키워드 사용하면 직렬화에서 제외되며 기본 값이 전달
	
	
	// 객체 전송 단계
	// 1. 직렬화된 객체를 바이트 단위로 분해 (마샬링, 파싱)
	// 2. 데이터 순서에 따라 전송
	// 3. 전송받은 데이터를 복구(언마샬링)
		
	// 마샬링 적용 가능한 데이터
	// - Serializable 인터페이스 구현 클래스
	// - Externalizable 인터페이스 : 메서드를 통해 데이터 제어 
	
	
	// serialVersionUID
	// : 객체 직렬화에 사용하는 값
	// : 정의하지 않으면 JVM이 해당 클래스의 정보를 이용해 자동 생성
	// : 같은 이름의 클래스라도 UID 값이 다르면 다른 클래스로 인식 
	
	// JVM UID 생성 <= 클래스가 수정되면 UID 값이 변경될 수 있으므로 값을 명시하는 것이 좋음
	// 1. UID 계산에 사용되는 정보 
	// - 클래스명
	// - 클래스 접근 제한자
	// - 멤버 필드의 시그니처 (식별자, 접근 제한자, 타입)
	// - 멤버 메서드의 시그니처 
	// - 생성자의 시그니처 
	// - static initializer block 존재 유무
	// 2. 조합된 정보로 나온 문자열을 SHA 알고리즘 처리

}