class java {
    private int a;
    private int b;
    private int c;
    public java(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public void print() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
    public void add() {
        a += b + c;
    }
    public static void main(String[] args) {
        java j = new java(1, 2, 3);
        j.print();
        j.add();
        j.print();
    }
}