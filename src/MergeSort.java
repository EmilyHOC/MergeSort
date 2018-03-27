public class MergeSort {
    //该方法用于拆分数组
    public static void mergeSort(int list[]){
        if(list.length>1) {
            int[] firstlist = new int[list.length / 2];
            System.arraycopy(list, 0, firstlist, 0, list.length / 2);
            mergeSort(firstlist);

            int secondlistLengh=list.length-list.length/2;
            int[] secondlist = new int[secondlistLengh];
            System.arraycopy(list, list.length/2, secondlist, 0, secondlistLengh);
            mergeSort(secondlist);

            int temp[] = guibing(firstlist, secondlist);
            System.arraycopy(temp, 0, list, 0, temp.length);

        }
    }

    //该方法用于归并拆分的数组
    private static int[] guibing(int firstlist[],int secondlist[]){
        int []temp=new int[firstlist.length+secondlist.length];
        int currentindex1=0;
        int currentindex2=0;
        int currentindex3=0;
        while (currentindex1<firstlist.length&&currentindex2<secondlist.length){
            if(firstlist[currentindex1]<secondlist[currentindex2]){
                temp[currentindex3++]=firstlist[currentindex1++];
            }else {
                temp[currentindex3++]=secondlist[currentindex2++];
            }
        }
        while (currentindex1<firstlist.length){
            temp[currentindex3++]=firstlist[currentindex1++];
        }
        while (currentindex2<secondlist.length){
            temp[currentindex3++]=secondlist[currentindex2++];
        }
        return temp;
    }
    public static void main(String []args){
      int []list={2,3,2,5,6,1,-2,3,1,78,32};
      mergeSort(list);
      for (int i=0;i<list.length;i++){
          System.out.print(list[i]+" ");
      }
    }

}

