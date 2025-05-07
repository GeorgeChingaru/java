public class Circle implements Tax {
    private int r;


    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;

    }
    @Override
    public float calcArea(){
        return Area.PI*(r*r);
    }
    @Override
    public float calcTax() {
        return calcArea() * Tax.TAX;
    }

}
