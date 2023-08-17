package org.example.internalclasses;

public class Extern {
    private int x;

    public void method1() {
        System.out.println("method1");
    }

    class Intern {
        public void method2() {
            System.out.println("method2");
            method1();
        }

        public void method3() {
            class InsideMethodIntern {
                public void show() {
                    System.out.printf("x=%d", x);
                }
            }

            InsideMethodIntern insideMethodIntern = new InsideMethodIntern();
            insideMethodIntern.show();
        }
    }
}
