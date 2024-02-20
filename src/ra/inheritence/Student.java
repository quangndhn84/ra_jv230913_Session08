package ra.inheritence;

//subClass
//extends: kế thừa
public class Student extends Person{
    //Các thuộc tính riêng của lớp con
    private String studentId;
    private float mark;
    //Hàm tạo riêng của lớp con
    public Student() {
    }

    public Student(String name, String age, String address) {
        super(name, age, address);
    }

    public Student(String name, String age, String address, String studentId, float mark) {
        super(name, age, address);
        this.studentId = studentId;
        this.mark = mark;
    }

    //Phương thức riêng của lớp con
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void love() {
        System.out.println("I love you");
    }
    @Override
    public void hello(){
        System.out.println("Xin chào bằng tiếng Hà Nội");
    }
    @Override
    public String toString(){
        return "Đã ghi đề phương thưc toString của Object";
    }
}
