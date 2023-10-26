import java.util.*;

import javax.security.auth.kerberos.KerberosKey;

public class Banjang {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int stu = scanner.nextInt();
		int[][] array = new int[stu+1][6];
		int max = Integer.MIN_VALUE;
		int answer=0;
		
		for(int i=1; i<=stu; i++) {
			for(int j=1; j<=5; j++) {
				array[i][j]= scanner.nextInt(); 
			}
		}
		
		for(int i=1; i<=stu; i++) {
			int cnt = 0;
			for(int j=1; j<=stu; j++) {
				for(int k=1; k<=5; k++) {
					if(array[i][k]==array[j][k]) {
						cnt++;
						break;
					}	//i번 학생의 1~5학년과 j번 학생의 1~5학년 비교		
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		System.out.print(answer);
		scanner.close();	
	}
}
