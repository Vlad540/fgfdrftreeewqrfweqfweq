package defpackage;

import java.util.Iterator;

/* renamed from: vyc  reason: default package */
public final class vyc implements Iterator, z67 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ syc c;

    public vyc(syc syc, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = syc;
                this.b = syc.f();
                return;
            default:
                this.c = syc;
                this.b = syc.f();
                return;
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                syc syc = this.c;
                int f = syc.f();
                int i = this.b;
                this.b = i - 1;
                return syc.i(f - i);
            default:
                syc syc2 = this.c;
                int f2 = syc2.f();
                int i2 = this.b;
                this.b = i2 - 1;
                return syc2.g(f2 - i2);
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
