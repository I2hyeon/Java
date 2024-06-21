package day15.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 저장을 문자열
		ABC abc = new ABC();
		abc.setobj("홍길동");
		
		String str = (String)abc.getobj(); // 문자열로 저장했지만 반환이 문자열로 되지 않음 형변환 해야함
		
		// 저장을 Person 
		abc.setobj( new Person() );
		Person p = (Person)abc.getobj();
		
		/*
		 * Object형은 무엇이든 저장할 수 있는데, 값을 사용할 때 
		 * 올바른 타입으로 형변환을 진행해야 하는 단점이 있음 
		 */
		
		
		
	}

}
