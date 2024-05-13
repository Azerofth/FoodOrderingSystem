/*TP061320
Soh Myles
TP059528
Wong Boon Hong
*/
package Cafeteria_Ordering_System;

public class Menu {
    private String name;
    private String price;
    private String itemtype;
    private String picture;

    public Menu(String name, String price, String itemtype, String picture) {
        this.name = name;
        this.price = price;
        this.itemtype = itemtype;
        this.picture = picture;
    }

    public Menu() {
    }
    
    public String addMenu(){
        return name + "," + price + "," + itemtype + "," + picture + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
