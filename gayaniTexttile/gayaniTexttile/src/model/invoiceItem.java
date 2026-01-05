
package model;


public class invoiceItem {
    
     private String StockId;
    private String Brand;
    private String Name;
    private String Qty;
    private String sellingPrice;

    /**
     * @return the StockId
     */
    public String getStockId() {
        return StockId;
    }

    /**
     * @param StockId the StockId to set
     */
    public void setStockId(String StockId) {
        this.StockId = StockId;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Qty
     */
    public String getQty() {
        return Qty;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(String Qty) {
        this.Qty = Qty;
    }

    /**
     * @return the sellingPrice
     */
    public String getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
}
