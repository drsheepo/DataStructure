public class Main {
    public static void main(String[] args) {
        System.out.println("Let's make and test a Queue");

        MyDataStructure  myData = new MyDataStructure();
        for (int i = 500; i < 800 ; i = i + 1) {
            myData.put(i);
            System.out.println(myData.get());
        }


    }

}