package defpackage;

/* renamed from: whb  reason: default package */
public final class whb extends gr8 {
    public static volatile whb[] c;
    public int a = 0;
    public int b = 0;

    public whb() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? o13.f(1, i) : 0;
        int i2 = this.b;
        return i2 != 0 ? f + o13.f(2, i2) : f;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = n13.p();
                if (p == 0) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = n13.p();
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
    }
}
