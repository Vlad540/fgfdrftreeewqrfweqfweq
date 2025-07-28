package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadExternalGifWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "swe", "owe", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadExternalGifWorker extends ForegroundWorker {
    public final r7e A0 = new r7e(new mwe(this, 5));
    public final r7e B0 = new r7e(new mwe(this, 6));
    public long C0;
    public volatile swe D0;
    public final uwe E0 = new uwe(this);
    public final r7e X = new r7e(new mwe(this, 10));
    public final r7e Y = new r7e(new mwe(this, 11));
    public final r7e Z = new r7e(new mwe(this, 12));
    public final r7e a = new r7e(new mwe(this, 0));
    public final r7e b = new r7e(new mwe(this, 7));
    public final r7e c = new r7e(new mwe(this, 8));
    public final r7e o = new r7e(new mwe(this, 9));
    public final r7e w0 = new r7e(new mwe(this, 1));
    public final r7e x0 = new r7e(new mwe(this, 2));
    public final r7e y0 = new r7e(new mwe(this, 3));
    public final r7e z0 = new r7e(new mwe(this, 4));

    public UploadExternalGifWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static final void c(UploadExternalGifWorker uploadExternalGifWorker) {
        i22 B = ((t52) uploadExternalGifWorker.X.getValue()).B(uploadExternalGifWorker.d().e);
        if (B != null) {
            long j = B.b.a;
            long j2 = uploadExternalGifWorker.d().d;
            ((eha) uploadExternalGifWorker.Z.getValue()).getClass();
            eha.b(j, j2);
        }
        ((wd5) uploadExternalGifWorker.y0.getValue()).b(((mg5) ((bf5) uploadExternalGifWorker.c.getValue())).n(uploadExternalGifWorker.d().f));
    }

    public final Object createForegroundInfo(Continuation continuation) {
        wia wia;
        String str;
        swe swe = this.D0;
        if (swe instanceof rwe) {
            rwe rwe = (rwe) swe;
            wia = new wia(new Float(rwe.a), new Long(rwe.b));
        } else {
            wia = new wia(new Float(-1.0f), new Long(0));
        }
        float floatValue = ((Number) wia.a).floatValue();
        long longValue = ((Number) wia.b).longValue();
        PendingIntent c2 = itf.d(getApplicationContext()).c(getId());
        i22 B = ((t52) this.X.getValue()).B(d().e);
        ae5 ae5 = (ae5) this.B0.getValue();
        long j = d().e;
        Long l = new Long(longValue);
        Long l2 = new Long(d().d);
        if (B == null || (str = B.p()) == null) {
            str = "";
        }
        return new hu5(((Number) this.b.getValue()).intValue(), ae5.b(j, l, l2, str, getApplicationContext().getString(((ae5) this.B0.getValue()).g), (int) floatValue, false, c2), 1);
    }

    public final owe d() {
        return (owe) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab A[Catch:{ all -> 0x003a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bd A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.twe
            if (r2 == 0) goto L_0x0017
            r2 = r1
            twe r2 = (defpackage.twe) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x0 = r3
            goto L_0x001c
        L_0x0017:
            twe r2 = new twe
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            pu3 r3 = pu3.a
            int r4 = r2.x0
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker"
            if (r4 == 0) goto L_0x005e
            if (r4 == r7) goto L_0x004e
            if (r4 == r6) goto L_0x0045
            if (r4 != r5) goto L_0x003d
            gh7 r0 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.o
            wx3.H(r1)     // Catch:{ all -> 0x003a }
            r1 = r0
            r0 = r4
            goto L_0x00d1
        L_0x003a:
            r0 = move-exception
            goto L_0x01e0
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            gh7 r0 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r4 = r2.o
            wx3.H(r1)     // Catch:{ all -> 0x003a }
            goto L_0x017e
        L_0x004e:
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r0 = r2.Y
            gh7 r4 = r2.X
            ru.ok.tamtam.upload.workers.UploadExternalGifWorker r9 = r2.o
            wx3.H(r1)     // Catch:{ all -> 0x003a }
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x016a
        L_0x005e:
            wx3.H(r1)
            java.lang.String r1 = "doWork"
            udd.q(r8, r1)
            fh7 r1 = gh7.b()
            r7e r4 = r0.X     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            t52 r4 = (defpackage.t52) r4     // Catch:{ all -> 0x003a }
            owe r9 = r17.d()     // Catch:{ all -> 0x003a }
            long r9 = r9.e     // Catch:{ all -> 0x003a }
            i22 r4 = r4.B(r9)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0096
            r7e r9 = r0.Z     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003a }
            r10 = r9
            eha r10 = (defpackage.eha) r10     // Catch:{ all -> 0x003a }
            o62 r4 = r4.b     // Catch:{ all -> 0x003a }
            long r11 = r4.a     // Catch:{ all -> 0x003a }
            e00 r13 = defpackage.e00.PHOTO     // Catch:{ all -> 0x003a }
            owe r4 = r17.d()     // Catch:{ all -> 0x003a }
            long r14 = r4.d     // Catch:{ all -> 0x003a }
            r10.f(r11, r13, r14)     // Catch:{ all -> 0x003a }
        L_0x0096:
            r7e r4 = r0.c     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            bf5 r4 = (defpackage.bf5) r4     // Catch:{ all -> 0x003a }
            owe r9 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r9.f     // Catch:{ all -> 0x003a }
            mg5 r4 = (defpackage.mg5) r4     // Catch:{ all -> 0x003a }
            java.io.File r4 = r4.n(r9)     // Catch:{ all -> 0x003a }
            boolean r9 = lp.n(r4)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x00b6
            uwe r9 = r0.E0     // Catch:{ all -> 0x003a }
            r9.e(r4)     // Catch:{ all -> 0x003a }
            goto L_0x00d1
        L_0x00b6:
            r7e r9 = r0.Y     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x003a }
            cm6 r9 = (defpackage.cm6) r9     // Catch:{ all -> 0x003a }
            owe r10 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x003a }
            uwe r11 = r0.E0     // Catch:{ all -> 0x003a }
            owe r12 = r17.d()     // Catch:{ all -> 0x003a }
            java.lang.String r12 = r12.f     // Catch:{ all -> 0x003a }
            em6 r9 = r9.a     // Catch:{ all -> 0x003a }
            r9.b(r10, r4, r11, r12)     // Catch:{ all -> 0x003a }
        L_0x00d1:
            boolean r4 = r0.isStopped()     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x01ac
            r7e r4 = r0.X     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x003a }
            t52 r4 = (defpackage.t52) r4     // Catch:{ all -> 0x003a }
            owe r9 = r0.d()     // Catch:{ all -> 0x003a }
            long r9 = r9.e     // Catch:{ all -> 0x003a }
            i22 r4 = r4.B(r9)     // Catch:{ all -> 0x003a }
            gk9 r9 = gk9.Y
            if (r4 != 0) goto L_0x00ef
            r0.D0 = r9     // Catch:{ all -> 0x003a }
        L_0x00ef:
            swe r4 = r0.D0     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x019b
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0106
            r1 = 5
            zy3 r1 = defpackage.me4.a(r1)     // Catch:{ all -> 0x003a }
            dh7 r2 = new dh7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
        L_0x0103:
            r1 = r2
            goto L_0x01ac
        L_0x0106:
            boolean r9 = r4 instanceof defpackage.qwe     // Catch:{ all -> 0x003a }
            if (r9 != 0) goto L_0x01ac
            boolean r9 = r4 instanceof defpackage.pwe     // Catch:{ all -> 0x003a }
            if (r9 != 0) goto L_0x01ac
            hk9 r9 = hk9.Z     // Catch:{ all -> 0x003a }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0121
            r1 = 4
            zy3 r1 = defpackage.me4.a(r1)     // Catch:{ all -> 0x003a }
            dh7 r2 = new dh7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0121:
            jk9 r9 = jk9.z0     // Catch:{ all -> 0x003a }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0133
            zy3 r1 = defpackage.me4.a(r5)     // Catch:{ all -> 0x003a }
            dh7 r2 = new dh7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0133:
            boolean r9 = r4 instanceof defpackage.rwe     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0181
            r9 = r4
            rwe r9 = (defpackage.rwe) r9     // Catch:{ all -> 0x003a }
            float r9 = r9.a     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r10.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r11 = "progress "
            r10.append(r11)     // Catch:{ all -> 0x003a }
            r10.append(r9)     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x003a }
            udd.q(r8, r9)     // Catch:{ all -> 0x003a }
            rwe r4 = (defpackage.rwe) r4     // Catch:{ all -> 0x003a }
            float r4 = r4.a     // Catch:{ all -> 0x003a }
            boolean r4 = r0.needToShowNotification(r4)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x019b
            r2.o = r0     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r2.Y = r0     // Catch:{ all -> 0x003a }
            r2.x0 = r7     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r0.getForegroundInfo(r2)     // Catch:{ all -> 0x003a }
            if (r4 != r3) goto L_0x0169
            return r3
        L_0x0169:
            r9 = r0
        L_0x016a:
            hu5 r4 = (hu5) r4     // Catch:{ all -> 0x003a }
            r2.o = r9     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r10 = 0
            r2.Y = r10     // Catch:{ all -> 0x003a }
            r2.x0 = r6     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r0.setForeground(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 != r3) goto L_0x017c
            return r3
        L_0x017c:
            r0 = r1
            r4 = r9
        L_0x017e:
            r1 = r0
            r0 = r4
            goto L_0x019b
        L_0x0181:
            kk9 r1 = kk9.z0     // Catch:{ all -> 0x003a }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0195
            r1 = 6
            zy3 r1 = defpackage.me4.a(r1)     // Catch:{ all -> 0x003a }
            dh7 r2 = new dh7     // Catch:{ all -> 0x003a }
            r2.<init>(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0103
        L_0x0195:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x019b:
            long r9 = r0.getWorkDelay()     // Catch:{ all -> 0x003a }
            r2.o = r0     // Catch:{ all -> 0x003a }
            r2.X = r1     // Catch:{ all -> 0x003a }
            r2.x0 = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = defpackage.ek8.q(r9, r2)     // Catch:{ all -> 0x003a }
            if (r4 != r3) goto L_0x00d1
            return r3
        L_0x01ac:
            java.lang.String r2 = "doWork %s"
            swe r3 = r0.D0     // Catch:{ all -> 0x003a }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x003a }
            udd.p(r8, r2, r3)     // Catch:{ all -> 0x003a }
            swe r2 = r0.D0     // Catch:{ all -> 0x003a }
            boolean r3 = r2 instanceof defpackage.pwe     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x01e9
            r7e r3 = r0.z0     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x003a }
            r9 = r3
            uc5 r9 = (defpackage.uc5) r9     // Catch:{ all -> 0x003a }
            pwe r2 = (defpackage.pwe) r2     // Catch:{ all -> 0x003a }
            r65 r10 = r2.a     // Catch:{ all -> 0x003a }
            owe r2 = r0.d()     // Catch:{ all -> 0x003a }
            long r11 = r2.d     // Catch:{ all -> 0x003a }
            owe r2 = r0.d()     // Catch:{ all -> 0x003a }
            long r13 = r2.e     // Catch:{ all -> 0x003a }
            owe r0 = r0.d()     // Catch:{ all -> 0x003a }
            java.lang.String r15 = r0.c     // Catch:{ all -> 0x003a }
            r9.c(r10, r11, r13, r15)     // Catch:{ all -> 0x003a }
            goto L_0x01e9
        L_0x01e0:
            java.lang.String r1 = "failure!"
            udd.s(r8, r1, r0)
            dh7 r1 = gh7.a()
        L_0x01e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadExternalGifWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getName() {
        String e = getInputData().e("taskName");
        return e == null ? "ru.ok.tamtam.upload.workers.UploadExternalGifWorker" : e;
    }
}
