public class GetterThread implements  Runnable {

    public GetterThread(MyDataStructure myData, int start, int end) {
        this.myData = myData;
        this.start = start;
        this.end = end;
    }

    MyDataStructure myData;
    int start;
    int end;

    public void run() {

        for (int i = start; i < end; i = i + 1) {

            Object obj = myData.get();
            while (obj == null){
                obj = myData.get();
            }
            System.out.println(obj);


        }
    }
}
