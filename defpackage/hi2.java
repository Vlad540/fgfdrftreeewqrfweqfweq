package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: hi2  reason: default package */
public final class hi2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public hi2(xwb xwb) {
        this.a = xwb;
        this.b = new le4(0);
        this.c = new le4(0);
        this.d = new le4(0);
        this.e = new le4(0);
        this.f = new le4(0);
        this.g = new HashMap();
        this.h = new le4(0);
        this.i = new le4(0);
        this.j = new ygd();
    }

    public static long a(ArrayList arrayList, u16 u16) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) u16.invoke((cod) it.next());
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).longValue() != -1) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        long j2 = 0;
        while (it3.hasNext()) {
            j2 += ((Number) it3.next()).longValue();
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.hi2 r5, ym8 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.ei2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            ei2 r0 = (defpackage.ei2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            ei2 r0 = new ei2
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.wx3.H(r7)
            goto L_0x004e
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.wx3.H(r7)
            java.lang.Object r7 = r5.b
            pae r7 = (pae) r7
            n3a r7 = (defpackage.n3a) r7
            ju3 r7 = r7.b()
            fi2 r2 = new fi2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            java.lang.Object r7 = defpackage.xs7.U(r7, r2, r0)
            if (r7 != r1) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = r7
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi2.b(hi2, ym8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c() {
        ((le4) this.b).a = -1;
        ((le4) this.c).a = -1;
        ((le4) this.d).a = -1;
        ((le4) this.e).a = -1;
        ((le4) this.f).a = -1;
        ((HashMap) this.g).clear();
        ((le4) this.h).a = -1;
        ((le4) this.i).a = -1;
    }

    public void d(int i2, int i3) {
        grd grd;
        Object value;
        boolean z;
        boolean z2;
        do {
            grd = (grd) this.g;
            value = grd.getValue();
            yrc yrc = (yrc) value;
            urc urc = yrc instanceof urc ? (urc) yrc : urc.e;
            z = false;
            z2 = i3 != i2;
            if (1 != i2) {
                z = true;
            }
            urc.getClass();
        } while (!grd.b(value, new urc(i3, i2, z2, z)));
    }

    public void e(ds8 ds8) {
        xs7.E((ContextScope) this.c, (hu3) null, (ru3) null, new gi2(this, ds8.b, ds8, (Continuation) null), 3);
    }

    public void f() {
        grd grd;
        Object value;
        grd grd2;
        Object value2;
        do {
            grd = (grd) this.h;
            value = grd.getValue();
            cg6 cg6 = (cg6) value;
        } while (!grd.b(value, (Object) null));
        do {
            grd2 = (grd) this.g;
            value2 = grd2.getValue();
            yrc yrc = (yrc) value2;
            (yrc instanceof urc ? (urc) yrc : urc.e).getClass();
        } while (!grd2.b(value2, new urc(0, 0, false, false)));
    }

    public hi2(ki2 ki2, t97 t97, t97 t972, t97 t973, pae pae, qj qjVar) {
        this.a = ki2;
        this.b = pae;
        this.c = n1g.a(((n3a) pae).c().getImmediate().plus(qjVar));
        this.d = t97;
        this.e = t972;
        this.f = t973;
        grd a2 = hrd.a(vrc.a);
        this.g = a2;
        this.i = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.h = a3;
        this.j = new t0c(a3);
    }

    public hi2() {
        this.b = gt0.k();
        this.a = gt0.k();
        this.e = gt0.k();
        this.f = gt0.k();
        this.c = gt0.k();
        this.d = gt0.k();
        this.g = gt0.k();
        this.h = gt0.k();
        this.i = gt0.k();
    }
}
