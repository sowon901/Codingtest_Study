import java.util.*;

public class MultiWalk {
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		int test_case = scanner.nextInt();
		
		for(int i=1; i<=test_case; i++) {
			
			long multi= scanner.nextLong();
			long res = 0;
			long min = Long.MAX_VALUE;
			
			for(int j=1; j<=Math.sqrt(multi); j++) {
				if(multi%j==0) {
					res = j+ (multi/j) - 2;
					min = Math.min(min, res);
				}
			}
			
			System.out.println("#" + i + " " + min);
			
		}
		
		scanner.close();
	}
}
