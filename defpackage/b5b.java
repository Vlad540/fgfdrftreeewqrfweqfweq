package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: b5b  reason: default package */
public final class b5b {
    public final ContentResolver a;
    public final Resources b;
    public final AssetManager c;
    public final w66 d;
    public final iq6 e;
    public final nfc f;
    public final vl4 g;
    public final boolean h;
    public final boolean i = false;
    public final h25 j;
    public final qe4 k;
    public final o3e l;
    public final el8 m;
    public final el8 n;
    public final m54 o;
    public final mxa p;
    public final lv1 q;
    public final int r;
    public final boolean s;

    public b5b(Context context, w66 w66, iq6 iq6, nfc nfc, vl4 vl4, boolean z, h25 h25, qe4 qe4, qe4 qe42, qe4 qe43, o3e o3e, m54 m54, mxa mxa, int i2, lv1 lv1) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = w66;
        this.e = iq6;
        this.f = nfc;
        this.g = vl4;
        this.h = z;
        this.j = h25;
        this.k = qe4;
        this.n = qe42;
        this.m = qe43;
        this.l = o3e;
        this.o = m54;
        this.p = mxa;
        new ns7();
        new ns7();
        this.r = i2;
        this.q = lv1;
        this.s = false;
    }

    public final i24 a(y4b y4b) {
        return new i24(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, y4b, this.r, this.q);
    }

    public final gbc b(y4b y4b, boolean z, wr6 wr6) {
        return new gbc(this.j.c(), this.k, y4b, z, wr6);
    }
}
