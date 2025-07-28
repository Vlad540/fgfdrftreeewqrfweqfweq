package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: et7  reason: default package */
public final class et7 extends gt7 implements Iterator, z67 {
    public final /* synthetic */ int X;

    public et7(int i, ht7 ht7) {
        this.X = i;
        this.o = ht7;
        this.b = -1;
        this.c = ht7.w0;
        f();
    }

    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i = this.a;
                ht7 ht7 = (ht7) this.o;
                if (i < ht7.Y) {
                    this.a = i + 1;
                    this.b = i;
                    ft7 ft7 = new ft7(i, ht7);
                    f();
                    return ft7;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i2 = this.a;
                ht7 ht72 = (ht7) this.o;
                if (i2 < ht72.Y) {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = ht72.a[i2];
                    f();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i3 = this.a;
                ht7 ht73 = (ht7) this.o;
                if (i3 < ht73.Y) {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object obj2 = ht73.b[i3];
                    f();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
