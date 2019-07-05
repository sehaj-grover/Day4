class Solution {
	
	public static int[] search(int[] arr, int target) 
	{
		int[] result=new int[2];
		int start=0,end=arr.length-1,mid,pos=-1;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			
			if(arr[mid]==target) {pos=mid;break;}
			else if(arr[mid]<target) {start=mid+1;}
			else{end=mid-1;}
		}
		result=find(arr,pos,target);
		return result;
	}
	public static int[] find(int[] arr,int pos,int target) 
	{
		int start=-1,end=-1;
		if (pos!=-1)
		{
			start=pos;
			while(arr[start-1]==target) {start--;}
			end=pos;
			while(arr[end+1]==target) {end++;}
			
		}
		int result[]= {start,end};
		return result;
	}
	
    public static void main(String args[]) 
    { 
    	int[] arr = {5,7,7,8,8,8,8,10};
    	int[] result=search(arr,8);
    	System.out.println(""+result[0]+" "+result[1]);
        
    } 
}
