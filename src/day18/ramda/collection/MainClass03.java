package day18.ramda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {

	public static void main(String[] args) {
		
		/*
		 * 스트림 타입
		 * Stream - 오리지널 스트림
		 * IntStream - 정수 스트림
		 * DoubleStream - 실수 스트림
		 * Long - long타입 스트림
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		
		// 정수형 스트림으로 형변환
		// count : 최종 함수
		long r1 = list.stream().mapToInt( t -> t ).count();
		System.out.println("총 카운트:" + r1);
		int r2 =list.stream().mapToInt(t -> t).sum();
		System.out.println("총합:" + r2);
		double r3 = list.stream().mapToInt(t -> t).average().getAsDouble(); // 더블형 반환
		System.out.println("평균:" + r3);
		int r4 = list.stream().mapToInt(t -> t).max().getAsInt(); //
		System.out.println("가장 큰 값:" + r4);
		
		int[] arr = {1, 40, 50, 23, 43, 70, 99, 94}; // 

		int r5 = Arrays.stream(arr).min().getAsInt();
		System.out.println("최소값:" + r5);
		
		// boxed() -> 원본 스트림으로 형변환
		List<Integer> list2 = IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list2.toString());
		
		// rangeClosed -> 뒤의 숫자 포함 범위
		List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list3);
		
		
		
	}
	
}
