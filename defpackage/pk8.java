package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: pk8  reason: default package */
public final class pk8 implements dk8, dl8 {
    public final ap3 a;
    public final bv2 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final ContextScope f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final grd h;
    public final grd i;
    public final grd j;
    public final t0c k;
    public final hcd l;

    public pk8(ap3 ap3, bv2 bv2, yi8 yi8, pae pae, t97 t97, t97 t972, r7e r7e) {
        this.a = ap3;
        this.b = bv2;
        this.c = t97;
        this.d = t972;
        this.e = r7e;
        ContextScope a2 = n1g.a(((n3a) pae).b());
        this.f = a2;
        hw4 hw4 = hw4.a;
        this.h = hrd.a(hw4);
        this.i = hrd.a(hw4);
        grd a3 = hrd.a(hw4);
        this.j = a3;
        this.k = new t0c(a3);
        this.l = icd.b(0, 0, 0, 7);
        ez3.N(new ck5(yi8.c, new fk8(this, (Continuation) null), 5), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.pk8 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.lk8
            if (r0 == 0) goto L_0x0016
            r0 = r6
            lk8 r0 = (defpackage.lk8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            lk8 r0 = new lk8
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            pk8 r1 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x0066
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            pk8 r5 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x0051
        L_0x003f:
            defpackage.wx3.H(r6)
            r0.o = r5
            r0.w0 = r4
            ap3 r6 = r5.a
            di3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L_0x0051
            goto L_0x0092
        L_0x0051:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            grd r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.w0 = r3
            r4.setValue(r2)
            jue r2 = defpackage.jue.a
            if (r2 != r1) goto L_0x0064
            goto L_0x0092
        L_0x0064:
            r1 = r5
            r5 = r6
        L_0x0066:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            es r6 = new es
            r2 = 2
            r6.<init>(r2, r5)
            xz6 r5 = new xz6
            r2 = 13
            r5.<init>(r2)
            sg5 r5 = defpackage.myc.M(r6, r5)
            t97 r6 = r1.e
            java.lang.Object r6 = r6.getValue()
            mta r6 = (defpackage.mta) r6
            hu3 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r1 = defpackage.n1g.a(r0)
            nb r2 = new nb
            r3 = 1
            r2.<init>(r1, r0, r6, r3)
            vqe r1 = new vqe
            r1.<init>(r5, r2)
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk8.a(pk8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[LOOP:0: B:20:0x0088->B:22:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable b(defpackage.pk8 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.nk8
            if (r0 == 0) goto L_0x0016
            r0 = r6
            nk8 r0 = (defpackage.nk8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            nk8 r0 = new nk8
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            pk8 r1 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            pk8 r5 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x005c
        L_0x003f:
            defpackage.wx3.H(r6)
            r0.o = r5
            r0.w0 = r4
            bv2 r6 = r5.b
            aw2 r6 = (aw2) r6
            t52 r6 = r6.l()
            ak0 r2 = new ak0
            r4 = 23
            r2.<init>(r4)
            java.util.ArrayList r6 = r6.w(r2)
            if (r6 != r1) goto L_0x005c
            goto L_0x00a2
        L_0x005c:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            grd r4 = r5.i
            r0.o = r5
            r0.X = r6
            r0.w0 = r3
            r4.setValue(r2)
            jue r2 = defpackage.jue.a
            if (r2 != r1) goto L_0x006f
            goto L_0x00a2
        L_0x006f:
            r1 = r5
            r5 = r6
        L_0x0071:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            hu3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r6 = defpackage.n1g.a(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.q23.H(r5, r2)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0088:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r5.next()
            mk8 r3 = new mk8
            r4 = 0
            r3.<init>(r2, r4, r1)
            r2 = 3
            zc4 r2 = defpackage.xs7.d(r6, r4, r3, r2)
            r0.add(r2)
            goto L_0x0088
        L_0x00a1:
            r1 = r0
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk8.b(pk8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static final ArrayList c(pk8 pk8, List list, String str) {
        pk8.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            tf3 tf3 = (tf3) next;
            if (!p0e.Q(String.valueOf(tf3.o()), str, false)) {
                t97 t97 = pk8.d;
                if (!((gsc) t97.getValue()).h(String.valueOf(tf3.d()), str)) {
                    String b2 = ehe.b(tf3.g());
                    if (b2 != null) {
                        if (!((gsc) t97.getValue()).h(b2, str)) {
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
