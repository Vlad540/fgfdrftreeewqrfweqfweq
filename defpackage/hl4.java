package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: hl4  reason: default package */
public final class hl4 implements i5e {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    public hl4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker) {
        this.a = downloadFileFromWebAppWorker;
    }

    public final void a() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            dee c = downloadFileFromWebAppWorker.c();
            fn6.d(tn7, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadFailed: " + c, (Throwable) null);
        }
        tt0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new qd5(j));
        this.a.B0 = al4.a;
    }

    public final jue b() {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onUrlExpired", (Throwable) null);
        }
        tt0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new qd5(j));
        return jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(float r18, long r19, long r21, kotlin.coroutines.Continuation r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof defpackage.gl4
            if (r2 == 0) goto L_0x0017
            r2 = r1
            gl4 r2 = (defpackage.gl4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            gl4 r2 = new gl4
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.X
            pu3 r3 = pu3.a
            int r4 = r2.Z
            jue r5 = jue.a
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 == r8) goto L_0x003a
            if (r4 != r7) goto L_0x0032
            wx3.H(r1)
            goto L_0x00c5
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r0 = r2.o
            wx3.H(r1)
            goto L_0x00b8
        L_0x0041:
            wx3.H(r1)
            long r9 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r0.a
            long r11 = r1.A0
            long r11 = r9 - r11
            r13 = 500(0x1f4, double:2.47E-321)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            return r5
        L_0x0055:
            r1.A0 = r9
            cl4 r4 = new cl4
            dee r9 = r1.c()
            long r13 = r9.e
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r9 = r0.a
            dee r9 = r9.c()
            long r9 = r9.b
            r11 = r4
            r12 = r18
            r15 = r9
            r11.<init>(r12, r13, r15)
            r1.B0 = r4
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r0.a
            dl4 r1 = r1.B0
            boolean r4 = r1 instanceof defpackage.cl4
            if (r4 == 0) goto L_0x007b
            cl4 r1 = (defpackage.cl4) r1
            goto L_0x007c
        L_0x007b:
            r1 = r6
        L_0x007c:
            if (r1 != 0) goto L_0x007f
            return r5
        L_0x007f:
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            boolean r9 = r4.c()
            if (r9 == 0) goto L_0x00a1
            tn7 r9 = defpackage.tn7.X
            float r10 = r1.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "update notification "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r4.d(r9, r11, r10, r6)
        L_0x00a1:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r4 = r0.a
            float r1 = r1.a
            boolean r1 = r4.needToShowNotification(r1)
            if (r1 == 0) goto L_0x00c5
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r0 = r0.a
            r2.o = r0
            r2.Z = r8
            java.lang.Object r1 = r0.getForegroundInfo(r2)
            if (r1 != r3) goto L_0x00b8
            return r3
        L_0x00b8:
            hu5 r1 = (hu5) r1
            r2.o = r6
            r2.Z = r7
            java.lang.Object r0 = r0.setForeground(r1, r2)
            if (r0 != r3) goto L_0x00c5
            return r3
        L_0x00c5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl4.c(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Continuation continuation) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            dee c = downloadFileFromWebAppWorker.c();
            fn6.d(tn7, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCancelled: " + c, (Throwable) null);
        }
        tt0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new od5(j));
        this.a.B0 = yk4.a;
        return jue.a;
    }

    public final void e(boolean z, boolean z2) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            dee c = downloadFileFromWebAppWorker.c();
            int i = downloadFileFromWebAppWorker.z0.get();
            fn6.d(tn7, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadInterrupted: " + c + ", isNetworkProblem:" + z + ", retryCount:" + i, (Throwable) null);
        }
        tt0 d = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        d.c(new qd5(j));
        int incrementAndGet = z ? this.a.z0.incrementAndGet() : 0;
        this.a.B0 = (!z || incrementAndGet > 10) ? new bl4(false) : new bl4(true);
    }

    public final Object f(File file, Continuation continuation) {
        udd.p("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCompleted: %s", new Object[]{this.a.c()});
        if (file != null) {
            this.a.d().c(new rd5(this.a.c().a, this.a.c().c));
            ((wd5) this.a.Y.getValue()).b(file);
        }
        this.a.B0 = zk4.a;
        return jue.a;
    }

    public final String getDownloadContext() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        long j = downloadFileFromWebAppWorker.c().b;
        long j2 = downloadFileFromWebAppWorker.c().e;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }
}
