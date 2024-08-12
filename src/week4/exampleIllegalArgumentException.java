package week4;

public class exampleIllegalArgumentException {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        }
        // Ngoai le Tham số được sử dụng để gọi phương thức không hợp lệ
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        s = "LeMinhHoa";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }
    // ham getLength de dem so luong kí tu trong chuoi s
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }


}
