import java.util.Scanner;
public class Search {
	int binary(int arr[],int m,int k,int x){
		if(k>=m){
		int mid=m + (k-m)/2;
		if(arr[mid]==x)
			return mid;
		if(x>arr[mid])
			return binary(arr,mid+1,k,x);
		if(x<arr[mid])
			return binary(arr,m,mid-1,x);
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int x,i;
		System.out.println("search no");
		x=scan.nextInt();
		Search se=new Search();
		int res=se.binary(arr,0,n-1,x);
		if(res==0)
			System.out.println("not found");
		else
			System.out.println("found");
	}

}
