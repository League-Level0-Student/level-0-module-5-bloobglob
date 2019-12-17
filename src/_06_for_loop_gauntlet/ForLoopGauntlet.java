package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for(int i = 0; i<101; i++) {
			System.out.println(i);
		}
		System.out.println();
		for(int i = 100; i>-1; i--) {
			System.out.println(i);
		}
		System.out.println();
		for(int i = 2; i<101; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i = 1; i<101; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i = 1; i<501; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is even");
			}else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println();
		for(int i = 1; i<778; i++) {
			if(i%7 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i = 0; i<12; i++) {
			System.out.println("In " + (2008+i) + " I was " + i);
		}
		System.out.println();
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(i +" " + j);
			}
		}
		System.out.println();
		for(int i = 0; i<3; i++) {
			for(int j = 1; j<4; j++) {
				System.out.print((j+(i*3)));
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<10; i++) {
			for(int j = 1; j<11; j++) {
				System.out.print((j+(i*10)));
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i<7; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
