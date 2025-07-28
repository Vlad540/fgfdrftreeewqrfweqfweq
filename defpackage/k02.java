package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

/* renamed from: k02  reason: default package */
public final class k02 extends ol implements qce {
    public final String X;
    public final int Y = 4;
    public final String o;

    public k02(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.X = str2;
    }

    public final void c(lbe lbe) {
        g99 g99 = (g99) lbe;
        zb9 c0 = m().c0(Collections.singletonList(g99.X));
        long[] jArr = c0.b;
        long[] jArr2 = c0.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            vo8 q = p().q(p().f(j2, ((j2b) r()).a.s(), g99.o));
                            String str = this.X;
                            if (!(str == null || str.length() == 0)) {
                                ((gy9) j()).n(j2, this.X, g99.c);
                            }
                            m().S(j2, g99.c, q);
                            l().c(new l02(this.a, j2));
                            return;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [wga, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public final ibe i() {
        gr3 gr3 = r1;
        gr3 gr32 = new gr3(2, (Long) null, hw4.a, this.o, (String) null, (String) null, (String) null, (d10) null, (String) null, (String) null, true, this.Y, (ym8) null, (String) null, false, false);
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        ? arrayList = new ArrayList(1);
        arrayList.add(gr3);
        obj.c = arrayList;
        return new pn2(0, 0, obj.a(), (Boolean) null, 0);
    }
}
