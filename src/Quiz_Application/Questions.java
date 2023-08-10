package Quiz_Application;

public class Questions{
    String ques;
    String a;
    String b;
    String c;
    String d;
    String ans;

    public Questions(String ques, String a, String b, String c, String d, String ans) {
        this.ques = ques;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.ans = ans;
    }

    public void display(){
        System.out.println(ques);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
