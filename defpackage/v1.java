package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: v1  reason: default package */
public final class v1 extends u1 implements ListIterator {
    public final /* synthetic */ x1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, int i) {
        super(0, x1Var);
        this.o = x1Var;
        int size = x1Var.getSize();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, size, ", size: "));
        }
        this.b = i;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return this.o.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
