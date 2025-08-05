package Java.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    String name;
    double price;
    int rating;
    //constructor
    public Product(String name,double price,int rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    //toString method to print info
    public String toString(){
        return name + " -₹" + price + " -*"+ rating;
    }
}
public class ComparatorAscendAndDescend {
    public static void main(String[] args) {
        ArrayList<Product> s = new ArrayList<>();
        s.add(new Product("laptop",55000,4));
        s.add(new Product("smartphone",20000,5));
        s.add(new Product("tablet",30000,4));
        s.add(new Product("headphones",3000,3));
        s.add(new Product("smartwatch",20000,4));
        s.add(new Product("smartphone",20000,5));

        // multilevel comparator
        Comparator<Product> customComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                //1.compare by price (Ascending)
                int pricecompare = Double.compare(o1.price, o2.price);
                if (pricecompare != 0) return pricecompare;

                //2.compare by rating (Descending)
                int ratingcompare = Integer.compare(o2.rating, o1.rating);
                if (ratingcompare !=0) return ratingcompare;

                //3.compare by name (Ascending)
                return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(s,customComparator);

        System.out.println("Ascending order:");
        for (Product p:s){
            System.out.println(p);
        }
    }
}
