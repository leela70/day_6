
public class RecursiveBinarySearch {
	    public static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
	        
	        if (start > end) 
	        {
	            return -1;
	        }
	        int mid = (start + end) / 2;
	        if (arr[mid] == target) {
	            return mid; 
	        } 
	        else if (arr[mid] > target)
	        {
	            return recursiveBinarySearch(arr, target, start, mid - 1);
	        } else
	        {
	            return recursiveBinarySearch(arr, target, mid + 1, end);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {0,1,2,4,5,6,9,10,11,36};//actual array{2,1,0,9,10,4,5,36,6,11}
	        int target = 10;
	        int result = recursiveBinarySearch(arr, target, 0, arr.length - 1);
	        System.out.println("Enter The Target Element");

	        if (result != -1) {
	            System.out.println("Target Element is " + target + " located index is " + result + ".");
	        } else {
	            System.out.println("Target Element is " + target + " located index is");
	        }
	    }
	}


