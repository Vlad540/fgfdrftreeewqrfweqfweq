package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: jg7  reason: default package */
public final class jg7 implements ListIterator, z67 {
    public final r2 X;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int o;

    public jg7(lg7 lg7, int i) {
        this.X = lg7;
        this.b = i;
        this.c = -1;
        this.o = lg7.modCount;
    }

    public void a() {
        if (((kg7) this.X).X.modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                this.b = i + 1;
                kg7 kg7 = (kg7) this.X;
                kg7.add(i, obj);
                this.c = -1;
                this.o = kg7.modCount;
                return;
            default:
                b();
                int i2 = this.b;
                this.b = i2 + 1;
                lg7 lg7 = (lg7) this.X;
                lg7.add(i2, obj);
                this.c = -1;
                this.o = lg7.modCount;
                return;
        }
    }

    public void b() {
        if (((lg7) this.X).modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((kg7) this.X).c;
            default:
                return this.b < ((lg7) this.X).b;
        }
    }

    public final boolean hasPrevious() {
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
                a();
                int i = this.b;
                kg7 kg7 = (kg7) this.X;
                if (i < kg7.c) {
                    this.b = i + 1;
                    this.c = i;
                    return kg7.a[kg7.b + i];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i2 = this.b;
                lg7 lg7 = (lg7) this.X;
                if (i2 < lg7.b) {
                    this.b = i2 + 1;
                    this.c = i2;
                    return lg7.a[i2];
                }
                throw new NoSuchElementException();
        }
    }

    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final Object previous() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                if (i > 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    this.c = i2;
                    kg7 kg7 = (kg7) this.X;
                    return kg7.a[kg7.b + i2];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i3 = this.b;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.b = i4;
                    this.c = i4;
                    return ((lg7) this.X).a[i4];
                }
                throw new NoSuchElementException();
        }
    }

    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.b - 1;
            default:
                return this.b - 1;
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i != -1) {
                    kg7 kg7 = (kg7) this.X;
                    kg7.a(i);
                    this.b = this.c;
                    this.c = -1;
                    this.o = kg7.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            default:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    lg7 lg7 = (lg7) this.X;
                    lg7.a(i2);
                    this.b = this.c;
                    this.c = -1;
                    this.o = lg7.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i != -1) {
                    ((kg7) this.X).set(i, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            default:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((lg7) this.X).set(i2, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public jg7(kg7 kg7, int i) {
        this.X = kg7;
        this.b = i;
        this.c = -1;
        this.o = kg7.modCount;
    }
}
