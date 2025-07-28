package defpackage;

import android.graphics.Bitmap;

/* renamed from: gz5  reason: default package */
public final class gz5 implements rm0 {
    public int a;
    public e13 b;

    public gz5(int i, e13 e13) {
        this.b = e13;
        this.a = i;
    }

    public synchronized void a() {
        e13.S(this.b);
        this.b = null;
        this.a = -1;
    }

    public synchronized void clear() {
        a();
    }

    public synchronized boolean p(int i) {
        return i == this.a && e13.n0(this.b);
    }

    public synchronized e13 q() {
        return e13.o(this.b);
    }

    public synchronized void r(int i, e13 e13) {
        try {
            if (this.b != null) {
                Object e0 = e13.e0();
                e13 e132 = this.b;
                if (e0.equals(e132 != null ? (Bitmap) e132.e0() : null)) {
                    return;
                }
            }
            e13.S(this.b);
            this.b = e13.o(e13);
            this.a = i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void s(int i, e13 e13) {
    }

    public synchronized e13 u() {
        e13 o;
        try {
            o = e13.o(this.b);
            a();
        } catch (Throwable th) {
            a();
            throw th;
        }
        return o;
    }

    public synchronized e13 v(int i) {
        return this.a == i ? e13.o(this.b) : null;
    }
}
