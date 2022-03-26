package com.company;

public class MyClass {
    // Phương thức tham số tùy chọn
    // names là mảng chứa các chuỗi
    static void showProductNames(String ... names) {
        int sotenSanpham = names.length;

        System.out.println("Số tên sản phẩm: " + sotenSanpham);
        // Duyệt qua phần tử mảng các tham số
        for (String names1 : names) {
            System.out.println(names1);
        }
        names[1] = "haha";
        names[5] = "msi";
    }

    public static void main(String[ ] args) {

        showProductNames("Iphone 8", "Note 10", "Macbook Pro","ProMaxx","lol","ooo");
    }
}
// In ra:
// Số tên sản phẩm: 3
// Iphone 8
// Note 10
// Macbook Pro

