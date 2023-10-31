import java.util.*;


public class SWEA_1206 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int test_case=1; test_case<=10; test_case++) {
			int num = scanner.nextInt();
			int count = 0;
			int[] array = new int[num];
			
			for(int i=0; i<num; i++) {
				array[i] = scanner.nextInt();
			}
			
			for(int i=2; i<num-2; i++) {
				int a = array[i-2];
				int b = array[i-1];
				int c = array[i];
				int d = array[i+1];
				int e = array[i+2];
				int max1 = Math.max(a, b);
				int max2 = Math.max(d, e);
				int max = Math.max(max1, max2);
				
				if(max<c) {
					count += c-max;
				}
			}
			System.out.println("#" + test_case + " "  + count);
		}
		scanner.close();
	}
}
