public class Main {
    public static void main(String[] args) {
        System.out.println("Let's make and test a Queue");
        MyDataStructure  myData = new MyDataStructure();

        PutterThread test1 = new PutterThread(myData,500,800);
        Thread testThread1 = new Thread(test1);
        testThread1.start();

        PutterThread test3 = new PutterThread(myData,900,1200);
        Thread testThread3 = new Thread(test3);
        testThread3.start();



        GetterThread test2 = new GetterThread(myData,100, 700);
        Thread testThread2 = new Thread(test2);
        testThread2.start();




     //   for (int i = 500; i < 800 ; i = i + 1) {
      //      myData.put(i);
         //   System.out.println(myData.get());
      //  }


    }

}