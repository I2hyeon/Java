package day17.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자 기반으로 읽어들이는 클래스 FileReader 클래스 입니다
		 * 2바이트 단위여서 문자 읽기에 적합합니다
		 */
		
		Reader rd = null;
		String path = "C:\\Users\\user\\Desktop\\course\\upload\\hello2.txt";
		
		try {
			rd = new FileReader(path);
			
//			// 한글자씩 읽기
//			while(true) {
//				int word = rd.read();
//				if(word == -1) { // -1이라면 더 이상 읽을 데이터가 없음
//					break;
//				}
//				System.out.print((char)word);
//			}
			
			char[] arr = new char[100];
			int length = rd.read(arr); // 길이 반환
			System.out.println(Arrays.toString(arr));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
