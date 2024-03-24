//Assignment 1



import java.util.util;

class Person {
    String name;
    int mobno;

    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and phone no");
        name = sc.next();
        mobno = sc.nextInt();
    }

    Person(String name, int mobno) {
        this.name = name;
        this.mobno = mobno;
        System.out.println("Name: " + name + " Mobile no: " + mobno);
    }
}

class Ap extends Person {
    String grade;
    int per;
    int[] m = new int[5];

    Ap() {
        super(); // Call the superclass constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degree");
        grade = sc.next();
        marks();
    }

    void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 sub");
        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += m[i];
        }
        per = (total / 5);
        System.out.println("Percentage is " + per);
    }
}

class Sp extends Person {
    String sportName;
    int score;

    Sp() {
        super(); // Call the superclass constructor                       
        info();
    }

    void info() {
        Scanner sc = new Scanner(System.in);
        System.out.print("For the Sports performance");
        System.out.println("Enter sport name");
        sportName = sc.next();
        System.out.println("Enter score");
        score = sc.nextInt();
    }
}

class Demo {
    public static void main(String[] args) {
        Ap a = new Ap();
        Sp s = new Sp();
    }
}

         
     
