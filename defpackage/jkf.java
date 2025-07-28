package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: jkf  reason: default package */
public final class jkf implements q57 {
    public final t97 a;
    public final Set b;
    public final us0 c;
    public jff d;

    public jkf(t97 t97) {
        this.a = t97;
        pz4 pz4 = hkf.Y;
        ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            arrayList.add(((hkf) u1Var.next()).a);
        }
        this.b = o23.w0(arrayList);
        this.c = xs7.a(0, 0, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.ikf
            if (r4 == 0) goto L_0x001b
            r4 = r3
            ikf r4 = (defpackage.ikf) r4
            int r5 = r4.w0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.w0 = r5
            goto L_0x0020
        L_0x001b:
            ikf r4 = new ikf
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.Y
            pu3 r5 = pu3.a
            int r6 = r4.w0
            jue r7 = jue.a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0043
            if (r6 == r9) goto L_0x0030
            if (r6 != r8) goto L_0x003b
        L_0x0030:
            hkf r0 = r4.X
            jkf r1 = r4.o
            wx3.H(r3)
            r3 = r0
            r0 = r1
            goto L_0x00f3
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            wx3.H(r3)
            gf6 r3 = defpackage.hkf.o
            r3.getClass()
            pz4 r3 = defpackage.hkf.Y
            java.util.Iterator r3 = r3.iterator()
        L_0x0051:
            r6 = r3
            u1 r6 = (u1) r6
            boolean r10 = r6.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x006b
            java.lang.Object r6 = r6.next()
            r10 = r6
            hkf r10 = (defpackage.hkf) r10
            java.lang.String r10 = r10.a
            boolean r10 = hhd.f(r10, r1)
            if (r10 == 0) goto L_0x0051
            goto L_0x006c
        L_0x006b:
            r6 = r11
        L_0x006c:
            r3 = r6
            hkf r3 = (defpackage.hkf) r3
            if (r3 != 0) goto L_0x0091
            java.lang.Class<jkf> r2 = defpackage.jkf.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown method with name = "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " in JsDelegate: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            udd.s(r2, r0, r11)
            return r7
        L_0x0091:
            int r1 = r3.ordinal()
            us0 r6 = r0.c
            if (r1 == 0) goto L_0x00ca
            if (r1 != r9) goto L_0x00c4
            r4.o = r0
            r4.X = r3
            r4.w0 = r8
            r57 r1 = r57.d
            r1.getClass()
            qkf r8 = defpackage.rkf.Companion
            l77 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            rkf r1 = (defpackage.rkf) r1
            ekf r2 = new ekf
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r1 = r7
        L_0x00c1:
            if (r1 != r5) goto L_0x00f3
            return r5
        L_0x00c4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ca:
            r4.o = r0
            r4.X = r3
            r4.w0 = r9
            r57 r1 = r57.d
            r1.getClass()
            nkf r8 = defpackage.okf.Companion
            l77 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            okf r1 = (defpackage.okf) r1
            fkf r2 = new fkf
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = r7
        L_0x00f0:
            if (r1 != r5) goto L_0x00f3
            return r5
        L_0x00f3:
            java.lang.String r9 = r3.a
            jff r1 = r0.d
            if (r1 == 0) goto L_0x0110
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            tif r8 = (defpackage.tif) r8
            r15 = 0
            r17 = 240(0xf0, float:3.36E-43)
            long r10 = r1.a
            java.lang.String r12 = r1.b
            r13 = 1
            r14 = 0
            r16 = 0
            defpackage.tif.a(r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0110:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkf.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final us0 b() {
        return this.c;
    }

    public final Set c() {
        return this.b;
    }

    public final void d(jff jff) {
        this.d = jff;
    }
}
