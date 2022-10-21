package lab2;
import java.util.*;
class Ex1{
	int getsmal(int[] arr, int n) {
		if(n==2) {
			if(arr[0]<arr[1]) {
				return arr[1];
			}
			else return arr[0];
		}
		int smal=arr[0], secSmall=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]<smal) {
				smal=arr[i];
				secSmall=smal;
			}
		}
		return secSmall;
	}
	public static void main(String[] args) {
		int n, ans;
		Ex1 s = new Ex1();
		System.out.println("enter n");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		ans= s.getsmal(arr,n);
		System.out.println(ans);
		sc.close();
	}
}

class Ex2{
	String[] sortStr(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		int n;
		Ex2 s= new Ex2();
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		String[] arr = new String[n];
		System.out.println("enter strings");
		for(int i=0;i<n;i++) {
			arr[i]= sc.next();
		}
		arr=s.sortStr(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
class Ex3{
	int[] getSort(int[] arr,int n) {
		int num;
		String str;
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<n;i++) {
			num=arr[i];
			str=Integer.toString(num);
			sb.append(str);
			sb.reverse();
			str=sb.toString();
			arr[i]= Integer.valueOf(str);
			sb.delete(0,sb.length()-1);
			
		}
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Ex3 s = new Ex3();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		arr= s.getSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
//problem
class Ex4{
	int[]reverse(int[] arr){
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[arr.length-1-i];
		}
		return temp;
	}
	int[] modArr(int[] arr) {
		int num;
		int[] arr2=new int[arr.length];
		Arrays.sort(arr);
		arr=reverse(arr);
		num=arr[0];
		arr2[0]=num;
		for(int i=1, j=1;i<arr.length;i++) {
			if(arr[i]==num) {
				continue;
				
			}
			else {
				num= arr[i];
				arr2[j]= arr[i];
				j++;
			}
		}
		return arr2;
	}
	public static void main(String[] args) {
		int n;
		Ex4 s=new Ex4();
		System.out.println("enter n");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int[]res = s.modArr(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}