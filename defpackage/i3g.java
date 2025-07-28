package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: i3g  reason: default package */
public final class i3g extends rue implements ListIterator {
    public final int b;
    public int c;
    public final k3g o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i3g(k3g k3g, int i) {
        super(1);
        int size = k3g.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(fja.H(i, size, "index"));
        }
        this.b = size;
        this.c = i;
        this.o = k3g;
    }

    public final Object a(int i) {
        return this.o.get(i);
    }

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
