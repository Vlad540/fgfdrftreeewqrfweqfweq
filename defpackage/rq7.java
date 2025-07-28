package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rq7  reason: default package */
public final class rq7 implements Iterator, z67 {
    public final long a;
    public final long b;
    public boolean c;
    public long o;

    public rq7(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.o = !z ? j2 : j;
    }

    public final boolean hasNext() {
        return this.c;
    }

    public final Object next() {
        long j = this.o;
        if (j != this.b) {
            this.o = this.a + j;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return Long.valueOf(j);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
