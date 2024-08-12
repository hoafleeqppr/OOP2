package week4;

public class btTernaryOperator {
    public static void main(String[] args) {
        String str = "hoal";
        String message ;
        try {
            // Nếu str không phải là null, lấy chuỗi con; nếu null, gán giá trị mặc định
            message = (str == null) ? "" : str.substring(0, 6);
            System.out.println("Result " + message);
        } catch (IndexOutOfBoundsException e) {
            // Xử lý trường hợp chuỗi ngắn hơn 6 ký tự
            message = "chuỗi ngắn hơn 6 ký tự";
            System.out.println("Result " + message);
        } catch (Exception e) {
            // Xử lý các ngoại lệ khác (nếu cần)
            message = "Default";
            System.out.println("Result " + message);
        }
    }
}
