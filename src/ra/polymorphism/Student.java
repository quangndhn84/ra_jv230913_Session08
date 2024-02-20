package ra.polymorphism;

public class Student {
    public int add(int number1, int number2) {
        return number1 + number2;
    }
    //Cách 1: thay đổi số lượng tham số
    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
    //Cách 2: thay đổi dữ liệu của các tham số
    public float add(float number1, float number2) {
        return number1 + number2;
    }
    //Cách 3: thay đổi thứ tự các tham số
    public void test(int a, String b){

    }
    public void test(String b, int a){

    }

}
