//import java.util.Scanner;
//
//// Swapping of number without 3rd variable
//public class B {
//	public static void main(String[] args) {
//		int a=10; int b=20;
//		a=a+b;//10+20=30
//		b=a-b;//30-20=10
//		a=a-b;//30-
//		System.out.println("after swapping a is " + a+ " is and b is " +b);
//	}
//}
//
//// Factorial of a number
//public class B{
//public static void main(String[] args) {
//	int factorial=1;
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter the number");
//	 int num = scan.nextInt();
//	 for(int i=1;i<=num;i++) {
//		 factorial *= i;
//		
//	 }System.out.println(+factorial);
//}
//	
//}
//
//// Reverse a given string
////public class B{
////	public static void main(String[] args) {
////		Scanner scan=new Scanner(System.in);
////		System.out.println("Enter the word to reverse : ");
////		String s = scan.nextLine();
////		for(int i=s.length()-1;i>=0;i--) {
////			System.out.print(s.charAt(i));
////		} 
////	}
////}
// 
//public class B{
//public static void main(String[] args) {
//	int arr[]= {1,2,3,5,54,8,1,5,8,9};
//	
//	boolean flag=false;
//	
//	
//	for(int i=0;i<arr.length;i++) {
//	for(int j=i+1;j<arr.length;j++) {
//		if(arr[i]==arr[j]) {
//			System.out.println("Duplicate element element found:" +arr[i]);
//			flag= true;
//		}
//	}
//	}
//	if(flag==false) {
//		System.out.println("Duplicate element not found");
//	}
//}	
//}
//
//
////public class B {
////
////    public static void main(String[] args) {
////    	Scanner scan=new Scanner(System.in);
////    	System.out.println("Enter the number:");
////    	String num = scan.nextLine();
////    	
//////    	StringBuffer sb= new StringBuffer(String.valueOf(num));   
//////    	StringBuffer reverse = sb.reverse();
//////    	System.out.println("Reversed number is:" +reverse);
////    	
////    	/*StringBuilder*/
////    	StringBuilder sbl=new StringBuilder();
////    	sbl.append(num);
////    	StringBuilder reverse = sbl.reverse();
////    	System.out.println("Reversed number is:" +reverse);
////    }}
//
////Palindrome
////public class B{
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter a string: ");
////        String str = input.nextLine();
////        input.close();
////
////        // create a StringBuffer object and append the input string to it
////        StringBuffer sb = new StringBuffer(str);
////
////        // reverse the StringBuffer object
////        sb.reverse();
////
////        // compare the reversed StringBuffer with the original string
////        if (str.equals(sb.toString())) {
////            System.out.println(str + " is a palindrome.");
////        } else {
////            System.out.println(str + " is not a palindrome.");
////        }
////    }
////}
//
//
////public class B {
////
////    public static void main(String[] args) {
////        
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter a number: ");
////        int num = sc.nextInt();
////        sc.close();
////        
////        boolean isPrime = true;
////        
////        if (num == 1 || num == 0) {
////            isPrime = false;
////        } else {
////            for (int i = 2; i <= num/2; i++) {
////                if (num % i == 0) {
////                    isPrime = false;
////                    break;
////                }
////            }
////        }
////        
////        if (isPrime) {
////            System.out.println(num + " is a prime number.");
////        } else {
////            System.out.println(num + " is not a prime number.");
////        }
////    }
////
////}
//
////Fibonacci series
//
////   public class B{
////	   public static void main(String[] args) {
////		   Scanner scan= new Scanner(System.in);
////		   System.out.println("Enter the number:");
////		   int num = scan.nextInt();
////           scan.close();
////           
////           int a=0, b=1;
////           System.out.println("Fibonacci series up to " + num + " terms: ");
////           
////           for(int i=1; i<=num; i++) {
////        	   System.out.print(+a+ "," );
////        	   
////        	   int c=a+b; //0+1=1
////        	   a=b;
////        	   b=c;
////               
////           }
////	}
////	  
////	   
////   }
//
//
//
//
//
