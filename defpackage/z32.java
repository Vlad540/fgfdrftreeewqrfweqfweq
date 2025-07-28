package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z32  reason: default package */
public final class z32 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ o42 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z32(int i, o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z32(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        if (r8 == r0) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            pu3 r0 = pu3.a
            int r1 = r8.X
            jue r2 = jue.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r5) goto L_0x001a
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001a:
            wx3.H(r9)
            goto L_0x010b
        L_0x001f:
            wx3.H(r9)
            int r9 = defpackage.f8a.z0
            o42 r1 = r8.Z
            int r6 = r8.Y
            if (r6 != r9) goto L_0x0035
            r8.X = r5
            k77[] r9 = defpackage.o42.x
            java.lang.Object r8 = r1.n(r8)
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x0035:
            int r9 = defpackage.f8a.B0
            java.lang.String r7 = "/"
            if (r6 != r9) goto L_0x00b4
            r8.X = r4
            k77[] r9 = defpackage.o42.x
            grd r9 = r1.i
            java.lang.Object r3 = r9.getValue()
            sz1 r3 = (defpackage.sz1) r3
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = r3.c
            if (r3 != 0) goto L_0x004e
            goto L_0x006c
        L_0x004e:
            java.lang.Object r9 = r9.getValue()
            sz1 r9 = (defpackage.sz1) r9
            if (r9 == 0) goto L_0x0059
            rz1 r9 = r9.b
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 != 0) goto L_0x005e
            r9 = -1
            goto L_0x0066
        L_0x005e:
            int[] r6 = defpackage.v32.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r6[r9]
        L_0x0066:
            hcd r6 = r1.f
            if (r9 == r5) goto L_0x0089
            if (r9 == r4) goto L_0x006e
        L_0x006c:
            r8 = r2
            goto L_0x00b1
        L_0x006e:
            c6b r9 = new c6b
            int r1 = defpackage.rhc.i
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            jge r4 = new jge
            java.util.List r3 = cs.g0(r3)
            r4.<init>(r1, r3)
            r9.<init>(r4)
            java.lang.Object r8 = r6.a(r9, r8)
            if (r8 != r0) goto L_0x006c
            goto L_0x00b1
        L_0x0089:
            c6b r9 = new c6b
            int r4 = defpackage.rhc.i
            t97 r1 = r1.m
            java.lang.Object r1 = r1.getValue()
            gg7 r1 = (defpackage.gg7) r1
            java.lang.String r1 = r1.e
            java.lang.String r1 = defpackage.me4.i(r1, r7, r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            jge r3 = new jge
            java.util.List r1 = cs.g0(r1)
            r3.<init>(r4, r1)
            r9.<init>(r3)
            java.lang.Object r8 = r6.a(r9, r8)
            if (r8 != r0) goto L_0x006c
        L_0x00b1:
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x00b4:
            int r9 = defpackage.f8a.C0
            if (r6 != r9) goto L_0x010b
            r8.X = r3
            k77[] r9 = defpackage.o42.x
            grd r9 = r1.i
            java.lang.Object r9 = r9.getValue()
            sz1 r9 = (defpackage.sz1) r9
            if (r9 != 0) goto L_0x00c8
        L_0x00c6:
            r8 = r2
            goto L_0x0108
        L_0x00c8:
            java.lang.String r3 = r9.c
            if (r3 != 0) goto L_0x00cd
            goto L_0x00c6
        L_0x00cd:
            rz1 r9 = r9.b
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x00de
            if (r9 != r5) goto L_0x00d8
            goto L_0x00ec
        L_0x00d8:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x00de:
            t97 r9 = r1.m
            java.lang.Object r9 = r9.getValue()
            gg7 r9 = (defpackage.gg7) r9
            java.lang.String r9 = r9.e
            java.lang.String r3 = defpackage.me4.i(r9, r7, r3)
        L_0x00ec:
            hcd r9 = r1.f
            a6b r1 = new a6b
            int r4 = defpackage.rhc.i
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            jge r5 = new jge
            java.util.List r3 = cs.g0(r3)
            r5.<init>(r4, r3)
            r1.<init>(r5)
            java.lang.Object r8 = r9.a(r1, r8)
            if (r8 != r0) goto L_0x00c6
        L_0x0108:
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x010b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z32.o(java.lang.Object):java.lang.Object");
    }
}
