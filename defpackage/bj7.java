package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: bj7  reason: default package */
public final class bj7 extends l5e implements i26 {
    public ud0 X;
    public e0f Y;
    public int Z;
    public final /* synthetic */ stf w0;
    public final /* synthetic */ Context x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj7(stf stf, Context context, Continuation continuation) {
        super(2, continuation);
        this.w0 = stf;
        this.x0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bj7(this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.Z
            r2 = 0
            r3 = 1
            stf r4 = r9.w0
            if (r1 == 0) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            e0f r0 = r9.Y
            ud0 r9 = r9.X
            wx3.H(r10)
            goto L_0x0116
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001d:
            wx3.H(r10)
            java.lang.Object r10 = r4.o
            t97 r10 = (t97) r10
            java.lang.Object r10 = r10.getValue()
            ip r10 = (defpackage.ip) r10
            kp r10 = (defpackage.kp) r10
            x97 r10 = r10.g
            java.lang.String r1 = "app.night.mode"
            java.lang.String r5 = "app.night.mode.system"
            java.lang.String r10 = r10.getString(r1, r5)
            int r1 = r10.hashCode()
            java.lang.Object r6 = r4.b
            t97 r6 = (t97) r6
            r7 = -700569351(0xffffffffd63e28f9, float:-5.2270796E13)
            android.content.Context r8 = r9.x0
            if (r1 == r7) goto L_0x0063
            r7 = 2051489143(0x7a473d77, float:2.5862843E35)
            if (r1 == r7) goto L_0x004b
            goto L_0x006b
        L_0x004b:
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0052:
            android.content.res.Resources r10 = r8.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            int r10 = r10.uiMode
            r10 = r10 & 48
            r1 = 32
            if (r10 != r1) goto L_0x006b
            goto L_0x007c
        L_0x0063:
            java.lang.String r1 = "app.night.mode.enabled"
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x007c
        L_0x006b:
            java.lang.Object r10 = r6.getValue()
            f03 r10 = (defpackage.f03) r10
            i03 r10 = (defpackage.i03) r10
            x97 r10 = r10.g
            java.lang.String r1 = "app.chat.background.light.id"
            java.lang.String r10 = r10.getString(r1, r2)
            goto L_0x008c
        L_0x007c:
            java.lang.Object r10 = r6.getValue()
            f03 r10 = (defpackage.f03) r10
            i03 r10 = (defpackage.i03) r10
            x97 r10 = r10.g
            java.lang.String r1 = "app.chat.background.dark.id"
            java.lang.String r10 = r10.getString(r1, r2)
        L_0x008c:
            if (r10 != 0) goto L_0x00a4
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            s59 r10 = km4.y0
            km4 r10 = r10.n(r8)
            pda r10 = r10.g()
            nd0 r10 = r10.b()
            int r10 = r10.i
            r9.<init>(r10)
            return r9
        L_0x00a4:
            ud0 r1 = new ud0
            r1.<init>(r10)
            android.util.LruCache r10 = defpackage.nhe.a
            android.util.LruCache r10 = defpackage.nhe.a
            java.lang.Object r10 = r10.get(r1)
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.String r5 = "LoadThemeBackgroundUseCase"
            if (r10 == 0) goto L_0x00ce
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Load theme "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = " from cache."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            udd.q(r5, r9)
            return r10
        L_0x00ce:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r6 = "Theme "
            r10.<init>(r6)
            r10.append(r1)
            java.lang.String r6 = " not cached, start loading from source."
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            udd.q(r5, r10)
            java.lang.Object r10 = r4.a
            r7e r10 = (r7e) r10
            java.lang.Object r5 = r10.getValue()
            pd0 r5 = (defpackage.pd0) r5
            r5.getClass()
            java.util.LinkedHashMap r5 = defpackage.pd0.b(r8, r2)
            java.lang.Object r5 = r5.get(r1)
            e0f r5 = (defpackage.e0f) r5
            if (r5 == 0) goto L_0x011b
            d0f r6 = r5.a
            if (r6 == 0) goto L_0x011b
            java.lang.Object r10 = r10.getValue()
            pd0 r10 = (defpackage.pd0) r10
            r9.X = r1
            r9.Y = r5
            r9.Z = r3
            java.lang.Object r10 = r10.c(r8, r6, r9)
            if (r10 != r0) goto L_0x0114
            return r0
        L_0x0114:
            r9 = r1
            r0 = r5
        L_0x0116:
            p6e r10 = (defpackage.p6e) r10
            r1 = r9
            r5 = r0
            goto L_0x011c
        L_0x011b:
            r10 = r2
        L_0x011c:
            if (r5 == 0) goto L_0x012f
            qhe r9 = ez3.g0(r5, r10)
            rhe r2 = new rhe
            r2.<init>(r9)
            r4.getClass()
            android.util.LruCache r9 = defpackage.nhe.a
            defpackage.nhe.a(r1, r2)
        L_0x012f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.o(java.lang.Object):java.lang.Object");
    }
}
