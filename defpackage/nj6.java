package defpackage;

import java.util.Map;

/* renamed from: nj6  reason: default package */
public final class nj6 extends wjc {
    public final Map H;
    public xn4 I;

    public nj6(l34 l34, no4 no4, fo4 fo4, Map map) {
        super(l34, no4, fo4);
        this.H = map;
    }

    public final xu5 l(xu5 xu5) {
        xn4 xn4;
        xn4 xn42 = this.I;
        if (xn42 == null) {
            xn42 = xu5.r;
        }
        if (!(xn42 == null || (xn4 = (xn4) this.H.get(xn42.c)) == null)) {
            xn42 = xn4;
        }
        a39 a39 = xu5.k;
        a39 a392 = null;
        if (a39 != null) {
            x29[] x29Arr = a39.a;
            int length = x29Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                x29 x29 = x29Arr[i2];
                if ((x29 instanceof z3b) && "com.apple.streaming.transportStreamTimestamp".equals(((z3b) x29).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    x29[] x29Arr2 = new x29[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            x29Arr2[i < i2 ? i : i - 1] = x29Arr[i];
                        }
                        i++;
                    }
                    a392 = new a39(x29Arr2);
                }
            }
            if (!(xn42 == xu5.r && a39 == xu5.k)) {
                uu5 a = xu5.a();
                a.q = xn42;
                a.j = a39;
                xu5 = a.a();
            }
            return super.l(xu5);
        }
        a39 = a392;
        uu5 a2 = xu5.a();
        a2.q = xn42;
        a2.j = a39;
        xu5 = a2.a();
        return super.l(xu5);
    }
}
