package ra.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Khới tạo 1 danh sách động chứa các sản phẩm từ List Interface và lớp ArrayList
        List<Product> listProduct = new ArrayList<>();
        Product product1 = new Product("P001", "Sản phẩm 1", 25, true);
        Product product2 = new Product("P002", "Sản phẩm 2", 20, false);
        Product product3 = new Product("P003", "Sản phẩm 3", 40, true);
        //add(Object o): thêm 1 phần tử vào cuối danh sách
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        //get(int index): object
        //In tên sản phẩm có chỉ số trong danh sách là 1
        System.out.println("Tên sản phẩm chỉ số 1: "+listProduct.get(1).getProductName());
        //set(int index, Object o): Đè phần từ o vào chỉ số index
        listProduct.set(2,product1);
        //add(int index, Object o): chèn 1 phần từ vào chỉ số index
        listProduct.add(2,product3);
        //size(): lấy số phần tử của danh sách
        System.out.println("Số phần tử: "+listProduct.size());
        //remove(int index): xóa phần tử ở chỉ số index
        listProduct.remove(3);
        listProduct.remove(product2);
        //In thông tin các sản phẩm trong danh sách
        for (Product pro : listProduct) {
            System.out.println(pro);
        }
    }
}
