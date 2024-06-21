package day14.api.lang.object;

public class Person implements Cloneable { // 복제가 가능하게 됨
	
	private String name;

	public Person(String name) {
		this.name = name;
	}

	// alt + shift + s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		// obj가 가지고 있는 이름이 같으면 true 반환
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			String s = p.getName();
					
			if(s.equals(this.name)) {
				return true;
			}
		}
		
		return false;
		
	}

	// 멤버변수의 값을 한 눈에 확인할 수 있도록 overriding
	// generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	// clone 메서드 오버라이딩해서 사용해라~
	// ctrl + enter
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("객체 소멸됨!");
	}
	
	
	
	
	
	
	
}
