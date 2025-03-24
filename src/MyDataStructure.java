public class MyDataStructure implements DataStructure{

    Object[] objects;

    // 0   1   2   3
    // 95  96  97
    int nextPut = 0;
    int nextGet = 0;
    public MyDataStructure() {

        this.objects = new Object[100];

    }
    public boolean put(Object obj) {
        objects[nextPut] = obj;
        nextPut = nextPut + 1;
    return true;
}
    public Object get() {

        Object MyData = objects[nextGet];

     return MyData;
    }
}
