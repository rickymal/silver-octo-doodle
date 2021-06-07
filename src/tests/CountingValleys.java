package tests;

public class CountingValleys {
	// https://www.hackerrank.com/challenges/counting-valleys/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	
	public static int countingValleys(int steps, String path) {
		int last_level_position = 0;
		int new_level_position = 0;
		int passed_to_a_valley = 0;
		
		
		char[] path_converted = path.toCharArray();
		for(int i = 0; i < steps;i++) {
			if (path_converted[i] == 'U') {
				System.out.println("U");
				new_level_position += 1;
			} else {
				System.out.println("D");
				new_level_position -= 1;
			}
		
			System.out.println("Nível de água: " + new_level_position);
			if (last_level_position == 0 && new_level_position == 1) {
				passed_to_a_valley += 1;
				System.out.println("Incrementando...");
			}
			
			last_level_position = new_level_position;
			
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
