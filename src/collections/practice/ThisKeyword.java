package collections.practice;
public class ThisKeyword {
    int age = 20;

    public void display() {
        int age = 7;
        System.out.println(age);
        System.out.println(this.age);
    }
    public void read()
        {
            int age =10;
            System.out.println(age);
            System.out.println(this.age);
        }

    public static void main(String[] args) {
        ThisKeyword s1 = new ThisKeyword();
        ThisKeyword s2 = new ThisKeyword();
        s1.display();
        s2.read();
    }
}