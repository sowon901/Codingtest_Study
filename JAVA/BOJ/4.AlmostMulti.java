import java.awt.MenuComponent;
import java.util.*;

public class AlmostMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min= Integer.MAX_VALUE;
		int array[] = new int[5];
		
		for(int i=0; i<5; i++) {
			array[i]= scanner.nextInt(); 
			min = Math.min(array[i], min);
		}
		int s = min;
		
		while(true) {
			int count=0;
			for(int i=0; i<5; i++) {
				if(s%array[i]==0) 
					count++;
				
			}
			if(count>=3)
				break;
			s++;		
		}
		
		System.out.print(s);
		
		scanner.close();
	}
}
