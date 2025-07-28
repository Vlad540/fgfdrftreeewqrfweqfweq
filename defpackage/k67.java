package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* renamed from: k67  reason: default package */
public final class k67 extends o67 {
    public final k67 c;
    public final nxc d;
    public k67 e;
    public String f;
    public int g;
    public int h;

    public k67(k67 k67, nxc nxc, int i, int i2, int i3) {
        this.c = k67;
        this.d = nxc;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = -1;
    }

    public final String a() {
        return this.f;
    }

    public final k67 f(int i, int i2) {
        k67 k67 = this.e;
        nxc nxc = null;
        if (k67 == null) {
            nxc nxc2 = this.d;
            if (nxc2 != null) {
                nxc = new nxc(nxc2.b);
            }
            k67 = new k67(this, nxc, 1, i, i2);
            this.e = k67;
        } else {
            k67.a = 1;
            k67.b = -1;
            k67.g = i;
            k67.h = i2;
            k67.f = null;
            nxc nxc3 = k67.d;
            if (nxc3 != null) {
                nxc3.a = null;
                nxc3.c = null;
                nxc3.o = null;
            }
        }
        return k67;
    }

    public final k67 g(int i, int i2) {
        k67 k67 = this.e;
        nxc nxc = null;
        if (k67 == null) {
            nxc nxc2 = this.d;
            if (nxc2 != null) {
                nxc = new nxc(nxc2.b);
            }
            k67 k672 = new k67(this, nxc, 2, i, i2);
            this.e = k672;
            return k672;
        }
        k67.a = 2;
        k67.b = -1;
        k67.g = i;
        k67.h = i2;
        k67.f = null;
        nxc nxc3 = k67.d;
        if (nxc3 != null) {
            nxc3.a = null;
            nxc3.c = null;
            nxc3.o = null;
        }
        return k67;
    }

    public final void h(String str) {
        this.f = str;
        nxc nxc = this.d;
        if (nxc != null && nxc.M(str)) {
            Object obj = nxc.b;
            throw new StreamReadException(obj instanceof i67 ? (i67) obj : null, wn6.i("Duplicate field '", str, "'"));
        }
    }
}
