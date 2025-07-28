package defpackage;

import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: wif  reason: default package */
public final /* synthetic */ class wif implements i34 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long a;
    public final /* synthetic */ bff b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ String o;

    public /* synthetic */ wif(long j, bff bff, Long l, String str, boolean z, int i) {
        this.a = j;
        this.b = bff;
        this.c = l;
        this.o = str;
        this.X = z;
        this.Y = i;
    }

    public final Object a() {
        return new WebAppRootScreen(this.a, this.b, this.c, this.o, this.X, this.Y);
    }
}
