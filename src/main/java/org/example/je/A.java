package org.example.je;

public class A {
    private B b = new B();

    public static void main(String[] args) {
        A a = new A();
        long num = 4321;
        long ret = a.b.test(num);
        System.out.println(ret);
    }
}

class B {
    private int a = 1234;
    static long C=111;
    public long test(long num) {
        long ret = this.a + C + num;
        return ret;
    }
}