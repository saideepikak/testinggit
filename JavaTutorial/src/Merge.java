
public class Merge {
	public static void main(String args[]){
		int arr[]={6,2,5,1,7,4,3,9};
		int n=arr.length;
		Merge m=new Merge();
		m.mergeSort(arr,0,n-1);
		System.out.print("sorted array is");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	void mergeSort(int arr[],int l,int k){
		if(l<k){
		int mid=(l+k)/2;
		mergeSort(arr,l,mid);
		//System.out.println("hai");
		mergeSort(arr,mid+1,k);
		//System.out.println("haiiii");
		merge(arr,l,mid,k);
		}
	}
	void merge(int arr[],int l,int mid,int k){
		int i,j,r;
		int n1 = mid-l+1;
		int n2 = k-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(i=0;i<n1;i++){
			left[i]=arr[l+i];
		}
		for(j=0;j<n2;j++){
			right[j]=arr[mid+j+1];
		}
		i=0;
		j=0;
		int d=l;
		while(i<n1&&j<n2){
			if(left[i]<=right[j]){
				arr[d]=left[i];
				i++;
			}
			else{
				arr[d]=right[j];
				j++;
			}
			d++;
		}
		while(i<n1){
			arr[d]=left[i];
			i++;
			d++;
		}
		while(j<n2){
			arr[d]=right[j];
			j++;
			d++;
		}
		
	}

}
