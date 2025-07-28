package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import ru.ok.tamtam.errors.TamErrorException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadFileAttachWorker extends ForegroundWorker {
    public final r7e A0 = new r7e(new vwe(this, 7));
    public final r7e B0 = new r7e(new vwe(this, 8));
    public final r7e C0 = new r7e(new vwe(this, 9));
    public final r7e D0 = new r7e(new vwe(this, 10));
    public c97 E0;
    public volatile float F0 = -1.0f;
    public volatile gh7 G0;
    public final r7e X = new r7e(new vwe(this, 14));
    public final r7e Y = new r7e(new vwe(this, 1));
    public final r7e Z = new r7e(new vwe(this, 2));
    public final r7e a = new r7e(new vwe(this, 0));
    public final r7e b = new r7e(new vwe(this, 11));
    public final r7e c = new r7e(new vwe(this, 12));
    public final r7e o = new r7e(new vwe(this, 13));
    public final r7e w0 = new r7e(new vwe(this, 3));
    public final r7e x0 = new r7e(new vwe(this, 4));
    public final r7e y0 = new r7e(new vwe(this, 5));
    public final r7e z0 = new r7e(new vwe(this, 6));

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ys8 c() {
        return (ys8) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        String str;
        String string;
        PendingIntent c2 = itf.d(getApplicationContext()).c(getId());
        i22 B = ((t52) this.Z.getValue()).B(c().a.b);
        if (B == null) {
            udd.s("UploadFileAttachWorker", "chat is null in getForegroundInfo!", (Throwable) null);
            h();
            this.G0 = gh7.a();
        }
        try {
            str = new File(c().b).getName();
        } catch (Throwable th) {
            str = new kcc(th);
        }
        if (str instanceof kcc) {
            str = "";
        }
        String i = me4.i(getApplicationContext().getString(((ae5) this.z0.getValue()).h), " ", str);
        ae5 ae5 = (ae5) this.z0.getValue();
        long j = c().a.b;
        if (B == null || (string = B.p()) == null) {
            string = getApplicationContext().getString(((ae5) this.z0.getValue()).h);
        }
        return new hu5(c().a.hashCode(), ae5.b(j, (Long) null, (Long) null, string, B == null ? null : i, a24.X(this.F0), true, c2), 1);
    }

    public final to8 d() {
        return (to8) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xwe
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xwe r0 = (defpackage.xwe) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            xwe r0 = new xwe
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003b
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            wx3.H(r9)
            goto L_0x00ed
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            wx3.H(r9)
            goto L_0x00cc
        L_0x003b:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r8 = r0.o
            wx3.H(r9)
            goto L_0x0091
        L_0x0041:
            wx3.H(r9)
            r7e r9 = r8.D0
            java.lang.Object r9 = r9.getValue()
            ed3 r9 = (defpackage.ed3) r9
            r0.o = r8
            r0.getClass()
            r0.Z = r5
            zv1 r2 = new zv1
            kotlin.coroutines.Continuation r6 = urd.y(r0)
            r2.<init>(r5, r6)
            r2.n()
            boolean r5 = r9.f()
            if (r5 == 0) goto L_0x006b
            jue r9 = jue.a
            r2.resumeWith(r9)
            goto L_0x008a
        L_0x006b:
            mo1 r5 = new mo1
            r6 = 1
            r5.<init>(r9, r2, r6)
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "Network connection lost, waiting network."
            udd.q(r6, r7)
            r9.c(r5)
            ph2 r6 = new ph2
            r7 = 2
            r6.<init>(r9, r7, r5)
            r2.d(r6)
        L_0x008a:
            java.lang.Object r9 = r2.m()
            if (r9 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r7e r9 = r8.A0
            java.lang.Object r9 = r9.getValue()
            g2b r9 = (defpackage.g2b) r9
            j2b r9 = (defpackage.j2b) r9
            kb5 r9 = r9.e
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f87newuploaderenabled
            r5 = 0
            boolean r9 = r9.m(r2, r5)
            java.lang.String r2 = "UploadFileAttachWorker"
            r5 = 0
            if (r9 == 0) goto L_0x00cd
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x00b1
            goto L_0x00be
        L_0x00b1:
            boolean r3 = r9.c()
            if (r3 == 0) goto L_0x00be
            tn7 r3 = defpackage.tn7.X
            java.lang.String r6 = "doForegroundWork: Using new uploader"
            r9.d(r3, r2, r6, r5)
        L_0x00be:
            r0.o = r5
            r0.getClass()
            r0.Z = r4
            java.lang.Object r9 = r8.k(r0)
            if (r9 != r1) goto L_0x00cc
            return r1
        L_0x00cc:
            return r9
        L_0x00cd:
            fn6 r9 = udd.e
            if (r9 != 0) goto L_0x00d2
            goto L_0x00df
        L_0x00d2:
            boolean r4 = r9.c()
            if (r4 == 0) goto L_0x00df
            tn7 r4 = defpackage.tn7.X
            java.lang.String r6 = "doForegroundWork: Using old uploader"
            r9.d(r4, r2, r6, r5)
        L_0x00df:
            r0.o = r5
            r0.getClass()
            r0.Z = r3
            java.lang.Object r9 = r8.l(r0)
            if (r9 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        udd.t("UploadFileAttachWorker", "onUploadFailed: %s", new Object[]{c().a, th});
        if (th instanceof HttpErrorException) {
            long j = c().a.b;
            ((tt0) this.c.getValue()).c(new hg5(((HttpErrorException) th).a));
        } else if (th instanceof TamErrorException) {
            ((tt0) this.c.getValue()).c(new jh0(((TamErrorException) th).a));
        }
        this.F0 = -1.0f;
        vo8 q = d().q(c().a.a);
        if (q == null || q.z0 == ls8.DELETED) {
            udd.s("UploadFileAttachWorker", "failMessageUpload: message is deleted", (Throwable) null);
        } else {
            d().x(q, bp8.ERROR);
            d().v(c().a.a, c().a.c, new are(11));
            ((tt0) this.c.getValue()).c(new ove(c().a.b, c().a.a, 0));
        }
        o1d.y((luf) this.X.getValue());
        h();
        ((uc5) this.Y.getValue()).a(c().a.a);
        this.G0 = gh7.a();
    }

    public final void g(bt8 bt8) {
        jj7 jj7;
        udd.p("UploadFileAttachWorker", "onUploadUpdate %s", new Object[]{bt8});
        wve wve = bt8.a;
        rxe rxe = wve.g;
        if (wve.a()) {
            udd.p("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", new Object[]{c().a, bt8});
            long j = c().a.a;
            String str = c().a.c;
            long j2 = c().a.b;
            d().v(j, str, new iwe(bt8, 2));
            ((gz) this.C0.getValue()).a(new lyb(j, bt8.a.f));
            h();
            ((tt0) this.c.getValue()).c(new ove(j2, j, 0));
            o1d.y((luf) this.X.getValue());
            this.G0 = gh7.b();
        } else if (rxe == rxe.UPLOADING) {
            udd.p("UploadFileAttachWorker", "onUploadProgress %s, %s", new Object[]{c(), bt8});
            long j3 = c().a.a;
            String str2 = c().a.c;
            long j4 = c().a.b;
            vo8 q = d().q(c().a.a);
            if (!(q == null || q.z0 == ls8.DELETED || (jj7 = q.D0) == null || jj7.v() <= 0)) {
                for (o10 o10 : (List) jj7.a) {
                    if (hhd.f(o10.q, c().a.c)) {
                        wve wve2 = bt8.a;
                        i(lp.b(wve2.a.c));
                        this.F0 = wve2.e;
                        d().v(j3, str2, new bwe(wve2, 2));
                        ((gz) this.C0.getValue()).a(new myb(wve2.e, j3, wve2.f));
                        ((tt0) this.c.getValue()).c(new ove(j4, j3, 0));
                        return;
                    }
                }
            }
            udd.R("UploadFileAttachWorker", (IOException) null, "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", Arrays.copyOf(new Object[]{c()}, 1));
            h();
            this.G0 = gh7.a();
        } else {
            Throwable th = new Throwable("Internal error. Unknown upload state");
            udd.u("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", new Object[]{c().a, bt8});
            e(th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadFileAttachWorker" : e;
    }

    public final void h() {
        udd.p("UploadFileAttachWorker", "removeUpload %s", new Object[]{c()});
        udd.p("UploadFileAttachWorker", "stopTyping %s", new Object[]{c()});
        i22 B = ((t52) this.Z.getValue()).B(c().a.b);
        if (B != null) {
            long j = B.b.a;
            long j2 = c().a.a;
            ((eha) this.w0.getValue()).getClass();
            eha.b(j, j2);
        }
        c97 c97 = this.E0;
        if (c97 != null) {
            bj4.a(c97);
        }
        try {
            new w63(((ft8) this.b.getValue()).b(), 2, new ss8(2, (Object) c().a)).a();
            udd.p("UploadFileAttachWorker", "removeUploadFromStorage: success %s", new Object[]{c()});
        } catch (Throwable th) {
            udd.s("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
    }

    public final void i(e00 e00) {
        udd.p("UploadFileAttachWorker", "sendTyping %s", new Object[]{c()});
        i22 B = ((t52) this.Z.getValue()).B(c().a.b);
        if (B != null) {
            ((eha) this.w0.getValue()).f(B.b.a, e00, c().a.a);
        }
    }

    public final void j() {
        udd.q("UploadFileAttachWorker", "startUpload");
        e00 b2 = lp.b(c().d);
        if (b2 == e00.UNKNOWN) {
            e(new Throwable("Internal error. Unknown attach type for upload type"));
            return;
        }
        i(b2);
        nu9 n = ((hxe) this.x0.getValue()).a(c()).n(cnc.d);
        c97 c97 = new c97(new bae(2, this), new fzd(2, this), z3d.i);
        n.a(c97);
        this.E0 = c97;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [k7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 0
            r3 = 3
            r4 = 1
            boolean r5 = r1 instanceof defpackage.axe
            if (r5 == 0) goto L_0x001a
            r5 = r1
            axe r5 = (defpackage.axe) r5
            int r6 = r5.w0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001a
            int r6 = r6 - r7
            r5.w0 = r6
            goto L_0x001f
        L_0x001a:
            axe r5 = new axe
            r5.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r5.Y
            pu3 r6 = pu3.a
            int r7 = r5.w0
            java.lang.String r8 = "UploadFileAttachWorker"
            r9 = 0
            r10 = 2
            if (r7 == 0) goto L_0x0046
            if (r7 == r4) goto L_0x0040
            if (r7 != r10) goto L_0x0038
            long r2 = r5.X
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r5.o
            wx3.H(r1)
            goto L_0x0181
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r5.o
            wx3.H(r1)
            goto L_0x007e
        L_0x0046:
            wx3.H(r1)
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x004e
            goto L_0x005b
        L_0x004e:
            boolean r7 = r1.c()
            if (r7 == 0) goto L_0x005b
            tn7 r7 = defpackage.tn7.X
            java.lang.String r11 = "Started foreground uploading"
            r1.d(r7, r8, r11, r9)
        L_0x005b:
            r5.o = r0
            r5.w0 = r4
            r7e r1 = r0.B0
            java.lang.Object r1 = r1.getValue()
            pae r1 = (defpackage.pae) r1
            n3a r1 = (n3a) r1
            ju3 r1 = r1.b()
            zwe r7 = new zwe
            r7.<init>(r0, r9)
            java.lang.Object r1 = xs7.U(r1, r7, r5)
            if (r1 != r6) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            jue r1 = jue.a
        L_0x007b:
            if (r1 != r6) goto L_0x007e
            return r6
        L_0x007e:
            ys8 r1 = r0.c()
            int r1 = r1.d
            e00 r1 = lp.b(r1)
            e00 r7 = defpackage.e00.UNKNOWN
            if (r1 != r7) goto L_0x00a7
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown attach type for upload type"
            r1.<init>(r2)
            r0.e(r1)
            gh7 r0 = r0.G0
            if (r0 == 0) goto L_0x009b
            return r0
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r0.i(r1)
            long r14 = java.lang.System.currentTimeMillis()
            k7c r1 = new k7c
            r1.<init>()
            r11 = -1
            r1.a = r11
            r7e r7 = r0.y0
            java.lang.Object r7 = r7.getValue()
            n6e r7 = (defpackage.n6e) r7
            ys8 r11 = r0.c()
            r7.getClass()
            tj5 r12 = new tj5
            r12.<init>(r3, r11)
            l6e r13 = new l6e
            r13.<init>(r7, r9)
            ik5 r12 = ez3.H(r12, r13)
            k6e r13 = new k6e
            r13.<init>(r12, r7, r2)
            kbb r12 = new kbb
            t97 r10 = r7.b
            java.lang.Object r10 = r10.getValue()
            r18 = r10
            h6e r18 = (defpackage.h6e) r18
            java.lang.Class<h6e> r19 = defpackage.h6e.class
            java.lang.String r20 = "upload"
            r17 = 2
            java.lang.String r21 = "upload(Lone/me/sdk/transfer/domain/UploadData;)Lkotlinx/coroutines/flow/Flow;"
            r22 = 4
            r23 = 20
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            ik5 r10 = ez3.H(r13, r12)
            k6e r12 = new k6e
            r12.<init>(r10, r7, r4)
            zl5 r10 = new zl5
            r13 = 11
            r10.<init>(r7, r11, r9, r13)
            bc r11 = new bc
            r13 = 17
            r11.<init>(r12, r13, r10)
            v5e r10 = new v5e
            r10.<init>(r7, r9, r4)
            bc r4 = new bc
            r12 = 18
            r4.<init>(r11, r12, r10)
            t97 r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            pae r7 = (defpackage.pae) r7
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            pj5 r4 = ez3.J(r4, r7)
            bxe r7 = new bxe
            r7.<init>(r0, r9)
            ck5 r10 = new ck5
            r10.<init>(r4, r7, r3)
            kbb r3 = new kbb
            java.lang.String r16 = "onUploadUpdate(Lru/ok/tamtam/upload/messages/MessageUploadState;)V"
            r17 = 4
            r12 = 2
            java.lang.Class<ru.ok.tamtam.upload.workers.UploadFileAttachWorker> r4 = ru.ok.tamtam.upload.workers.UploadFileAttachWorker.class
            java.lang.String r7 = "onUploadUpdate"
            r18 = 22
            r11 = r3
            r13 = r0
            r24 = r14
            r14 = r4
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            ck5 r4 = new ck5
            r7 = 5
            r4.<init>(r10, r3, r7)
            int r3 = zp4.o
            r3 = 500(0x1f4, float:7.0E-43)
            eq4 r7 = eq4.c
            long r10 = mt0.P(r3, r7)
            q02 r3 = vx3.M(r4, r10)
            wua r4 = new wua
            r7 = 20
            r4.<init>(r0, r9, r7, r2)
            gl5 r2 = new gl5
            r2.<init>(r3, r4)
            dxe r3 = new dxe
            r3.<init>(r0, r1)
            r5.o = r0
            r10 = r24
            r5.X = r10
            r1 = 2
            r5.w0 = r1
            java.lang.Object r1 = r2.c(r3, r5)
            if (r1 != r6) goto L_0x0180
            return r6
        L_0x0180:
            r2 = r10
        L_0x0181:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x018b
            goto L_0x01ae
        L_0x018b:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01ae
            tn7 r2 = defpackage.tn7.X
            gh7 r3 = r0.G0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "doWork finish by "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " and duration="
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r1.d(r2, r8, r3, r9)
        L_0x01ae:
            gh7 r0 = r0.G0
            if (r0 != 0) goto L_0x01b6
            dh7 r0 = gh7.a()
        L_0x01b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0169 A[Catch:{ all -> 0x004a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017d A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            boolean r2 = r0 instanceof defpackage.exe
            if (r2 == 0) goto L_0x0017
            r2 = r0
            exe r2 = (defpackage.exe) r2
            int r3 = r2.y0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.y0 = r3
            goto L_0x001c
        L_0x0017:
            exe r2 = new exe
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.w0
            pu3 r3 = pu3.a
            int r4 = r2.y0
            java.lang.String r5 = "UploadFileAttachWorker"
            r6 = 0
            r7 = -1
            r9 = 5
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 4
            if (r4 == 0) goto L_0x0087
            if (r4 == r12) goto L_0x0081
            if (r4 == r11) goto L_0x0078
            if (r4 == r10) goto L_0x0061
            if (r4 == r13) goto L_0x0055
            if (r4 != r9) goto L_0x004d
            long r14 = r2.Z
            r16 = r14
            long r13 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004a }
            r4 = r9
            r12 = r13
            r14 = r16
            r7 = 4
            goto L_0x016c
        L_0x004a:
            r0 = move-exception
            goto L_0x01ac
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            long r12 = r2.Z
            long r14 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004a }
            r7 = 4
            goto L_0x0150
        L_0x0061:
            long r12 = r2.Z
            long r14 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.X
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r4 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x0074 }
            r18 = r2
            r2 = r1
            r1 = r4
            r4 = r18
            goto L_0x013b
        L_0x0074:
            r0 = move-exception
            r1 = r4
            goto L_0x01ac
        L_0x0078:
            long r12 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00ff
        L_0x0081:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            wx3.H(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00b2
        L_0x0087:
            wx3.H(r0)
            java.lang.String r0 = "doWork"
            udd.q(r5, r0)     // Catch:{ all -> 0x004a }
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.y0 = r12     // Catch:{ all -> 0x004a }
            r7e r0 = r1.B0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            pae r0 = (defpackage.pae) r0     // Catch:{ all -> 0x004a }
            n3a r0 = (n3a) r0     // Catch:{ all -> 0x004a }
            ju3 r0 = r0.b()     // Catch:{ all -> 0x004a }
            zwe r4 = new zwe     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = xs7.U(r0, r4, r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            jue r0 = jue.a     // Catch:{ all -> 0x004a }
        L_0x00af:
            if (r0 != r3) goto L_0x00b2
            return r3
        L_0x00b2:
            r1.j()     // Catch:{ all -> 0x004a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            r14 = r7
        L_0x00ba:
            gh7 r0 = r1.G0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "progress =%f"
            float r4 = r1.F0     // Catch:{ all -> 0x004a }
            java.lang.Float r9 = new java.lang.Float     // Catch:{ all -> 0x004a }
            r9.<init>(r4)     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x004a }
            udd.p(r5, r0, r4)     // Catch:{ all -> 0x004a }
            float r0 = r1.F0     // Catch:{ all -> 0x004a }
            int r0 = a24.X(r0)     // Catch:{ all -> 0x004a }
            float r0 = (float) r0     // Catch:{ all -> 0x004a }
            boolean r0 = r1.needToShowNotification(r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0153
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.Y = r12     // Catch:{ all -> 0x004a }
            r2.y0 = r11     // Catch:{ all -> 0x004a }
            r7e r0 = r1.B0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            pae r0 = (defpackage.pae) r0     // Catch:{ all -> 0x004a }
            n3a r0 = (n3a) r0     // Catch:{ all -> 0x004a }
            ju3 r0 = r0.b()     // Catch:{ all -> 0x004a }
            ywe r4 = new ywe     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = xs7.U(r0, r4, r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x00ff
            return r3
        L_0x00ff:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x004a }
            long r14 = r0.longValue()     // Catch:{ all -> 0x004a }
        L_0x0105:
            r7e r0 = r1.A0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            g2b r0 = (defpackage.g2b) r0     // Catch:{ all -> 0x004a }
            j2b r0 = (defpackage.j2b) r0     // Catch:{ all -> 0x004a }
            yzc r0 = r0.b     // Catch:{ all -> 0x004a }
            r0.getClass()     // Catch:{ all -> 0x004a }
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f61maxdownloadedsizefornotifykb     // Catch:{ all -> 0x004a }
            r9 = 1024(0x400, float:1.435E-42)
            long r7 = (long) r9     // Catch:{ all -> 0x004a }
            long r7 = r0.o(r4, r7)     // Catch:{ all -> 0x004a }
            int r0 = (int) r7     // Catch:{ all -> 0x004a }
            long r7 = (long) r0     // Catch:{ all -> 0x004a }
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0153
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.X = r1     // Catch:{ all -> 0x004a }
            r2.Y = r12     // Catch:{ all -> 0x004a }
            r2.Z = r14     // Catch:{ all -> 0x004a }
            r2.y0 = r10     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r1.getForegroundInfo(r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x0134
            return r3
        L_0x0134:
            r4 = r2
            r2 = r1
            r18 = r12
            r12 = r14
            r14 = r18
        L_0x013b:
            hu5 r0 = (hu5) r0     // Catch:{ all -> 0x004a }
            r4.o = r1     // Catch:{ all -> 0x004a }
            r4.X = r6     // Catch:{ all -> 0x004a }
            r4.Y = r14     // Catch:{ all -> 0x004a }
            r4.Z = r12     // Catch:{ all -> 0x004a }
            r7 = 4
            r4.y0 = r7     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r2.setForeground(r0, r4)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x014f
            return r3
        L_0x014f:
            r2 = r4
        L_0x0150:
            r8 = r12
            r13 = r14
            goto L_0x0156
        L_0x0153:
            r7 = 4
            r8 = r14
            r13 = r12
        L_0x0156:
            long r10 = r1.getWorkDelay()     // Catch:{ all -> 0x004a }
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.Y = r13     // Catch:{ all -> 0x004a }
            r2.Z = r8     // Catch:{ all -> 0x004a }
            r4 = 5
            r2.y0 = r4     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = defpackage.ek8.q(r10, r2)     // Catch:{ all -> 0x004a }
            if (r10 != r3) goto L_0x016a
            return r3
        L_0x016a:
            r12 = r13
            r14 = r8
        L_0x016c:
            r9 = r4
            r7 = -1
            r10 = 3
            r11 = 2
            goto L_0x00ba
        L_0x0173:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            long r2 = r2 - r12
            fn6 r0 = udd.e     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x017d
            goto L_0x01a3
        L_0x017d:
            boolean r4 = r0.c()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x01a3
            tn7 r4 = defpackage.tn7.X     // Catch:{ all -> 0x004a }
            gh7 r7 = r1.G0     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r8.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r9 = "doWork finish by "
            r8.append(r9)     // Catch:{ all -> 0x004a }
            r8.append(r7)     // Catch:{ all -> 0x004a }
            java.lang.String r7 = " and duration="
            r8.append(r7)     // Catch:{ all -> 0x004a }
            r8.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x004a }
            r0.d(r4, r5, r2, r6)     // Catch:{ all -> 0x004a }
        L_0x01a3:
            gh7 r0 = r1.G0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x01bc
            dh7 r0 = gh7.a()     // Catch:{ all -> 0x004a }
            goto L_0x01bc
        L_0x01ac:
            java.lang.String r2 = "cancelled!"
            udd.s(r5, r2, r0)
            c97 r0 = r1.E0
            if (r0 == 0) goto L_0x01b8
            bj4.a(r0)
        L_0x01b8:
            dh7 r0 = gh7.a()
        L_0x01bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.l(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
