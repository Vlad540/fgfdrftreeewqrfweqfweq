package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ga0  reason: default package */
public final class ga0 {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public ga0() {
        nqc nqc = nqc.a;
        zy9 d2 = nqc.d();
        kp kpVar = nqc.q().c;
        t97 t97 = mqc.a;
        r7e d3 = nqc.getAccessor().d(iz2.class);
        r7e r7e = new r7e(new ib7(0));
        r7e r7e2 = new r7e(new ib7(1));
        t97 t972 = mqc.a;
        this.a = d2;
        this.c = kpVar;
        this.b = 5;
        this.d = d3;
        this.e = r7e;
        this.f = r7e2;
        this.g = t972;
    }

    public static void e(int i, s16 s16) {
        long nanoTime = System.nanoTime();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "LibraryUpgradeHelper", rf0.f(i, "Upgrade to ", " started"), (Throwable) null);
        }
        s16.invoke();
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            tn7 tn7 = tn7.X;
            int i2 = zp4.o;
            String j = zp4.j(mt0.Q(System.nanoTime() - nanoTime, eq4.NANOSECONDS));
            fn62.d(tn7, "LibraryUpgradeHelper", "Upgrade to " + i + " complete. It takes " + j, (Throwable) null);
        }
    }

    public ha0 a() {
        String str = this.b == 0 ? " registrationStatus" : BuildConfig.FLAVOR;
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            str = hr1.g(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new ha0(this.b, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.a, (String) this.c, (String) this.d, (String) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b() {
        int a2 = ((yac) this.d).a((Context) this.a);
        if (this.b != a2) {
            this.b = a2;
            ((ml4) ((r34) this.c).b).b(this, a2);
        }
    }

    public boolean c() {
        return (this.b < ((List) this.a).size()) || (((ArrayList) this.d).isEmpty() ^ true);
    }

    public void d() {
        qpc qpc = (ip) this.c;
        int i = qpc.g.getInt("app.library.version", 5);
        int i2 = this.b;
        if (i == i2) {
            udd.p("LibraryUpgradeHelper", "upgrade not needed", new Object[0]);
            return;
        }
        if (((zy9) this.a).d()) {
            if (i < 1) {
                e(1, new hb7(this, 0));
            }
            if (i <= 1 && i2 > 1) {
                e(2, new hb7(this, 1));
            }
            if (i <= 3 && i2 > 3) {
                e(4, new hb7(this, 2));
            }
            if (i <= 4 && i2 > 4) {
                e(5, new hb7(this, 3));
            }
        }
        qpc.j(i2, "app.library.version");
    }

    public int f() {
        yac yac = (yac) this.d;
        Context context = (Context) this.a;
        this.b = yac.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = yac.a;
        if ((i & 1) != 0) {
            if (oze.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                abc abc = new abc(this);
                this.g = abc;
                connectivityManager.registerDefaultNetworkCallback(abc);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            if (oze.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        an anVar = new an(11, this);
        this.f = anVar;
        context.registerReceiver(anVar, intentFilter, (String) null, (Handler) this.e);
        return this.b;
    }

    public ga0(Context context, r34 r34, yac yac) {
        this.a = context.getApplicationContext();
        this.c = r34;
        this.d = yac;
        this.e = oze.p((fi4) null);
    }
}
