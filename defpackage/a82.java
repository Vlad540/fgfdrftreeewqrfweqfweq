package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: a82  reason: default package */
public final class a82 extends l5e implements i26 {
    public final /* synthetic */ List A0;
    public final /* synthetic */ b92 B0;
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ String D0;
    public boolean X;
    public b92 Y;
    public String Z;
    public Collection w0;
    public Iterator x0;
    public Collection y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a82(List list, b92 b92, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.A0 = list;
        this.B0 = b92;
        this.C0 = z;
        this.D0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a82(this.A0, this.B0, this.C0, this.D0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pu3 r1 = pu3.a
            int r2 = r0.z0
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            b92 r7 = r0.B0
            r8 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r3) goto L_0x0032
            if (r2 == r6) goto L_0x002d
            if (r2 == r5) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            wx3.H(r18)
            goto L_0x00fb
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            b92 r7 = r0.Y
            wx3.H(r18)
            r2 = r18
            goto L_0x00ec
        L_0x002d:
            wx3.H(r18)
            goto L_0x00db
        L_0x0032:
            boolean r2 = r0.X
            java.util.Collection r9 = r0.y0
            java.util.Iterator r10 = r0.x0
            java.util.Collection r11 = r0.w0
            java.lang.String r12 = r0.Z
            b92 r13 = r0.Y
            wx3.H(r18)
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r18
            goto L_0x009b
        L_0x0047:
            wx3.H(r18)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r9 = r0.A0
            r10 = 10
            int r10 = q23.H(r9, r10)
            r2.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r0.C0
            java.lang.String r11 = r0.D0
            r13 = r7
            r12 = r11
            r16 = r9
            r9 = r2
            r2 = r10
            r10 = r16
        L_0x0067:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b4
            java.lang.Object r11 = r10.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r14 = r11.longValue()
            if (r2 == 0) goto L_0x00a2
            java.lang.String r11 = defpackage.b92.O0
            t97 r11 = r13.z0
            java.lang.Object r11 = r11.getValue()
            bv2 r11 = (defpackage.bv2) r11
            r0.Y = r13
            r0.Z = r12
            r0.w0 = r9
            r0.x0 = r10
            r0.y0 = r9
            r0.X = r2
            r0.z0 = r3
            java.lang.Object r11 = r11.d(r14, r0)
            if (r11 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r14 = r13
            r13 = r12
            r12 = r9
        L_0x009b:
            i22 r11 = (defpackage.i22) r11
            o62 r11 = r11.b
            long r3 = r11.a
            goto L_0x00a6
        L_0x00a2:
            r3 = r14
            r14 = r13
            r13 = r12
            r12 = r9
        L_0x00a6:
            z22 r11 = new z22
            r11.<init>(r3, r13)
            r9.add(r11)
            r9 = r12
            r12 = r13
            r13 = r14
            r3 = 1
            r4 = 4
            goto L_0x0067
        L_0x00b4:
            java.util.List r9 = (java.util.List) r9
            java.lang.String r2 = defpackage.b92.O0
            udc r2 = r7.e()
            r0.Y = r8
            r0.Z = r8
            r0.w0 = r8
            r0.x0 = r8
            r0.y0 = r8
            r0.z0 = r6
            r2.getClass()
            uh r3 = new uh
            r4 = 22
            r3.<init>(r2, r4, r9)
            aec r2 = r2.a
            java.lang.Object r2 = r1g.h(r2, r3, r0)
            if (r2 != r1) goto L_0x00db
            return r1
        L_0x00db:
            java.lang.String r2 = defpackage.b92.O0
            udc r2 = r7.e()
            r0.Y = r7
            r0.z0 = r5
            java.lang.Object r2 = r2.d(r0)
            if (r2 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            java.util.List r2 = (java.util.List) r2
            r0.Y = r8
            r3 = 4
            r0.z0 = r3
            r3 = 1
            java.lang.Object r0 = defpackage.b92.j(r7, r2, r3, r0)
            if (r0 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a82.o(java.lang.Object):java.lang.Object");
    }
}
