public class CarLot {

    //attributes
    private String dealername;
    private Vehicle[] vehicles;
    private int index;

    //Constructors
    public CarLot(){
        dealername = "";
        vehicles = new Vehicle[100];
        index = 0;
    }
    public CarLot(String dname){
        dealername = dname;
        vehicles = new Vehicle[100];
        index = 0;
    }
    //setter

    public void setDealername(String dname){
        dealername = dname;
    }
    //add method

    public void addVehiclesToArray(String make, String model, String color, double cost){
        vehicles[index] = new Vehicle(make, model, color, cost);
        index++;
    }
    //getters
    public String getDealername(){
        return dealername;
    }
    public int getLogicalLength(){
        return index;
    }

    public Vehicle getVehicleFromArray(int i){
        return vehicles[i];}
    // print method
    public void printInfo() {
        System.out.println("Dealership: " + dealername + "has " + index + " cars");
        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.println(vehicles[i].toString());
        }
        System.out.println();
    }

    public Vehicle[] getCarArray() {return vehicles;
    }
}
