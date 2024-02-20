package ra.static_final;

public class RA_Website {
    private static int cntWebsite = 0;

    public static void visitedWebsite() {
        cntWebsite++;
    }

    public void printVisiter() {
        System.out.println("Số lượt truy cập hiện tại: " + this.cntWebsite);
    }

    public static void main(String[] args) {
        visitedWebsite();
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
