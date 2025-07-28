package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rp8  reason: default package */
public final class rp8 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public rp8(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
    }

    public static xm8 a(rp8 rp8, vo8 vo8) {
        rp8 rp82 = rp8;
        vo8 vo82 = vo8;
        rp8.getClass();
        vo8 vo83 = vo82.G0;
        sq8 sq8 = vo83 != null ? new sq8(vo82.E0, vo82.F0, a(rp82, vo83), vo82.H0, vo82.I0, vo82.N0, vo82.O0) : null;
        vo8 vo84 = vo82.P0;
        return new xm8(vo8, ((di3) rp82.a.getValue()).i(vo82.Y, true), sq8, vo84 != null ? a(rp82, vo84) : null, ((n1b) rp82.b.getValue()).c(vo82), (ir8) rp82.c.getValue(), (os8) rp82.d.getValue(), (ho2) rp82.e.getValue(), 0);
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (vo8) it.next()));
        }
        return arrayList2;
    }
}
