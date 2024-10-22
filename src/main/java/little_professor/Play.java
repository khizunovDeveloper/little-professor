package little_professor;

import java.util.Random;
import java.util.Scanner;

public class Play {
	public static Scanner input = new Scanner(System.in);

	public static int getNum(int k) {
		Random Random = new Random();
		switch (k) {
		  case 0:
			k = Random.nextInt(10);
			break;
		  case 1:
			k = 10 + Random.nextInt(41);
			break;
		  default:
			k = Random.nextInt(101);	
		}
		return k;		
	}

	public static int getLevel() {
		System.out.println("enter dif level (0-2) to stop enter 99");
		return input.nextInt();
	}

	public static void showMessage(int N) {
		switch (N) {
		case 1:
			System.out.println("good");
			break;
		case 2:
			System.out.println("wrong");
			break;
		}
	}

	public static void showGrade(int G) {
		switch (G) {
		case 10:
		    System.out.println("perfect");
		    break;
		case 9:    
		    System.out.println("very good");
            break;
		case 8:    
		    System.out.println("good");
            break;
		case 7:    
		    System.out.println("almost good");
	        break;
		case 6:    
		    System.out.println("okay");
		    break;
		default:    
	        System.out.println("bad");
		}
	}

}
