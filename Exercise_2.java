class Solution {
	
	public static int findMin(int[] arr)
	{
		int start=0,end=arr.length-1,mid=0;
		boolean flag= false;
		while(!flag)
		{
			mid=start+(end-start)/2;
			flag=check(arr,mid);
			if(arr[mid]<arr[end]) {end=mid-1;}
			else {start=mid+1;}
			
		}
		return arr[mid];
	}
	public static boolean check(int[] arr, int pos)
	{
		int prev=pos-1;
		if(pos==0) {prev=arr.length-1;}
		if(arr[pos]<arr[prev]) {return true;}
		return false;
	}
    public static void main(String args[]) 
    { 
    	int[] arr = {4,5,6,7,0,1,2};
    	int min=findMin(arr);
    	System.out.println(min);
    	
        
    } 
}
