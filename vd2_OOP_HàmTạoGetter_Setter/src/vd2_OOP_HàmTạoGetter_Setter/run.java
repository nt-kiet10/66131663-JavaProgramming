package vd2_OOP_HàmTạoGetter_Setter;

public class run {

    public static void main(String[] args) {

        Car xe1 = new Car(null, null, 0, 0);
        Car xe2 = new Car("Toyota", "Đen", 12, 1);

        // gán giá trị cho xe1
        xe1.setHangXe("Honda");
        xe1.setMauXe("Đỏ");
        xe1.setTuoi(5);
        xe1.setGia(2);

        System.out.println(xe1.toString());
        System.out.println(xe2.toString());

    }
}