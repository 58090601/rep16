package com.company;

class Formula {
    int a;
    int b;
    int c;

    Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayFormula() {
        double form = a * Math.pow(b, c);
        System.out.println(form);
    }
}
class Formula2 {
    int k;
    int r;
    int m;

    Formula2(int k, int r, int m) {
        this.k = k;
        this.r = r;
        this.m = m;
    }

    public void displayFormula() {
        double form = k * Math.pow(k, m);
        System.out.println(form);
    }
}
@FunctionalInterface
interface Converter <Formula,Formula2> {
    Formula2 conv(Formula t);

}
public class Main {

    public static void main(String[] args) {
        Formula form1 = new Formula(4,2,3);
        Converter bb = x -> new Formula2(form1.a, form1.b, form1.c);
        Formula2 form2 = (Formula2) bb.conv(form1);
        form2.displayFormula();

    }
}
