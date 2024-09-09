package week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME_REGEX = "[CAP]\\d{4}[GHIK]";
//^: Đánh dấu bắt đầu chuỗi.
//[CAP]: Ký tự đầu tiên phải là C, A, hoặc P.
//\\d{4}: Tiếp theo là 4 ký tự số.
//[GHIK]: Ký tự cuối cùng phải là G, H, I, hoặc K.
//$: Đánh dấu kết thúc chuỗi.

    public ClassNameExample() {
    }

    public boolean validate(String className) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX); //để biên dịch biểu thức chính quy
        Matcher matcher = pattern.matcher(className); //ể kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không.
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();

        // Tên lớp hợp lệ
        String[] validClassNames = {"C0223G", "A0323K", "P1234I", "C0789W"};

        // Tên lớp không hợp lệ
        String[] invalidClassNames = {"M0318G", "P0323A", "C12B3K", "C03234H"};

        // Kiểm tra lớp hợp lệ
        for (String className : validClassNames) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name " + className + " is valid: " + isValid);
        }

        // Kiểm tra lớp không hợp lệ
        for (String className : invalidClassNames) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name " + className + " is valid: " + isValid);
        }
    }
}
