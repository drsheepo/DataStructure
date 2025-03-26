public class DataTestThread implements  Runnable {

    public DataTestThread(MyDataStructure myData, int start, int end) {
        this.myData = myData;
        this.start = start;
        this.end = end;
    }

    MyDataStructure myData;
    int start;
    int end;

    public void run() {
        for (int i = start; i < end; i = i + 1) {
            boolean success = myData.put(i);
            while (!success) {
             success = myData.put(i);
            }
        }


        for (int i = start; i < end; i = i + 1) {

            Object obj = myData.get();
            while (obj == null){
               obj = myData.get();
            }
            System.out.println(obj);


        }
    }
}
