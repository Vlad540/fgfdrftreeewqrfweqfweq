package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;

/* renamed from: gyc  reason: default package */
public final class gyc implements Iterator, Continuation, z67 {
    public int a;
    public Object b;
    public Iterator c;
    public Continuation o;

    public final RuntimeException a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(Object obj, Continuation continuation) {
        this.b = obj;
        this.a = 3;
        this.o = continuation;
    }

    public final hu3 getContext() {
        return bw4.a;
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                } else if (this.c.hasNext()) {
                    this.a = 2;
                    return true;
                } else {
                    this.c = null;
                }
            }
            this.a = 5;
            Continuation continuation = this.o;
            this.o = null;
            continuation.resumeWith(jue.a);
        }
    }

    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.a = 1;
            return this.c.next();
        } else if (i == 3) {
            this.a = 0;
            Object obj = this.b;
            this.b = null;
            return obj;
        } else {
            throw a();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        wx3.H(obj);
        this.a = 4;
    }
}
