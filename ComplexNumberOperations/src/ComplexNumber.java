

public class ComplexNumber {

    // Fields
    private double real;
    private double imaginary;


    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Methods
    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
        System.out.println("Add with parameters -> Real = " + this.real + " imaginary = " + this.imaginary);
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
        System.out.println("Add with Obj -> Real = " + this.real + " Imaginary = " + this.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
        System.out.println("Subtract with parameters -> Real = " + this.real + " Imaginary = " + this.imaginary);
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
        System.out.println("Subtract with Obj -> Real = " + this.real + " Imaginary = " + this.imaginary);
    }




}