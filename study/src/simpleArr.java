package chp24;

public class simpleArr {
	
	static void Reverse(int[] arr,int n ) {
		for(int i=0;i<n/2;i++) {
			swap(arr, i , n-1-i);
			
		}
		
		
	}
	
	static void swap(int[] arr, int So, int end) {
		int temp=arr[So];
		arr[So]=arr[end];
		arr[end]=temp;
		
	}
	
	static void allhap(int[] arr) {
		int sum=0;
		for(int i=0 ; i<arr.length; i++) {
			sum+=arr[i];
			
		}
	
	System.out.println("배열의 총합은"+sum);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,6,4,2,6,2,3,60,21};
		allhap(arr);
		Reverse(arr,arr.length);
		
		for(int e: arr) {
			System.out.print(e+"|");
			
		}

		
		
		
		

	}

}
