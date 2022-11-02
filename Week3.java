package week3;

public class Week3 {

	public static void main(String[] args) {
	
// QUESTION 1

	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	int difference = (ages[ages.length-1] - ages[0]);
		System.out.println(difference);
		
	System.out.println(difference);

	double sum = 0;
		for (int age : ages) {
			sum += age;
			}
	double average = sum / ages.length;
		System.out.println(average);
		
		
				
//	QUESTION 2

	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	double numberOfLetters = 0;
	for (String name : names) {
		numberOfLetters += name.length();
		}
	double averageletterlength = numberOfLetters / names.length;
		System.out.println(averageletterlength);
				
		for (int i = 0; i < names.length; i++) {
		System.out.print(names[i] + " ");    
		}

		
//	QUESTION 3 - Written
//  QUESTION 4 - Written
		
		
		
//	QUESTION 5
				
	//String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
	int[] nameLengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		}
				
	for (int x : nameLengths) {
		System.out.println(x);
		} 
				
					
//	QUESTION 6
			
	for (int nameLength : nameLengths) {
		}
		System.out.println(sum);
					
					
//	QUESTION 7 

	
		System.out.println("Is this going to work?");				
		System.out.println(repeaterMethod("WowIFinallyDidIt!", 5));
	
	
//  QUESTION 8
						
	String firstName = "Mary";
	String lastName = "HadaLittleLamb";
	String fullName = connectStrings(firstName, lastName);
		System.out.println(fullName);
		


//	QUESTION 9
					
		int[] array = {24, 9, 42, 12, 7, 15, 23};		
			System.out.println(sumGreaterThanHundred(array));
	
					
//	Question 10

	double[] numberset1 = {5.4, 2.7, 11.9, 8.3};
	double[] numberset2 = {7.6, 15.3, 8.9, 7.4};
	
	System.out.println(findAverage(numberset1));
	System.out.println(findAverage(numberset2));
	
	
			
// Question 11
	
	System.out.println(firstAverageisHigher(numberset1, numberset2));
	
	
	
//	QUESTION 12
			
	boolean isHotOutside = true;
	double moneyInPocket = 12;

	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	
	
	
	
//	QUESTION 13

	int ecSurpriseBox = 40;
	int beginningAccountBalance = 200;
	int totalBills = 80;
	
	canIBuyIt(ecSurpriseBox, beginningAccountBalance, totalBills);
	}

	
//	question 7
	
	public static String repeaterMethod(String word, int n)  {
		String result = "";
		for (int i =1; i<= n; i++) {
			result += word;
		}
		return result;
		}
	
//	question 8
	
	public static String connectStrings(String x, String y) {
		return x + " " + y;
	}	
//	question 9
		
		public static boolean sumGreaterThanHundred(int[] array) { 
			int sum = 0;
			for (int number : array)
				sum += number;
			return sum > 100;
			}			
		
//	question 10
		
		public static double findAverage(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum / array.length;
		}
		
// 	question 11
		
			public static boolean firstAverageisHigher(double[] average1, double[] average2) {
				return	findAverage(average1) > findAverage(average2);
			}	
		
//  question 12
		
			public static boolean willBuyDrink(boolean hot, double money) {
				return ((hot == true) && (money > 10.5));
				}

			
//	question 13
			public static void canIBuyIt(int beginningAccountBalance, int ecSupriseBox, int totalBills) {
				
			if ((beginningAccountBalance - totalBills) >= ecSupriseBox)  {
				System.out.println("Yes, I have enough money to place my order!");
				}	else	{
				System.out.println("I really hope I can get a great paying developer job!");
				}
			}
}
