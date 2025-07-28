package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ez6  reason: default package */
public final class ez6 implements Iterator, z67 {
    public final int a;
    public final int b;
    public boolean c;
    public int o;

    public ez6(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.o = !z ? i2 : i;
    }

    public final int a() {
        int i = this.o;
        if (i != this.b) {
            this.o = this.a + i;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
