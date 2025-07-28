package defpackage;

/* renamed from: ww0  reason: default package */
public final /* synthetic */ class ww0 implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ gx0 a;
    public final /* synthetic */ rk9 b;
    public final /* synthetic */ ocd c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ ww0(gx0 gx0, rk9 rk9, ocd ocd, boolean z, boolean z2, String str) {
        this.a = gx0;
        this.b = rk9;
        this.c = ocd;
        this.o = z;
        this.X = z2;
        this.Y = str;
    }

    public final void run() {
        gx0 gx0 = this.a;
        rk9 rk9 = this.b;
        ocd ocd = this.c;
        boolean z = this.o;
        boolean z2 = this.X;
        String str = this.Y;
        gx0.getClass();
        Runnable runnable = rk9.m;
        ocd.getClass();
        ocd.a.execute(new lcd(ocd, z, 2));
        ocd.d.setPreprocessorParams(z2, rk9.e, str, rk9.g, rk9.h, rk9.i, rk9.j, rk9.k, rk9.l, z2 ? new zw0(gx0, runnable, 0) : new lc(4));
    }
}
