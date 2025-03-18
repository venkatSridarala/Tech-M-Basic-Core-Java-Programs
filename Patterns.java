package com.app.movie.MovieApp;
import java.util.*;
public class Patterns {
	public void pattern1(){
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
		}
		System.out.println();
		}
	}
//  output
//	*****
//	****
//	***
//	**
//	*
	public void pattern2(){
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
		System.out.println();
		}
	}
//	Output
//	*
//	**
//	***
//	****
//	*****
	public void pattern3(){
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(i);
		}
		System.out.println();
		}
	}
//	Output
//	11111
//	2222
//	333
//	44
//	5
	public void pattern4(){
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
		}
		System.out.println();
		}
	}
//	Output
//	1
//	12
//	123
//	1234
//	12345
	public void pattern5(){
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
		}
		System.out.println();
		}
	}
//	Output
//	1
//	23
//	456
//	78910
//	1112131415
	public void pattern6(){
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
		}
		System.out.println();
		}
	}
//	Output
//	A
//	BC
//	DEF
//	GHIJ
//	KLMNO
	public void pattern7(){
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
		}
		System.out.println();
		}
	}
//	Output
//	A
//	AB
//	ABC
//	ABCD
//	ABCDE
	public void pattern8(){
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
		}
		System.out.println();
		}
	}
//	Output
//	1
//	22
//	333
//	4444
//	55555
	public void fibonacci() {
		int n1=0;
		int	n2=1;
		int n3;
		System.out.println("Fibonacci Series Are:");
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=10;i++) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
	System.out.println();
	}
//	Output
//	Fibonacci Series Are:
//	0 1 1 2 3 5 8 13 21 34 55 89 
	public void pattern9(){
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='Z';
			for(int j=5;j>=i;j--) {
				System.out.print(ch);
				ch--;
		}
		System.out.println();
		}
	}
//	OUtput
//	ZYXWV
//	ZYXW
//	ZYX
//	ZY
//	Z
	public void pattern10(){
		int n=5;
		char ch='Z';
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(ch);
				ch--;
		}
		System.out.println();
		}
	}
//	OUtput
//	ZYXWV
//	UTSR
//	QPO
//	NM
//	L
	public void factorial() {
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial Is:"+fact);
	}
//	Output
//	The factorial Is:120
	public void primenum() {
		int x=20;
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				count++;	
		}
		if(count==2) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println(x+" It is not a prime number");
		}
	}
//	Output
//	20 It is not a prime number
	public void Nprimenums() {
		int x=20;
		int i,j;
		System.out.println("The Prime Numbers Are:");
		for(i=1;i<=x;i++) {
			int count=0;
			for(j=1;j<=i;j++) {
			if(i%j==0)
				count++;
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}	
		System.out.println();
	}
//	Output
//	The Prime Numbers Are:
//	2 3 5 7 11 13 17 19 
	
	public void palindrome() {
		int n=121;
		int temp=n;
		int rev=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp) {
		System.out.println("This is a Palindrome Number:"+rev);
		}
		else {
			System.out.println("This is not a Palindrome Number:"+rev);
		}
	System.out.println();
	}
//	Output
//	This is not a Palindrome Number:653
	
	public void strpalindrome() {
		String s="mam";
		String st=s;
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(st)) {
			System.out.println("It is a string palindrome "+rev);
		}
		else {
			System.out.println("It is not a string palindrome "+rev);
		}		
	}
//	Output
//	mam
//	It is a string palindrome mam
	
	public void Armstrong() {
		int num=153;
		int temp=num;
		int r;
		double sum=0;
		int digits = String.valueOf(num).length();
		System.out.println(digits);
		while(num !=0) {
			r=num%10;
			sum=sum+Math.pow(r,digits);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("It is a armstrong number "+temp);
		}
		else {
			System.out.println("It is not a armstrong number "+temp);
		}
		System.out.println();
	}
//	Output
//	It is not a armstrong number 1535
	
	public void NumOfArmstrong() {
		System.out.println("The Armstrong Numbers Between 1 to given number are.");
		for(int i=1;i<=10000;i++) {
			int temp=i;
			double sum=0;
			int length=0;
			
			while(temp!=0) {
				temp=temp/10;
				length++;
			}
			temp=i;
			while(temp!=0) {
				int rem=temp%10;
				sum=sum+Math.pow(rem, length);
				temp=temp/10;
			}
			if(sum==i) {
				System.out.print(i+" ");
			} 
		}
		System.out.println();
	}
//	Output
//	The Armstrong Numbers Between 1 to given number are.
//	1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474 
	
	public void TriStarpattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
//	Output:
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
	public void Triabcpattern() {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
//	Output:
//		    A 
//		   B C 
//		  D E F 
//		 G H I J 
//		K L M N O 
	public void Triaaapattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
//	Output:
//		    A 
//		   A B 
//		  A B C 
//		 A B C D 
//		A B C D E
	    /*public void calculator() {
		Scanner sc = new Scanner(System.in);
		char d='y';
		do {
		System.out.println("Enter First Number:");
		int a =sc.nextInt();
		System.out.println("Enter Second Number:");
		int b =sc.nextInt();
		System.out.println("Enter Your Choice:");
		char ch =sc.next().charAt(0);
		switch(ch) {
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		}
		System.out.println("press y to continue and n to terminate:");
		d=sc.next().charAt(0);
		
		}while(d=='y'); {
			
		}
	}*/
//	Output:
//		Enter First Number:
//			67
//			Enter Second Number:
//			75
//			Enter Your Choice:
//			+
//			142
//			press y to continue and n to terminate:
	public void pap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter option to check:");
		System.out.println("1-Prime:");
		System.out.println("2-Palindrome:");
		System.out.println("3-ArmStrong");
		System.out.println("4-Factorial");
		int st=sc.nextInt();
		switch(st) {
		case 1:
		int i,j;
		System.out.println("The Prime Numbers Are:");
		for(i=1;i<=n;i++) {
			int count=0;
			for(j=1;j<=i;j++) {
			if(i%j==0)
				count++;
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}	
		System.out.println();
		break;
		case 2:
		int temp=n;
		int rev=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp) {
		System.out.println("This is a Palindrome Number:"+rev);
		}
		else {
			System.out.println("This is not a Palindrome Number:"+rev);
		}
	   System.out.println();
	   break;
		case 3:
			int tem=n;
			int r;
			int sum=0;
			int digits = String.valueOf(n).length();
			while(n !=0) {
				r=n%10;
				sum+=Math.pow(r,digits);
				n=n/10;
			}
			if(sum==tem) {
				System.out.println("It is a armstrong number "+tem);
			}
			else {
				System.out.println("It is not a armstrong number "+tem);
			}
			System.out.println();
			break;
		case 4:
			int fact=1;
			for(int k=1;k<=n;k++) {
				fact=fact*k;
			}
			System.out.println("The factorial Is:"+fact);
			break;
		}
	}
	public static void main(String[] args) {
		Patterns sc = new Patterns();
		sc.pattern1();
		sc.pattern2();
		sc.pattern3();
		sc.pattern4();
		sc.pattern5();
		sc.pattern6();
		sc.pattern7();
		sc.pattern8();
		sc.pattern9();
		sc.pattern10();
		sc.fibonacci();
		sc.factorial();
		sc.primenum();
		sc.Nprimenums();
		sc.palindrome();
		sc.strpalindrome();
		sc.Armstrong();
		sc.NumOfArmstrong();
		sc.TriStarpattern();
		sc.Triabcpattern();
		sc.Triaaapattern();
		//sc.calculator();
		sc.pap();
	}
}
