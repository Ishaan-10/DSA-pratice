package Oops1;

public class fractionClass {
    
    private int numerator;
    private int demoninator;

    private fractionClass(){

    }

    public fractionClass(int numerator,int denominator){
        this.numerator=numerator;
        this.demoninator=denominator;
    }

    public int getNum(){
        return numerator;
    }
    public void setNum(int numerator){
        this.numerator=numerator;
    }
    public void setDenom(int demoninator){
        this.demoninator=demoninator;
    }
    public int getDenom(){
        return demoninator;
    }
    public void print(){
        System.out.println(numerator + "/" + demoninator);
    }

    public void simplify(){

        int hcf=1;
        int smaller = Math.min(numerator, demoninator);

        for(int i=smaller;i>0;i--){

            if(numerator%i==0 && demoninator%i==0){
                hcf=i;
                break;
            }
        }
        
        numerator=numerator/hcf;
        demoninator=demoninator/hcf;
    }

    public void increment(){
        numerator=numerator+demoninator;
        simplify();
    }

    public fractionClass add(fractionClass a){
        fractionClass temp = new fractionClass();
        temp.numerator = (numerator * a.demoninator) + (a.numerator*demoninator);
        temp.demoninator= a.demoninator * demoninator;
        temp.simplify();

        return temp;
    }


}

class solution{

    public static void main(String[] args) {
        
        fractionClass f1= new fractionClass(1000,1200);
        fractionClass f2= new fractionClass(200,200);
        fractionClass f3;
        f3=f1.add(f2);

        f3.print();
        
    }
}
