package demo.test.lang.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMehod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		// TODO Auto-generated method stub

		TestClass test = new TestClass();
		
		
		Method method = test.getClass().getMethod("noPara");          //得到类中所有的public属性的方法
		System.out.println(method.invoke(test));
		
		method = test.getClass().getDeclaredMethod("privMethod");   //得到类中所有的方法，包括private,protected,public属性的方法
		method.setAccessible(true);                    //调用private属性的方法，必须设置
		System.out.println(method.invoke(test));
		
		method = TestClass.class.getMethod("onePara", int.class);
		System.out.println(method.invoke(test, 1));
		
		method = TestClass.class.getMethod("multiParas", int.class,int.class);
		System.out.println(method.invoke(test, 1 ,2));
	}

}
