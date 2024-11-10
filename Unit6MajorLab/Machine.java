public class Machine {
    protected String machineName;
    protected int topSpeed;
    protected String engineType;
    
    public Machine(String machineName, int topSpeed, String engineType) {
        this.machineName = machineName;
        this.topSpeed = topSpeed;
        this.engineType = engineType;
    }
    
    public String toString() {
        return "Machine name: " + machineName + "\n" + 
            "Top Speed: " + topSpeed + " mph\n" + 
            "Engine Type: " + engineType + "\n";
    }
}
