package day15.generic.basic;

public class DEF<T, C> { // 멀티제네릭
	
	// t = 키, C = 값
	
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key = key;
		this.value = value;
	}
	
	public C get(T key) { // T를 받으면 C를 반환
		return value;
	}

}
