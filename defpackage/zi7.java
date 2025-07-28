package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: zi7  reason: default package */
public final class zi7 extends l5e implements i26 {
    public final /* synthetic */ Context A0;
    public final /* synthetic */ boolean B0;
    public aj7 X;
    public ud0 Y;
    public e0f Z;
    public boolean w0;
    public int x0;
    public final /* synthetic */ aj7 y0;
    public final /* synthetic */ ud0 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zi7(aj7 aj7, ud0 ud0, Context context, boolean z, Continuation continuation) {
        super(2, continuation);
        this.y0 = aj7;
        this.z0 = ud0;
        this.A0 = context;
        this.B0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zi7(this.y0, this.z0, this.A0, this.B0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.x0
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            boolean r0 = r10.w0
            e0f r1 = r10.Z
            ud0 r2 = r10.Y
            aj7 r10 = r10.X
            wx3.H(r11)
            goto L_0x0075
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001d:
            wx3.H(r11)
            aj7 r11 = r10.y0
            r11.getClass()
            android.util.LruCache r1 = defpackage.nhe.a
            r1 = 0
            ud0 r3 = r10.z0
            if (r3 != 0) goto L_0x002e
            r4 = r1
            goto L_0x0036
        L_0x002e:
            android.util.LruCache r4 = defpackage.nhe.a
            java.lang.Object r4 = r4.get(r3)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            return r4
        L_0x0039:
            t97 r4 = r11.b
            java.lang.Object r5 = r4.getValue()
            pd0 r5 = (defpackage.pd0) r5
            r5.getClass()
            android.content.Context r5 = r10.A0
            java.util.LinkedHashMap r6 = defpackage.pd0.b(r5, r3)
            java.lang.Object r6 = r6.get(r3)
            e0f r6 = (defpackage.e0f) r6
            if (r6 == 0) goto L_0x0090
            boolean r7 = r10.B0
            d0f r8 = r6.a
            if (r8 == 0) goto L_0x007c
            java.lang.Object r1 = r4.getValue()
            pd0 r1 = (defpackage.pd0) r1
            r10.X = r11
            r10.Y = r3
            r10.Z = r6
            r10.w0 = r7
            r10.x0 = r2
            java.lang.Object r10 = r1.c(r5, r8, r10)
            if (r10 != r0) goto L_0x006f
            return r0
        L_0x006f:
            r2 = r3
            r1 = r6
            r0 = r7
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x0075:
            p6e r11 = (defpackage.p6e) r11
            r7 = r0
            r6 = r1
            r3 = r2
            r1 = r11
            r11 = r10
        L_0x007c:
            rhe r10 = new rhe
            qhe r0 = ez3.g0(r6, r1)
            r10.<init>(r0)
            if (r7 == 0) goto L_0x008f
            r11.getClass()
            android.util.LruCache r11 = defpackage.nhe.a
            defpackage.nhe.a(r3, r10)
        L_0x008f:
            r1 = r10
        L_0x0090:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi7.o(java.lang.Object):java.lang.Object");
    }
}
