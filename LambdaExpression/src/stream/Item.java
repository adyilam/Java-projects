package stream;

public class Item {

    private int itemNo;
    private String itemName;
    private String price;

    public Item(int itemNo, String itemName, String price) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemNo=" + itemNo +
                ", itemName='" + itemName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
