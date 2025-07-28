package defpackage;

import java.util.Map;

/* renamed from: mj6  reason: default package */
public final class mj6 extends vjc {
    public final Map H;
    public wn4 I;

    public mj6(l34 l34, mo4 mo4, eo4 eo4, Map map) {
        super(l34, mo4, eo4);
        this.H = map;
    }

    public final vu5 m(vu5 vu5) {
        wn4 wn4;
        wn4 wn42 = this.I;
        if (wn42 == null) {
            wn42 = vu5.D0;
        }
        if (!(wn42 == null || (wn4 = (wn4) this.H.get(wn42.c)) == null)) {
            wn42 = wn4;
        }
        y29 y29 = vu5.y0;
        y29 y292 = null;
        if (y29 != null) {
            w29[] w29Arr = y29.a;
            int length = w29Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                w29 w29 = w29Arr[i2];
                if ((w29 instanceof y3b) && "com.apple.streaming.transportStreamTimestamp".equals(((y3b) w29).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    w29[] w29Arr2 = new w29[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            w29Arr2[i < i2 ? i : i - 1] = w29Arr[i];
                        }
                        i++;
                    }
                    y292 = new y29(w29Arr2);
                }
            }
            if (!(wn42 == vu5.D0 && y29 == vu5.y0)) {
                tu5 a = vu5.a();
                a.n = wn42;
                a.i = y29;
                vu5 = a.a();
            }
            return super.m(vu5);
        }
        y29 = y292;
        tu5 a2 = vu5.a();
        a2.n = wn42;
        a2.i = y29;
        vu5 = a2.a();
        return super.m(vu5);
    }
}
