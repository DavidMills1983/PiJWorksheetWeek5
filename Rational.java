public class Rational {

    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    void printRational(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    void negate(){
        this.numerator = -this.numerator;
        this.denominator = -this.denominator;
    }

    void invert(){
        this.numerator+=this.denominator;
        this.denominator=this.numerator-this.denominator;
        this.numerator=this.numerator-this.denominator;

    }

    Double toDouble(){
        return (double) this.numerator / this.denominator;
    }

    void reduce(){
        int a = numerator;
        int b = denominator;
        if(a < b){
            a += b;
            b = a - b;
            a = a - b;
        }
        while(true){
            int remainder = a % b;
            if (remainder == 0){
                break;
            }
            a = b;
            b = remainder;
        }
        this.numerator = this.numerator / b;
        this.denominator = this.denominator / b;

        System.out.println(this.numerator + "/" + this.denominator);
    }


    public Rational add(Rational number){
        Rational sum = new Rational();
        int a = this.numerator * number.denominator;
        int b = this.denominator * number.denominator;
        int c = number.numerator * this.denominator;
        int d = number.denominator * this.denominator;

        sum.numerator = a + c;
        sum.denominator = d;
        sum.reduce();
        return sum;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Rational fraction = new Rational();
        fraction.numerator = 1;
        fraction.denominator = 2;

        Rational fractionTwo = new Rational();
        fractionTwo.numerator = 3;
        fractionTwo.denominator = 4;

        fractionTwo.add(fraction);

        // prints 5/4
    }
}
