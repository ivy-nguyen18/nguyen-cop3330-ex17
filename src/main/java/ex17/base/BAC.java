package ex17.base;

public class BAC{
    private double weight;
    private double alcDistRatio;
    private double alcConsumed;
    private double hours;

    public BAC(double weight, int gender, double alcConsumed, double hours){
        this.weight = weight;
        if(gender == 1){
            this.alcDistRatio = 0.73;
        }else{
            this.alcDistRatio = 0.66;
        }
        this.alcConsumed = alcConsumed;
        this.hours = hours;
    }

    public double calculateBAC(){
        return ((alcConsumed * 5.14) / (weight * alcDistRatio)) - .015 * hours;
    }
}
