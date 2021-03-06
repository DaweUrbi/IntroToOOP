package midterm;

import java.util.Objects;

public abstract class Vehicle implements Steerable {

    private String productId;
    private Integer weight = null;

    //constructor
    public Vehicle(String productID, int weight) {
        this.productId = productID;
        setWeight(weight);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = null;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" + "productId='" + productId + "', weight=" + weight + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(productId, vehicle.productId);
    }
}

