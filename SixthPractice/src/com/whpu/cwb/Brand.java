package com.whpu.cwb;

public enum Brand {
    Lenovo("Lenovo",1000),Dell("Dell",2000),Accer("Accer",3000)
    ,ASN("ASN",4000),Apple("Apple",5000);
    private String type;
    private int price;

    Brand(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
