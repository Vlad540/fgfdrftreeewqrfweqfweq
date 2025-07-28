package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v66  reason: default package */
public final class v66 implements Iterator, z67 {
    public final /* synthetic */ int a = 2;
    public int b;
    public Object c;
    public final /* synthetic */ dyc o;

    public v66(ij4 ij4) {
        this.o = ij4;
        this.c = ((dyc) ij4.c).iterator();
    }

    public void a() {
        int i = this.b;
        ij4 ij4 = (ij4) this.o;
        Object invoke = i == -2 ? ((s16) ij4.c).invoke() : ((u16) ij4.b).invoke(this.c);
        this.c = invoke;
        this.b = invoke == null ? 0 : 1;
    }

    public final boolean hasNext() {
        x0e x0e;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            case 1:
                break;
            default:
                return ((Iterator) this.c).hasNext();
        }
        while (true) {
            int i = this.b;
            x0e = (x0e) this.o;
            int i2 = x0e.b;
            it = (Iterator) this.c;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.b++;
            }
        }
        return this.b < x0e.c && it.hasNext();
    }

    public final Object next() {
        x0e x0e;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b != 0) {
                    Object obj = this.c;
                    this.b = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                break;
            default:
                i26 i26 = (i26) ((ij4) this.o).b;
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return i26.invoke(Integer.valueOf(i), ((Iterator) this.c).next());
                }
                p23.G();
                throw null;
        }
        while (true) {
            int i2 = this.b;
            x0e = (x0e) this.o;
            int i3 = x0e.b;
            it = (Iterator) this.c;
            if (i2 >= i3 || !it.hasNext()) {
                int i4 = this.b;
            } else {
                it.next();
                this.b++;
            }
        }
        int i42 = this.b;
        if (i42 < x0e.c) {
            this.b = i42 + 1;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v66(x0e x0e) {
        this.o = x0e;
        this.c = x0e.a.iterator();
    }

    public v66(ij4 ij4, byte b2) {
        this.o = ij4;
        this.b = -2;
    }
}
