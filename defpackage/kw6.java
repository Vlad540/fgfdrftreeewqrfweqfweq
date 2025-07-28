package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: kw6  reason: default package */
public final class kw6 extends gr8 {
    public static volatile kw6[] f;
    public String a = BuildConfig.FLAVOR;
    public String b = BuildConfig.FLAVOR;
    public int c = 0;
    public gt5 d = null;
    public mw6[] e = mw6.a();

    public kw6() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = 0;
        int l = !this.a.equals(BuildConfig.FLAVOR) ? o13.l(1, this.a) : 0;
        if (!this.b.equals(BuildConfig.FLAVOR)) {
            l += o13.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            l += o13.n(3, i2);
        }
        gt5 gt5 = this.d;
        if (gt5 != null) {
            l += o13.i(4, gt5);
        }
        mw6[] mw6Arr = this.e;
        if (mw6Arr != null && mw6Arr.length > 0) {
            while (true) {
                mw6[] mw6Arr2 = this.e;
                if (i >= mw6Arr2.length) {
                    break;
                }
                mw6 mw6 = mw6Arr2[i];
                if (mw6 != null) {
                    l = o13.i(17, mw6) + l;
                }
                i++;
            }
        }
        return l;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = n13.r();
            } else if (s == 18) {
                this.b = n13.r();
            } else if (s == 24) {
                this.c = n13.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new gt5(1);
                }
                n13.j(this.d);
            } else if (s == 138) {
                int z = iu7.z(n13, 138);
                mw6[] mw6Arr = this.e;
                int length = mw6Arr == null ? 0 : mw6Arr.length;
                int i = z + length;
                mw6[] mw6Arr2 = new mw6[i];
                if (length != 0) {
                    System.arraycopy(mw6Arr, 0, mw6Arr2, 0, length);
                }
                while (length < i - 1) {
                    mw6 mw6 = new mw6();
                    mw6Arr2[length] = mw6;
                    n13.j(mw6);
                    n13.s();
                    length++;
                }
                mw6 mw62 = new mw6();
                mw6Arr2[length] = mw62;
                n13.j(mw62);
                this.e = mw6Arr2;
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        if (!this.a.equals(BuildConfig.FLAVOR)) {
            o13.E(1, this.a);
        }
        if (!this.b.equals(BuildConfig.FLAVOR)) {
            o13.E(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            o13.G(3, i);
        }
        gt5 gt5 = this.d;
        if (gt5 != null) {
            o13.y(4, gt5);
        }
        mw6[] mw6Arr = this.e;
        if (mw6Arr != null && mw6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                mw6[] mw6Arr2 = this.e;
                if (i2 < mw6Arr2.length) {
                    mw6 mw6 = mw6Arr2[i2];
                    if (mw6 != null) {
                        o13.y(17, mw6);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
