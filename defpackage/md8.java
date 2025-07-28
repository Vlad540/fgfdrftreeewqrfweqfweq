package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: md8  reason: default package */
public final class md8 extends m18 {
    public static final int q = (oze.a >= 31 ? 33554432 : 0);
    public final nxc e;
    public final cd8 f;
    public final rd8 g;
    public final kd8 h;
    public final fx i;
    public final vc8 j;
    public final an k;
    public final ComponentName l;
    public oza m;
    public volatile long n = 300000;
    public h36 o;
    public int p;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kd8] */
    public md8(cd8 cd8, Uri uri, Handler handler) {
        ComponentName componentName;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        this.f = cd8;
        Context context = cd8.f;
        this.g = rd8.a(context);
        ? obj = new Object();
        obj.X = this;
        obj.a = z78.J;
        obj.b = BuildConfig.FLAVOR;
        obj.o = -9223372036854775807L;
        this.h = obj;
        nxc nxc = new nxc(cd8);
        this.e = nxc;
        this.i = new fx(cd8.l.getLooper(), nxc);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        boolean z = true;
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.isEmpty()) {
            componentName = null;
        } else {
            throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size());
        }
        this.l = componentName;
        if (componentName == null || oze.a < 31) {
            componentName2 = P(context, "androidx.media3.session.MediaLibraryService");
            componentName2 = componentName2 == null ? P(context, "androidx.media3.session.MediaSessionService") : componentName2;
            if (componentName2 == null || componentName2.equals(componentName)) {
                z = false;
            }
        } else {
            z = false;
            componentName2 = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentName2 == null) {
            an anVar = new an(7, this);
            this.k = anVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uri.getScheme());
            if (oze.a < 33) {
                context.registerReceiver(anVar, intentFilter);
            } else {
                context.registerReceiver(anVar, intentFilter, 4);
            }
            intent2.setPackage(context.getPackageName());
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, q);
            componentName2 = new ComponentName(context, context.getClass());
        } else {
            intent2.setComponent(componentName2);
            pendingIntent = z ? oze.a >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, q) : PendingIntent.getService(context, 0, intent2, q) : PendingIntent.getBroadcast(context, 0, intent2, q);
            this.k = null;
        }
        String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", cd8.i});
        int i2 = oze.a;
        vc8 vc8 = new vc8(context, join, i2 < 31 ? componentName2 : null, i2 < 31 ? pendingIntent : null, cd8.j.a.getExtras());
        this.j = vc8;
        if (i2 >= 31 && componentName != null) {
            id8.a(vc8, componentName);
        }
        PendingIntent pendingIntent2 = cd8.t;
        if (pendingIntent2 != null) {
            vc8.a.a.setSessionActivity(pendingIntent2);
        }
        vc8.a.c(this, handler);
    }

    /* JADX INFO: finally extract failed */
    public static void J(vc8 vc8, a88 a88) {
        qc8 qc8 = vc8.a;
        qc8.i = a88;
        MediaMetadata mediaMetadata = a88.b;
        if (mediaMetadata == null) {
            Parcel obtain = Parcel.obtain();
            try {
                a88.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                a88.b = mediaMetadata2;
                obtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        qc8.a.setMetadata(mediaMetadata);
    }

    public static void K(md8 md8, qza qza) {
        md8.getClass();
        int i2 = qza.t1(20) ? 4 : 0;
        if (md8.p != i2) {
            md8.p = i2;
            md8.j.a.a.setFlags(i2 | 3);
        }
    }

    public static void L(vc8 vc8, ArrayList arrayList) {
        if (arrayList != null) {
            vc8.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sc8 sc8 = (sc8) it.next();
                if (sc8 != null) {
                    long j2 = sc8.b;
                    if (hashSet.contains(Long.valueOf(j2))) {
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(j2));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        qc8 qc8 = vc8.a;
        qc8.h = arrayList;
        MediaSession mediaSession = qc8.a;
        if (arrayList == null) {
            mediaSession.setQueue((List) null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sc8 sc82 = (sc8) it2.next();
            MediaSession.QueueItem queueItem = sc82.c;
            if (queueItem == null) {
                queueItem = rc8.a(sc82.a.b(), sc82.b);
                sc82.c = queueItem;
            }
            queueItem.getClass();
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [it4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [t58, v58] */
    public static l68 M(String str, Uri uri, String str2, Bundle bundle) {
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        Collections.emptyList();
        e8c e8c2 = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str3 = str;
        ? obj = new Object();
        obj.a = uri;
        obj.b = str2;
        obj.c = bundle;
        return new l68(str3, new t58(r58), (a68) null, new z58(x58), z78.J, new d68(obj));
    }

    public static ComponentName P(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void A(int i2) {
        N(15, new gd8(this, i2, 0), this.j.b(), true);
    }

    public final void B(int i2) {
        N(14, new gd8(this, i2, 1), this.j.b(), true);
    }

    public final void C() {
        boolean t1 = this.f.s.t1(9);
        vc8 vc8 = this.j;
        if (t1) {
            N(9, new dd8(this, 8), vc8.b(), true);
        } else {
            N(8, new dd8(this, 9), vc8.b(), true);
        }
    }

    public final void D() {
        boolean t1 = this.f.s.t1(7);
        vc8 vc8 = this.j;
        if (t1) {
            N(7, new dd8(this, 2), vc8.b(), true);
        } else {
            N(6, new dd8(this, 3), vc8.b(), true);
        }
    }

    public final void E(long j2) {
        if (j2 >= 0) {
            N(10, new ed8(this, j2, 0), this.j.b(), true);
        }
    }

    public final void F() {
        N(3, new dd8(this, 6), this.j.b(), true);
    }

    public final void N(int i2, ld8 ld8, pd8 pd8, boolean z) {
        cd8 cd8 = this.f;
        if (!cd8.i()) {
            if (pd8 == null) {
                ez3.v("RemoteUserInfo is null, ignoring command=" + i2);
                return;
            }
            oze.W(cd8.l, new hd8(this, i2, pd8, ld8, z));
        }
    }

    public final void O(v1d v1d, int i2, ld8 ld8, pd8 pd8) {
        if (pd8 == null) {
            StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = v1d;
            if (v1d == null) {
                obj = Integer.valueOf(i2);
            }
            sb.append(obj);
            ez3.v(sb.toString());
            return;
        }
        oze.W(this.f.l, new tw0(this, v1d, i2, pd8, ld8, 3));
    }

    public final void Q(l68 l68, boolean z) {
        N(31, new qa5(this, l68, z, 5), this.j.b(), false);
    }

    public final ic8 R(pd8 pd8) {
        ic8 x = this.e.x(pd8);
        if (x == null) {
            pd8 pd82 = pd8;
            x = new ic8(pd82, 0, 0, this.g.b(pd8), new jd8(pd8), Bundle.EMPTY);
            gc8 l2 = this.f.l(x);
            this.e.l(pd8, x, l2.a, l2.b);
        }
        fx fxVar = this.i;
        long j2 = this.n;
        fxVar.removeMessages(1001, x);
        fxVar.sendMessageDelayed(fxVar.obtainMessage(1001, x), j2);
        return x;
    }

    public final void S(qza qza) {
        oze.W(this.f.l, new fd8(this, qza, 1));
    }

    public final void f(c58 c58) {
        if (c58 != null) {
            N(20, new ph0(this, c58, -1, 10), this.j.b(), false);
        }
    }

    public final void g(c58 c58, int i2) {
        if (c58 == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            N(20, new ph0(this, c58, i2, 10), this.j.b(), false);
        }
    }

    public final void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
        oyb.l(str);
        if (!TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) || resultReceiver == null) {
            v1d v1d = new v1d(str, Bundle.EMPTY);
            O(v1d, 0, new xz(this, v1d, bundle, resultReceiver), this.j.b());
            return;
        }
        resultReceiver.send(0, this.f.j.b());
    }

    public final void i(String str, Bundle bundle) {
        v1d v1d = new v1d(str, Bundle.EMPTY);
        O(v1d, 0, new w48(this, v1d, bundle), this.j.b());
    }

    public final void j() {
        N(12, new dd8(this, 0), this.j.b(), true);
    }

    public final boolean k(Intent intent) {
        pd8 b = this.j.b();
        b.getClass();
        return this.f.n(new ic8(b, 0, 0, false, (hc8) null, Bundle.EMPTY), intent);
    }

    public final void l() {
        N(1, new dd8(this, 11), this.j.b(), true);
    }

    public final void m() {
        N(1, new dd8(this, 10), this.j.b(), false);
    }

    public final void n(String str, Bundle bundle) {
        Q(M(str, (Uri) null, (String) null, bundle), true);
    }

    public final void o(String str, Bundle bundle) {
        Q(M((String) null, (Uri) null, str, bundle), true);
    }

    public final void p(Uri uri, Bundle bundle) {
        Q(M((String) null, uri, (String) null, bundle), true);
    }

    public final void q() {
        N(2, new dd8(this, 5), this.j.b(), true);
    }

    public final void r(String str, Bundle bundle) {
        Q(M(str, (Uri) null, (String) null, bundle), false);
    }

    public final void s(String str, Bundle bundle) {
        Q(M((String) null, (Uri) null, str, bundle), false);
    }

    public final void t(Uri uri, Bundle bundle) {
        Q(M((String) null, uri, (String) null, bundle), false);
    }

    public final void u(c58 c58) {
        if (c58 != null) {
            N(20, new w48((Object) this, 2, (Object) c58), this.j.b(), true);
        }
    }

    public final void v() {
        N(11, new dd8(this, 4), this.j.b(), true);
    }

    public final void w(long j2) {
        N(5, new ed8(this, j2, 1), this.j.b(), true);
    }

    public final void x(float f2) {
        if (f2 > 0.0f) {
            N(13, new a44(this, f2), this.j.b(), true);
        }
    }

    public final void y(dyb dyb) {
        z(dyb);
    }

    public final void z(dyb dyb) {
        ayb q2 = qa7.q(dyb);
        if (q2 == null) {
            ez3.j0("Ignoring invalid RatingCompat " + dyb);
            return;
        }
        O((v1d) null, 40010, new dd8(this, q2), this.j.b());
    }
}
