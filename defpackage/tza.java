package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: tza  reason: default package */
public final class tza extends uje {
    public final int X;
    public final int[] Y;
    public final int[] Z;
    public final int b;
    public final xed c;
    public final int o;
    public final uje[] w0;
    public final Object[] x0;
    public final HashMap y0 = new HashMap();

    public tza(Collection collection, xed xed) {
        this.c = xed;
        this.b = xed.b.length;
        int size = collection.size();
        this.Y = new int[size];
        this.Z = new int[size];
        this.w0 = new uje[size];
        this.x0 = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            df8 df8 = (df8) it.next();
            this.w0[i3] = df8.b();
            this.Z[i3] = i;
            this.Y[i3] = i2;
            i += this.w0[i3].p();
            i2 += this.w0[i3].i();
            this.x0[i3] = df8.a();
            this.y0.put(this.x0[i3], Integer.valueOf(i3));
            i3++;
        }
        this.o = i;
        this.X = i2;
    }

    public final int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            uje[] ujeArr = this.w0;
            if (ujeArr[i].q()) {
                i = r(i, z);
            } else {
                return ujeArr[i].a(z) + this.Z[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int b(Object obj) {
        int b2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.y0.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b2 = this.w0[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.Y[intValue] + b2;
    }

    public final int c(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            uje[] ujeArr = this.w0;
            if (ujeArr[i].q()) {
                i = s(i, z);
            } else {
                return ujeArr[i].c(z) + this.Z[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int c2 = mze.c(i + 1, iArr);
        int i3 = iArr[c2];
        uje[] ujeArr = this.w0;
        int e = ujeArr[c2].e(i - i3, i2 == 2 ? 0 : i2, z);
        if (e != -1) {
            return i3 + e;
        }
        int r = r(c2, z);
        while (r != -1 && ujeArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return ujeArr[r].a(z) + iArr[r];
        } else if (i2 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    public final pje g(int i, pje pje, boolean z) {
        int[] iArr = this.Y;
        int c2 = mze.c(i + 1, iArr);
        int i2 = this.Z[c2];
        this.w0[c2].g(i - iArr[c2], pje, z);
        pje.c += i2;
        if (z) {
            Object obj = this.x0[c2];
            Object obj2 = pje.b;
            obj2.getClass();
            pje.b = Pair.create(obj, obj2);
        }
        return pje;
    }

    public final pje h(Object obj, pje pje) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.y0.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.Z[intValue];
        this.w0[intValue].h(obj3, pje);
        pje.c += i;
        pje.b = obj;
        return pje;
    }

    public final int i() {
        return this.X;
    }

    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int c2 = mze.c(i + 1, iArr);
        int i3 = iArr[c2];
        uje[] ujeArr = this.w0;
        int l = ujeArr[c2].l(i - i3, i2 == 2 ? 0 : i2, z);
        if (l != -1) {
            return i3 + l;
        }
        int s = s(c2, z);
        while (s != -1 && ujeArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return ujeArr[s].c(z) + iArr[s];
        } else if (i2 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    public final Object m(int i) {
        int[] iArr = this.Y;
        int c2 = mze.c(i + 1, iArr);
        return Pair.create(this.x0[c2], this.w0[c2].m(i - iArr[c2]));
    }

    public final sje n(int i, sje sje, long j) {
        int[] iArr = this.Z;
        int c2 = mze.c(i + 1, iArr);
        int i2 = iArr[c2];
        int i3 = this.Y[c2];
        this.w0[c2].n(i - i2, sje, j);
        Object obj = this.x0[c2];
        if (!sje.G0.equals(sje.a)) {
            obj = Pair.create(obj, sje.a);
        }
        sje.a = obj;
        sje.D0 += i3;
        sje.E0 += i3;
        return sje;
    }

    public final int p() {
        return this.o;
    }

    public final int r(int i, boolean z) {
        if (z) {
            xed xed = this.c;
            int i2 = xed.c[i] + 1;
            int[] iArr = xed.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i < this.b - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i, boolean z) {
        if (z) {
            xed xed = this.c;
            int i2 = xed.c[i] - 1;
            if (i2 >= 0) {
                return xed.b[i2];
            }
            return -1;
        } else if (i > 0) {
            return i - 1;
        } else {
            return -1;
        }
    }
}
