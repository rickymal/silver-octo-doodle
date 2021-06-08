package tests;

public class CountingValleys {
	// https://www.hackerrank.com/challenges/counting-valleys/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	
	public static int countingValleys(int steps, String path) {
		int new_level_position = 0;
		int passed_to_a_valley = 0;
		
		
		for(char c : path.toCharArray())
		{
			if (c == 'U') {
				System.out.println("U");
				new_level_position += 1;
			} else {
				System.out.println("D");
				new_level_position -= 1;
			}
		
			System.out.println("Nivel em relacao a agua: " + new_level_position);
			if (c == 'U' && new_level_position == 0) {
				passed_to_a_valley += 1;
				System.out.println("Incrementando...");
			}
			
	
			
		}
		
		return passed_to_a_valley;
	}
	
	public static void main(String[] args) {
		int steps = 12;
		String path = "DDUUDDUDUUUD";
		
		int n = countingValleys(steps,path);
		
		System.out.println("resultado: " + n);
	}
}
