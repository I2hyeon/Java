package day17.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BfWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedWriter클래스는 문자열 2Byte 기반의 성능 향상 보조 스트림
		 * 빠른 출력에 사용됨
		 */
		
		// 출력을 빠르게
		
		String path = "C:\\Users\\user\\Desktop\\course\\upload\\hello4.txt";
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			bw.write("안녕하세요?\n모두\n잠에서\n일어나");
			bw.flush();  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		try {
//			
//			Writer w = new OutputStreamWriter(System.out); // 1Byte 기반의 데이터를 writer 타입으로 중간에서 바꿔주는 매개체
//			BufferedWriter bw = new BufferedWriter(w);
//			bw.write("안녕하세요?");
//			bw.flush();
//			
//		} catch (Exception e) {
//			
//		}
	}

}
