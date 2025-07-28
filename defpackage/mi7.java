package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: mi7  reason: default package */
public final class mi7 extends l5e implements i26 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ ni7 B0;
    public final /* synthetic */ Context C0;
    public ni7 X;
    public Context Y;
    public Map Z;
    public Iterator w0;
    public Map x0;
    public ud0 y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi7(boolean z, ni7 ni7, Context context, Continuation continuation) {
        super(2, continuation);
        this.A0 = z;
        this.B0 = ni7;
        this.C0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mi7(this.A0, this.B0, this.C0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pu3 r1 = pu3.a
            int r2 = r0.z0
            r3 = 1
            if (r2 == 0) goto L_0x0029
            if (r2 != r3) goto L_0x0021
            ud0 r2 = r0.y0
            java.util.Map r4 = r0.x0
            java.util.Iterator r5 = r0.w0
            java.util.Map r6 = r0.Z
            android.content.Context r7 = r0.Y
            ni7 r8 = r0.X
            wx3.H(r17)
            r12 = r8
            r8 = r5
            r5 = r6
            r6 = r17
            goto L_0x00b7
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            wx3.H(r17)
            boolean r2 = r0.A0
            if (r2 == 0) goto L_0x0033
            java.util.List r2 = defpackage.ud0.c
            goto L_0x0035
        L_0x0033:
            java.util.List r2 = defpackage.ud0.b
        L_0x0035:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r6 = q23.H(r2, r5)
            r4.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0044:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            ud0 r7 = new ud0
            r7.<init>(r6)
            r4.add(r7)
            goto L_0x0044
        L_0x0059:
            int r2 = q23.H(r4, r5)
            int r2 = ju7.S(r2)
            r5 = 16
            if (r2 >= r5) goto L_0x0066
            r2 = r5
        L_0x0066:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
            ni7 r4 = r0.B0
            android.content.Context r6 = r0.C0
            r12 = r4
            r4 = r5
            r5 = r2
            r2 = r6
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c0
            java.lang.Object r6 = r5.next()
            r13 = r6
            ud0 r13 = (defpackage.ud0) r13
            aj7 r7 = r12.a
            r0.X = r12
            r0.Y = r2
            r0.Z = r4
            r0.w0 = r5
            r0.x0 = r4
            r0.y0 = r13
            r0.z0 = r3
            t97 r6 = r7.a
            java.lang.Object r6 = r6.getValue()
            pae r6 = (defpackage.pae) r6
            n3a r6 = (n3a) r6
            ju3 r14 = r6.b()
            zi7 r15 = new zi7
            r11 = 0
            r10 = 0
            r6 = r15
            r8 = r13
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r6 = xs7.U(r14, r15, r0)
            if (r6 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r7 = r2
            r8 = r5
            r2 = r13
            r5 = r4
        L_0x00b7:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r4.put(r2, r6)
            r4 = r5
            r2 = r7
            r5 = r8
            goto L_0x0077
        L_0x00c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi7.o(java.lang.Object):java.lang.Object");
    }
}
