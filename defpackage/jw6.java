package defpackage;

/* renamed from: jw6  reason: default package */
public final class jw6 extends gr8 {
    public iw6[] a;

    public jw6() {
        if (iw6.u == null) {
            synchronized (tz6.b) {
                try {
                    if (iw6.u == null) {
                        iw6.u = new iw6[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = iw6.u;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        iw6[] iw6Arr = this.a;
        int i = 0;
        if (iw6Arr == null || iw6Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            iw6[] iw6Arr2 = this.a;
            if (i >= iw6Arr2.length) {
                return i2;
            }
            iw6 iw6 = iw6Arr2[i];
            if (iw6 != null) {
                i2 = o13.i(1, iw6) + i2;
            }
            i++;
        }
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int z = iu7.z(n13, 10);
                iw6[] iw6Arr = this.a;
                int length = iw6Arr == null ? 0 : iw6Arr.length;
                int i = z + length;
                iw6[] iw6Arr2 = new iw6[i];
                if (length != 0) {
                    System.arraycopy(iw6Arr, 0, iw6Arr2, 0, length);
                }
                while (length < i - 1) {
                    iw6 iw6 = new iw6();
                    iw6Arr2[length] = iw6;
                    n13.j(iw6);
                    n13.s();
                    length++;
                }
                iw6 iw62 = new iw6();
                iw6Arr2[length] = iw62;
                n13.j(iw62);
                this.a = iw6Arr2;
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        iw6[] iw6Arr = this.a;
        if (iw6Arr != null && iw6Arr.length > 0) {
            int i = 0;
            while (true) {
                iw6[] iw6Arr2 = this.a;
                if (i < iw6Arr2.length) {
                    iw6 iw6 = iw6Arr2[i];
                    if (iw6 != null) {
                        o13.y(1, iw6);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
