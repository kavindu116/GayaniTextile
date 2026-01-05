
package model;

import java.util.Date;


public class GrnItem {
    
      private String ProductId;
    private String Brand;
    private String Name;
   
    private double qty;
    private double buyingPrice;
    private double sellingPrice;
    

   
    public String getProductId() {
        return ProductId;
    }

   
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    
    public String getBrand() {
        return Brand;
    }

   
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

   
    public String getName() {
        return Name;
    }

   
    public void setName(String Name) {
        this.Name = Name;
    }

   
  

    
    public double getQty() {
        return qty;
    }

    
    public void setQty(double qty) {
        this.qty = qty;
    }

    
    public double getBuyingPrice() {
        return buyingPrice;
    }

   
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

   
    public double getSellingPrice() {
        return sellingPrice;
    }

   
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

   
    
}
