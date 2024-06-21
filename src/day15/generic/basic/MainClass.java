package day15.generic.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
//		ABC abc = new ABC(); // 무엇이든 저장 가능한 상자
		
		// 문자열을 저장하는 상자
		ABC<String> abc = new ABC<String>();

		abc.setT("홍길동"); 
		String name = abc.getT(); 
		
		// Person 저장하는 상자
		ABC<Person> abc2 = new ABC<>(); // 뒤 <> 타입 생략 가능
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		// <>는 객체타입만 사용가능
		ABC<Integer> abc3 = new ABC<>(); // wrapper 타입으로 입력해야 함
		
		// 멀티제네릭 생성
		
		DEF<Integer, String> def = new DEF<>();
		
		def.put(1, "홍길동"); // 1번 홍길동
		def.get(1); // 1번 받고 홍길동 반환
		
	}

}
