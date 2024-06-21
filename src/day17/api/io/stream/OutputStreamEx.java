package day17.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Output이 붙어 있는 클래스는 1바이트 기반의 출력스트림 클래스입니다
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다
		 * 2. io패키지의 모든 클래스는 throws가 있어서 try~catch블록과 함께 사용합니다
		 */
	
		String path = "C:/Users/user/Desktop/course/upload/hello.txt"; //파일명을 포함한 경로
		
		OutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			
			// 출력할 문자
			String str = "hello world? nice to meet you";
			
			fos.write(str.getBytes() );
			
			// fos.close(); // 스트림 자원해제
					 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				
			}
			
		}
		
		
	}

}
