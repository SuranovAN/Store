package ConsoleUI;

import Product.ProductsDB;

public class Menu {
    public void showAll(){
        ProductsDB db = ProductsDB.getInstance();
        Showcase showcase = new Showcase(db);
        showcase.printV(3,2);
    }

    public void choiceFilter(){
        System.out.println("some1");
    }

    public void checkBucket(){
        System.out.println("some2");
    }

    public void trackZakaz(){

    }

    public void repatZakaz(){

    }

    public void refundZakaz(){

    }

    public void some1() {
    }
}
