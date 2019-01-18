/*
Write a Java program that takes a number as input and prints its multiplication table upto 10.
5 x 1=5
5 x2 =10
.
.
.
5 x 10=50
*/
class MultiTable
{
	public static void main(String r[]){
		int num =  Integer.parseInt(r[0]);

		for(int i=1; i<=10;i++){
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}