package defpackage;

import android.app.Service;
import android.content.Intent;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;
import one.me.android.media.service.OneMeMediaSessionService;

/* renamed from: vd8  reason: default package */
public abstract class vd8 extends Service {
    public ue X;
    public i94 Y;
    public og0 Z;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final yr c = new kgd(0);
    public ud8 o;

    public final void a(kc8 kc8) {
        kc8 kc82;
        boolean z = true;
        oyb.c("session is already released", !kc8.a.i());
        synchronized (this.a) {
            kc82 = (kc8) this.c.get(kc8.a.i);
            if (kc82 != null) {
                if (kc82 != kc8) {
                    z = false;
                }
            }
            oyb.c("Session ID should be unique", z);
            this.c.put(kc8.a.i, kc8);
        }
        if (kc82 == null) {
            oze.W(this.b, new px4((Object) this, (Object) c(), (Object) kc8, 15));
        }
    }

    public final og0 b() {
        og0 og0;
        synchronized (this.a) {
            try {
                if (this.Z == null) {
                    this.Z = new og0(5, (Object) this);
                }
                og0 = this.Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return og0;
    }

    public final ue c() {
        ue ueVar;
        synchronized (this.a) {
            try {
                if (this.X == null) {
                    if (this.Y == null) {
                        bq0 bq0 = new bq0(getApplicationContext());
                        oyb.k(!bq0.c);
                        i94 i94 = new i94(bq0);
                        bq0.c = true;
                        this.Y = i94;
                    }
                    this.X = new ue(this, this.Y, b());
                }
                ueVar = this.X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ueVar;
    }

    public final boolean d(kc8 kc8) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.c.containsKey(kc8.a.i);
        }
        return containsKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.kc8 r9, boolean r10) {
        /*
            r8 = this;
            ue r2 = r8.c()
            java.lang.Object r8 = r2.c
            vd8 r8 = (defpackage.vd8) r8
            boolean r8 = r8.d(r9)
            r0 = 1
            if (r8 == 0) goto L_0x0082
            r38 r8 = r2.b(r9)
            if (r8 == 0) goto L_0x0082
            vje r1 = r8.x0()
            boolean r1 = r1.q()
            if (r1 != 0) goto L_0x0082
            int r8 = r8.getPlaybackState()
            if (r8 == r0) goto L_0x0082
            int r8 = r2.a
            int r8 = r8 + r0
            r2.a = r8
            java.lang.Object r0 = r2.i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r9)
            ch7 r0 = (defpackage.ch7) r0
            if (r0 == 0) goto L_0x0043
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r0 = swb.u(r0)     // Catch:{ ExecutionException -> 0x0043 }
            r38 r0 = (defpackage.r38) r0     // Catch:{ ExecutionException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x005c
            r0.K()
            q38 r0 = r0.c
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L_0x0056
            ws6 r0 = r0.V0()
            goto L_0x005a
        L_0x0056:
            po5 r0 = defpackage.ws6.b
            e8c r0 = defpackage.e8c.X
        L_0x005a:
            r4 = r0
            goto L_0x0061
        L_0x005c:
            po5 r0 = defpackage.ws6.b
            e8c r0 = defpackage.e8c.X
            goto L_0x005a
        L_0x0061:
            ph0 r5 = new ph0
            r0 = 9
            r5.<init>(r2, r8, r9, r0)
            android.os.Handler r8 = new android.os.Handler
            kya r0 = r9.c()
            android.os.Looper r0 = r0.z1()
            r8.<init>(r0)
            g88 r7 = new g88
            r1 = 0
            r0 = r7
            r3 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.oze.W(r8, r7)
            goto L_0x0085
        L_0x0082:
            r2.d(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd8.e(kc8, boolean):void");
    }

    public final boolean f(kc8 kc8, boolean z) {
        try {
            e(kc8, c().i(kc8, z));
            return true;
        } catch (IllegalStateException e) {
            if (oze.a < 31 || !td8.a(e)) {
                throw e;
            }
            ez3.B("Failed to start foreground", e);
            this.b.post(new eq6(11, this));
            return false;
        }
    }

    public final void g(kc8 kc8) {
        synchronized (this.a) {
            oyb.c("session not found", this.c.containsKey(kc8.a.i));
            this.c.remove(kc8.a.i);
        }
        oze.W(this.b, new zo5(c(), 23, kc8));
    }

    public final IBinder onBind(Intent intent) {
        String action;
        ud8 ud8;
        wd8 wd8;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.a) {
                ud8 = this.o;
                oyb.l(ud8);
            }
            return ud8;
        } else if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        } else {
            if (!TextUtils.isEmpty("android.media.session.MediaController")) {
                new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1);
                Bundle bundle = Bundle.EMPTY;
                udd.p("OneMeMediaSessionService", "onGetSession", new Object[0]);
                kc8 kc8 = ((OneMeMediaSessionService) this).w0;
                if (kc8 == null) {
                    return null;
                }
                a(kc8);
                cd8 cd8 = kc8.a;
                synchronized (cd8.a) {
                    try {
                        if (cd8.w == null) {
                            uc8 uc8 = cd8.k.a.h.j.a.c;
                            wd8 wd82 = new wd8(cd8);
                            wd82.a(uc8);
                            cd8.w = wd82;
                        }
                        wd8 = cd8.w;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return wd8.onBind(new Intent("android.media.browse.MediaBrowserService"));
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.a) {
            this.o = new ud8(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        synchronized (this.a) {
            try {
                ud8 ud8 = this.o;
                if (ud8 != null) {
                    ud8.c.clear();
                    ud8.d.removeCallbacksAndMessages((Object) null);
                    for (hn6 c2 : ud8.f) {
                        try {
                            c2.c(0);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        kc8 kc8;
        kc8 kc82;
        if (intent == null) {
            return 1;
        }
        og0 b2 = b();
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            synchronized (kc8.b) {
                try {
                    Iterator it = kc8.c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            kc82 = null;
                            break;
                        }
                        kc82 = (kc8) it.next();
                        if (oze.a(kc82.a.b, data)) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kc8 = kc82;
        } else {
            kc8 = null;
        }
        b2.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (kc8 == null) {
                if (!TextUtils.isEmpty("android.media.session.MediaController")) {
                    new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1);
                    Bundle bundle = Bundle.EMPTY;
                    udd.p("OneMeMediaSessionService", "onGetSession", new Object[0]);
                    kc8 = ((OneMeMediaSessionService) this).w0;
                    if (kc8 == null) {
                        return 1;
                    }
                    a(kc8);
                } else {
                    throw new IllegalArgumentException("packageName should be nonempty");
                }
            }
            cd8 cd8 = kc8.a;
            cd8.l.post(new zo5(cd8, 22, intent));
        } else if (kc8 != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj2 = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                return 1;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                obj = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
            }
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
            ue c2 = c();
            r38 b3 = c2.b(kc8);
            if (b3 != null) {
                oze.W(new Handler(kc8.c().z1()), new f88(c2, kc8, str, bundle2, b3));
            }
        }
        return 1;
    }
}
