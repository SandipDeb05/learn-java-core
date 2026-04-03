package oops.encapsulation;

public class Root {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop();
        lenovo.setPrice(200);
        System.out.println(lenovo.getPrice());
    }
}

class Laptop {
    int ram;
    private int price;
    boolean isAdmin;

    public void setPrice(int price) {
        if(isAdmin) {
            this.price = price;
        }
    }
    int getPrice() {
        return this.price;
    }
}