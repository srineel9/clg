public class oops{
    public static void main(String args[]) {
        Pen p1= new Pen(); //created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        BankAccount myacc = new BankAccount();
        myacc.username = "srineel";
        myacc.setpassword("absdf");

    }

}

class BankAccount {
    public String username;
    public void setpassword(String pwd) {
    }

}


class Pen{
   private String color;
  private  int tip;

    String getcolor() {
        return this.color;
    }

    void setcolor(String newcolor) {
        color = newcolor;
    }

    int gettip() {
        return this.tip;
    }
    void settip(int newtip) {
        tip = newtip;
    }
}

class Student {
    String name;
    int age;
    float percentage;


    void calcpercentage(int phy,int chem,int maths) {
        percentage=(phy + chem + maths)/3;

    }
}