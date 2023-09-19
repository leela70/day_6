public class NonRecursiveBinarySearch 
{
	    public static int nonRecursiveBinarySearch(int[] arr, int target)
	    {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start <= end)
	        {
	          int mid = (start + end) / 2;
	           if (arr[mid] == target)
	           {
	                return mid; 
	           } 
	            else if (arr[mid] < target)
	            {       
	                start = mid + 1;
	            } else 
	            {  
	                end = mid - 1;
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {0,1,2,4,5,6,9,10,11,36};//actual array{2,1,0,9,10,4,5,36,6,11}
	        int target = 10;
	        int result = nonRecursiveBinarySearch(arr, target);
	        if (result != -1) {
	       System.out.println("Enter The Target Element");
	       System.out.println("Target Element is " + target + " located index is " + result + ".");
	        } 
	        else 
	        {
	            System.out.println("Target Element is " + target + " located index is ");
	        }
	    }
	}

