public class PorkArray {
   private int[] arr = new int[10];
   private int size;

    public int getSize() {
        return size;
    }

    public  int get(int i){
        return arr[i];
    }
    public void set(int i,int num){
        arr[i]=num;
    }


    public void add(int num){
        if (arr.length==size+1){
            int[] arr2 = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i]=arr[i];
            }
            arr=arr2;
        }

        arr[size] = num;
        size++;
    }

    public void add(int index,int num){
        if (arr.length==size+1){
            int[] arr2 = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
        for (int i = size; i >= index; i--) {
            arr[i+1]=arr[i];

        }
        arr[index]=num;
        size++;
    }
    public void delite(int index){
        for (int i = index; i <= size ; i++) {
                arr[i]=arr[i+1];
        }
        size--;
    }
    public void addAll(PorkArray porkArray){
        for (int i = 0; i <porkArray.getSize(); i++) {
            add(porkArray.get(i));
        }

    }
}
