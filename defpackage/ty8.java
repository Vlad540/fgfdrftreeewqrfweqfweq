package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ty8  reason: default package */
public final class ty8 extends l5e implements i26 {
    public final /* synthetic */ zz8 A0;
    public int X;
    public zz8 Y;
    public Collection Z;
    public Iterator w0;
    public vo8 x0;
    public int y0;
    public final /* synthetic */ List z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.z0 = list;
        this.A0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ty8(this.A0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 0
            r4 = 0
            r5 = 2
            zz8 r6 = r0.A0
            r7 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 == r7) goto L_0x002b
            if (r2 != r5) goto L_0x0023
            int r2 = r0.X
            vo8 r8 = r0.x0
            java.util.Iterator r9 = r0.w0
            java.util.Collection r10 = r0.Z
            zz8 r11 = r0.Y
            wx3.H(r19)
            r12 = r19
            goto L_0x008d
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r2 = r0.X
            wx3.H(r19)
            r8 = r2
            r2 = r19
            goto L_0x0053
        L_0x0034:
            wx3.H(r19)
            java.util.List r2 = r0.z0
            int r8 = r2.size()
            if (r8 <= r7) goto L_0x0041
            r8 = r7
            goto L_0x0042
        L_0x0041:
            r8 = r4
        L_0x0042:
            k77[] r9 = defpackage.zz8.I1
            b29 r9 = r6.y()
            r0.X = r8
            r0.y0 = r7
            java.lang.Object r2 = r9.b(r2, r0)
            if (r2 != r1) goto L_0x0053
            return r1
        L_0x0053:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
            r11 = r6
            r10 = r9
            r9 = r2
            r2 = r8
        L_0x0062:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x00f5
            java.lang.Object r8 = r9.next()
            vo8 r8 = (defpackage.vo8) r8
            if (r2 == 0) goto L_0x009e
            t97 r12 = r11.O0
            java.lang.Object r12 = r12.getValue()
            ap3 r12 = (defpackage.ap3) r12
            long r13 = r8.Y
            r0.Y = r11
            r0.Z = r10
            r0.w0 = r9
            r0.x0 = r8
            r0.X = r2
            r0.y0 = r5
            java.lang.Comparable r12 = r12.b(r13, r0)
            if (r12 != r1) goto L_0x008d
            return r1
        L_0x008d:
            tf3 r12 = (defpackage.tf3) r12
            if (r12 == 0) goto L_0x0097
            java.lang.String r12 = r12.d()
            if (r12 != 0) goto L_0x009f
        L_0x0097:
            long r12 = r8.Y
            java.lang.String r12 = java.lang.String.valueOf(r12)
            goto L_0x009f
        L_0x009e:
            r12 = r3
        L_0x009f:
            java.lang.String r13 = r8.w0
            if (r13 == 0) goto L_0x00ac
            int r13 = r13.length()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r13 = r4
            goto L_0x00ad
        L_0x00ac:
            r13 = r7
        L_0x00ad:
            r13 = r13 ^ r7
            if (r13 == 0) goto L_0x00b3
            java.lang.String r8 = r8.w0
            goto L_0x00d6
        L_0x00b3:
            boolean r13 = r8.o()
            if (r13 == 0) goto L_0x00be
            vo8 r8 = r8.G0
            java.lang.String r8 = r8.w0
            goto L_0x00d6
        L_0x00be:
            boolean r13 = ete.H(r8)
            if (r13 == 0) goto L_0x00d5
            jj7 r8 = r8.D0
            if (r8 == 0) goto L_0x00d5
            o10 r8 = r8.u(r4)
            if (r8 == 0) goto L_0x00d5
            l00 r8 = r8.e
            if (r8 == 0) goto L_0x00d5
            java.lang.String r8 = r8.f
            goto L_0x00d6
        L_0x00d5:
            r8 = r3
        L_0x00d6:
            if (r2 == 0) goto L_0x00ee
            if (r8 == 0) goto L_0x00ed
            t97 r13 = r11.J0
            java.lang.Object r13 = r13.getValue()
            android.app.Application r13 = (android.app.Application) r13
            int r14 = defpackage.c7a.O0
            java.lang.Object[] r8 = new java.lang.Object[]{r12, r8}
            java.lang.String r8 = r13.getString(r14, r8)
            goto L_0x00ee
        L_0x00ed:
            r8 = r3
        L_0x00ee:
            if (r8 == 0) goto L_0x0062
            r10.add(r8)
            goto L_0x0062
        L_0x00f5:
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            t97 r0 = r6.J0
            java.lang.Object r0 = r0.getValue()
            android.app.Application r0 = (android.app.Application) r0
            r15 = 0
            r16 = 0
            java.lang.String r13 = "\n\n"
            r14 = 0
            r17 = 62
            java.lang.String r1 = o23.c0(r12, r13, r14, r15, r16, r17)
            hhd.q(r0, r1)
            boolean r0 = hhd.y()
            if (r0 == 0) goto L_0x0134
            int r0 = defpackage.b7a.a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            fge r2 = new fge
            java.util.List r1 = cs.g0(r1)
            r2.<init>(r1, r0, r7)
            ked r0 = new ked
            r1 = 6
            r0.<init>(r2, r4, r3, r1)
            l05 r1 = r6.y1
            defpackage.taf.o(r1, r0)
        L_0x0134:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty8.o(java.lang.Object):java.lang.Object");
    }
}
