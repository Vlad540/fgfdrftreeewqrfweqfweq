package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: p35  reason: default package */
public final class p35 {
    public final Context a;
    public final y7e b;
    public final p3e c;
    public final p3e d;
    public p3e e;
    public p3e f;
    public final p3e g;
    public final e26 h;
    public final Looper i;
    public final j20 j;
    public final int k;
    public final boolean l;
    public final wtc m;
    public final a94 n;
    public final long o;
    public boolean p;

    public p35(Context context, hbe hbe) {
        k94 k94 = new k94(5, hbe);
        o35 o35 = new o35(context, 2);
        o35 o352 = new o35(context, 3);
        d93 d93 = new d93(3);
        o35 o353 = new o35(context, 6);
        i74 i74 = new i74(16);
        this.a = context;
        this.c = k94;
        this.d = o35;
        this.e = o352;
        this.f = d93;
        this.g = o353;
        this.h = i74;
        int i2 = mze.a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = j20.Z;
        this.k = 1;
        this.l = true;
        this.m = wtc.c;
        this.n = new a94(0, mze.D(20), 0.999f, mze.D(500));
        this.b = y7e.a;
        this.o = 2000;
    }
}
