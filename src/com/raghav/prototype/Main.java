package com.raghav.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        BookShop bs = new BookShop();
        bs.setShopName("Bookish");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Readers");
        System.out.println(bs);
        System.out.println(bs1);
    }
}
