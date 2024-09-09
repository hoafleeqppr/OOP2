//package week6.ThucHanh3;
//
//public class ProductApp {
//    public static void main(String[] args) {
//        Product objProduct1 = new Product();
//        objProduct1.setProID(1);
//        objProduct1.setProName("Laptop");
//        objProduct1.setPrice(1200.00);
//
//        Product objProduct2 = new Product(2, "Smartphone", 800.00);
//
//        ProductProcess productProcess = new ProductProcess();
//
//        // Ghi dữ liệu vào file
//        if (productProcess.writeObjectData(new Product[]{objProduct1, objProduct2}, "object.dat")) {
//            System.out.println("Ghi dữ liệu thành công vào file object.dat");
//        } else {
//            System.out.println("Ghi dữ liệu thất bại.");
//        }
//
//        // Đọc dữ liệu từ file
//        Product[] listProduct = productProcess.readObjectData("object.dat");
//        if (listProduct != null) {
//            System.out.println("Dữ liệu đọc được từ file object.dat:");
//            for (Product product : listProduct) {
//                System.out.println(product);
//            }
//        } else {
//            System.out.println("Không có dữ liệu hoặc lỗi khi đọc dữ liệu.");
//        }
//    }
//}
