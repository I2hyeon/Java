package day15.generic.bad;

public class ABC {
	
	// 무엇이든 저장 가능한 마법의 상자
	private Object obj; 
	
	public void setobj(Object obj) {
		this.obj = obj; // 저장
	}
	
	public Object getobj() {
		return obj; // 반환
	}

}
