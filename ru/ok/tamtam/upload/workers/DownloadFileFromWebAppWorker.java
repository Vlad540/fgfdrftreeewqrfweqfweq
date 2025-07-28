package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileFromWebAppWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "dl4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class DownloadFileFromWebAppWorker extends ForegroundWorker {
    public long A0;
    public volatile dl4 B0;
    public File C0;
    public final hl4 D0 = new hl4(this);
    public final r7e X = new r7e(new xk4(this, 4));
    public final r7e Y = new r7e(new xk4(this, 5));
    public final r7e Z = new r7e(new xk4(this, 6));
    public final r7e a = new r7e(new xk4(this, 0));
    public final r7e b = new r7e(new xk4(this, 1));
    public final r7e c = new r7e(new xk4(this, 2));
    public final r7e o = new r7e(new xk4(this, 3));
    public final r7e w0 = new r7e(new xk4(this, 7));
    public final r7e x0 = new r7e(new xk4(this, 8));
    public final r7e y0 = new r7e(new xk4(this, 9));
    public final AtomicInteger z0 = new AtomicInteger();

    public DownloadFileFromWebAppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final dee c() {
        return (dee) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        String str;
        PendingIntent c2 = itf.d(getApplicationContext()).c(getId());
        dl4 dl4 = this.B0;
        cl4 cl4 = dl4 instanceof cl4 ? (cl4) dl4 : null;
        if (cl4 != null) {
            f = cl4.a;
            j2 = cl4.b;
            j = cl4.c;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        String string = getApplicationContext().getString(((ae5) this.Z.getValue()).e);
        tf3 tf3 = (tf3) ((ap3) this.y0.getValue()).c(j).a.getValue();
        String d = tf3 != null ? tf3.d() : null;
        ae5 ae5 = (ae5) this.Z.getValue();
        try {
            File file = this.C0;
            if (file == null) {
                file = null;
            }
            str = file.getName();
        } catch (Throwable th) {
            str = new kcc(th);
        }
        if (str instanceof kcc) {
            str = "";
        }
        String str2 = string + " " + str;
        int X2 = a24.X(f);
        ae5.getClass();
        int hashCode = Long.hashCode(j);
        o7a o7a = ae5.b;
        o7a.getClass();
        sr7 sr7 = sr7.c;
        bff bff = bff.FROM_NOTIFICATION;
        sr7.getClass();
        return new hu5(((Number) this.b.getValue()).intValue(), ae5.a(d, str2, Long.valueOf(j2), false, X2, d8.p(ae5.a, hashCode, o7a.k(sr7.c2(j, bff, (String) null))), c2), 1);
    }

    public final tt0 d() {
        return (tt0) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[Catch:{ all -> 0x004e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107 A[Catch:{ all -> 0x0125 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.el4
            if (r2 == 0) goto L_0x0017
            r2 = r0
            el4 r2 = (defpackage.el4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            el4 r2 = new el4
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.X
            pu3 r10 = pu3.a
            int r3 = r2.Z
            yk4 r11 = defpackage.yk4.a
            jue r12 = jue.a
            r13 = 1
            r14 = 4
            r15 = 3
            r16 = 5
            r4 = 2
            java.lang.String r9 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r8 = 0
            if (r3 == 0) goto L_0x005f
            if (r3 == r13) goto L_0x0059
            if (r3 == r4) goto L_0x0052
            if (r3 == r15) goto L_0x0046
            if (r3 != r14) goto L_0x003e
            wx3.H(r0)
            goto L_0x01d7
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004e }
            r14 = r9
            goto L_0x0108
        L_0x004e:
            r0 = move-exception
            r14 = r9
            goto L_0x0188
        L_0x0052:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004e }
            goto L_0x00dc
        L_0x0059:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004e }
            goto L_0x008d
        L_0x005f:
            wx3.H(r0)
            java.lang.String r0 = "File download. doWork %s"
            dee r3 = r17.c()     // Catch:{ all -> 0x004e }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x004e }
            udd.p(r9, r0, r3)     // Catch:{ all -> 0x004e }
            r7e r0 = r1.w0     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            pae r0 = (defpackage.pae) r0     // Catch:{ all -> 0x004e }
            n3a r0 = (n3a) r0     // Catch:{ all -> 0x004e }
            ju3 r0 = r0.b()     // Catch:{ all -> 0x004e }
            fl4 r3 = new fl4     // Catch:{ all -> 0x004e }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.Z = r13     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = xs7.U(r0, r3, r2)     // Catch:{ all -> 0x004e }
            if (r0 != r10) goto L_0x008d
            return r10
        L_0x008d:
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x004e }
            r1.C0 = r0     // Catch:{ all -> 0x004e }
            r7e r0 = r1.x0     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            ed3 r0 = (defpackage.ed3) r0     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.getClass()     // Catch:{ all -> 0x004e }
            r2.Z = r4     // Catch:{ all -> 0x004e }
            zv1 r3 = new zv1     // Catch:{ all -> 0x004e }
            kotlin.coroutines.Continuation r4 = urd.y(r2)     // Catch:{ all -> 0x004e }
            r3.<init>(r13, r4)     // Catch:{ all -> 0x004e }
            r3.n()     // Catch:{ all -> 0x004e }
            boolean r4 = r0.f()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x00b6
            r3.resumeWith(r12)     // Catch:{ all -> 0x004e }
            goto L_0x00d5
        L_0x00b6:
            mo1 r4 = new mo1     // Catch:{ all -> 0x004e }
            r5 = 1
            r4.<init>(r0, r3, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "Network connection lost, waiting network."
            udd.q(r5, r6)     // Catch:{ all -> 0x004e }
            r0.c(r4)     // Catch:{ all -> 0x004e }
            ph2 r5 = new ph2     // Catch:{ all -> 0x004e }
            r6 = 2
            r5.<init>(r0, r6, r4)     // Catch:{ all -> 0x004e }
            r3.d(r5)     // Catch:{ all -> 0x004e }
        L_0x00d5:
            java.lang.Object r0 = r3.m()     // Catch:{ all -> 0x004e }
            if (r0 != r10) goto L_0x00dc
            return r10
        L_0x00dc:
            r7e r0 = r1.X     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004e }
            j5e r0 = (defpackage.j5e) r0     // Catch:{ all -> 0x004e }
            dee r3 = r1.c()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = r3.c     // Catch:{ all -> 0x004e }
            java.io.File r3 = r1.C0     // Catch:{ all -> 0x004e }
            if (r3 != 0) goto L_0x00f0
            r5 = r8
            goto L_0x00f1
        L_0x00f0:
            r5 = r3
        L_0x00f1:
            hl4 r6 = r1.D0     // Catch:{ all -> 0x004e }
            r2.o = r1     // Catch:{ all -> 0x004e }
            r2.getClass()     // Catch:{ all -> 0x004e }
            r2.Z = r15     // Catch:{ all -> 0x004e }
            k5e r3 = r0.a     // Catch:{ all -> 0x004e }
            r7 = 0
            r0 = 1
            r8 = r0
            r14 = r9
            r9 = r2
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0125 }
            if (r0 != r10) goto L_0x0108
            return r10
        L_0x0108:
            h5e r0 = (defpackage.h5e) r0     // Catch:{ all -> 0x0125 }
            h5e r3 = defpackage.h5e.a     // Catch:{ all -> 0x0125 }
            if (r0 != r3) goto L_0x0127
            java.lang.String r0 = "File download. Process: already downloading file %s"
            dee r3 = r1.c()     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0125 }
            udd.p(r14, r0, r3)     // Catch:{ all -> 0x0125 }
            zy3 r0 = defpackage.me4.a(r13)     // Catch:{ all -> 0x0125 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            return r3
        L_0x0125:
            r0 = move-exception
            goto L_0x0188
        L_0x0127:
            dl4 r0 = r1.B0     // Catch:{ all -> 0x0125 }
            boolean r3 = r0 instanceof defpackage.bl4     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0146
            bl4 r0 = (defpackage.bl4) r0     // Catch:{ all -> 0x0125 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x013a
            eh7 r0 = new eh7     // Catch:{ all -> 0x0125 }
            r0.<init>()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x013a:
            zy3 r0 = defpackage.me4.a(r15)     // Catch:{ all -> 0x0125 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
        L_0x0143:
            r0 = r3
            goto L_0x01e1
        L_0x0146:
            al4 r3 = defpackage.al4.a     // Catch:{ all -> 0x0125 }
            boolean r3 = hhd.f(r0, r3)     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0159
            r3 = 4
            zy3 r0 = defpackage.me4.a(r3)     // Catch:{ all -> 0x0125 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0143
        L_0x0159:
            boolean r3 = hhd.f(r0, r11)     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0169
            zy3 r0 = defpackage.me4.a(r16)     // Catch:{ all -> 0x0125 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0125 }
            r3.<init>(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0143
        L_0x0169:
            zk4 r3 = defpackage.zk4.a     // Catch:{ all -> 0x0125 }
            boolean r3 = hhd.f(r0, r3)     // Catch:{ all -> 0x0125 }
            if (r3 != 0) goto L_0x0183
            if (r0 != 0) goto L_0x0174
            goto L_0x0183
        L_0x0174:
            boolean r0 = r0 instanceof defpackage.cl4     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x017d
            fh7 r0 = gh7.b()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x017d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0125 }
            r0.<init>()     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0183:
            fh7 r0 = gh7.b()     // Catch:{ all -> 0x0125 }
            goto L_0x01e1
        L_0x0188:
            java.lang.String r3 = "File download. Cancelled!"
            udd.S(r14, r3, r0)
            r3 = 0
            r2.o = r3
            r2.getClass()
            r4 = 4
            r2.Z = r4
            java.io.File r8 = r1.C0
            if (r8 != 0) goto L_0x019b
            r8 = r3
        L_0x019b:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r4 = "File download. CancelLoading: %s"
            udd.p(r14, r4, r0)
            tt0 r0 = r1.d()
            od5 r4 = new od5
            dee r5 = r1.c()
            long r5 = r5.a
            dee r7 = r1.c()
            java.lang.String r7 = r7.c
            r4.<init>(r5)
            r0.c(r4)
            r1.B0 = r11
            r7e r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            j5e r0 = (defpackage.j5e) r0
            java.io.File r8 = r1.C0
            if (r8 != 0) goto L_0x01cb
            r8 = r3
        L_0x01cb:
            k5e r0 = r0.a
            java.lang.Object r0 = r0.b(r8, r3, r2)
            if (r0 != r10) goto L_0x01d4
            r12 = r0
        L_0x01d4:
            if (r12 != r10) goto L_0x01d7
            return r10
        L_0x01d7:
            zy3 r0 = defpackage.me4.a(r16)
            dh7 r1 = new dh7
            r1.<init>(r0)
            r0 = r1
        L_0x01e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ju3 getCoroutineContext() {
        return (ju3) ((pae) this.w0.getValue()).d.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    public final Object onStopWork(Continuation continuation) {
        udd.q("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "File download. OnStopWork");
        tt0 d = d();
        long j = c().a;
        String str = c().c;
        d.c(new od5(j));
        this.B0 = yk4.a;
        j5e j5e = (j5e) this.X.getValue();
        File file = this.C0;
        if (file == null) {
            file = null;
        }
        Object c2 = j5e.a.c(file, (String) null, continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }
}
