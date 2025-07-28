package defpackage;

/* renamed from: fib  reason: default package */
public final class fib extends gr8 {
    public static volatile fib[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public gt5 d = null;

    public fib() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? o13.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += o13.f(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += o13.f(3, i3);
        }
        gt5 gt5 = this.d;
        return gt5 != null ? f + o13.i(4, gt5) : f;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = n13.p();
            } else if (s == 16) {
                this.b = n13.p();
            } else if (s == 24) {
                this.c = n13.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new gt5(3);
                }
                n13.j(this.d);
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        int i = this.a;
        if (i != 0) {
            o13.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            o13.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            o13.w(3, i3);
        }
        gt5 gt5 = this.d;
        if (gt5 != null) {
            o13.y(4, gt5);
        }
    }
}
