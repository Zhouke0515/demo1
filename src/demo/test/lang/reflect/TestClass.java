package demo.test.lang.reflect;

public class TestClass {

	public String noPara(){
		return "no paras";
	}
	
	public String onePara(int i){
		return "one para";
	}
	
	public String multiParas(int i , int j){
		return "multi paras";
	}
	
	@SuppressWarnings("unused")
	private String privMethod(){
		return "private method";
	}
}
