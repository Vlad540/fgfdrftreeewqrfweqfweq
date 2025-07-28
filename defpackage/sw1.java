package defpackage;

/* renamed from: sw1  reason: default package */
public final class sw1 extends ps1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b(int i, ws1 ws1) {
        switch (this.a) {
            case 1:
                d39 d39 = (d39) this.b;
                synchronized (d39.a) {
                    try {
                        if (!d39.X) {
                            d39.x0.put(ws1.getTimestamp(), new xs1(ws1));
                            d39.g();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                for (mye mye : ((zcf) this.b).a) {
                    c2d c2d = mye.n;
                    for (ps1 b2 : c2d.g.e) {
                        b2.b(i, new kg5(ws1, c2d.g.g, -1));
                    }
                }
                return;
            default:
                return;
        }
    }

    public void d(int i) {
        switch (this.a) {
            case 0:
                pa2.A().execute(new ds1(5, this));
                return;
            default:
                return;
        }
    }
}
