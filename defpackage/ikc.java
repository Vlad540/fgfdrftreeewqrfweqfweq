package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* renamed from: ikc  reason: default package */
public final class ikc {
    public final knc a;
    public final ju3 b;
    public final cla c;

    public ikc(knc knc, ju3 ju3, cla cla) {
        this.a = knc;
        this.b = ju3;
        this.c = cla;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        udd.s("ikc", "onNewResultImpl: failed to save image", r11);
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        udd.s("ikc", "onNewResultImpl: failed to save image", r11);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0031, B:34:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC, Splitter:B:26:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable a(defpackage.ikc r11, java.lang.String r12, boolean r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r0 = 1
            r1 = 2
            r11.getClass()
            boolean r2 = r15 instanceof defpackage.dkc
            if (r2 == 0) goto L_0x0018
            r2 = r15
            dkc r2 = (defpackage.dkc) r2
            int r3 = r2.y0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.y0 = r3
            goto L_0x001d
        L_0x0018:
            dkc r2 = new dkc
            r2.<init>(r11, r15)
        L_0x001d:
            java.lang.Object r15 = r2.w0
            pu3 r3 = pu3.a
            int r4 = r2.y0
            java.lang.String r5 = "onNewResultImpl: failed to save image"
            java.lang.String r6 = "ikc"
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L_0x0055
            if (r4 == r0) goto L_0x0046
            if (r4 == r1) goto L_0x0041
            if (r4 != r7) goto L_0x0039
            wx3.H(r15)     // Catch:{ all -> 0x0036 }
            goto L_0x0111
        L_0x0036:
            r11 = move-exception
            goto L_0x0115
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            wx3.H(r15)     // Catch:{ all -> 0x0036 }
            goto L_0x00cd
        L_0x0046:
            boolean r14 = r2.Z
            boolean r13 = r2.Y
            tr6 r11 = r2.X
            ikc r12 = r2.o
            wx3.H(r15)
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x00a6
        L_0x0055:
            wx3.H(r15)
            knc r15 = r11.a
            zd r15 = (defpackage.zd) r15
            ka7 r15 = r15.e
            r15.getClass()
            java.lang.String r12 = at7.y(r12)
            tr6 r12 = tr6.b(r12)
            if (r12 != 0) goto L_0x006e
        L_0x006b:
            r3 = r8
            goto L_0x011a
        L_0x006e:
            r2.o = r11
            r2.X = r12
            r2.Y = r13
            r2.Z = r14
            r2.y0 = r0
            fr6 r15 = a06.u()
            g0 r15 = r15.c(r12)
            zv1 r4 = new zv1
            kotlin.coroutines.Continuation r9 = urd.y(r2)
            r4.<init>(r0, r9)
            r4.n()
            bq9 r9 = new bq9
            r9.<init>(r4, r0)
            xn1 r0 = xn1.a
            r15.m(r9, r0)
            sb5 r0 = new sb5
            r0.<init>(r15, r1)
            r4.d(r0)
            java.lang.Object r15 = r4.m()
            if (r15 != r3) goto L_0x00a6
            goto L_0x011a
        L_0x00a6:
            jl8 r15 = (jl8) r15
            if (r15 != 0) goto L_0x00ab
            goto L_0x006b
        L_0x00ab:
            k0b r0 = new k0b     // Catch:{ all -> 0x0036 }
            r0.<init>(r15)     // Catch:{ all -> 0x0036 }
            t97 r4 = mq6.d     // Catch:{ all -> 0x0036 }
            lq6 r0 = xy6.r(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "webp"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x00d0
            r2.o = r8     // Catch:{ all -> 0x0036 }
            r2.X = r8     // Catch:{ all -> 0x0036 }
            r2.y0 = r1     // Catch:{ all -> 0x0036 }
            java.lang.Object r15 = r11.e(r12, r13, r14, r2)     // Catch:{ all -> 0x0036 }
            if (r15 != r3) goto L_0x00cd
            goto L_0x011a
        L_0x00cd:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0036 }
            goto L_0x0113
        L_0x00d0:
            r2.o = r8     // Catch:{ all -> 0x0036 }
            r2.X = r8     // Catch:{ all -> 0x0036 }
            r2.y0 = r7     // Catch:{ all -> 0x0036 }
            r11.getClass()     // Catch:{ all -> 0x0036 }
            z29 r12 = new z29     // Catch:{ all -> 0x0109 }
            if (r13 == 0) goto L_0x00de
            r1 = 5
        L_0x00de:
            if (r14 == 0) goto L_0x00fe
            cla r0 = r11.c     // Catch:{ all -> 0x0109 }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x0109 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0109 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = defpackage.cla.b     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0109 }
            goto L_0x0100
        L_0x00fe:
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ all -> 0x0109 }
        L_0x0100:
            r12.<init>(r15, r1, r0)     // Catch:{ all -> 0x0109 }
            android.net.Uri r11 = r11.d(r12, r13, r14)     // Catch:{ all -> 0x0109 }
            r15 = r11
            goto L_0x010e
        L_0x0109:
            r11 = move-exception
            udd.s(r6, r5, r11)     // Catch:{ all -> 0x0036 }
            r15 = r8
        L_0x010e:
            if (r15 != r3) goto L_0x0111
            goto L_0x011a
        L_0x0111:
            android.net.Uri r15 = (android.net.Uri) r15     // Catch:{ all -> 0x0036 }
        L_0x0113:
            r3 = r15
            goto L_0x011a
        L_0x0115:
            udd.s(r6, r5, r11)
            goto L_0x006b
        L_0x011a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikc.a(ikc, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static Object c(ikc ikc, String str, boolean z, Continuation continuation) {
        ikc.getClass();
        return xs7.U(ikc.b, new fkc(ikc, str, z, false, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ekc
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ekc r0 = (defpackage.ekc) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ekc r0 = new ekc
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r10) goto L_0x0028
            wx3.H(r14)
            goto L_0x004f
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            wx3.H(r14)
            r0.Y = r10
            sk9 r14 = sk9.a
            ju3 r2 = r11.b
            hu3 r14 = r14.plus(r2)
            gkc r2 = new gkc
            r8 = 0
            r3 = r2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r14 = xs7.U(r14, r2, r0)
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x004f:
            if (r14 == 0) goto L_0x0052
            r9 = r10
        L_0x0052:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikc.b(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri d(lnc lnc, boolean z, boolean z2) {
        knc knc = this.a;
        if (z2) {
            String b2 = knc.b(z);
            cla cla = ((zd) knc).c;
            StringBuilder l = hr1.l(cla.a.getCacheDir().getPath());
            l.append(cla.b);
            String sb = l.toString();
            try {
                File file = new File(sb);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (IOException e) {
                udd.u("PathHelper", e, me4.j("Failed to create dir=", sb, " due to: ", e.getMessage()), new Object[0]);
            }
            File file2 = new File(sb, b2);
            lnc.f(file2);
            Context context = cla.a;
            String packageName = context.getPackageName();
            return FileProvider.d(context, file2, packageName + ".provider");
        }
        return ((zd) knc).c(lnc, knc.b(z));
    }

    public final Object e(tr6 tr6, boolean z, boolean z2, dkc dkc) {
        zv1 zv1 = new zv1(1, urd.y(dkc));
        zv1.n();
        try {
            g0 a2 = a06.u().a(tr6, (Object) null);
            a2.m(new hkc(a2, zv1, this, z2, z), xn1.a);
        } catch (Throwable th) {
            udd.s("ikc", "onNewResultImpl: failed to save image", th);
            zv1.resumeWith((Object) null);
        }
        return zv1.m();
    }
}
