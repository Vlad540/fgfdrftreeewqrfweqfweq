package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: uof  reason: default package */
public final class uof implements q57 {
    public final t97 a;
    public final Set b;
    public final us0 c;
    public jff d;

    public uof(t97 t97) {
        this.a = t97;
        pz4 pz4 = sof.Y;
        ArrayList arrayList = new ArrayList(q23.H(pz4, 10));
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            arrayList.add(((sof) u1Var.next()).a);
        }
        this.b = o23.w0(arrayList);
        this.c = xs7.a(0, 0, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.tof
            if (r4 == 0) goto L_0x001b
            r4 = r3
            tof r4 = (defpackage.tof) r4
            int r5 = r4.w0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.w0 = r5
            goto L_0x0020
        L_0x001b:
            tof r4 = new tof
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.Y
            pu3 r5 = pu3.a
            int r6 = r4.w0
            jue r7 = jue.a
            r8 = 5
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 4
            if (r6 == 0) goto L_0x004c
            if (r6 == r11) goto L_0x0039
            if (r6 == r10) goto L_0x0039
            if (r6 == r9) goto L_0x0039
            if (r6 == r12) goto L_0x0039
            if (r6 != r8) goto L_0x0044
        L_0x0039:
            sof r0 = r4.X
            uof r1 = r4.o
            wx3.H(r3)
            r3 = r0
            r0 = r1
            goto L_0x0142
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            wx3.H(r3)
            ns7 r3 = defpackage.sof.o
            r3.getClass()
            pz4 r3 = defpackage.sof.Y
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            r6 = r3
            u1 r6 = (u1) r6
            boolean r13 = r6.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x0074
            java.lang.Object r6 = r6.next()
            r13 = r6
            sof r13 = (defpackage.sof) r13
            java.lang.String r13 = r13.a
            boolean r13 = hhd.f(r13, r1)
            if (r13 == 0) goto L_0x005a
            goto L_0x0075
        L_0x0074:
            r6 = r14
        L_0x0075:
            r3 = r6
            sof r3 = (defpackage.sof) r3
            if (r3 != 0) goto L_0x009a
            java.lang.Class<uof> r2 = defpackage.uof.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown method with name = "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " in JsDelegate: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            udd.s(r2, r0, r14)
            return r7
        L_0x009a:
            int r1 = r3.ordinal()
            us0 r6 = r0.c
            if (r1 == 0) goto L_0x012f
            if (r1 == r11) goto L_0x011c
            if (r1 == r10) goto L_0x00f3
            if (r1 == r9) goto L_0x00ca
            if (r1 != r12) goto L_0x00c4
            r4.o = r0
            r4.X = r3
            r4.w0 = r8
            f57 r1 = new f57
            ns7 r8 = defpackage.sof.o
            java.lang.String r8 = "WebAppBackButtonPressed"
            r1.<init>(r8, r2)
            java.lang.Object r1 = r6.o(r1, r4)
            if (r1 != r5) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r1 = r7
        L_0x00c1:
            if (r1 != r5) goto L_0x0142
            return r5
        L_0x00c4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ca:
            r4.o = r0
            r4.X = r3
            r4.w0 = r12
            r57 r1 = r57.d
            r1.getClass()
            fnf r8 = defpackage.gnf.Companion
            l77 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            gnf r1 = (defpackage.gnf) r1
            pof r2 = new pof
            boolean r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = r7
        L_0x00f0:
            if (r1 != r5) goto L_0x0142
            return r5
        L_0x00f3:
            r4.o = r0
            r4.X = r3
            r4.w0 = r9
            r57 r1 = r57.d
            r1.getClass()
            cnf r8 = defpackage.dnf.Companion
            l77 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            dnf r1 = (defpackage.dnf) r1
            qof r2 = new qof
            boolean r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r1 = r7
        L_0x0119:
            if (r1 != r5) goto L_0x0142
            return r5
        L_0x011c:
            r4.o = r0
            r4.X = r3
            r4.w0 = r10
            oof r1 = defpackage.oof.a
            java.lang.Object r1 = r6.o(r1, r4)
            if (r1 != r5) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r1 = r7
        L_0x012c:
            if (r1 != r5) goto L_0x0142
            return r5
        L_0x012f:
            r4.o = r0
            r4.X = r3
            r4.w0 = r11
            rof r1 = defpackage.rof.a
            java.lang.Object r1 = r6.o(r1, r4)
            if (r1 != r5) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r1 = r7
        L_0x013f:
            if (r1 != r5) goto L_0x0142
            return r5
        L_0x0142:
            java.lang.String r9 = r3.a
            jff r1 = r0.d
            if (r1 == 0) goto L_0x015f
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
        L_0x015f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uof.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
