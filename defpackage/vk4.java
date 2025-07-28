package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: vk4  reason: default package */
public final class vk4 implements i5e {
    public final /* synthetic */ DownloadFileAttachWorker a;

    public vk4(DownloadFileAttachWorker downloadFileAttachWorker) {
        this.a = downloadFileAttachWorker;
    }

    public final void a() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            ude g = downloadFileAttachWorker.g();
            fn6.d(tn7, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadFailed: " + g, (Throwable) null);
        }
        if (this.a.g().h) {
            ((tt0) this.a.y0.getValue()).c(new dk4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        this.a.H0 = lk4.a;
    }

    public final jue b() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        fn6 fn6 = udd.e;
        File file = null;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", wn6.h(downloadFileAttachWorker.g().l, "invalidate count="), (Throwable) null);
        }
        int i = this.a.g().l;
        jue jue = jue.a;
        ok4 ok4 = ok4.a;
        if (i >= 10) {
            udd.s("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Reached max link invalidate count:", (Throwable) null);
            ((g15) this.a.x0.getValue()).c(new Exception("Reached max link invalidate count"), true);
            this.a.H0 = ok4;
            return jue;
        }
        vo8 q = this.a.e().q(this.a.g().a);
        if (q == null || !q.s() || q.z0 == ls8.DELETED) {
            udd.s("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Message deleted or now audio", (Throwable) null);
            this.a.H0 = ok4;
            return jue;
        }
        i22 B = ((t52) this.a.X.getValue()).B(q.x0);
        if (B != null) {
            udd.q("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Create invalidateAndDownloadAudio task");
            pk pkVar = (pk) this.a.w0.getValue();
            File file2 = this.a.I0;
            if (file2 != null) {
                file = file2;
            }
            String absolutePath = file.getAbsolutePath();
            long j = B.b.a;
            long j2 = q.c;
            ude g = this.a.g();
            gy9 gy9 = (gy9) pkVar;
            gy9.getClass();
            new Long(sce.d(gy9.A(), new l07(((j2b) gy9.z()).a.n(), absolutePath, j, j2, g), false, 0, 12));
        } else {
            udd.s("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Chat is null", (Throwable) null);
            this.a.H0 = ok4;
        }
        return jue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: nk4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: nk4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: nk4} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if ((r4.C() ? r4.D0.x(defpackage.j10.o).d : r0) != null) goto L_0x00ec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(float r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r24
            boolean r2 = r1 instanceof defpackage.uk4
            if (r2 == 0) goto L_0x0017
            r2 = r1
            uk4 r2 = (defpackage.uk4) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w0 = r3
            goto L_0x001c
        L_0x0017:
            uk4 r2 = new uk4
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Y
            pu3 r13 = pu3.a
            int r3 = r2.w0
            g10 r14 = defpackage.g10.X
            jue r15 = jue.a
            r12 = 0
            r11 = 3
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r4) goto L_0x004b
            if (r3 == r9) goto L_0x003f
            if (r3 != r11) goto L_0x0037
            wx3.H(r1)
            goto L_0x016b
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r0 = r2.o
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = (ru.ok.tamtam.upload.workers.DownloadFileAttachWorker) r0
            wx3.H(r1)
            r3 = r1
            r1 = r0
            r0 = r12
            goto L_0x015d
        L_0x004b:
            float r0 = r2.X
            java.lang.Object r3 = r2.o
            vk4 r3 = (defpackage.vk4) r3
            wx3.H(r1)
            r1 = r0
            r0 = r12
            goto L_0x00b8
        L_0x0057:
            wx3.H(r1)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            ude r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x016b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            ude r1 = r1.g()
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x0072
            goto L_0x016b
        L_0x0072:
            long r5 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r0.a
            long r7 = r3.G0
            long r7 = r5 - r7
            r16 = 500(0x1f4, double:2.47E-321)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0083
            return r15
        L_0x0083:
            r3.G0 = r5
            int r6 = a24.X(r19)
            r2.o = r0
            r1 = r19
            r2.X = r1
            r2.w0 = r4
            to8 r4 = r3.e()
            ude r5 = r3.g()
            long r7 = r5.a
            vo8 r4 = r4.q(r7)
            r16 = 0
            r5 = r14
            r7 = r20
            r0 = r9
            r9 = r22
            r11 = r16
            r0 = r12
            r12 = r2
            java.lang.Object r3 = r3.h(r4, r5, r6, r7, r9, r11, r12)
            if (r3 != r13) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r3 = r15
        L_0x00b3:
            if (r3 != r13) goto L_0x00b6
            return r13
        L_0x00b6:
            r3 = r18
        L_0x00b8:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r3.a
            to8 r4 = r4.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            ude r5 = r5.g()
            long r5 = r5.a
            vo8 r4 = r4.q(r5)
            if (r4 == 0) goto L_0x0113
            boolean r5 = r4.m()
            if (r5 == 0) goto L_0x0113
            v00 r5 = r4.g()
            if (r5 != 0) goto L_0x00ec
            boolean r5 = r4.C()
            if (r5 == 0) goto L_0x00e9
            j10 r5 = defpackage.j10.o
            jj7 r6 = r4.D0
            o10 r5 = r6.x(r5)
            n10 r12 = r5.d
            goto L_0x00ea
        L_0x00e9:
            r12 = r0
        L_0x00ea:
            if (r12 == 0) goto L_0x0113
        L_0x00ec:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            ude r5 = r5.g()
            java.lang.String r5 = r5.b
            o10 r5 = ete.x(r4, r5)
            if (r5 == 0) goto L_0x0113
            g10 r5 = r5.n
            if (r5 != r14) goto L_0x0113
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            nk4 r6 = new nk4
            long r7 = r4.o
            long r9 = r4.x0
            r18 = r6
            r19 = r1
            r20 = r7
            r22 = r9
            r18.<init>(r19, r20, r22)
            r5.H0 = r6
        L_0x0113:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            pk4 r1 = r1.H0
            boolean r4 = r1 instanceof defpackage.nk4
            if (r4 == 0) goto L_0x011f
            r12 = r1
            nk4 r12 = (defpackage.nk4) r12
            goto L_0x0120
        L_0x011f:
            r12 = r0
        L_0x0120:
            if (r12 != 0) goto L_0x0123
            return r15
        L_0x0123:
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0128
            goto L_0x0145
        L_0x0128:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0145
            tn7 r4 = defpackage.tn7.X
            float r5 = r12.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "update notification "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r4, r6, r5, r0)
        L_0x0145:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            float r4 = r12.a
            boolean r1 = r1.needToShowNotification(r4)
            if (r1 == 0) goto L_0x016b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            r2.o = r1
            r3 = 2
            r2.w0 = r3
            java.lang.Object r3 = r1.getForegroundInfo(r2)
            if (r3 != r13) goto L_0x015d
            return r13
        L_0x015d:
            hu5 r3 = (hu5) r3
            r2.o = r0
            r0 = 3
            r2.w0 = r0
            java.lang.Object r0 = r1.setForeground(r3, r2)
            if (r0 != r13) goto L_0x016b
            return r13
        L_0x016b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk4.c(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.sk4
            if (r0 == 0) goto L_0x0014
            r0 = r13
            sk4 r0 = (defpackage.sk4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            sk4 r0 = new sk4
            r0.<init>(r12, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r10.X
            pu3 r0 = pu3.a
            int r1 = r10.Z
            jue r11 = jue.a
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            vk4 r12 = r10.o
            wx3.H(r13)
            goto L_0x0093
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            wx3.H(r13)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x005f
            tn7 r3 = defpackage.tn7.X
            ude r13 = r13.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onFileDownloadCancelled: "
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            r4 = 0
            java.lang.String r5 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r3, r5, r13, r4)
        L_0x005f:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            ude r13 = r13.g()
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x0093
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r12.a
            g10 r3 = defpackage.g10.b
            int r4 = r1.F0
            r10.o = r12
            r10.Z = r2
            to8 r13 = r1.e()
            ude r2 = r1.g()
            long r5 = r2.a
            vo8 r2 = r13.q(r5)
            r9 = 0
            r5 = 0
            r7 = 0
            java.lang.Object r13 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r13 != r0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r13 = r11
        L_0x0090:
            if (r13 != r0) goto L_0x0093
            return r0
        L_0x0093:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r12 = r12.a
            jk4 r13 = defpackage.jk4.a
            r12.H0 = r13
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk4.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(boolean z, boolean z2) {
        pk4 pk4;
        g10 g10;
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            ude g = downloadFileAttachWorker.g();
            int i = downloadFileAttachWorker.E0.get();
            fn6.d(tn7, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadInterrupted: " + g + ", isNetworkProblem:" + z + ", retryCount:" + i, (Throwable) null);
        }
        if (this.a.g().h) {
            ((tt0) this.a.y0.getValue()).c(new dk4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        o10 x = ete.x(this.a.e().q(this.a.g().a), this.a.g().b);
        int incrementAndGet = z ? this.a.E0.incrementAndGet() : 0;
        DownloadFileAttachWorker downloadFileAttachWorker2 = this.a;
        if (x == null || (g10 = x.n) == null || !g10.a()) {
            pk4 = (!z || incrementAndGet > 10) ? new mk4(false) : new mk4(true);
        } else {
            udd.U("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. onFileDownloadInterrupted: cancelled outside!");
            pk4 = jk4.a;
        }
        downloadFileAttachWorker2.H0 = pk4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.io.File r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.tk4
            if (r0 == 0) goto L_0x0014
            r0 = r15
            tk4 r0 = (defpackage.tk4) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.w0 = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            tk4 r0 = new tk4
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.Y
            pu3 r0 = pu3.a
            int r1 = r10.w0
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.io.File r14 = r10.X
            vk4 r13 = r10.o
            wx3.H(r15)
            goto L_0x00d1
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            wx3.H(r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            ude r15 = r15.g()
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r1 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r3 = "onFileDownloadCompleted: %s"
            udd.p(r1, r3, r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            to8 r15 = r15.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            long r3 = r1.a
            vo8 r15 = r15.q(r3)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            long r3 = r1.e
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ac
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            r7e r1 = r1.Z
            java.lang.Object r1 = r1.getValue()
            u98 r1 = (defpackage.u98) r1
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r13.a
            bf5 r3 = r3.d()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r13.a
            ude r4 = r4.g()
            long r4 = r4.e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            mg5 r3 = (defpackage.mg5) r3
            java.io.File r3 = r3.l(r4)
            xh0 r1 = (defpackage.xh0) r1
            r1.b(r14, r3)
            if (r15 == 0) goto L_0x00ac
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            to8 r1 = r1.e()
            long r3 = r15.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r13.a
            ude r5 = r5.g()
            java.lang.String r5 = r5.b
            i74 r6 = new i74
            r7 = 7
            r6.<init>(r7)
            r1.v(r3, r5, r6)
        L_0x00ac:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00d1
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            g10 r3 = defpackage.g10.c
            r10.o = r13
            r10.X = r14
            r10.w0 = r2
            r5 = 0
            r7 = 0
            r4 = 100
            r2 = r15
            r9 = r14
            java.lang.Object r15 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r15 != r0) goto L_0x00d1
            return r0
        L_0x00d1:
            r15 = 0
            if (r14 == 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            ude r0 = r0.g()
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x0115
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            r7e r0 = r0.y0
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (tt0) r0
            bk4 r9 = new bk4
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            long r2 = r1.o
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            java.lang.String r6 = r1.g
            java.lang.String r7 = r14.getAbsolutePath()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            java.lang.String r8 = r1.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            long r4 = r1.a
            r1 = r9
            r1.<init>(r2, r4, r6, r7, r8)
            r0.c(r9)
        L_0x0115:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            ude r0 = r0.g()
            long r0 = r0.c
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            ude r0 = r0.g()
            boolean r0 = r0.n
            if (r0 != 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            r7e r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            u98 r0 = (defpackage.u98) r0
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            ude r1 = r1.g()
            long r1 = r1.c
            o6a r0 = (o6a) r0
            r7e r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            ou3 r1 = (ou3) r1
            n6a r2 = new n6a
            r2.<init>(r0, r14, r15)
            r0 = 3
            xs7.E(r1, r15, r15, r2, r0)
        L_0x0150:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            ude r0 = r0.g()
            long r0 = r0.j
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r14 = r15
        L_0x015e:
            if (r14 == 0) goto L_0x016d
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            r7e r15 = r15.z0
            java.lang.Object r15 = r15.getValue()
            wd5 r15 = (defpackage.wd5) r15
            r15.b(r14)
        L_0x016d:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r13.a
            kk4 r14 = defpackage.kk4.a
            r13.H0 = r14
            jue r13 = jue.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk4.f(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getDownloadContext() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        if (downloadFileAttachWorker.g().c > 0) {
            long j = downloadFileAttachWorker.g().a;
            long j2 = downloadFileAttachWorker.g().c;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(j2);
            return sb.toString();
        } else if (downloadFileAttachWorker.g().d > 0) {
            long j3 = downloadFileAttachWorker.g().a;
            long j4 = downloadFileAttachWorker.g().d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(j4);
            return sb2.toString();
        } else if (downloadFileAttachWorker.g().e > 0) {
            long j5 = downloadFileAttachWorker.g().a;
            long j6 = downloadFileAttachWorker.g().e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(j6);
            return sb3.toString();
        } else if (downloadFileAttachWorker.g().f > 0) {
            long j7 = downloadFileAttachWorker.g().a;
            long j8 = downloadFileAttachWorker.g().f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j7);
            sb4.append(j8);
            return sb4.toString();
        } else if (downloadFileAttachWorker.g().j > 0) {
            long j9 = downloadFileAttachWorker.g().a;
            long j10 = downloadFileAttachWorker.g().j;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(j9);
            sb5.append(j10);
            return sb5.toString();
        } else {
            throw new AssertionError("DownloadListener.getContext() must return not null value");
        }
    }
}
