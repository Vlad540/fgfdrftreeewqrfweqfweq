package defpackage;

/* renamed from: yhb  reason: default package */
public final class yhb extends gr8 {
    public static volatile yhb[] c;
    public int a = 0;
    public float[] b = iu7.m;

    public yhb() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? o13.f(1, i) : 0;
        float[] fArr = this.b;
        return (fArr == null || fArr.length <= 0) ? f : (fArr.length * 4) + f + fArr.length;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = n13.p();
                if (p == 0 || p == 1) {
                    this.a = p;
                }
            } else if (s == 18) {
                int p2 = n13.p();
                int e = n13.e(p2);
                int i = p2 / 4;
                float[] fArr = this.b;
                int length = fArr == null ? 0 : fArr.length;
                int i2 = i + length;
                float[] fArr2 = new float[i2];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i2) {
                    fArr2[length] = n13.i();
                    length++;
                }
                this.b = fArr2;
                n13.d(e);
            } else if (s == 21) {
                int z = iu7.z(n13, 21);
                float[] fArr3 = this.b;
                int length2 = fArr3 == null ? 0 : fArr3.length;
                int i3 = z + length2;
                float[] fArr4 = new float[i3];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i3 - 1) {
                    fArr4[length2] = n13.i();
                    n13.s();
                    length2++;
                }
                fArr4[length2] = n13.i();
                this.b = fArr4;
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
        float[] fArr = this.b;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.b;
                if (i2 < fArr2.length) {
                    o13.v(2, fArr2[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
