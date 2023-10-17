import java.util.*;

public class AddCircle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int on = scanner.nextInt();
		int cn = on;
		int count = 0;
		
		while(true) {
			
			if((cn<10&&cn>=0)) {
				cn = cn*10+cn;
				count++;
			} else {
				cn = cn%10*10 +  (cn/10+cn%10)%10;
				count++;
			}
			
			if(on==cn)
				break;
		}
			
		System.out.print(count);
		
		scanner.close();
	}
}
