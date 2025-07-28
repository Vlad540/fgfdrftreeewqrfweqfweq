package defpackage;

/* renamed from: esf  reason: default package */
public abstract class esf {
    public final nsf a;
    public qy6[] b;

    public esf() {
        this(new nsf());
    }

    public final void a() {
        qy6[] qy6Arr = this.b;
        if (qy6Arr != null) {
            qy6 qy6 = qy6Arr[0];
            qy6 qy62 = qy6Arr[1];
            nsf nsf = this.a;
            if (qy62 == null) {
                qy62 = nsf.a.f(2);
            }
            if (qy6 == null) {
                qy6 = nsf.a.f(1);
            }
            f(qy6.a(qy6, qy62));
            qy6 qy63 = this.b[4];
            if (qy63 != null) {
                e(qy63);
            }
            qy6 qy64 = this.b[5];
            if (qy64 != null) {
                d(qy64);
            }
            qy6 qy65 = this.b[6];
            if (qy65 != null) {
                g(qy65);
            }
        }
    }

    public abstract nsf b();

    public void c(int i, qy6 qy6) {
        char c;
        if (this.b == null) {
            this.b = new qy6[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                qy6[] qy6Arr = this.b;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = 8;
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(wn6.h(i2, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c = 0;
                }
                qy6Arr[c] = qy6;
            }
        }
    }

    public abstract void d(qy6 qy6);

    public abstract void e(qy6 qy6);

    public abstract void f(qy6 qy6);

    public abstract void g(qy6 qy6);

    public void h(int i, boolean z) {
    }

    public esf(nsf nsf) {
        this.a = nsf;
    }
}
