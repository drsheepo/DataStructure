public class PutterThread implements  Runnable {

    public PutterThread(MyDataStructure myData, int start, int end) {
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

    }
}
