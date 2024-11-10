public class Vehicle extends Machine {
    protected double weight;
    protected int length;
    protected String chassisType;
    
    public Vehicle(String carName, int topSpeed, String engineType, double weight, int length, String chassisType) {
        super(carName, topSpeed, engineType);
        this.weight = weight;
        this.length = length;
        this.chassisType = chassisType;
    }
    
    public String toString() {
        return super.toString() +  
            "Weight: " + weight + " pounds\n" + 
            "Length: " + length + " inches\n" + 
            "Chassis Type: " + chassisType + "\n";
    }
}
