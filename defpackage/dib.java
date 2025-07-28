package defpackage;

/* renamed from: dib  reason: default package */
public final class dib extends gr8 {
    public float a;
    public float b;
    public int c;
    public boolean d;

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? o13.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            e += o13.e(2);
        }
        int i = this.c;
        if (i != 0) {
            e += o13.f(3, i);
        }
        return this.d ? e + o13.a(4) : e;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 13) {
                this.a = n13.i();
            } else if (s == 21) {
                this.b = n13.i();
            } else if (s == 24) {
                this.c = n13.p();
            } else if (s == 32) {
                this.d = n13.f();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            o13.v(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            o13.v(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            o13.w(3, i);
        }
        boolean z = this.d;
        if (z) {
            o13.r(4, z);
        }
    }
}
