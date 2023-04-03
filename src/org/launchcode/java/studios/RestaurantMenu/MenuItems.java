package org.launchcode.java.studios.RestaurantMenu;

public class MenuItems {

    private String name;
    private boolean isNew;
    private String description;
    private double price;
    private String type;

    public void MenuItems(String name){
        this.name = name;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setIsNew(boolean fresh){this.isNew = fresh;}
    public boolean getNew(){ return this.isNew;}
    public void setDesc(String descript){
        this.description = descript;
    }
    public String getDesc(){return this.description;}
    public void setPrice(double fee){this.price = fee;}
    public double getPrice(){return this.price;}
    public void setType(String variety){this.type = variety;}
    public String getType(){return this.type;}
}
