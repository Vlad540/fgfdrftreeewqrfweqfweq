package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/upload/workers/DownloadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "pk4", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class DownloadFileAttachWorker extends ForegroundWorker {
    public final r7e A0 = new r7e(new hk4(this, 8));
    public final r7e B0 = new r7e(new hk4(this, 9));
    public final r7e C0 = new r7e(new hk4(this, 10));
    public final r7e D0 = new r7e(new hk4(this, 11));
    public final AtomicInteger E0 = new AtomicInteger();
    public int F0;
    public long G0;
    public volatile pk4 H0;
    public File I0;
    public final vk4 J0 = new vk4(this);
    public final r7e X = new r7e(new hk4(this, 1));
    public final r7e Y = new r7e(new hk4(this, 2));
    public final r7e Z = new r7e(new hk4(this, 3));
    public final r7e a = new r7e(new hk4(this, 0));
    public final r7e b = new r7e(new hk4(this, 12));
    public final r7e c = new r7e(new hk4(this, 13));
    public final r7e o = new r7e(new hk4(this, 14));
    public final r7e w0 = new r7e(new hk4(this, 4));
    public final r7e x0 = new r7e(new hk4(this, 5));
    public final r7e y0 = new r7e(new hk4(this, 6));
    public final r7e z0 = new r7e(new hk4(this, 7));

    public DownloadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Object c(er3 er3) {
        File file = this.I0;
        File file2 = null;
        if (file == null) {
            file = null;
        }
        udd.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. CancelLoading: %s", new Object[]{file});
        j5e j5e = (j5e) this.Y.getValue();
        File file3 = this.I0;
        if (file3 != null) {
            file2 = file3;
        }
        Object b2 = j5e.a.b(file2, g().b, er3);
        return b2 == pu3.a ? b2 : jue.a;
    }

    public final Object createForegroundInfo(Continuation continuation) {
        long j;
        long j2;
        float f;
        String str;
        PendingIntent c2 = itf.d(getApplicationContext()).c(getId());
        pk4 pk4 = this.H0;
        File file = null;
        nk4 nk4 = pk4 instanceof nk4 ? (nk4) pk4 : null;
        if (nk4 != null) {
            f = nk4.a;
            long j3 = nk4.b;
            j2 = nk4.c;
            j = j3;
        } else {
            j2 = 0;
            f = -1.0f;
            j = 0;
        }
        i22 B = ((t52) this.X.getValue()).B(j2);
        String string = getApplicationContext().getString(((ae5) this.A0.getValue()).e);
        ae5 ae5 = (ae5) this.A0.getValue();
        Long l = new Long(j);
        Long l2 = new Long(g().a);
        String p = B != null ? B.p() : null;
        try {
            File file2 = this.I0;
            if (file2 != null) {
                file = file2;
            }
            str = file.getName();
        } catch (Throwable th) {
            str = new kcc(th);
        }
        if (str instanceof kcc) {
            str = "";
        }
        return new hu5(((Number) this.b.getValue()).intValue(), ae5.b(j2, l, l2, p, string + " " + str, a24.X(f), false, c2), 1);
    }

    public final bf5 d() {
        return (bf5) this.c.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[Catch:{ all -> 0x0048 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof defpackage.qk4
            if (r2 == 0) goto L_0x0017
            r2 = r0
            qk4 r2 = (defpackage.qk4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            qk4 r2 = new qk4
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.X
            pu3 r10 = pu3.a
            int r3 = r2.Z
            r11 = 1
            r12 = 4
            r4 = 2
            r13 = 3
            r14 = 5
            java.lang.String r15 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r9 = 0
            if (r3 == 0) goto L_0x0058
            if (r3 == r11) goto L_0x0052
            if (r3 == r4) goto L_0x004b
            if (r3 == r13) goto L_0x0041
            if (r3 != r12) goto L_0x0039
            wx3.H(r0)
            goto L_0x01a1
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0117
        L_0x0048:
            r0 = move-exception
            goto L_0x018d
        L_0x004b:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x00e3
        L_0x0052:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0086
        L_0x0058:
            wx3.H(r0)
            java.lang.String r0 = "File download. doWork %s"
            ude r3 = r16.g()     // Catch:{ all -> 0x0048 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0048 }
            udd.p(r15, r0, r3)     // Catch:{ all -> 0x0048 }
            r7e r0 = r1.B0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            pae r0 = (defpackage.pae) r0     // Catch:{ all -> 0x0048 }
            n3a r0 = (n3a) r0     // Catch:{ all -> 0x0048 }
            ju3 r0 = r0.b()     // Catch:{ all -> 0x0048 }
            rk4 r3 = new rk4     // Catch:{ all -> 0x0048 }
            r3.<init>(r1, r9)     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.Z = r11     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = xs7.U(r0, r3, r2)     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x0086
            return r10
        L_0x0086:
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0094
            zy3 r0 = defpackage.me4.a(r4)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0094:
            r1.I0 = r0     // Catch:{ all -> 0x0048 }
            r7e r0 = r1.C0     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            ed3 r0 = (defpackage.ed3) r0     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.getClass()     // Catch:{ all -> 0x0048 }
            r2.Z = r4     // Catch:{ all -> 0x0048 }
            zv1 r3 = new zv1     // Catch:{ all -> 0x0048 }
            kotlin.coroutines.Continuation r4 = urd.y(r2)     // Catch:{ all -> 0x0048 }
            r3.<init>(r11, r4)     // Catch:{ all -> 0x0048 }
            r3.n()     // Catch:{ all -> 0x0048 }
            boolean r4 = r0.f()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x00bd
            jue r0 = jue.a     // Catch:{ all -> 0x0048 }
            r3.resumeWith(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x00dc
        L_0x00bd:
            mo1 r4 = new mo1     // Catch:{ all -> 0x0048 }
            r5 = 1
            r4.<init>(r0, r3, r5)     // Catch:{ all -> 0x0048 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "Network connection lost, waiting network."
            udd.q(r5, r6)     // Catch:{ all -> 0x0048 }
            r0.c(r4)     // Catch:{ all -> 0x0048 }
            ph2 r5 = new ph2     // Catch:{ all -> 0x0048 }
            r6 = 2
            r5.<init>(r0, r6, r4)     // Catch:{ all -> 0x0048 }
            r3.d(r5)     // Catch:{ all -> 0x0048 }
        L_0x00dc:
            java.lang.Object r0 = r3.m()     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x00e3
            return r10
        L_0x00e3:
            r7e r0 = r1.Y     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0048 }
            j5e r0 = (defpackage.j5e) r0     // Catch:{ all -> 0x0048 }
            ude r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r3.g     // Catch:{ all -> 0x0048 }
            java.io.File r3 = r1.I0     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x00f7
            r5 = r9
            goto L_0x00f8
        L_0x00f7:
            r5 = r3
        L_0x00f8:
            vk4 r6 = r1.J0     // Catch:{ all -> 0x0048 }
            ude r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.String r7 = r3.b     // Catch:{ all -> 0x0048 }
            ude r3 = r1.g()     // Catch:{ all -> 0x0048 }
            boolean r8 = r3.m     // Catch:{ all -> 0x0048 }
            r2.o = r1     // Catch:{ all -> 0x0048 }
            r2.getClass()     // Catch:{ all -> 0x0048 }
            r2.Z = r13     // Catch:{ all -> 0x0048 }
            k5e r3 = r0.a     // Catch:{ all -> 0x0048 }
            r9 = r2
            java.lang.Object r0 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0048 }
            if (r0 != r10) goto L_0x0117
            return r10
        L_0x0117:
            h5e r0 = (defpackage.h5e) r0     // Catch:{ all -> 0x0048 }
            h5e r3 = defpackage.h5e.a     // Catch:{ all -> 0x0048 }
            if (r0 != r3) goto L_0x0134
            java.lang.String r0 = "File download. Process: already downloading file %s"
            ude r3 = r1.g()     // Catch:{ all -> 0x0048 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0048 }
            udd.p(r15, r0, r3)     // Catch:{ all -> 0x0048 }
            zy3 r0 = defpackage.me4.a(r11)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0134:
            pk4 r0 = r1.H0     // Catch:{ all -> 0x0048 }
            boolean r3 = r0 instanceof defpackage.mk4     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0151
            mk4 r0 = (defpackage.mk4) r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.a     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0146
            eh7 r0 = new eh7     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x01ab
        L_0x0146:
            zy3 r0 = defpackage.me4.a(r13)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
        L_0x014f:
            r0 = r3
            goto L_0x01ab
        L_0x0151:
            lk4 r3 = defpackage.lk4.a     // Catch:{ all -> 0x0048 }
            boolean r3 = hhd.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0163
            zy3 r0 = defpackage.me4.a(r12)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0163:
            jk4 r3 = defpackage.jk4.a     // Catch:{ all -> 0x0048 }
            boolean r3 = hhd.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0175
            zy3 r0 = defpackage.me4.a(r14)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0175:
            ok4 r3 = defpackage.ok4.a     // Catch:{ all -> 0x0048 }
            boolean r0 = hhd.f(r0, r3)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0188
            r0 = 6
            zy3 r0 = defpackage.me4.a(r0)     // Catch:{ all -> 0x0048 }
            dh7 r3 = new dh7     // Catch:{ all -> 0x0048 }
            r3.<init>(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x014f
        L_0x0188:
            fh7 r0 = gh7.b()     // Catch:{ all -> 0x0048 }
            goto L_0x01ab
        L_0x018d:
            java.lang.String r3 = "File download. Cancelled!"
            udd.S(r15, r3, r0)
            r3 = 0
            r2.o = r3
            r2.getClass()
            r2.Z = r12
            java.lang.Object r0 = r1.c(r2)
            if (r0 != r10) goto L_0x01a1
            return r10
        L_0x01a1:
            zy3 r0 = defpackage.me4.a(r14)
            dh7 r1 = new dh7
            r1.<init>(r0)
            r0 = r1
        L_0x01ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final to8 e() {
        return (to8) this.o.getValue();
    }

    public final ude g() {
        return (ude) this.a.getValue();
    }

    public final ju3 getCoroutineContext() {
        return (ju3) ((pae) this.B0.getValue()).d.getValue();
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker" : e;
    }

    public final long getWorkDelay() {
        return 500;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.vo8 r23, defpackage.g10 r24, int r25, long r26, long r28, java.io.File r30, kotlin.coroutines.Continuation r31) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r10 = r25
            r2 = r31
            boolean r3 = r2 instanceof defpackage.wk4
            if (r3 == 0) goto L_0x001b
            r3 = r2
            wk4 r3 = (defpackage.wk4) r3
            int r4 = r3.x0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.x0 = r4
            goto L_0x0020
        L_0x001b:
            wk4 r3 = new wk4
            r3.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r3.Z
            pu3 r4 = pu3.a
            int r5 = r3.x0
            jue r11 = jue.a
            r6 = 1
            if (r5 == 0) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            long r0 = r3.Y
            vo8 r4 = r3.X
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r3.o
            wx3.H(r2)
            r13 = r0
            r0 = r3
            r1 = r4
            goto L_0x0084
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            wx3.H(r2)
            if (r1 == 0) goto L_0x004d
            ls8 r2 = r1.z0
            ls8 r5 = defpackage.ls8.DELETED
            if (r2 != r5) goto L_0x0051
        L_0x004d:
            r31 = r11
            goto L_0x0157
        L_0x0051:
            ude r2 = r22.g()
            java.lang.String r2 = r2.b
            o10 r12 = ete.x(r1, r2)
            if (r12 != 0) goto L_0x005e
            return r11
        L_0x005e:
            g10 r2 = r12.n
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x009b
            boolean r2 = r24.a()
            if (r2 != 0) goto L_0x009b
            java.lang.String r2 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r5 = "File download. updateAttachStatus: cancelled!"
            udd.U(r2, r5)
            r3.o = r0
            r3.X = r1
            r13 = r28
            r3.Y = r13
            r3.x0 = r6
            java.lang.Object r2 = r0.c(r3)
            if (r2 != r4) goto L_0x0084
            return r4
        L_0x0084:
            jk4 r2 = defpackage.jk4.a
            r0.H0 = r2
            r7e r0 = r0.D0
            java.lang.Object r0 = r0.getValue()
            gz r0 = (defpackage.gz) r0
            kyb r2 = new kyb
            long r3 = r1.b
            r2.<init>(r3, r13)
            r0.a(r2)
            return r11
        L_0x009b:
            r13 = r28
            r0.F0 = r10
            to8 r15 = r22.e()
            ude r2 = r22.g()
            long r7 = r2.a
            java.lang.String r9 = r12.q
            ik4 r5 = new ik4
            r2 = r5
            r3 = r24
            r4 = r25
            r13 = r5
            r5 = r26
            r31 = r11
            r10 = r7
            r7 = r28
            r14 = r9
            r9 = r30
            r2.<init>(r3, r4, r5, r7, r9)
            r15.v(r10, r14, r13)
            int r2 = r24.ordinal()
            r3 = 2
            if (r2 == r3) goto L_0x0126
            r3 = 4
            if (r2 == r3) goto L_0x00e2
            r7e r2 = r0.D0
            java.lang.Object r2 = r2.getValue()
            gz r2 = (defpackage.gz) r2
            kyb r3 = new kyb
            long r4 = r1.b
            long r6 = r12.t
            r3.<init>(r4, r6)
            r2.a(r3)
            goto L_0x013a
        L_0x00e2:
            boolean r2 = r12.c()
            r3 = 0
            if (r2 == 0) goto L_0x00ec
            v00 r2 = r12.j
            goto L_0x00ed
        L_0x00ec:
            r2 = r3
        L_0x00ed:
            r7e r4 = r0.D0
            java.lang.Object r4 = r4.getValue()
            gz r4 = (defpackage.gz) r4
            long r13 = r1.b
            r5 = r25
            float r5 = (float) r5
            if (r2 == 0) goto L_0x0106
            long r6 = r2.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            r20 = r8
            goto L_0x0108
        L_0x0106:
            r20 = r3
        L_0x0108:
            if (r2 == 0) goto L_0x0114
            long r2 = r2.b
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r2)
            r21 = r6
            goto L_0x0116
        L_0x0114:
            r21 = r3
        L_0x0116:
            jyb r2 = new jyb
            r12 = r2
            r15 = r28
            r17 = r5
            r18 = r26
            r12.<init>(r13, r15, r17, r18, r20, r21)
            r4.a(r2)
            goto L_0x013a
        L_0x0126:
            r7e r2 = r0.D0
            java.lang.Object r2 = r2.getValue()
            gz r2 = (defpackage.gz) r2
            lyb r3 = new lyb
            long r4 = r1.b
            long r6 = r12.t
            r3.<init>(r4, r6)
            r2.a(r3)
        L_0x013a:
            r7e r0 = r0.y0
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (tt0) r0
            ove r2 = new ove
            long r3 = r1.x0
            long r5 = r1.b
            r1 = 0
            r22 = r2
            r23 = r3
            r25 = r5
            r27 = r1
            r22.<init>(r23, r25, r27)
            r0.c(r2)
        L_0x0157:
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.DownloadFileAttachWorker.h(vo8, g10, int, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object onStopWork(Continuation continuation) {
        udd.q("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. OnStopWork");
        j5e j5e = (j5e) this.Y.getValue();
        File file = this.I0;
        if (file == null) {
            file = null;
        }
        Object c2 = j5e.a.c(file, g().b, continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }
}
