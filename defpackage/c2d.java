package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: c2d  reason: default package */
public final class c2d {
    public static final List j = Arrays.asList(new Integer[]{1, 5, 3});
    public final List a;
    public final ra0 b;
    public final List c;
    public final List d;
    public final List e;
    public final a2d f;
    public final pw1 g;
    public final int h;
    public final InputConfiguration i;

    public c2d(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, pw1 pw1, a2d a2d, InputConfiguration inputConfiguration, int i2, ra0 ra0) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = a2d;
        this.g = pw1;
        this.i = inputConfiguration;
        this.h = i2;
        this.b = ra0;
    }

    public static c2d a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        fc9 c2 = fc9.c();
        ArrayList arrayList5 = new ArrayList();
        nc9 a2 = nc9.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        hga a3 = hga.a(c2);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        return new c2d(arrayList, arrayList2, arrayList3, arrayList4, new pw1(arrayList6, a3, -1, false, arrayList7, false, new s9e(arrayMap), (ws1) null), (a2d) null, (InputConfiguration) null, 0, (ra0) null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (ra0 ra0 : this.a) {
            arrayList.add(ra0.a);
            for (xc4 add : ra0.b) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
