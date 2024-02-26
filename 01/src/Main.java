import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int target;
		int N = sc.nextInt();
		HashMap<Integer, Integer> hmap = new HashMap<>(N);
		
		for(int i =0; i<N; i++) {
			hmap.put(i, sc.nextInt());
		}
		
		int M = sc.nextInt();
		HashMap<Integer, Integer> hhmap = new HashMap<>(M);
		for(int i =0; i<M; i++) {
			hhmap.put(i, sc.nextInt());
		}
		
		int lowIndex = 0;
		int midIndex = 0;
		int highIndex = hmap.size();
		
		for(int i =0; i<hhmap.size(); i++) {
			while(lowIndex<=highIndex) {
				
					target = hhmap.get(i);
					midIndex = (lowIndex + highIndex) /2;
					System.out.println(midIndex);
					if(hmap.get(midIndex) == target) {
						System.out.print(1 + " ");
					}
					else if (hmap.get(midIndex)>target) {
						highIndex = midIndex -1;
					}
					else 
						lowIndex = midIndex+1;

				}
			System.out.println(0);
		}
	
	}
}
