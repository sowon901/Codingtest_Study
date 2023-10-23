import java.util.*;

class StringString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int strc = scanner.nextInt();
			String str = scanner.next();
			String answer = "";
			
			if(strc%2==0) {
				for(int j=0; j<strc/2; j++) {
					if(str.charAt(j)==str.charAt(j+strc/2)) {	
						if(j==strc/2-1) {
							answer = "Yes";
							break;
						}
						else	
							continue;
					}
					else {
						answer = "No";
						break;
					}	
				}
			} else {
				answer = "No";
			}
		
			System.out.println("#" + test_case + " " + answer);
		}
		
		scanner.close();
	}
}
