class mergeSort{
	void printArray(int array[]){
		int n = array.length;
		System.out.print("print the array :");
		for(int i = 0; i<n ; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	void sort(int array[], int l, int r){
		if(l<r){
			int m = l+(r-1)/2;
			sort(array, l, m);
			sort(array, m+1, r);
			merge(array, l, m, r);
		}
	}
	
	void merge(int array[], int l, int m , int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++){
			L[i] = array[l + i];
		}
		for (int j = 0; j < n2; j++){
			R[j] = array[m + 1 + j];
		}
		
		int i=0 , j=0;
		
		int k = 1 ;
		while(i<n1 && j <n2){
			if(L[i] <= R[j]){
				array[k] = L[i];
				i++;
			}else{
				array[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			array[k] = L[i];
			i++;
			k++;
		}
	}
	
	
}

class main{
	public static void main(String args[]){
		int array[] = {12,23,435,65,67};
		
		mergeSort object01 = new mergeSort();
		object01.printArray(array);
		
		object01.sort(array, 0, array.length - 1);
		
		object01.printArray(array);
		
	}
}