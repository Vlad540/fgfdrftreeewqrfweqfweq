package ru.ok.messages.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.work.WorkerParameters;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/services/PipWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class PipWorker extends SdkCoroutineWorker {
    public final r7e a = new r7e(new qk8(29, this));

    public PipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC, Splitter:B:30:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4 A[Catch:{ all -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.wwa
            if (r0 == 0) goto L_0x0013
            r0 = r10
            wwa r0 = (defpackage.wwa) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            wwa r0 = new wwa
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "PIP_WORKER"
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            ru.ok.messages.services.PipWorker r9 = r0.o
            wx3.H(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0066
        L_0x0031:
            r10 = move-exception
            goto L_0x00bd
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            ru.ok.messages.services.PipWorker r9 = r0.o
            wx3.H(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00a2
        L_0x0042:
            ru.ok.messages.services.PipWorker r9 = r0.X
            ru.ok.messages.services.PipWorker r2 = r0.o
            wx3.H(r10)     // Catch:{ all -> 0x004a }
            goto L_0x0091
        L_0x004a:
            r10 = move-exception
            r9 = r2
            goto L_0x00bd
        L_0x004e:
            wx3.H(r10)
            java.lang.String r10 = "doWork"
            udd.q(r6, r10)
            r9.getApplicationContext()
            k93 r10 = defpackage.vl.b()
            o2a r10 = (o2a) r10
            tf4 r10 = r10.f()
            r10.f(r6)
        L_0x0066:
            boolean r10 = r9.isStopped()     // Catch:{ all -> 0x0031 }
            r7e r2 = r9.a
            if (r10 != 0) goto L_0x00b8
            java.lang.Object r10 = r2.getValue()     // Catch:{ all -> 0x0031 }
            jwa r10 = (defpackage.jwa) r10     // Catch:{ all -> 0x0031 }
            i22 r10 = r10.L0     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0031 }
            jwa r2 = (defpackage.jwa) r2     // Catch:{ all -> 0x0031 }
            xm8 r2 = r2.K0     // Catch:{ all -> 0x0031 }
            if (r10 == 0) goto L_0x00b5
            if (r2 != 0) goto L_0x0083
            goto L_0x00b5
        L_0x0083:
            r0.o = r9     // Catch:{ all -> 0x0031 }
            r0.X = r9     // Catch:{ all -> 0x0031 }
            r0.w0 = r5     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = r9.getForegroundInfo(r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r9
        L_0x0091:
            hu5 r10 = (hu5) r10     // Catch:{ all -> 0x004a }
            r0.o = r2     // Catch:{ all -> 0x004a }
            r7 = 0
            r0.X = r7     // Catch:{ all -> 0x004a }
            r0.w0 = r4     // Catch:{ all -> 0x004a }
            java.lang.Object r9 = r9.setForeground(r10, r0)     // Catch:{ all -> 0x004a }
            if (r9 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r9 = r2
        L_0x00a2:
            int r10 = zp4.o     // Catch:{ all -> 0x0031 }
            eq4 r10 = eq4.o     // Catch:{ all -> 0x0031 }
            long r7 = mt0.P(r5, r10)     // Catch:{ all -> 0x0031 }
            r0.o = r9     // Catch:{ all -> 0x0031 }
            r0.w0 = r3     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = defpackage.ek8.r(r7, r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x0066
            return r1
        L_0x00b5:
            r9.stop()     // Catch:{ all -> 0x0031 }
        L_0x00b8:
            fh7 r10 = gh7.b()     // Catch:{ all -> 0x0031 }
            goto L_0x00c6
        L_0x00bd:
            java.lang.String r0 = "failure!"
            udd.s(r6, r0, r10)
            dh7 r10 = gh7.a()
        L_0x00c6:
            java.lang.String r0 = "doWork finish %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            udd.p(r6, r0, r1)
            r9.getApplicationContext()
            k93 r9 = defpackage.vl.b()
            o2a r9 = (o2a) r9
            tf4 r9 = r9.f()
            r9.g(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.services.PipWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getForegroundInfo(Continuation continuation) {
        Uri uri;
        jwa jwa = (jwa) this.a.getValue();
        swa swa = jwa.B0;
        i22 i22 = jwa.L0;
        xm8 xm8 = jwa.K0;
        o10 o10 = jwa.J0;
        Bitmap bitmap = null;
        if (o10 == null) {
            uri = null;
        } else {
            uri = Uri.parse((ete.L(o10) ? jwa.J0.j.d.d : jwa.J0.d).d);
        }
        boolean z = jwa.O0;
        swa.b.c();
        o7a o7a = swa.b;
        swa.c.getClass();
        un9 h = o7a.h("ru.oneme.app.media", true, true);
        io9 io9 = new io9();
        io9.e = null;
        io9.f = ((MediaSessionCompat) swa.d.getValue()).getSessionToken();
        io9.e = new int[]{0};
        afc afc = swa.e;
        afc.getClass();
        Intent intent = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        PendingIntent.getBroadcast((Context) afc.a, 5, intent, d8.I(intent, d8.l(134217728)));
        if (uri != null) {
            e13 e13 = (e13) a06.u().a(tr6.a(uri), (Object) null).e();
            if (e13 != null) {
                e13.e0();
                CloseableStaticBitmap closeableStaticBitmap = (b13) e13.e0();
                if (closeableStaticBitmap instanceof CloseableStaticBitmap) {
                    bitmap = closeableStaticBitmap.getUnderlyingBitmap();
                }
            }
            if (bitmap != null) {
                h.k(bitmap);
            }
        }
        afc afc2 = swa.e;
        afc2.getClass();
        Intent intent2 = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        h.F.deleteIntent = PendingIntent.getBroadcast((Context) afc2.a, 5, intent2, d8.I(intent2, d8.l(134217728)));
        h.i(2, z);
        h.m();
        if (i22 != null) {
            i22.h0();
            h.f(i22.y0);
            if (xm8 != null) {
                afc afc3 = swa.e;
                long j = i22.a;
                vo8 vo8 = xm8.a;
                long j2 = vo8.o;
                long j3 = vo8.b;
                o7a o7a2 = (o7a) afc3.b;
                o7a2.getClass();
                sr7 sr7 = sr7.c;
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(j3);
                sr7.getClass();
                h.g = d8.p((Context) afc3.a, 5, o7a2.k(sr7.Z1(j, valueOf, valueOf2)));
            }
        }
        h.e(swa.a.getText(cic.p3));
        h.F.icon = z ? zhc.m0 : zhc.n0;
        afc afc4 = swa.e;
        afc4.getClass();
        Intent intent3 = new Intent().setAction(z ? "ru.ok.video.ACTION_VIDEO_PAUSE" : "ru.ok.video.ACTION_VIDEO_PLAY").setPackage("one.me.android");
        h.a(new gn9(z ? zhc.R : zhc.U, "", PendingIntent.getBroadcast((Context) afc4.a, 5, intent3, d8.I(intent3, d8.l(134217728)))));
        h.q(io9);
        return new hu5(5, h.b(), 2);
    }
}
