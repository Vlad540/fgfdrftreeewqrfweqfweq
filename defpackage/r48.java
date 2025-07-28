package defpackage;

/* renamed from: r48  reason: default package */
public final /* synthetic */ class r48 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u48 b;

    public /* synthetic */ r48(u48 u48, int i) {
        this.a = i;
        this.b = u48;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                u48 u48 = this.b;
                if (((v38) u48.g.b).e.a() == null) {
                    u48.R();
                    return;
                }
                return;
            default:
                u48 u482 = this.b;
                u482.getClass();
                j18 j18 = new j18(u482.a, u482.c.a.b(), new jj7(u482));
                u482.h = j18;
                j18.a.b.connect();
                return;
        }
    }
}
