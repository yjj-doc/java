package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class UnnamedPackageTest {

	@Test
	public void unnamedPackageTest() throws IllegalAccessException, IllegalArgumentException, 
		InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, 
		InstantiationException {
			
		Class<?> c = Class.forName("UnnamedPackage");
		Method m = c.getMethod("unnamedPackageMethod", String.class);	
		Object o = m.invoke(c.getDeclaredConstructor().newInstance(), "호출");
		
		System.out.println(o);

	}
	
}