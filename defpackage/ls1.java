package defpackage;

import android.content.Context;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: ls1  reason: default package */
public final class ls1 implements sye {
    public final si4 b;

    public ls1(Context context) {
        this.b = si4.b(context);
    }

    public final ia3 a(rye rye, int i) {
        int i2;
        int i3;
        rye rye2 = rye;
        int i4 = i;
        fc9 c = fc9.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        fc9 c2 = fc9.c();
        ArrayList arrayList = new ArrayList();
        nc9 a = nc9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = rye.ordinal();
        if (ordinal != 0) {
            i2 = ordinal != 3 ? 1 : 3;
        } else {
            i2 = i4 == 2 ? 5 : 1;
        }
        z80 z80 = pye.k0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        hga a2 = hga.a(c2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        c.j(z80, new c2d(arrayList5, arrayList6, arrayList7, arrayList8, new pw1(arrayList9, a2, i2, false, arrayList10, false, new s9e(arrayMap), (ws1) null), (a2d) null, (InputConfiguration) null, 0, (ra0) null));
        c.j(pye.m0, ks1.a);
        HashSet hashSet2 = new HashSet();
        fc9 c3 = fc9.c();
        ArrayList arrayList11 = new ArrayList();
        nc9 a3 = nc9.a();
        int ordinal2 = rye.ordinal();
        if (ordinal2 != 0) {
            i3 = ordinal2 != 3 ? 1 : 3;
        } else {
            i3 = i4 == 2 ? 5 : 2;
        }
        z80 z802 = pye.l0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        hga a4 = hga.a(c3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        s9e s9e2 = s9e.b;
        ArrayMap arrayMap2 = new ArrayMap();
        Map map2 = a3.a;
        for (String str2 : map2.keySet()) {
            arrayMap2.put(str2, map2.get(str2));
        }
        c.j(z802, new pw1(arrayList12, a4, i3, false, arrayList13, false, new s9e(arrayMap2), (ws1) null));
        c.j(pye.n0, rye2 == rye.a ? dq6.c : rr1.a);
        rye rye3 = rye.b;
        si4 si4 = this.b;
        if (rye2 == rye3) {
            c.j(br6.H, si4.e());
        }
        c.j(br6.C, Integer.valueOf(si4.c(true).getRotation()));
        if (rye2 == rye.o || rye2 == rye.X) {
            c.j(pye.q0, Boolean.TRUE);
        }
        return hga.a(c);
    }
}
