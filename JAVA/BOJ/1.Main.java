import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		String[] array = new String[count];
		
		for(int i=0; i<count; i++) {
			array[i]= scanner.next(); 
		}
		int length = array[0].length();
		char[] arrayC = new char[length];
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<count; j++) {
				char temp = array[0].charAt(i);
				if(temp==array[j].charAt(i)) {
					if(j==count-1) {
						arrayC[i] = temp;
					}
					else
						continue;
				}
				else {
					arrayC[i]= '?' ;
					break;
				}
			}
		}
		
		for(int i=0; i<length; i++) {
			System.out.print(arrayC[i]);
		}
		
		scanner.close();
	}
	
}
