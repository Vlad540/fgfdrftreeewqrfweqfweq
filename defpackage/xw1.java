package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: xw1  reason: default package */
public final class xw1 {
    public final pw1 a;

    public xw1() {
        HashSet hashSet = new HashSet();
        fc9 c = fc9.c();
        ArrayList arrayList = new ArrayList();
        nc9 a2 = nc9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        hga a3 = hga.a(c);
        ArrayList arrayList3 = new ArrayList(arrayList);
        s9e s9e = s9e.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        this.a = new pw1(arrayList2, a3, -1, false, arrayList3, false, new s9e(arrayMap), (ws1) null);
    }
}
