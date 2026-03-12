

public class Main {

    public static void main(String[] args) {

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

        ComplexNumber cn1 = new ComplexNumber(2.0, 4.0);
        System.out.println("Real = " + cn1.getReal());
        System.out.println("Imaginary = " + cn1.getImaginary());
        cn1.add(-2, 10.5);
        ComplexNumber cn2 = new ComplexNumber(5, 3);

        cn1.add(cn2);

        cn1.subtract(1, 3);
        cn1.subtract(cn2);

    }
}