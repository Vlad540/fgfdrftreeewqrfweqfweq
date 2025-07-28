package defpackage;

/* renamed from: cib  reason: default package */
public final class cib extends gr8 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public cib() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? o13.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            e += o13.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            e += o13.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f) ? e + o13.e(4) : e;
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
            } else if (s == 29) {
                this.c = n13.i();
            } else if (s == 37) {
                this.d = n13.i();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            o13.v(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            o13.v(4, this.d);
        }
    }
}
