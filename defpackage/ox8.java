package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ox8  reason: default package */
public final class ox8 extends l5e implements i26 {
    public tw8 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ zz8 w0;
    public final /* synthetic */ i7c x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox8(zz8 zz8, i7c i7c, Continuation continuation) {
        super(2, continuation);
        this.w0 = zz8;
        this.x0 = i7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wia) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ox8 ox8 = new ox8(this.w0, this.x0, continuation);
        ox8.Z = obj;
        return ox8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (hhd.f(r2, defpackage.tw8.o) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        if (((defpackage.bpc) r9.A1.a.getValue()) != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        if (r9.A1.b == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        r11 = r2.a;
        r0.Z = r10;
        r0.X = r2;
        r0.Y = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (defpackage.zz8.q(r9, r10, r11, r0) != r1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        r11 = r9.x1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        if (r5.a == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (r11 == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r10.b.m <= 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        r11 = oyb.C(r10);
        r13 = r2.f(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r13 >= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        r13 = java.lang.Math.abs(r13) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r14 = r2.a;
        r15 = (one.me.messages.list.loader.MessageModel) o23.Y(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        if (r15 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r15.c != r11) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010e, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        if (r13 != 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        if (r2.c == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        if (r6 != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r5.a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
        if (r15 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        r7 = r5;
        r4 = (r11 > r15.c ? 1 : (r11 == r15.c ? 0 : -1));
        r5 = r9.z1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r4 >= 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0128, code lost:
        r0.Z = r2;
        r0.X = null;
        r0.Y = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0134, code lost:
        if (r5.e(r11, r0) != r1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        if (r6 == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        r4 = (one.me.messages.list.loader.MessageModel) o23.Y(r13 + 1, r14);
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        if (r4 == null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014d, code lost:
        if (r4.b != 0) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        r18 = r4.c - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
        if (r2.b == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015b, code lost:
        r18 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015e, code lost:
        r0.Z = r2;
        r0.X = null;
        r0.Y = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
        if (r5.e(r10, r0) != r1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016d, code lost:
        r10 = oyb.C(r10);
        r0.Z = r2;
        r0.X = null;
        r0.Y = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017d, code lost:
        if (r5.e(r10, r0) != r1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        r7.a = true;
        r9.x1.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0188, code lost:
        r5.a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018b, code lost:
        r4 = r9.s1;
        r0.Z = null;
        r0.X = null;
        r0.Y = 6;
        r4.setValue(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r3 != r1) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pu3 r1 = pu3.a
            int r2 = r0.Y
            jue r3 = jue.a
            r4 = 3
            i7c r5 = r0.x0
            r6 = 1
            r7 = 0
            r8 = 0
            zz8 r9 = r0.w0
            switch(r2) {
                case 0: goto L_0x0049;
                case 1: goto L_0x003e;
                case 2: goto L_0x0033;
                case 3: goto L_0x0029;
                case 4: goto L_0x0020;
                case 5: goto L_0x0029;
                case 6: goto L_0x001b;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001b:
            wx3.H(r21)
            goto L_0x019b
        L_0x0020:
            java.lang.Object r2 = r0.Z
            tw8 r2 = (defpackage.tw8) r2
            wx3.H(r21)
            r4 = r7
            goto L_0x0030
        L_0x0029:
            java.lang.Object r2 = r0.Z
            tw8 r2 = (defpackage.tw8) r2
            wx3.H(r21)
        L_0x0030:
            r7 = r5
            goto L_0x0137
        L_0x0033:
            tw8 r2 = r0.X
            java.lang.Object r10 = r0.Z
            i22 r10 = (defpackage.i22) r10
            wx3.H(r21)
            goto L_0x00dd
        L_0x003e:
            tw8 r2 = r0.X
            java.lang.Object r10 = r0.Z
            i22 r10 = (defpackage.i22) r10
            wx3.H(r21)
            goto L_0x00b3
        L_0x0049:
            wx3.H(r21)
            java.lang.Object r2 = r0.Z
            wia r2 = (wia) r2
            java.lang.Object r10 = r2.a
            i22 r10 = (defpackage.i22) r10
            java.lang.Object r2 = r2.b
            tw8 r2 = (defpackage.tw8) r2
            java.util.List r11 = r2.a
            int r11 = r11.size()
            r0.Z = r10
            r0.X = r2
            r0.Y = r6
            grd r12 = r9.v1
            java.lang.Object r13 = r12.getValue()
            r14 = r13
            jpc r14 = (defpackage.jpc) r14
            o62 r13 = r10.b
            int r15 = r13.m
            boolean r17 = r10.z()
            java.lang.Object r13 = r12.getValue()
            jpc r13 = (defpackage.jpc) r13
            boolean r13 = r13.b
            if (r13 == 0) goto L_0x0084
            if (r11 == 0) goto L_0x0084
            r16 = r6
            goto L_0x0086
        L_0x0084:
            r16 = r8
        L_0x0086:
            r18 = 0
            r19 = 8
            jpc r13 = defpackage.jpc.a(r14, r15, r16, r17, r18, r19)
            r12.m(r7, r13)
            o62 r12 = r10.b
            java.lang.String r12 = r12.m0
            if (r12 == 0) goto L_0x00a0
            int r12 = r12.length()
            if (r12 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r12 = r8
            goto L_0x00a1
        L_0x00a0:
            r12 = r6
        L_0x00a1:
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            yz8 r11 = new yz8
            r11.<init>(r10, r9, r7)
            kotlinx.coroutines.internal.ContextScope r12 = r9.a
            xs7.E(r12, r7, r7, r11, r4)
        L_0x00b0:
            if (r3 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            tw8 r11 = defpackage.tw8.o
            boolean r11 = hhd.f(r2, r11)
            if (r11 != 0) goto L_0x00dd
            epc r11 = r9.A1
            mc9 r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            bpc r11 = (defpackage.bpc) r11
            if (r11 != 0) goto L_0x00dd
            epc r11 = r9.A1
            boolean r11 = r11.b
            if (r11 == 0) goto L_0x00dd
            java.util.List r11 = r2.a
            r0.Z = r10
            r0.X = r2
            r12 = 2
            r0.Y = r12
            java.lang.Object r11 = defpackage.zz8.q(r9, r10, r11, r0)
            if (r11 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.x1
            boolean r11 = r11.get()
            boolean r12 = r5.a
            if (r12 == 0) goto L_0x00ef
            if (r11 == 0) goto L_0x018b
            o62 r11 = r10.b
            int r11 = r11.m
            if (r11 <= 0) goto L_0x018b
        L_0x00ef:
            long r11 = oyb.C(r10)
            int r13 = r2.f(r11)
            if (r13 >= 0) goto L_0x00fe
            int r13 = java.lang.Math.abs(r13)
            int r13 = r13 - r6
        L_0x00fe:
            java.util.List r14 = r2.a
            java.lang.Object r15 = o23.Y(r13, r14)
            one.me.messages.list.loader.MessageModel r15 = (one.me.messages.list.loader.MessageModel) r15
            if (r15 == 0) goto L_0x0110
            long r6 = r15.c
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0110
            r6 = 1
            goto L_0x0111
        L_0x0110:
            r6 = r8
        L_0x0111:
            if (r13 != 0) goto L_0x011d
            boolean r7 = r2.c
            if (r7 == 0) goto L_0x011d
            if (r6 != 0) goto L_0x011d
            r5.a = r8
            goto L_0x018b
        L_0x011d:
            if (r15 == 0) goto L_0x0188
            r7 = r5
            long r4 = r15.c
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            l05 r5 = r9.z1
            if (r4 >= 0) goto L_0x0139
            r0.Z = r2
            r4 = 0
            r0.X = r4
            r4 = 3
            r0.Y = r4
            java.lang.Object r4 = r5.e(r11, r0)
            if (r4 != r1) goto L_0x0137
            return r1
        L_0x0137:
            r4 = 1
            goto L_0x0180
        L_0x0139:
            if (r6 == 0) goto L_0x016d
            r4 = 1
            int r13 = r13 + r4
            java.lang.Object r4 = o23.Y(r13, r14)
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            r13 = 1
            r18 = 0
            if (r4 == 0) goto L_0x0157
            long r10 = r4.b
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 != 0) goto L_0x0152
        L_0x014f:
            r10 = r18
            goto L_0x015e
        L_0x0152:
            long r10 = r4.c
            long r18 = r10 - r13
            goto L_0x014f
        L_0x0157:
            boolean r4 = r2.b
            if (r4 == 0) goto L_0x014f
            long r18 = r11 + r13
            goto L_0x014f
        L_0x015e:
            r0.Z = r2
            r4 = 0
            r0.X = r4
            r6 = 4
            r0.Y = r6
            java.lang.Object r5 = r5.e(r10, r0)
            if (r5 != r1) goto L_0x0137
            return r1
        L_0x016d:
            r4 = 0
            long r10 = oyb.C(r10)
            r0.Z = r2
            r0.X = r4
            r4 = 5
            r0.Y = r4
            java.lang.Object r4 = r5.e(r10, r0)
            if (r4 != r1) goto L_0x0137
            return r1
        L_0x0180:
            r7.a = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.x1
            r4.set(r8)
            goto L_0x018b
        L_0x0188:
            r7 = r5
            r7.a = r8
        L_0x018b:
            grd r4 = r9.s1
            r5 = 0
            r0.Z = r5
            r0.X = r5
            r5 = 6
            r0.Y = r5
            r4.setValue(r2)
            if (r3 != r1) goto L_0x019b
            return r1
        L_0x019b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox8.o(java.lang.Object):java.lang.Object");
    }
}
