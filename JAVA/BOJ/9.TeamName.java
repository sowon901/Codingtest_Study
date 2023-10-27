import java.security.GeneralSecurityException;
import java.util.*;


public class TeamName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String yn = scanner.next();
		int l=0,o=0,v=0,e=0;
		int t = scanner.nextInt();
		String[] tn = new String[t];
		String winner = "";
		int percentage = Integer.MIN_VALUE;
		int[] res= new int[t];
		
		for(int i=0; i<t; i++) {
			tn[i]= scanner.next();
		}
		
		for(char x: yn.toCharArray()) {
			switch(x) {
				case 'L' :  {
					l++;
					break;
				}
				case 'O' : {
					o++;
					break;
				}
				case 'V' : {
					v++;
					break;
				}
				case 'E' : {
					e++;
					break;
				}	
			}
		}
		
		for(int i=0; i<t; i++) {
			int rl=l, ro=o, rv=v, re=e;
			
			for(char s: tn[i].toCharArray()) {
				if(s=='L') {
					rl++;
				} else if(s=='O') {
					ro++;
				} else if(s=='V') {
					rv++;
				} else if(s=='E') {
					re++;
				}
			}
			res[i] = ((rl+ro)*(rl+rv)*(rl+re)*(ro+rv)*(ro+re)*(rv+re))%100;

			if(res[i]>percentage) {
				percentage = res[i];
				winner = tn[i];
			}
			else if(res[i]==percentage) {
				
				if(winner.compareTo(tn[i])>0)
					winner = tn[i];
			}
		}
		System.out.print(winner);
		
		scanner.close();
	}
}
