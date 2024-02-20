package ra.inheritence;

public class ClassA extends Student{
    public ClassA() {
    }

    public ClassA(String name, String age, String address) {
        super(name, age, address);
    }

    public void test(){
        super.love();
        super.hello();
    }
}
