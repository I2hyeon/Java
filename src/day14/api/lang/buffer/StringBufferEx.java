package day14.api.lang.buffer;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		// 빠른 문자열
		// StringBuffer, StringBuilder (빌더가 더 빠름)
		
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		
		System.out.println(str);
		System.out.println(sb);
		
		// 차이점 - 문자열을 더할 때
		str = str + "bye~"; // 새로운 문자열로 저장

		sb.append("bye~"); // 마지막에 추가 - 원본 문자가 바뀜(재활용)
		
		System.out.println(str);
		System.out.println(sb);
		
		// 중간에 추가
		sb.insert(5, "hello ");
		System.out.println(sb);
		
		// 문자열 변경
		sb.replace(5, 10, "good"); // 5 ~ 10 미만의 문자열을 변경
		System.out.println(sb);
		
		// 문자열 삭제
		sb.delete(5, 10); // 5 ~ 10 미만의 문자열을 삭제
		System.out.println(sb);
		
		// 문자열 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		// 빠른 문자열을 문자열로 형변환
		sb.reverse();
		System.out.println(sb);
		
		String s = sb.toString();
		if(s.equals("Java bye~")) { // 타입이 다름
			System.out.println("아니");
		}
	}

}
