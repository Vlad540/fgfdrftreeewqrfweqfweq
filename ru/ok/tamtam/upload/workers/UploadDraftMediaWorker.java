package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadDraftMediaWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadDraftMediaWorker extends ForegroundWorker {
    public c97 A0;
    public volatile float B0 = -1.0f;
    public volatile gh7 C0;
    public final r7e X = new r7e(new hwe(this, 7));
    public final r7e Y = new r7e(new hwe(this, 8));
    public final r7e Z = new r7e(new hwe(this, 9));
    public final r7e a = new r7e(new hwe(this, 0));
    public final r7e b = new r7e(new hwe(this, 4));
    public final r7e c = new r7e(new hwe(this, 5));
    public final r7e o = new r7e(new hwe(this, 6));
    public final r7e w0 = new r7e(new hwe(this, 10));
    public final r7e x0 = new r7e(new hwe(this, 1));
    public final r7e y0 = new r7e(new hwe(this, 2));
    public final r7e z0 = new r7e(new hwe(this, 3));

    public UploadDraftMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final t52 c() {
        return (t52) this.o.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        String string;
        PendingIntent c2 = itf.d(getApplicationContext()).c(getId());
        i22 B = c().B(d().a.a);
        if (B == null) {
            i();
        }
        ae5 ae5 = (ae5) this.x0.getValue();
        long j = d().a.a;
        if (B == null || (string = B.p()) == null) {
            string = getApplicationContext().getString(((ae5) this.x0.getValue()).f);
        }
        return new hu5(d().a.hashCode(), ae5.b(j, (Long) null, (Long) null, string, B == null ? null : getApplicationContext().getString(((ae5) this.x0.getValue()).f), (int) this.B0, true, c2), 1);
    }

    public final fm4 d() {
        return (fm4) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.kwe
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kwe r0 = (defpackage.kwe) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            kwe r0 = new kwe
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "UploadDraftMediaWorker"
            r7 = 4
            r8 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x0053
            if (r2 == r4) goto L_0x0047
            if (r2 == r3) goto L_0x0040
            if (r2 != r7) goto L_0x0038
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            wx3.H(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r12 = move-exception
            goto L_0x00d9
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            wx3.H(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x00c1
        L_0x0047:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.X
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r2 = r0.o
            wx3.H(r12)     // Catch:{ all -> 0x004f }
            goto L_0x00b1
        L_0x004f:
            r12 = move-exception
            r11 = r2
            goto L_0x00d9
        L_0x0053:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            wx3.H(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x0084
        L_0x0059:
            wx3.H(r12)
            java.lang.String r12 = "doWork"
            udd.q(r6, r12)     // Catch:{ all -> 0x0035 }
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.w0 = r5     // Catch:{ all -> 0x0035 }
            r7e r12 = r11.z0     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0035 }
            pae r12 = (defpackage.pae) r12     // Catch:{ all -> 0x0035 }
            n3a r12 = (n3a) r12     // Catch:{ all -> 0x0035 }
            ju3 r12 = r12.b()     // Catch:{ all -> 0x0035 }
            lwe r2 = new lwe     // Catch:{ all -> 0x0035 }
            r2.<init>(r11, r8)     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = xs7.U(r12, r2, r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            jue r12 = jue.a     // Catch:{ all -> 0x0035 }
        L_0x0081:
            if (r12 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r11.h()     // Catch:{ all -> 0x0035 }
        L_0x0087:
            gh7 r12 = r11.C0     // Catch:{ all -> 0x0035 }
            if (r12 != 0) goto L_0x00d0
            java.lang.String r12 = "update %f"
            float r2 = r11.B0     // Catch:{ all -> 0x0035 }
            java.lang.Float r5 = new java.lang.Float     // Catch:{ all -> 0x0035 }
            r5.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x0035 }
            udd.p(r6, r12, r2)     // Catch:{ all -> 0x0035 }
            float r12 = r11.B0     // Catch:{ all -> 0x0035 }
            boolean r12 = r11.needToShowNotification(r12)     // Catch:{ all -> 0x0035 }
            if (r12 == 0) goto L_0x00c1
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.X = r11     // Catch:{ all -> 0x0035 }
            r0.w0 = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = r11.getForegroundInfo(r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            r2 = r11
        L_0x00b1:
            hu5 r12 = (hu5) r12     // Catch:{ all -> 0x004f }
            r0.o = r2     // Catch:{ all -> 0x004f }
            r0.X = r8     // Catch:{ all -> 0x004f }
            r0.w0 = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r11 = r11.setForeground(r12, r0)     // Catch:{ all -> 0x004f }
            if (r11 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r11 = r2
        L_0x00c1:
            long r9 = r11.getWorkDelay()     // Catch:{ all -> 0x0035 }
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.w0 = r7     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = defpackage.ek8.q(r9, r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x0087
            return r1
        L_0x00d0:
            gh7 r12 = r11.C0     // Catch:{ all -> 0x0035 }
            if (r12 != 0) goto L_0x00e5
            dh7 r12 = gh7.a()     // Catch:{ all -> 0x0035 }
            goto L_0x00e5
        L_0x00d9:
            java.lang.String r0 = "cancelled!"
            udd.s(r6, r0, r12)
            r11.i()
            dh7 r12 = gh7.a()
        L_0x00e5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        yl4 yl4 = d().a;
        udd.s("UploadDraftMediaWorker", "onUploadFailed: draftMediaUploadKey = " + yl4, th);
        yl4 yl42 = d().a;
        udd.s("UploadDraftMediaWorker", "failDraftUpload: key = " + yl42, (Throwable) null);
        i22 B = c().B(d().a.a);
        if (B == null) {
            udd.s("UploadDraftMediaWorker", "failDraftUpload: chat is null", (Throwable) null);
        } else {
            j4a j4a = B.b.f0;
            if (j4a == null) {
                udd.s("UploadDraftMediaWorker", "failDraftUpload: draft is null", (Throwable) null);
            } else {
                ((dm4) this.X.getValue()).c(j4a);
                t52 c2 = c();
                Long b2 = j4a.b();
                c2.k(B.a, b2 != null ? b2.longValue() : 0, j4a);
                o1d.y((luf) this.c.getValue());
            }
        }
        g();
        ((uc5) this.y0.getValue()).b(d().a.a);
        this.C0 = gh7.a();
    }

    public final void g() {
        try {
            new w63(((om4) this.b.getValue()).a(), 2, new mb1(10, d().a)).a();
            yl4 yl4 = d().a;
            udd.q("UploadDraftMediaWorker", "removeUploadFromStorage: success for key = " + yl4);
        } catch (Throwable th) {
            yl4 yl42 = d().a;
            udd.s("UploadDraftMediaWorker", "removeUploadFromStorage: failed for key = " + yl42, th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadDraftMediaWorker" : e;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, xs8] */
    public final void h() {
        e00 e00;
        fm4 d = d();
        udd.q("UploadDraftMediaWorker", "startUpload: draftUpload = " + d);
        int i = d().d;
        if (i != 0) {
            switch (txe.$EnumSwitchMapping$0[hr1.t(i)]) {
                case 1:
                    e00 = e00.UNKNOWN;
                    break;
                case 2:
                case 3:
                    e00 = e00.VIDEO;
                    break;
                case 4:
                case 5:
                    e00 = e00.PHOTO;
                    break;
                case 6:
                    e00 = e00.FILE;
                    break;
                case 7:
                    e00 = e00.AUDIO;
                    break;
                case 8:
                    e00 = e00.STICKER;
                    break;
                default:
                    e00 = e00.UNKNOWN;
                    break;
            }
            if (e00 == e00.UNKNOWN) {
                e(new IllegalStateException("Internal error. Unknown attach type for upload type"));
                return;
            }
            ? obj = new Object();
            obj.e = d().e;
            obj.b = d().b;
            obj.d = d().d;
            obj.c = d().c;
            obj.f = d().a.b;
            nu9 n = ((hxe) this.Z.getValue()).a(new ys8(obj)).n((qmc) this.w0.getValue());
            c97 c97 = new c97(new ygd(this), new mv4(27, this), z3d.i);
            n.a(c97);
            this.A0 = c97;
            return;
        }
        throw null;
    }

    public final void i() {
        yl4 yl4 = d().a;
        udd.q("UploadDraftMediaWorker", "cancel: key =" + yl4);
        tic.b(this.A0);
        g();
        String str = d().a.b;
        udd.q("UploadDraftMediaWorker", "cancel: finished for key = " + str);
        this.C0 = gh7.a();
    }
}
