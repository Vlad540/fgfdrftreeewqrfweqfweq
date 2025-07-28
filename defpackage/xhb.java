package defpackage;

/* renamed from: xhb  reason: default package */
public final class xhb extends gr8 {
    public cib a;
    public float b;
    public float[] c;

    public final int computeSerializedSize() {
        cib cib = this.a;
        int i = cib != null ? o13.i(1, cib) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            i += o13.e(2);
        }
        float[] fArr = this.c;
        return (fArr == null || fArr.length <= 0) ? i : (fArr.length * 4) + i + fArr.length;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                if (this.a == null) {
                    this.a = new cib();
                }
                n13.j(this.a);
            } else if (s == 21) {
                this.b = n13.i();
            } else if (s == 26) {
                int p = n13.p();
                int e = n13.e(p);
                int i = p / 4;
                float[] fArr = this.c;
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
                this.c = fArr2;
                n13.d(e);
            } else if (s == 29) {
                int z = iu7.z(n13, 29);
                float[] fArr3 = this.c;
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
                this.c = fArr4;
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        cib cib = this.a;
        if (cib != null) {
            o13.y(1, cib);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            o13.v(2, this.b);
        }
        float[] fArr = this.c;
        if (fArr != null && fArr.length > 0) {
            int i = 0;
            while (true) {
                float[] fArr2 = this.c;
                if (i < fArr2.length) {
                    o13.v(3, fArr2[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
