package Strings;

public class mutability {
    public static void main(String[] args) {
        String brand = "Pwskills";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append("Bengaluru");
        System.out.println(brand1);
    }
}
