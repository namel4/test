import java.util.Arrays;

class test{
	public static void main(String args[]){
		System.out.println("德玛西亚");
		int[] arr = {2,4,1,9,6,8,7,10,3,5};

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void bubbleSort(int[] arr){
		if(arr == null || arr.length < 2){
			return;
		}else {
			for (int i=0;i<arr.length-1;i++){
				for (int j=0;j<arr.length-1-i;j++){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
	}


}
