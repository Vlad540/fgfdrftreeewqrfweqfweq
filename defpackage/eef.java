package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.n;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat;

/* renamed from: eef  reason: default package */
public final class eef {
    public final Runnable a;
    public final Object b = new Object();
    public lpf c;
    public final Handler d;
    public final Object e = new Object();
    public boolean f;
    public final ExecutorService g;
    public volatile String h;
    public long i;
    public volatile long j = SystemClock.elapsedRealtime();
    public final boolean k;
    public volatile long l = 0;
    public lv1 m;
    public final SignalingStat n;
    public final qw9 o;
    public final uy4 p;
    public final d4b q;
    public long r;

    public eef(long j2, n nVar, SignalingStat signalingStat, ExecutorService executorService, xwb xwb, ywb ywb, qw9 qw9, boolean z, uy4 uy4) {
        Uri.Builder buildUpon = Uri.parse(uy4.d).buildUpon();
        String str = uy4.c;
        if (str != null) {
            buildUpon.appendQueryParameter("userId", str);
        }
        buildUpon.appendQueryParameter(ApiProtocol.KEY_TOKEN, uy4.b).appendQueryParameter(ApiProtocol.PARAM_CONVERSATION_ID, uy4.a);
        if (uy4.h >= 6) {
            buildUpon.appendQueryParameter("deviceIdx", String.valueOf(uy4.o));
        }
        Long l2 = uy4.f;
        if (l2 != null) {
            buildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(l2));
        }
        Locale locale = uy4.n;
        if (locale != null) {
            buildUpon.appendQueryParameter("locale", locale.getLanguage());
        }
        this.h = c(buildUpon, uy4);
        this.i = j2;
        this.a = nVar;
        this.n = signalingStat;
        this.g = executorService;
        this.o = qw9;
        this.r = 20000;
        this.k = z;
        this.p = uy4;
        this.q = new d4b(xwb, 5, ywb);
        this.d = new Handler(Looper.myLooper(), new fi4(7, this));
        a("init");
    }

    public static String c(Uri.Builder builder, uy4 uy4) {
        Uri.Builder appendQueryParameter = builder.appendQueryParameter(ClientCookie.VERSION_ATTR, Integer.toString(uy4.h)).appendQueryParameter("capabilities", uy4.i);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", Build.MANUFACTURER + "/" + Build.MODEL).appendQueryParameter("platform", AbstractUploader.SDK_TYPE_STRING).appendQueryParameter("clientType", uy4.g).appendQueryParameter("appVersion", uy4.e).appendQueryParameter("osVersion", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("ispAsOrg", uy4.k).appendQueryParameter("locCc", uy4.l).appendQueryParameter("locReg", uy4.m);
        Integer num = uy4.j;
        if (num != null) {
            appendQueryParameter2.appendQueryParameter("ispAsNo", String.valueOf(num));
        }
        return appendQueryParameter2.build().toString();
    }

    public static String e(String str, String str2, String str3) {
        Uri.Builder builder;
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            builder = parse.buildUpon().clearQuery();
            for (String next : queryParameterNames) {
                if (str2.equals(next)) {
                    builder.appendQueryParameter(next, str3);
                } else {
                    builder.appendQueryParameter(next, parse.getQueryParameter(next));
                }
            }
        } else {
            builder = parse.buildUpon();
            builder.appendQueryParameter(str2, str3);
        }
        return builder.build().toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "not connecting, lastPongTime = "
            d4b r1 = r9.q
            java.lang.String r2 = "connect, "
            java.lang.String r10 = r2.concat(r10)
            r1.n(r10)
            long r1 = r9.r
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x001b
            android.os.Handler r10 = r9.d
            r1 = 2
            r10.removeMessages(r1)
        L_0x001b:
            java.lang.Object r10 = r9.e
            monitor-enter(r10)
            boolean r1 = r9.f     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x002d
            d4b r9 = r9.q     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "cant connect because released"
            r9.n(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r9 = move-exception
            goto L_0x007b
        L_0x002d:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x002b }
            long r5 = r9.j     // Catch:{ all -> 0x002b }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0069
            long r3 = r1 - r5
            long r7 = r9.i     // Catch:{ all -> 0x002b }
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0040
            goto L_0x0069
        L_0x0040:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r3 = r9.n     // Catch:{ all -> 0x002b }
            r3.onTimeout()     // Catch:{ all -> 0x002b }
            d4b r3 = r9.q     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r4.<init>(r0)     // Catch:{ all -> 0x002b }
            r4.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = " time = "
            r4.append(r0)     // Catch:{ all -> 0x002b }
            r4.append(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x002b }
            r3.n(r0)     // Catch:{ all -> 0x002b }
            java.lang.Runnable r0 = r9.a     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0065
            r0.run()     // Catch:{ all -> 0x002b }
        L_0x0065:
            r9.b()     // Catch:{ all -> 0x002b }
            goto L_0x0079
        L_0x0069:
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r0 = r9.n     // Catch:{ all -> 0x002b }
            r0.onConnect()     // Catch:{ all -> 0x002b }
            java.util.concurrent.ExecutorService r0 = r9.g     // Catch:{ all -> 0x002b }
            def r1 = new def     // Catch:{ all -> 0x002b }
            r2 = 0
            r1.<init>(r9, r2)     // Catch:{ all -> 0x002b }
            r0.execute(r1)     // Catch:{ all -> 0x002b }
        L_0x0079:
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            return
        L_0x007b:
            monitor-exit(r10)     // Catch:{ all -> 0x002b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eef.a(java.lang.String):void");
    }

    public final void b() {
        this.q.n("transport.dispose");
        synchronized (this.e) {
            try {
                if (!this.f) {
                    this.f = true;
                    this.d.removeCallbacksAndMessages((Object) null);
                    this.g.execute(new def(this, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.q.n("handleDisconnected");
        if (this.r > 0) {
            this.d.removeMessages(2);
        }
        synchronized (this.b) {
            this.c = null;
        }
        synchronized (this.e) {
            try {
                if (!this.f) {
                    this.d.sendEmptyMessageDelayed(1, 2000);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        lv1 lv1 = this.m;
        if (lv1 != null) {
            synchronized (((mfd) lv1.b).f) {
                ((mfd) lv1.b).r = false;
            }
        }
    }

    public final void f(String str) {
        this.g.execute(new cef(this, str, 0));
    }
}
