package day17.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BfReaderEx {
	
	public static void main(String[] args) {
		
		// 빠른 입력
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			System.out.println("입력해봐 > ");
//			String str = br.readLine();// 한 줄 받기
//	        System.out.println(str);  
			
		String path = "C:\\Users\\user\\Desktop\\course\\upload\\hello4.txt";
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
			String str;
			while( (str = br.readLine() ) != null) {
				System.out.println(str);
			}
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // 읽을게 없으면 null
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

}
