package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: qv4  reason: default package */
public final class qv4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uv4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qv4(uv4 uv4, Continuation continuation) {
        super(2, continuation);
        this.Y = uv4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qv4) n((ese) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qv4 qv4 = new qv4(this.Y, continuation);
        qv4.X = obj;
        return qv4;
    }

    public final Object o(Object obj) {
        boolean z;
        grd grd;
        long j;
        long j2;
        ph phVar;
        Object obj2;
        boolean z2 = true;
        wx3.H(obj);
        ese ese = (ese) this.X;
        List list = (List) ese.a;
        List list2 = (List) ese.b;
        List list3 = (List) ese.c;
        uv4 uv4 = this.Y;
        k77[] k77Arr = uv4.z0;
        uv4.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            z = false;
            ku4 ku4 = null;
            if (!it.hasNext()) {
                break;
            }
            vu4 vu4 = (f2c) it.next();
            r2c r2c = vu4.a;
            if (r2c == r2c.c && (vu4 instanceof vu4)) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (hhd.f(((ku4) obj2).c, vu4.c)) {
                        break;
                    }
                }
                ku4 ku42 = (ku4) obj2;
                if (ku42 != null) {
                    ku4 = new ku4(jt4.RECENT.a, -ku42.b, ku42.c, ku42.o, ku42.X, ku42.Y);
                }
            } else if (r2c == r2c.Y && (phVar = (ph) ((gj) uv4.X.getValue()).i(vu4.b).getValue()) != null) {
                ku4 = uv4.q(list, phVar, jt4.RECENT.a, 0);
            }
            if (ku4 != null) {
                arrayList.add(ku4);
            }
        }
        String name = this.Y.getClass().getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, me4.g("Load emoji. Finish. emojis:", list.size(), list2.size(), ", recent:"), (Throwable) null);
        }
        uv4 uv42 = this.Y;
        uv42.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Integer valueOf = Integer.valueOf(((ku4) next).a);
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            grd = uv42.Y;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int intValue = ((Number) entry.getKey()).intValue();
            List list4 = (List) entry.getValue();
            m54 m54 = jt4.o;
            int intValue2 = ((Number) entry.getKey()).intValue();
            m54.getClass();
            jt4 n = m54.n(intValue2);
            int intValue3 = ((Number) entry.getKey()).intValue();
            arrayList2.add(new hx1(intValue, list4, !arrayList.isEmpty() || !list3.isEmpty() || ((sv4) grd.getValue()).a != Integer.MIN_VALUE ? ((sv4) grd.getValue()).a == ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() == jt4.CLASSIC.a, n, (String) null, (String) null, (lge) null, intValue3 == jt4.RECENT.a ? Long.MIN_VALUE : -9223372036854775807L + ((long) intValue3), 496));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (!list3.isEmpty()) {
            int i = 0;
            for (Object next2 : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    lj ljVar = (lj) next2;
                    boolean isEmpty = arrayList.isEmpty() ^ z2;
                    ArrayList arrayList4 = new ArrayList();
                    int i3 = jt4.ANIMOJI.a + i;
                    int size = ljVar.d.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        arrayList4.add(uv42.q(list, (ph) ljVar.d.get(i4), i3, i4));
                    }
                    jt4 jt4 = jt4.ANIMOJI;
                    lge lge = new lge(ljVar.a);
                    if (i3 == jt4.RECENT.a) {
                        j2 = Long.MIN_VALUE;
                        j = -9223372036854775807L;
                    } else {
                        j = -9223372036854775807L;
                        j2 = ((long) i3) - Long.MAX_VALUE;
                    }
                    arrayList3.add(0, new hx1(i3, arrayList4, isEmpty || ((sv4) grd.getValue()).a != Integer.MIN_VALUE ? ((sv4) grd.getValue()).a == i3 : i == 0, jt4, ljVar.b, ljVar.c, lge, j2, 384));
                    z = false;
                    i = i2;
                    long j3 = j;
                    z2 = true;
                } else {
                    p23.G();
                    throw null;
                }
            }
        }
        boolean z3 = z;
        if (!arrayList.isEmpty()) {
            int i5 = jt4.RECENT.a;
            jt4.o.getClass();
            arrayList3.add(z3 ? 1 : 0, new hx1(i5, arrayList, !(((sv4) grd.getValue()).a != Integer.MIN_VALUE ? true : z3), m54.n(i5), (String) null, (String) null, (lge) null, Long.MIN_VALUE, 496));
        }
        lg7 c = hwf.c();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            hx1 hx1 = (hx1) it4.next();
            c.add(hx1);
            c.addAll(hx1.b);
        }
        this.Y.x0.m((Object) null, new rv4(arrayList3, hwf.a(c)));
        return jue.a;
    }
}
