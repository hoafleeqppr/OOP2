//package week6.ThucHanh3;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
//import java.io.IOException;
//
//public class ProductProcess {
//
//    public static boolean writeObjectData(Product[] products, String fileName) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            for (Product product : products) {
//                oos.writeObject(product);
//            }
//            return true; // Trả về true nếu ghi dữ liệu thành công
//        } catch (IOException e) {
//            e.printStackTrace();
//            return false; // Trả về false nếu có lỗi xảy ra
//        }
//    }
//
//    public Product[] readObjectData(String fileName) {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
//            // Đọc các đối tượng từ file vào danh sách
//            Product[] products = new Product[2];
//            for (int i = 0; i < products.length; i++) {
//                products[i] = (Product) ois.readObject();
//            }
//            return products; // Trả về mảng đối tượng
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//            return null; // Trả về null nếu có lỗi xảy ra hoặc file không có dữ liệu
//        }
//    }
//}