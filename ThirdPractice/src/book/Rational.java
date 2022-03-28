package book;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(long numerator, long denominator){
        long t = gcd(numerator,denominator);
        this.denominator = denominator / t;
        this.numerator = numerator / t;
    }
//求最大公约数
    private long gcd(long n, long d){
        long t1 = Math.abs(n);
        long t2 = Math.abs(d);
        long remainder = t1%t2;
        while (remainder != 0)
        {
            t1 = t2;
            t2 = remainder;
            remainder = t1%t2;
        }
        return t2;
    }

    public Rational add(Rational secondRational){
        long n = numerator*secondRational.getDenominator() + denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational){
        long n = numerator*secondRational.getDenominator() - denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational){
        long n = numerator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational){
        long n = numerator*secondRational.getDenominator();
        long d = denominator*secondRational.getNumerator();
        return new Rational(n, d);
    }
//重写toString方法
    public String toString(){
        if(denominator == 1){
            return numerator+"";
        }
        else{
            return numerator+"/"+denominator;
        }
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
}