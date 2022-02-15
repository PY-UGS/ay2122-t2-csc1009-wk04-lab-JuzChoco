import static java.lang.Math.pow;

public class Wk4Q1Class {
    
    private double weight;
    private double height;

    static final float pToK = 0.45359237f;
    static final float iToM = 0.0254f;

    public Wk4Q1Class(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double calculateBMI(){

        double KiloWeight = this.getWeight() * pToK;
        double MetresHeight = this.getHeight() * iToM;
        double bmi = KiloWeight / pow(MetresHeight, 2);

        return bmi;
    }

    public void BMIInterpretation(){
        double bmi = this.calculateBMI();

        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }


    }


}
