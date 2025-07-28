package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: zb2  reason: default package */
public final class zb2 extends taf {
    public final grd A0;
    public final t0c B0;
    public qod C0;
    public final AtomicReference D0 = new AtomicReference((Object) null);
    public final yb2 E0 = new yb2(this);
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final Context b;
    public final pae c;
    public final ikc o;
    public final t97 w0;
    public final t97 x0;
    public final hcd y0;
    public final s0c z0;

    public zb2(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, Context context, pae pae, ikc ikc) {
        this.b = context;
        this.c = pae;
        this.o = ikc;
        this.X = t97;
        this.Y = t972;
        this.Z = t973;
        this.w0 = t974;
        this.x0 = t975;
        hcd a = icd.a(1, Integer.MAX_VALUE, 2);
        this.y0 = a;
        this.z0 = new s0c(a);
        grd a2 = hrd.a(Float.valueOf(0.0f));
        this.A0 = a2;
        this.B0 = new t0c(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.zb2 r22, java.lang.String r23, n10 r24, vo8 r25, kotlin.coroutines.Continuation r26) {
        /*
            r1 = r22
            r2 = r24
            r0 = r25
            r3 = r26
            boolean r4 = r3 instanceof defpackage.wb2
            if (r4 == 0) goto L_0x001c
            r4 = r3
            wb2 r4 = (defpackage.wb2) r4
            int r5 = r4.x0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.x0 = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            wb2 r4 = new wb2
            r4.<init>(r1, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r11.Z
            pu3 r4 = defpackage.pu3.a
            int r5 = r11.x0
            jue r12 = defpackage.jue.a
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0055
            if (r5 == r8) goto L_0x0043
            if (r5 == r7) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.wx3.H(r3)
            goto L_0x00bf
        L_0x0043:
            n10 r1 = r11.Y
            java.lang.String r2 = r11.X
            zb2 r5 = r11.o
            defpackage.wx3.H(r3)     // Catch:{ all -> 0x0050 }
            r0 = r3
            r3 = r1
            r1 = r5
            goto L_0x008c
        L_0x0050:
            r0 = move-exception
            r3 = r2
            r2 = r1
            r1 = r5
            goto L_0x009c
        L_0x0055:
            defpackage.wx3.H(r3)
            bm9 r3 = new bm9
            long r14 = r2.a
            long r6 = r0.x0
            long r8 = r0.c
            java.lang.String r0 = r2.m
            r13 = r3
            r15 = r14
            r14 = r0
            r17 = r6
            r19 = r8
            r13.<init>(r14, r15, r17, r19)
            xb2 r0 = new xb2     // Catch:{ all -> 0x0099 }
            r6 = 0
            r0.<init>(r1, r3, r6)     // Catch:{ all -> 0x0099 }
            r11.o = r1     // Catch:{ all -> 0x0099 }
            r3 = r23
            r11.X = r3     // Catch:{ all -> 0x0097 }
            r11.Y = r2     // Catch:{ all -> 0x0097 }
            r6 = 1
            r11.x0 = r6     // Catch:{ all -> 0x0097 }
            r6 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = defpackage.ez3.l0(r6, r0, r11)     // Catch:{ all -> 0x0097 }
            if (r0 != r4) goto L_0x0087
            goto L_0x00f4
        L_0x0087:
            r21 = r3
            r3 = r2
            r2 = r21
        L_0x008c:
            g7f r0 = (g7f) r0     // Catch:{ all -> 0x0090 }
            r9 = r2
            goto L_0x00a4
        L_0x0090:
            r0 = move-exception
            r21 = r3
            r3 = r2
            r2 = r21
            goto L_0x009c
        L_0x0097:
            r0 = move-exception
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            r3 = r23
        L_0x009c:
            kcc r6 = new kcc
            r6.<init>(r0)
            r9 = r3
            r0 = r6
            r3 = r2
        L_0x00a4:
            boolean r2 = r0 instanceof defpackage.kcc
            if (r2 == 0) goto L_0x00a9
            r0 = 0
        L_0x00a9:
            g7f r0 = (g7f) r0
            if (r0 != 0) goto L_0x00c1
            yb2 r0 = r1.E0
            r1 = 0
            r11.o = r1
            r11.X = r1
            r11.Y = r1
            r1 = 2
            r11.x0 = r1
            r0.a()
            if (r12 != r4) goto L_0x00bf
            goto L_0x00f4
        L_0x00bf:
            r4 = r12
            goto L_0x00f4
        L_0x00c1:
            java.util.Map r0 = r0.c
            java.lang.String r6 = defpackage.am7.m(r0)
            t97 r0 = r1.w0
            java.lang.Object r0 = r0.getValue()
            bf5 r0 = (bf5) r0
            long r2 = r3.a
            mg5 r0 = (mg5) r0
            java.io.File r7 = r0.s(r2)
            t97 r0 = r1.Y
            java.lang.Object r0 = r0.getValue()
            j5e r0 = (j5e) r0
            r2 = 0
            r11.o = r2
            r11.X = r2
            r11.Y = r2
            r2 = 3
            r11.x0 = r2
            k5e r5 = r0.a
            yb2 r8 = r1.E0
            r10 = 0
            java.lang.Object r0 = r5.a(r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto L_0x00bf
        L_0x00f4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.q(zb2, java.lang.String, n10, vo8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static int u(ak4 ak4, boolean z) {
        switch (ak4.ordinal()) {
            case 0:
                return otb.media_share_dialog_share_video_fail;
            case 1:
            case 3:
            case 5:
                return z ? otb.media_share_dialog_download_media_fail_not_enough_space : otb.media_share_dialog_download_media_fail;
            case 2:
                return otb.media_share_dialog_share_photo_fail;
            case 4:
                return otb.media_share_dialog_share_gif_fail;
            case 6:
                return otb.media_share_dialog_share_file_fail;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void r() {
        taf.n(this, this.c.b().plus(sk9.a), (ru3) null, new qb2(this, (Continuation) null), 2);
        qod qod = this.C0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(java.lang.String r12, v00 r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.tb2
            if (r0 == 0) goto L_0x0014
            r0 = r14
            tb2 r0 = (defpackage.tb2) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.x0 = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            tb2 r0 = new tb2
            r0.<init>(r11, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r7.Z
            pu3 r0 = defpackage.pu3.a
            int r1 = r7.x0
            jue r8 = defpackage.jue.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r4) goto L_0x003f
            if (r1 == r3) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            defpackage.wx3.H(r14)
            goto L_0x00c1
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            defpackage.wx3.H(r14)
            goto L_0x0090
        L_0x003f:
            v00 r13 = r7.Y
            java.lang.String r12 = r7.X
            zb2 r11 = r7.o
            defpackage.wx3.H(r14)     // Catch:{ all -> 0x0049 }
            goto L_0x006e
        L_0x0049:
            r14 = move-exception
            goto L_0x0071
        L_0x004b:
            defpackage.wx3.H(r14)
            pn2 r14 = new pn2
            long r9 = r13.a
            r1 = 14
            r6 = 0
            r14.<init>(r9, r1, r6)
            ub2 r1 = new ub2     // Catch:{ all -> 0x0049 }
            r1.<init>(r11, r14, r5)     // Catch:{ all -> 0x0049 }
            r7.o = r11     // Catch:{ all -> 0x0049 }
            r7.X = r12     // Catch:{ all -> 0x0049 }
            r7.Y = r13     // Catch:{ all -> 0x0049 }
            r7.x0 = r4     // Catch:{ all -> 0x0049 }
            r9 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r14 = defpackage.ez3.l0(r9, r1, r7)     // Catch:{ all -> 0x0049 }
            if (r14 != r0) goto L_0x006e
            return r0
        L_0x006e:
            pd5 r14 = (pd5) r14     // Catch:{ all -> 0x0049 }
            goto L_0x0077
        L_0x0071:
            kcc r1 = new kcc
            r1.<init>(r14)
            r14 = r1
        L_0x0077:
            boolean r1 = r14 instanceof defpackage.kcc
            if (r1 == 0) goto L_0x007c
            r14 = r5
        L_0x007c:
            pd5 r14 = (pd5) r14
            if (r14 != 0) goto L_0x0091
            yb2 r11 = r11.E0
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.x0 = r3
            r11.a()
            if (r8 != r0) goto L_0x0090
            return r0
        L_0x0090:
            return r8
        L_0x0091:
            t97 r1 = r11.Y
            java.lang.Object r1 = r1.getValue()
            j5e r1 = (j5e) r1
            java.lang.String r14 = r14.c
            t97 r3 = r11.w0
            java.lang.Object r3 = r3.getValue()
            bf5 r3 = (bf5) r3
            java.lang.String r13 = r13.c
            mg5 r3 = (mg5) r3
            java.io.File r3 = r3.i(r13)
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.x0 = r2
            k5e r1 = r1.a
            yb2 r4 = r11.E0
            r6 = 0
            r2 = r14
            r5 = r12
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L_0x00c1
            return r0
        L_0x00c1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.s(java.lang.String, v00, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t(boolean z) {
        ob2 ob2 = (ob2) this.D0.get();
        if (ob2 != null) {
            r();
            this.y0.g(new ek4(u(ob2.d, z)));
        }
    }
}
