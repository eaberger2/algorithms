
public class MergeSort{

    public static void main(String[] args){
        int[] arr = {3,4,6,4,4,12,1,4,36,98,60,6,5};
        System.out.println("Sorted: ");
        int[] newArr = mergeSort(0,arr.length-1,arr);
        for(int i : newArr){
            System.out.println(i);
        }
    }

    public static int[] merge(int low, int mid, int high, int[] arr){
        int leftSize = mid-low+1;
        int rightSize = high-mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        int i = low;
        for(int k = 0; k<(mid-low+1); k++){
            left[k] = arr[i];
            i++;
        }
        int j = mid+1;
        for(int k = 0; k<(high-mid); k++){
            right[k] = arr[j];
            j++;
        }

        int k = low; //track original arr index
        i = 0; //track left array index
        j = 0; //track right array index
        while(i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            arr[k] = left[i];
            k++;
            i++;
        }

        while(j<rightSize){
            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }

    public static int[] mergeSort(int low, int high, int[] arr){
        int mid = low + (high - low) / 2;
        if(low < high){
            mergeSort(low,mid,arr);
            mergeSort(mid+1,high,arr);
            merge(low, mid, high, arr);
        }
        return arr;
    }

}