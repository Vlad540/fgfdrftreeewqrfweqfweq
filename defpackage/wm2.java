package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: wm2  reason: default package */
public final class wm2 extends l5e implements i26 {
    public Object X;
    public int Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ nn2 x0;
    public final /* synthetic */ Long y0;
    public final /* synthetic */ jv5 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wm2(Uri uri, long j, nn2 nn2, Long l, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Z = uri;
        this.w0 = j;
        this.x0 = nn2;
        this.y0 = l;
        this.z0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wm2(this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r6 = defpackage.pu3.a
            int r0 = r12.Y
            jue r7 = defpackage.jue.a
            r1 = 3
            r2 = 2
            r3 = 1
            long r8 = r12.w0
            nn2 r10 = r12.x0
            if (r0 == 0) goto L_0x0036
            if (r0 == r3) goto L_0x002c
            if (r0 == r2) goto L_0x0023
            if (r0 != r1) goto L_0x001b
            defpackage.wx3.H(r13)
            r0 = r13
            goto L_0x00cf
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r0 = r12.X
            d1d r0 = (d1d) r0
            defpackage.wx3.H(r13)
            r2 = r13
            goto L_0x0084
        L_0x002c:
            java.lang.Object r0 = r12.X
            c1d r0 = (c1d) r0
            defpackage.wx3.H(r13)
            r4 = r0
            r0 = r13
            goto L_0x0067
        L_0x0036:
            defpackage.wx3.H(r13)
            android.net.Uri r0 = r12.Z
            java.lang.String r0 = r0.toString()
            ugd r4 = new ugd
            r11 = 7
            r4.<init>(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            c1d r4 = new c1d
            r4.<init>(r8, r0)
            t97 r0 = r10.J0
            java.lang.Object r0 = r0.getValue()
            gw8 r0 = (gw8) r0
            r12.X = r4
            r12.Y = r3
            java.lang.Long r3 = r12.y0
            java.lang.Object r0 = r0.a(r8, r3, r12)
            if (r0 != r6) goto L_0x0067
            return r6
        L_0x0067:
            sq8 r0 = (sq8) r0
            r4.b = r0
            d1d r0 = r4.b()
            t97 r3 = r10.H0
            java.lang.Object r3 = r3.getValue()
            g86 r3 = (g86) r3
            r12.X = r0
            r12.Y = r2
            jv5 r2 = r12.z0
            java.lang.Object r2 = r3.b(r2, r12)
            if (r2 != r6) goto L_0x0084
            return r6
        L_0x0084:
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0097
            luf r1 = defpackage.nn2.r(r10)
            r0.getClass()
            r1.a(r0)
            return r7
        L_0x0097:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r0)
            r3.addAll(r2)
            g0d r0 = new g0d
            r2 = 2
            r0.<init>(r8, r3, r2)
            g1d r2 = new g1d
            r2.<init>(r0)
            luf r0 = defpackage.nn2.r(r10)
            r0.a(r2)
            t97 r0 = r10.G0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            et0 r3 = (defpackage.et0) r3
            r0 = 0
            r12.X = r0
            r12.Y = r1
            r2 = 1
            jv5 r4 = r12.z0
            long r0 = r12.w0
            r5 = r12
            java.lang.Object r0 = ns7.b(r0, r2, r3, r4, r5)
            if (r0 != r6) goto L_0x00cf
            return r6
        L_0x00cf:
            yl2 r0 = (defpackage.yl2) r0
            l05 r1 = r10.c1
            taf.o(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm2.o(java.lang.Object):java.lang.Object");
    }
}
