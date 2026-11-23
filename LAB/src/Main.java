import java.util.Scanner;



void main() {
  Scanner myObj = new Scanner(System.in);
  int arrsize = myObj.nextInt();
  int[] arrnum = new int[arrsize];
  for (int i = 0; i < arrsize; i++) {
    int nextnum = myObj.nextInt();
    arrnum[i] = nextnum;
  }
  selectionSort(arrnum);
  for(int j =0; j< arrsize ; j++){
    System.out.println(arrnum[j]);
  }
}
static void selectionSort(int[] arr){
  int n = arr.length;
  for (int i = 0; i < n - 1; i++) {

    int min_idx = i;

    for (int j = i + 1; j < n; j++) {
      if (arr[j] < arr[min_idx]) {
        min_idx = j;
      }
    }
    int temp = arr[i];
    arr[i] = arr[min_idx];
    arr[min_idx] = temp;
  }
}