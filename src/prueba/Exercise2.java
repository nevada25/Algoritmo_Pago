package prueba;

import java.util.Stack;

class Exercise2 {

    public static <T> void reverseStack(Stack<T> p) {
        T e;
        if (!p.empty()) {
            e = p.pop();
            reverseStack(p);
            pushBottom(p, e);
        }
    }

    public static <T> void pushBottom(Stack<T> p, T e) {
        T a;
        if (!p.empty()) {
            a = p.pop();
            pushBottom(p, e);
            p.push(a);
        } else {
            p.push(e);
        }
    }
}
