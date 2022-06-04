package com.raghav.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    List<Book> books = new ArrayList<>();
    private String shopName;

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book" + i);
            getBooks().add(b);
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.getBooks().addAll(this.getBooks());
        return bs;
    }
}
