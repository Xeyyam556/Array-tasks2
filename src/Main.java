
void main() {

    //Task 1

   /* Scanner scanner=new Scanner(System.in);

    int [] arr=new int []{10,20,30,40,50,60};
    System.out.print("Enter the first index: ");
    int firstIndex=scanner.nextInt();
    System.out.print("Enter the second index: ");
    int secondIndex=scanner.nextInt();

    int temporary=arr[firstIndex];
    arr[firstIndex]=arr[secondIndex];
    arr[secondIndex]=temporary;

    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }*/

    //Task 2

  /*  int [] arr=new int[]{1,2,3,4,5};
    int a=1;
    for (int i=0; i<arr.length;i++){
        if (arr[i]%2==0){
            a=arr[i];
            System.out.println(a);
        }

    }*/

    //Task 3

  /*  int a;
    int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
    }
    System.out.println("Second Smallest: "+arr[1]);
    System.out.println("Second Largest: "+arr[arr.length-2]);
*/

    //Task 4

   /* int[] arr = {2, 7, 4, 9, 6, 11, 8, 15, 10};

    int[] result = new int[arr.length];
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            result[count] = arr[i];
            count++;
        }
    }

    int[] sonNetice = Arrays.copyOf(result, count);

    System.out.println( Arrays.toString(sonNetice));*/

}
