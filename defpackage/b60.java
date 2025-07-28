package defpackage;

/* renamed from: b60  reason: default package */
public final /* synthetic */ class b60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b60(d60 d60, boolean z, int i) {
        this.a = i;
        this.b = d60;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                d60 d60 = this.b;
                int t = hr1.t(d60.g);
                if (t == 0) {
                    d60.b.set((Object) null);
                    d60.c.set(false);
                    d60.g = 2;
                    d60.a.execute(new b60(d60, this.c, 1));
                    d60.d();
                    return;
                } else if (t == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
            default:
                d60 d602 = this.b;
                int t2 = hr1.t(d602.g);
                if (t2 == 0 || t2 == 1) {
                    boolean z = d602.r;
                    boolean z2 = this.c;
                    if (z != z2) {
                        d602.r = z2;
                        if (d602.g == 2) {
                            d602.a();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (t2 == 2) {
                    throw new AssertionError("AudioSource is released");
                } else {
                    return;
                }
        }
    }
}
