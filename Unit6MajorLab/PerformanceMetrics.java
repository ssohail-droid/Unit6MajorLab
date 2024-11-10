public class PerformanceMetrics {
    private int horsepower;
    private double weight;
    private int topSpeed;
    private double accelerationTime;
    private double brakingDistance;
    
    public PerformanceMetrics(int horsepower, double weight, int topSpeed) {
        this.horsepower = horsepower;
        this.weight = weight;
        this.topSpeed = topSpeed;
        calcAccelerationTime();
        calcBrakingDistance();
    }
    
    public void calcAccelerationTime() {
        accelerationTime = (weight / horsepower) * 0.07;
    }
    
    public void calcBrakingDistance() {
        brakingDistance = (topSpeed * topSpeed) / (30 * horsepower / weight);
    }
    
    public double getAccelerationTime() {
        return accelerationTime;
    }
    
    public double getBrakingDistance() {
        return brakingDistance;
    }
    
    public String toString() {
        return "0-60 mph Acceleration Time: " + getAccelerationTime() + " seconds\n" + 
               "Braking Distance (from 60 mph): " + getBrakingDistance() + " feet\n";
    }
}
