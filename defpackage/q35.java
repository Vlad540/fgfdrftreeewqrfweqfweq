package defpackage;

import android.content.Context;
import android.os.Looper;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: q35  reason: default package */
public final class q35 {
    public final Context a;
    public z7e b;
    public final p3e c;
    public p3e d;
    public p3e e;
    public p3e f;
    public final p3e g;
    public final e26 h;
    public Looper i;
    public final int j;
    public final k20 k;
    public final int l;
    public final boolean m;
    public final xtc n;
    public final long o;
    public final long p;
    public final long q;
    public final a94 r;
    public long s;
    public final long t;
    public boolean u;
    public boolean v;
    public final String w;

    public q35(Context context) {
        this(context, new o35(context, 0), new o35(context, 1));
    }

    public final n45 a() {
        oyb.k(!this.v);
        this.v = true;
        return new n45(this);
    }

    public q35(Context context, p3e p3e, p3e p3e2) {
        o35 o35 = new o35(context, 5);
        d93 d93 = new d93(4);
        o35 o352 = new o35(context, 7);
        i74 i74 = new i74(17);
        context.getClass();
        this.a = context;
        this.c = p3e;
        this.d = p3e2;
        this.e = o35;
        this.f = d93;
        this.g = o352;
        this.h = i74;
        this.i = oze.w();
        this.k = k20.g;
        this.l = 1;
        this.m = true;
        this.n = xtc.c;
        this.o = 5000;
        this.p = 15000;
        this.q = 3000;
        this.r = new a94(1, oze.S(20), 0.999f, oze.S(500));
        this.b = z7e.a;
        this.s = 500;
        this.t = 2000;
        this.u = true;
        this.w = BuildConfig.FLAVOR;
        this.j = -1000;
    }
}
