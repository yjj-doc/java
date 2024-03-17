package basic;

import org.junit.Test;

public class Variable {

	final static String CONSTANT = "상수";
	static String staticVariable = "정적 변수";
	final String finalVariable = "최종 변수";
	String variable = "인스턴스 변수";
	
	

	public Variable() {
		staticVariable = "정적 변수 수정";
		variable = "인스턴스 변수 수정";
		
		System.out.println(Variable.CONSTANT);
		System.out.println(Variable.staticVariable);
		System.out.println(finalVariable);
		System.out.println(variable);
	}
	
	public void localVariable() {
		String localVariable = "지역 변수";
		System.out.println(localVariable);
		
		// 선언만 할 경우 오류가 나지 않으나 
		@SuppressWarnings("unused")
		String str;
		
		// 초기화하지 않은 변수는 참조할 수 없음
		//System.out.println(str);
	}
	
	@Test
	public void localVariableTest() {
		localVariable();
	}
	
}