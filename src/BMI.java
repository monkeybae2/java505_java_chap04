public class BMI {
    public String name;
    public int weight;
    public int height;
    private double bmi;

    public double getBmi() {
        return bmi;
    }

    public void setMyInfo(int height, int weight) {
        this.height = height / 100;
        this.weight = weight;
        calcBmi(height, weight);
    }

    private void calcBmi(int height, int weight) {
        this.bmi = (double) weight / (height * height);
    }
}
