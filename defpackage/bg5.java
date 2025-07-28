package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bg5  reason: default package */
public final class bg5 implements nn1 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ sm6 Z;
    public final /* synthetic */ lac a;
    public final /* synthetic */ fm6 b;
    public final /* synthetic */ m2d c;
    public final /* synthetic */ File o;
    public final /* synthetic */ lg8 w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ dg5 y0;
    public final /* synthetic */ gg5 z0;

    public bg5(gg5 gg5, lac lac, qm6 qm6, m2d m2d, File file, AtomicBoolean atomicBoolean, String str, sm6 sm6, lg8 lg8, int i, dg5 dg5) {
        this.z0 = gg5;
        this.a = lac;
        this.b = qm6;
        this.c = m2d;
        this.o = file;
        this.X = atomicBoolean;
        this.Y = str;
        this.Z = sm6;
        this.w0 = lg8;
        this.x0 = i;
        this.y0 = dg5;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, m2d] */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:14|(1:16)(1:17)|18|19|20|21|(1:23)|24|25|(2:27|(1:29)(2:30|(1:33)(2:34|(1:58)(2:38|(2:40|119)(1:57)))))|31|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ all -> 0x0042, all -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(y0c r13, xbc r14) {
        /*
            r12 = this;
            java.lang.String r13 = "error uploading, e: "
            f1c r0 = r14.Z
            boolean r1 = r14.m()     // Catch:{ all -> 0x0042 }
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            fm6 r14 = r12.b     // Catch:{ all -> 0x0042 }
            java.io.File r1 = r12.o     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            if (r14 == 0) goto L_0x0039
            java.lang.String r6 = r0.U()     // Catch:{ all -> 0x0042 }
            long r7 = r1.length()     // Catch:{ all -> 0x0042 }
            qm6 r14 = (defpackage.qm6) r14     // Catch:{ all -> 0x0042 }
            java.util.concurrent.atomic.AtomicBoolean r13 = r14.w0     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.get()     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            v82 r13 = new v82     // Catch:{ all -> 0x0042 }
            r9 = 2
            r4 = r13
            r5 = r14
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (long) r7, (int) r9)     // Catch:{ all -> 0x0042 }
            omc r14 = r14.Y     // Catch:{ all -> 0x0042 }
            r14.b(r13)     // Catch:{ all -> 0x0042 }
        L_0x0039:
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            m2d r12 = r12.c     // Catch:{ all -> 0x0042 }
            defpackage.gg5.a(r13, r12, r3, r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0042:
            r12 = move-exception
            goto L_0x014d
        L_0x0045:
            gg5 r1 = r12.z0     // Catch:{ all -> 0x0042 }
            zpe r1 = r1.c     // Catch:{ all -> 0x0042 }
            int r4 = r14.o     // Catch:{ all -> 0x0042 }
            t97 r1 = r1.a     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0042 }
            bd r1 = (defpackage.bd) r1     // Catch:{ all -> 0x0042 }
            in7 r5 = r1.a()     // Catch:{ all -> 0x0042 }
            boolean r5 = r5.c()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            java.lang.String r5 = "HTTP_ERROR"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0042 }
            r1.g(r5, r4)     // Catch:{ all -> 0x0042 }
        L_0x0067:
            gg5 r1 = r12.z0     // Catch:{ all -> 0x0042 }
            m2d r4 = r12.c     // Catch:{ all -> 0x0042 }
            int r5 = r14.o     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0042 }
            r6 = 1
            defpackage.gg5.a(r1, r4, r6, r5)     // Catch:{ all -> 0x0042 }
            int r1 = r14.o     // Catch:{ all -> 0x0042 }
            gg5 r4 = r12.z0     // Catch:{ all -> 0x0042 }
            r4.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "X-Reason"
            ye6 r5 = r14.Y     // Catch:{ Exception -> 0x0087 }
            java.lang.String r4 = r5.a(r4)     // Catch:{ Exception -> 0x0087 }
            if (r4 == 0) goto L_0x0087
            r2 = r4
        L_0x0087:
            am6 r1 = defpackage.pa2.o(r1, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "gg5"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r4.<init>(r13)     // Catch:{ all -> 0x0042 }
            r4.append(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0042 }
            udd.q(r2, r13)     // Catch:{ all -> 0x0042 }
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            am6 r13 = defpackage.pa2.g     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 != 0) goto L_0x00b4
            am6 r13 = defpackage.pa2.e     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r13 = r3
            goto L_0x00b5
        L_0x00b4:
            r13 = r6
        L_0x00b5:
            if (r13 == 0) goto L_0x00c5
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            fm6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            qm6 r12 = (defpackage.qm6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            defpackage.gg5.f(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x00c5:
            am6 r13 = defpackage.pa2.c     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0139
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.X     // Catch:{ all -> 0x0042 }
            boolean r13 = r13.compareAndSet(r3, r6)     // Catch:{ all -> 0x0042 }
            if (r13 == 0) goto L_0x0139
            long r7 = defpackage.gg5.e(r14)     // Catch:{ all -> 0x0042 }
            r13 = 0
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x012a
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            m2d r14 = r12.c     // Catch:{ all -> 0x0042 }
            java.lang.String r14 = r14.a     // Catch:{ all -> 0x0042 }
            m2d r9 = new m2d     // Catch:{ all -> 0x0042 }
            r9.<init>()     // Catch:{ all -> 0x0042 }
            zpe r13 = r13.c     // Catch:{ all -> 0x0042 }
            long r1 = r13.b()     // Catch:{ all -> 0x0042 }
            r9.f = r1     // Catch:{ all -> 0x0042 }
            r9.a = r14     // Catch:{ all -> 0x0042 }
            gg5 r2 = r12.z0     // Catch:{ all -> 0x0042 }
            java.io.File r3 = r12.o     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r12.Y     // Catch:{ all -> 0x0042 }
            sm6 r5 = r12.Z     // Catch:{ all -> 0x0042 }
            lg8 r6 = r12.w0     // Catch:{ all -> 0x0042 }
            fm6 r13 = r12.b     // Catch:{ all -> 0x0042 }
            int r11 = r12.x0     // Catch:{ all -> 0x0042 }
            r10 = r13
            qm6 r10 = (defpackage.qm6) r10     // Catch:{ all -> 0x0042 }
            lac r13 = r2.b(r3, r4, r5, r6, r7, r9, r10, r11)     // Catch:{ all -> 0x0042 }
            gg5 r14 = r12.z0     // Catch:{ all -> 0x0042 }
            r7e r14 = r14.b     // Catch:{ all -> 0x0042 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x0042 }
            qw9 r14 = (qw9) r14     // Catch:{ all -> 0x0042 }
            y0c r13 = r14.b(r13)     // Catch:{ all -> 0x0042 }
            dg5 r14 = r12.y0     // Catch:{ all -> 0x0042 }
            monitor-enter(r14)     // Catch:{ all -> 0x0042 }
            boolean r1 = r14.b     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0120
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0120:
            r14.a = r13     // Catch:{ all -> 0x0127 }
            monitor-exit(r14)     // Catch:{ all -> 0x0042 }
            r13.e(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0127:
            r12 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0127 }
            throw r12     // Catch:{ all -> 0x0042 }
        L_0x012a:
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            fm6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            qm6 r12 = (defpackage.qm6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0147
        L_0x0139:
            gg5 r13 = r12.z0     // Catch:{ all -> 0x0042 }
            fm6 r12 = r12.b     // Catch:{ all -> 0x0042 }
            qm6 r12 = (defpackage.qm6) r12     // Catch:{ all -> 0x0042 }
            r13.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.String r13 = "upload failed"
            r12.b(r13, r1)     // Catch:{ all -> 0x0042 }
        L_0x0147:
            if (r0 == 0) goto L_0x014c
            r0.close()
        L_0x014c:
            return
        L_0x014d:
            if (r0 == 0) goto L_0x0157
            r0.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0157
        L_0x0153:
            r13 = move-exception
            r12.addSuppressed(r13)
        L_0x0157:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg5.j(y0c, xbc):void");
    }

    public final void r(y0c y0c, IOException iOException) {
        lg8 lg8 = gg5.d;
        udd.u("gg5", iOException, "onFailure %s", new Object[]{this.a});
        gg5 gg5 = this.z0;
        bd bdVar = (bd) gg5.c.a.getValue();
        if (!bdVar.a().c()) {
            bdVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        udd.s("gg5", "onFailure", (Throwable) null);
        boolean z = iOException instanceof FileNotFoundException;
        fm6 fm6 = this.b;
        if (z) {
            ((qm6) fm6).b("file not found", pa2.m);
        } else if ("FILE_ZERO_LENGTH".equals(iOException.getMessage())) {
            ((qm6) fm6).b("file is zero length", pa2.n);
        } else {
            String obj = iOException.toString();
            qm6 qm6 = (qm6) fm6;
            am6 am6 = pa2.l;
            if (obj != null) {
                am6 = new am6(-1, "UNKNOWN_ERROR", obj);
            }
            qm6.b("upload failed", am6);
        }
        gg5.a(gg5, this.c, true, iOException.getMessage());
    }
}
