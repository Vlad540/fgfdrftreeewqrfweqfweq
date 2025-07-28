package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: sg4  reason: default package */
public final class sg4 {
    public static final lzc f;
    public final xwb a;
    public final dma b;
    public List c = Collections.emptyList();
    public Map d = Collections.emptyMap();
    public boolean e = false;

    /* JADX WARNING: type inference failed for: r0v0, types: [lzc, java.lang.Object] */
    static {
        ? obj = new Object();
        f = obj;
        obj.a = true;
    }

    public sg4(xwb xwb, iue iue) {
        this.a = xwb;
        this.b = iue;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [lzc, java.lang.Object] */
    public final void a(List list) {
        List<f31> emptyList = this.e ? Collections.emptyList() : this.c;
        HashMap hashMap = new HashMap();
        for (f31 f31 : emptyList) {
            hashMap.put(f31.a, f31);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f31 f312 = (f31) it.next();
            hashMap2.put(f312.a, f312);
        }
        ArrayList arrayList = new ArrayList();
        for (xm1 xm1 : hashMap2.keySet()) {
            f31 f313 = (f31) hashMap.get(xm1);
            f31 f314 = (f31) hashMap2.get(xm1);
            if (f314 != null && (f313 == null || !f313.b.equals(f314.b))) {
                xm1 xm12 = f314.a;
                o3f o3f = f314.b;
                ? obj = new Object();
                int i = 1;
                if (o3f.c != 1) {
                    i = 2;
                }
                obj.d = i;
                obj.b = o3f.a;
                obj.c = o3f.b;
                obj.a = false;
                arrayList.add(new mzc(xm12, obj));
            }
        }
        for (xm1 xm13 : hashMap.keySet()) {
            f31 f315 = (f31) hashMap.get(xm13);
            if (f315 != null && !hashMap2.containsKey(xm13)) {
                arrayList.add(new mzc(f315.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            gve gve = new gve(arrayList, z);
            dhc B = ((iue) this.b).F0.B();
            rg4 rg4 = new rg4(this, 0);
            rg4 rg42 = new rg4(this, 1);
            bhc bhc = new bhc((ahc) gve);
            bhc.c = rg4;
            bhc.d = rg42;
            B.d(new bhc(bhc));
        }
        this.c = list;
        HashMap hashMap3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f31 f316 = (f31) it2.next();
            ge1 ge1 = f316.a.b;
            Set set = (Set) hashMap3.get(ge1);
            if (set == null) {
                set = new HashSet();
                hashMap3.put(ge1, set);
            }
            set.add(f316.a);
        }
        this.d = hashMap3;
        this.e = false;
    }
}
