package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ur  reason: default package */
public final class ur implements Iterator, z67 {
    public final /* synthetic */ Object X;
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int o;

    public ur(int i) {
        this.a = i;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((yr) this.X).f(i);
            case 1:
                return ((yr) this.X).i(i);
            default:
                return ((bs) this.X).b[i];
        }
    }

    public final void b(int i) {
        switch (this.o) {
            case 0:
                ((yr) this.X).g(i);
                return;
            case 1:
                ((yr) this.X).g(i);
                return;
            default:
                ((bs) this.X).d(i);
                return;
        }
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = a(this.b);
            this.b++;
            this.c = true;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            b(i);
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ur(bs bsVar) {
        this(bsVar.c);
        this.o = 2;
        this.X = bsVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ur(yr yrVar, int i) {
        this(yrVar.c);
        this.o = i;
        switch (i) {
            case 1:
                this.X = yrVar;
                this(yrVar.c);
                return;
            default:
                this.X = yrVar;
                return;
        }
    }
}
