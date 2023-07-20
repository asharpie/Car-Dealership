public class Vehicle {

    // attributes
    private String make;
    private String model;
    private String color;
    private double cost;

    //Constructors
    public Vehicle(){
        make = "";
        model = "";
        color = "";
        cost = 0.0;
    }

    public Vehicle(String make, String model, String color, double cost){
        this.make = make;
        this.model = model;
        this.color = color;
        this.cost = cost;
    }
    //setters

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    //getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getCost(){
        return cost;
    }
    //to string
    public String toString() {
    return "Make" + make + ", model " + model + ", color " + color + ", cost " + cost;
    }
}

