package defpackage;

/* renamed from: aib  reason: default package */
public final class aib extends gr8 {
    public static volatile aib[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public yhb[] e;

    public aib() {
        if (yhb.c == null) {
            synchronized (tz6.b) {
                try {
                    if (yhb.c == null) {
                        yhb.c = new yhb[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e = yhb.c;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int f2 = i != 0 ? o13.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            f2 += o13.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            f2 += o13.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            f2 += o13.e(4);
        }
        yhb[] yhbArr = this.e;
        if (yhbArr != null && yhbArr.length > 0) {
            while (true) {
                gr8[] gr8Arr = this.e;
                if (i2 >= gr8Arr.length) {
                    break;
                }
                gr8 gr8 = gr8Arr[i2];
                if (gr8 != null) {
                    f2 = o13.i(5, gr8) + f2;
                }
                i2++;
            }
        }
        return f2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = n13.p();
            } else if (s == 16) {
                int p = n13.p();
                if (p == 0) {
                    this.b = p;
                }
            } else if (s == 24) {
                this.c = n13.p();
            } else if (s == 37) {
                this.d = n13.i();
            } else if (s == 42) {
                int z = iu7.z(n13, 42);
                yhb[] yhbArr = this.e;
                int length = yhbArr == null ? 0 : yhbArr.length;
                int i = z + length;
                yhb[] yhbArr2 = new yhb[i];
                if (length != 0) {
                    System.arraycopy(yhbArr, 0, yhbArr2, 0, length);
                }
                while (length < i - 1) {
                    yhb yhb = new yhb();
                    yhbArr2[length] = yhb;
                    n13.j(yhb);
                    n13.s();
                    length++;
                }
                yhb yhb2 = new yhb();
                yhbArr2[length] = yhb2;
                n13.j(yhb2);
                this.e = yhbArr2;
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
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            o13.v(4, this.d);
        }
        yhb[] yhbArr = this.e;
        if (yhbArr != null && yhbArr.length > 0) {
            int i4 = 0;
            while (true) {
                gr8[] gr8Arr = this.e;
                if (i4 < gr8Arr.length) {
                    gr8 gr8 = gr8Arr[i4];
                    if (gr8 != null) {
                        o13.y(5, gr8);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
