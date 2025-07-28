package defpackage;

/* renamed from: lw6  reason: default package */
public final class lw6 extends gr8 {
    public kw6[] a;

    public lw6() {
        if (kw6.f == null) {
            synchronized (tz6.b) {
                try {
                    if (kw6.f == null) {
                        kw6.f = new kw6[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = kw6.f;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        kw6[] kw6Arr = this.a;
        int i = 0;
        if (kw6Arr == null || kw6Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            kw6[] kw6Arr2 = this.a;
            if (i >= kw6Arr2.length) {
                return i2;
            }
            kw6 kw6 = kw6Arr2[i];
            if (kw6 != null) {
                i2 = o13.i(1, kw6) + i2;
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
                kw6[] kw6Arr = this.a;
                int length = kw6Arr == null ? 0 : kw6Arr.length;
                int i = z + length;
                kw6[] kw6Arr2 = new kw6[i];
                if (length != 0) {
                    System.arraycopy(kw6Arr, 0, kw6Arr2, 0, length);
                }
                while (length < i - 1) {
                    kw6 kw6 = new kw6();
                    kw6Arr2[length] = kw6;
                    n13.j(kw6);
                    n13.s();
                    length++;
                }
                kw6 kw62 = new kw6();
                kw6Arr2[length] = kw62;
                n13.j(kw62);
                this.a = kw6Arr2;
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        kw6[] kw6Arr = this.a;
        if (kw6Arr != null && kw6Arr.length > 0) {
            int i = 0;
            while (true) {
                kw6[] kw6Arr2 = this.a;
                if (i < kw6Arr2.length) {
                    kw6 kw6 = kw6Arr2[i];
                    if (kw6 != null) {
                        o13.y(1, kw6);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
