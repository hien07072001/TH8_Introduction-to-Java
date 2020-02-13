import java.util.Scanner;

public class BodyWeightIndex {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        float weight;
        float height;

        System.out.println("nhap vao can nang");
         weight=scanner.nextFloat();

        System.out.println("nhap vao chieu cao");
        height=scanner.nextFloat();

        float bmi = weight/(height*height);

                if(bmi<18.5){
                    System.out.println("UnderWeight");
                }else if(bmi>=18.5 && bmi <25){
                    System.out.println("Normal");
                }else if (bmi>=25 && bmi<30){
                    System.out.println("OverWeight");
                }else
                    System.out.println("Obese");
    }
}
