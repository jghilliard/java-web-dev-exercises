package org.launchcode.java.studios.RestaurantMenu;

public class MenuItems {

    //Object information.
    private String name;
    private boolean isNew;
    private String description;
    private double price;
    private String type;
    //appetizer, main course, dessert
    

    //Getters and setters
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setIsNew(boolean fresh){this.isNew = fresh;}
    public String getNew(){
        if (this.isNew){
            return "New Item!";
        } return "Classic Item";
    }
    public void setDesc(String descriptor){
        this.description = descriptor;
    }
    public String getDesc(){return this.description;}
    public void setPrice(double fee){this.price = fee;}
    public double getPrice(){return this.price;}
    public void setType(String variety){this.type = variety;}
    //appetizer, main course, dessert
    public String getType(){return this.type;}
    
    //is equal?
    public boolean isEqual(MenuItems item){
        return this.name.equals(item.getName());
    }
}
