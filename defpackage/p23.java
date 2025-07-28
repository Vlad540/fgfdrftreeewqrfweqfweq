package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: p23  reason: default package */
public abstract class p23 extends hwf {
    public static int A(List list) {
        return list.size() - 1;
    }

    public static List B(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : hw4.a;
    }

    public static ArrayList C(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new kr(objArr, true));
    }

    public static final List D(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : hw4.a;
    }

    public static final void E(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(rf0.g("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(rf0.f(i2, "fromIndex (", ") is less than zero."));
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException(rf0.g("toIndex (", i3, ") is greater than size (", i, ")."));
        }
    }

    public static void F() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void G() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
