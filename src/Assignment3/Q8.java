package Assignment3;

public class Q8 {
    static void main(String[] args) {
        int[] arr={10,25,38,47,56,62,71};

        System.out.println("Original Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Reversed Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

    }
}
}