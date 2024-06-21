package day15.generic.basic;

public class ABC<T> { // 제네릭은 인터페이스, 클래스에 <타입> 문법, <>에 변수, 보통 대문자로 적는다(아직 미정의 타입)

	private T t; // 타입이 미정 상태 (생성할 때 지정)
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}

}
