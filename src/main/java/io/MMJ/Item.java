package io.MMJ;

/**
 * Created by Matthew Belongia, Jay Milnamow and Manjusha Das on 5/24/16.
 */

public class Item {

    String name;
    String price;
    String type;
    String expiration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public void printRawText(){

    }
}
