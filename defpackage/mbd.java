package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mbd  reason: default package */
public final class mbd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nbd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mbd(nbd nbd, Continuation continuation) {
        super(2, continuation);
        this.Y = nbd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mbd) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mbd(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [i26, l5e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2 A[LOOP:0: B:25:0x00bc->B:27:0x00c2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r11.X
            jue r2 = defpackage.jue.a
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r6) goto L_0x001c
            if (r1 != r5) goto L_0x0014
            defpackage.wx3.H(r12)
            goto L_0x0071
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001c:
            defpackage.wx3.H(r12)
            goto L_0x005b
        L_0x0020:
            defpackage.wx3.H(r12)
            nbd r12 = r11.Y
            r12.d = r4
            double r7 = java.lang.Math.random()
            r9 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0036
            r1 = r6
            goto L_0x0037
        L_0x0036:
            r1 = r4
        L_0x0037:
            r12.e = r1
            nbd r12 = r11.Y
            t97 r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            pae r12 = (pae) r12
            n3a r12 = (defpackage.n3a) r12
            zr7 r12 = r12.c()
            zr7 r12 = r12.getImmediate()
            lbd r1 = new lbd
            r1.<init>(r5, r3)
            r11.X = r6
            java.lang.Object r12 = defpackage.xs7.U(r12, r1, r11)
            if (r12 != r0) goto L_0x005b
            return r0
        L_0x005b:
            fn6 r12 = defpackage.udd.e
            boolean r1 = r12 instanceof i6a
            if (r1 == 0) goto L_0x0064
            i6a r12 = (i6a) r12
            goto L_0x0065
        L_0x0064:
            r12 = r3
        L_0x0065:
            if (r12 != 0) goto L_0x0068
            return r2
        L_0x0068:
            r11.X = r5
            java.lang.Object r12 = r12.f(r11)
            if (r12 != r0) goto L_0x0071
            return r0
        L_0x0071:
            java.lang.String r12 = (java.lang.String) r12
            java.io.File r0 = new java.io.File
            r0.<init>(r12)
            nbd r12 = r11.Y
            t97 r12 = r12.b
            java.lang.Object r12 = r12.getValue()
            android.content.Context r12 = (android.content.Context) r12
            ff4 r1 = defpackage.ff4.a
            w4 r1 = r1.getAccessor()
            java.lang.Class<mg5> r5 = mg5.class
            java.lang.Object r1 = r1.c(r5)
            mg5 r1 = (mg5) r1
            android.net.Uri r0 = r1.f(r12, r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.SEND"
            r1.<init>(r5)
            java.lang.String r5 = "*/*"
            r1.setType(r5)
            java.lang.String r5 = "android.intent.extra.STREAM"
            r1.putExtra(r5, r0)
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r3)
            android.content.pm.PackageManager r3 = r12.getPackageManager()
            r5 = 65536(0x10000, float:9.18355E-41)
            java.util.List r3 = r3.queryIntentActivities(r1, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d1
            java.lang.Object r5 = r3.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.packageName
            r6 = 3
            r12.grantUriPermission(r5, r0, r6)
            goto L_0x00bc
        L_0x00d1:
            r12.startActivity(r1)
            nbd r11 = r11.Y
            r11.e = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbd.o(java.lang.Object):java.lang.Object");
    }
}
