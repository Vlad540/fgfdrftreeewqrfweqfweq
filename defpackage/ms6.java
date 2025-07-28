package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: ms6  reason: default package */
public abstract class ms6 {
    public boolean a;
    public int b = 0;
    public Object[] c;

    public ms6(int i) {
        ete.l(i, "initialCapacity");
        this.c = new Object[i];
    }

    public static int h(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public void a(Object obj) {
        obj.getClass();
        i(this.b + 1);
        Object[] objArr = this.c;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public void b(Object... objArr) {
        int length = objArr.length;
        e07.n(length, objArr);
        i(this.b + length);
        System.arraycopy(objArr, 0, this.c, this.b, length);
        this.b += length;
    }

    public abstract ms6 c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            i(collection.size() + this.b);
            if (collection instanceof ns6) {
                this.b = ((ns6) collection).b(this.b, this.c);
                return;
            }
        }
        for (Object c2 : iterable) {
            c(c2);
        }
    }

    public void f(Iterable iterable) {
        e(iterable);
    }

    public abstract void g(ok okVar, vde vde);

    public void i(int i) {
        Object[] objArr = this.c;
        if (objArr.length < i) {
            this.c = Arrays.copyOf(objArr, h(objArr.length, i));
            this.a = false;
        } else if (this.a) {
            this.c = (Object[]) objArr.clone();
            this.a = false;
        }
    }
}
