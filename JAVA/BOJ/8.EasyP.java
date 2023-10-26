import java.util.*;

public class EasyP {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int count = 0;
		int sum=0;
			
		for(int i=1; i<=1000; i++) {
			for(int j=1; j<=i; j++) {
				count++;
				if(count>=start&& count<=end) {
					sum+=i;
				}
			}
		}
		
		System.out.print(sum);
		
		scanner.close();
	}
}
