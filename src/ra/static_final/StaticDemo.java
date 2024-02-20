package ra.static_final;

public class StaticDemo {
    public static void main(String[] args) {
        //Biến static dùng khi lưu trữ dữ liệu chung cho các đối tượng
        RA_Website guest1 = new RA_Website();//0
        guest1.visitedWebsite();
        guest1.printVisiter();//1
        RA_Website guest2 = new RA_Website();
        guest2.visitedWebsite();
        guest2.printVisiter();//2
        RA_Website guest3 = new RA_Website();
        guest3.visitedWebsite();
        guest3.printVisiter();//3
        //Tính tổng 2 số 5 và 10
        //Phương thức static dùng khi muốn tạo các phương thức chung cho các đối tượng, phụ thuộc vào tham số của phương thức
        System.out.println("Kết quả: "+RA_Website.add(5,10));
    }
}
