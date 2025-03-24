public class Main {
    public static void main(String[] args) {
        System.out.println("Let's make and test a Queue");

        MyDataStructure  myData = new MyDataStructure();
        myData.put(95);
        myData.put(96);
        myData.put(97);

        Object data1 = myData.get();
        Object data2 = myData.get();
        Object data3 = myData.get();

        System.out.println(data1);  // 95
        System.out.println(data2);
        System.out.println(data3);
    }

}