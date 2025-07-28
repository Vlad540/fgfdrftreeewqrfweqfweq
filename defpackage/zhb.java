package defpackage;

/* renamed from: zhb  reason: default package */
public final class zhb extends gr8 {
    public aib[] a;
    public whb[] b;
    public cib c;
    public boolean d;

    public final int computeSerializedSize() {
        int i;
        aib[] aibArr = this.a;
        int i2 = 0;
        if (aibArr != null && aibArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                gr8[] gr8Arr = this.a;
                if (i3 >= gr8Arr.length) {
                    break;
                }
                gr8 gr8 = gr8Arr[i3];
                if (gr8 != null) {
                    i += o13.i(1, gr8);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        whb[] whbArr = this.b;
        if (whbArr != null && whbArr.length > 0) {
            while (true) {
                gr8[] gr8Arr2 = this.b;
                if (i2 >= gr8Arr2.length) {
                    break;
                }
                gr8 gr82 = gr8Arr2[i2];
                if (gr82 != null) {
                    i = o13.i(2, gr82) + i;
                }
                i2++;
            }
        }
        cib cib = this.c;
        if (cib != null) {
            i += o13.i(3, cib);
        }
        return this.d ? i + o13.a(4) : i;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int z = iu7.z(n13, 10);
                aib[] aibArr = this.a;
                int length = aibArr == null ? 0 : aibArr.length;
                int i = z + length;
                aib[] aibArr2 = new aib[i];
                if (length != 0) {
                    System.arraycopy(aibArr, 0, aibArr2, 0, length);
                }
                while (length < i - 1) {
                    aib aib = new aib();
                    aibArr2[length] = aib;
                    n13.j(aib);
                    n13.s();
                    length++;
                }
                aib aib2 = new aib();
                aibArr2[length] = aib2;
                n13.j(aib2);
                this.a = aibArr2;
            } else if (s == 18) {
                int z2 = iu7.z(n13, 18);
                whb[] whbArr = this.b;
                int length2 = whbArr == null ? 0 : whbArr.length;
                int i2 = z2 + length2;
                whb[] whbArr2 = new whb[i2];
                if (length2 != 0) {
                    System.arraycopy(whbArr, 0, whbArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    whb whb = new whb();
                    whbArr2[length2] = whb;
                    n13.j(whb);
                    n13.s();
                    length2++;
                }
                whb whb2 = new whb();
                whbArr2[length2] = whb2;
                n13.j(whb2);
                this.b = whbArr2;
            } else if (s == 26) {
                if (this.c == null) {
                    this.c = new cib();
                }
                n13.j(this.c);
            } else if (s == 32) {
                this.d = n13.f();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        aib[] aibArr = this.a;
        int i = 0;
        if (aibArr != null && aibArr.length > 0) {
            int i2 = 0;
            while (true) {
                gr8[] gr8Arr = this.a;
                if (i2 >= gr8Arr.length) {
                    break;
                }
                gr8 gr8 = gr8Arr[i2];
                if (gr8 != null) {
                    o13.y(1, gr8);
                }
                i2++;
            }
        }
        whb[] whbArr = this.b;
        if (whbArr != null && whbArr.length > 0) {
            while (true) {
                gr8[] gr8Arr2 = this.b;
                if (i >= gr8Arr2.length) {
                    break;
                }
                gr8 gr82 = gr8Arr2[i];
                if (gr82 != null) {
                    o13.y(2, gr82);
                }
                i++;
            }
        }
        cib cib = this.c;
        if (cib != null) {
            o13.y(3, cib);
        }
        boolean z = this.d;
        if (z) {
            o13.r(4, z);
        }
    }
}
