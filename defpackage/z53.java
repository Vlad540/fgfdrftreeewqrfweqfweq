package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: z53  reason: default package */
public abstract class z53 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ b63 o;

    public z53(b63 b63) {
        this.o = b63;
        this.a = b63.X;
        this.b = b63.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        b63 b63 = this.o;
        if (b63.X != this.a) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object a2 = a(i);
            int i2 = this.b + 1;
            if (i2 >= b63.Y) {
                i2 = -1;
            }
            this.b = i2;
            return a2;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        b63 b63 = this.o;
        int i = b63.X;
        int i2 = this.a;
        if (i == i2) {
            int i3 = this.c;
            if (i3 >= 0) {
                this.a = i2 + 32;
                b63.remove(b63.i()[i3]);
                this.b--;
                this.c = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
