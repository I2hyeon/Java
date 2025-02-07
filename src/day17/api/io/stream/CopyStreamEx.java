package day17.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * input, outputstream 클래스는 1바이트 기반으로 파일을 읽고 쓰는데 적합합니다
		 */
		
		String inputPath = "C:\\Users\\user\\Desktop\\course\\upload\\quiz.png";
		String outputPath = "C:\\Users\\user\\Desktop\\course\\uploadcopy\\quiz_copy.png";
		
		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000]; // 사진 크기가 44kb, 1000바이트씩 44번
			
			int result;
			while( (result = ios.read(arr)) != -1 ) { // read(바이트)는 읽은 길이를 반환하고 더 이상 읽을 내용이 없다면 -1을 반환
				
				// 파일 output
				fos.write(arr, 0, result); // 배열의 0 ~ 데이터 길이까지 파일을 씀
			}; 
			// 무슨 파일이든 복사 가능
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
				fos.close();
				
			} catch (Exception e2) {
			}
		}
	}

}
