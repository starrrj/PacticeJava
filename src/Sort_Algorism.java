import java.util.Arrays;

public class Sort_Algorism {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  int [] arr = {-1, -2 , -100, 0 , 100, 511111};
  QuickSort(arr, 0, arr.length-1);
  System.out.println(Arrays.toString(arr));
  
 }
 static void Select_Sort(int arr[], int n) // 선택 정렬
 {
  int i,j;
  int maxIdx;
  int temp;
  
  for(i=0; i<n-1  ;i++)
  {
   maxIdx = i;
   
   for(j=i+1 ; j<n ; j++) 
   {
    if(arr[j] < arr[maxIdx])
     maxIdx = j;
    
   }
   temp = arr[i];
   arr[i] = arr[maxIdx];
   arr[maxIdx] = temp;
   
  }
 } // end of selection sort
 
 // 삽입 정렬
 static void InserSort(int arr[], int n)
 {
  int i,j;
  int insData;
  
  for(i=1 ; i<n ; i++)
  {
   insData = arr[i];
   
   for(j=i-1 ; j>=0 ; j--)
   {
    if(arr[j] > insData)
     arr[j+1] = arr[j];
    else
     break;
    
   }
   
   arr[j+1] = insData;
  }
  
 } 
 
 // 병합 정렬
 static void MergeTwoArea(int arr[], int left, int mid, int right)
 {
  int fIdx = left;
  int rIdx = mid+1;
  int i;
  
  
  int []sortArr = new int[right+1];
  int sIdx = left;
  
  while(fIdx <= mid && rIdx <= right)
  {
  
   if(arr[fIdx] <= arr[rIdx])  
    sortArr[sIdx] = arr[fIdx++];
   else
    sortArr[sIdx] = arr[rIdx++];
   
   sIdx++;
  }
  
  if(fIdx > mid)
  {
   
   for(i=rIdx; i<= right ; i++, sIdx++)
    sortArr[sIdx] = arr[i];
  }
  else
  { 
   for(i=fIdx ; i<= mid ; i++, sIdx++)
    sortArr[sIdx] = arr[i];
  }
  
  for(i=left ; i<= right ; i++)
   arr[i] = sortArr[i];
  
 }
 

 static void MergeSort(int arr[], int left, int right)
 {
  int mid;
  
  if(left < right)
  {
   mid = (left+right) /2 ;
   
   MergeSort(arr, left, mid);
   MergeSort(arr, mid+1, right);
   
   MergeTwoArea(arr,  left,  mid, right);
   
  } 
 }
 static void Swap(int arr[], int idx1, int idx2)
 {
  int temp = arr[idx1];
  arr[idx1] = arr[idx2];
  arr[idx2] = temp;
 }
 
 // 분할 정렬
 static int Partition(int arr[], int left , int right)
 {
  int pivot = arr[left];
  int low = left+1; 
  int high = right;
  
  while(low <= high)
  {
   while(pivot >= arr[low] && low <= right)
    low++; 
   while(pivot <= arr[high] && high >= (left+1))
    high--;
   
  
   if(low <= high) 
    Swap(arr, low , high);
  }
  Swap(arr, left, high);
  return high; 
 }
 
 
 // 퀵 정렬 : 가장 빠른 정렬 알고리즘
 static void QuickSort(int arr[], int left , int right)
 {
  if(left <= right)
  {
   int pivot = Partition(arr,  left,  right); 
   QuickSort(arr, left, pivot -1);   
   QuickSort(arr, pivot+1, right);    
   
  }
 }
}


