package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o1  reason: default package */
public abstract class o1 extends rue implements ListIterator {
    public final int b;
    public int c;

    public o1(int i, int i2) {
        super(0);
        a06.n(i2, i);
        this.b = i;
        this.c = i2;
    }

    public abstract Object a(int i);

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final boolean hasPrevious() {
        return this.c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.c;
            this.c = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.c - 1;
            this.c = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.c - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
