class Solution {
	
	public static int findPeak(int[] arr)
	{
		int mid,start=0,end=arr.length-1;
		boolean flag=false;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(check(arr,mid)) {return mid;}
			end=mid-1;
		}
		end=arr.length-1;
		start=end/2;
		
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(check(arr,mid)) {return mid;}
			start=mid+1;
		}
		return -1;

	}
	public static boolean check(int[] arr, int pos)
	{
		if(pos==0 && arr[pos]>arr[pos+1]) {return true;}
		else if(pos==arr.length-1 && arr[pos]>arr[pos-1]) {return true;}
		else if(pos!=0 && pos!=arr.length-1 && arr[pos-1]<arr[pos] && arr[pos+1]<arr[pos]){return true;}
		
		return false;
	}
    public static void main(String args[]) 
    { 
    	int[] arr = {1,2,1,3,5,6,4};
    	int peak=findPeak(arr);
    	System.out.println(peak);
    	
        
    } 
}
