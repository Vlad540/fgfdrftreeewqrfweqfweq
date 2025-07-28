package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: e71  reason: default package */
public final class e71 extends taf {
    public final t97 X;
    public final t97 Y = ez3.O(3, new c6(21, this));
    public final grd Z;
    public final t97 b;
    public final nxc c;
    public final we1 o;
    public final grd w0;
    public final grd x0;
    public final grd y0;
    public final grd z0;

    public e71(t97 t97, t97 t972, nxc nxc, we1 we1) {
        this.b = t972;
        this.c = nxc;
        this.o = we1;
        this.X = t97;
        grd a = hrd.a(new c71());
        this.Z = a;
        this.w0 = a;
        grd a2 = hrd.a(new sp1(hw4.a, false, false));
        this.x0 = a2;
        this.y0 = a2;
        grd a3 = hrd.a(Boolean.FALSE);
        this.z0 = a3;
        ez3.N(new ck5(a3, new b71(this, (Continuation) null), 5), this.a);
    }

    public final void q(long j, wg6 wg6) {
        grd grd;
        Object value;
        c71 c71;
        LinkedHashMap linkedHashMap;
        do {
            grd = this.Z;
            value = grd.getValue();
            c71 = (c71) value;
            linkedHashMap = new LinkedHashMap(c71.b);
            if (linkedHashMap.containsKey(Long.valueOf(j))) {
                wg6 wg62 = (wg6) linkedHashMap.remove(Long.valueOf(j));
            } else {
                wg6 wg63 = (wg6) linkedHashMap.put(Long.valueOf(j), wg6);
            }
        } while (!grd.b(value, new c71(linkedHashMap, c71.a)));
    }
}
