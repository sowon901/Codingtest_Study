import java.util.*;

public class Protect6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		String str = "";
		char arr[][] = new char[rows][cols];
		int rowc = 0;
		int colc= 0;
		int maxcount=0;
		
		for(int i=0; i<rows; i++) {
			str = scanner.next();
			for(int j=0; j<str.length(); j++) {
				arr[i][j]= str.charAt(j);
			}
		}
		
		for(int i=0; i<rows; i++) {
			int count=0;
			for(int j=0; j<cols; j++) {
				if(arr[i][j]=='.') 
					count++;
			}
			if(count==cols)
				rowc++;
		}

		for(int i=0; i<cols; i++) {
			int count=0;
			for(int j=0; j<rows; j++) {
				if(arr[j][i]=='.') 
					count++;
			}
			if(count==rows)
				colc++;
		}
		
		maxcount = Math.max(rowc, colc);
		
		System.out.print(maxcount);
		
		scanner.close();
	}
}
