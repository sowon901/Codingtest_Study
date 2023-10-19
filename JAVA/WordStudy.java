import java.util.*;

public class WordStudy {
	
	public char solution(String str) {
		
		char answer = ' ';
		HashMap<Character, Integer> hash= new HashMap<>();
		int max=0;
		int count=0;
		for(char x: str.toCharArray()) {
			if(x>=97)
				hash.put((char)(x-32), hash.getOrDefault((char)(x-32), 0)+1);
			else
				hash.put(x, hash.getOrDefault(x, 0)+1);
		}
		ArrayList<Integer> list = new ArrayList<>(hash.values());
		Collections.sort(list, Collections.reverseOrder());

		max = list.get(0);
		
		char s = ' ';
		
		for(char x: hash.keySet()) {
			if(hash.get(x)==max) {
				count++;
				s = x;
			}
		}
		
		if(count>1) {
			System.out.print("?");
		}
		else
			System.out.print(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		WordStudy t= new WordStudy();
		Scanner scanner = new Scanner(System.in);
		
		String str= scanner.next();
		
		t.solution(str);
		
		scanner.close();
	}
}
