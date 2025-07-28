package defpackage;

/* renamed from: f9a  reason: default package */
public final /* synthetic */ class f9a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9a b;

    public /* synthetic */ f9a(g9a g9a, int i) {
        this.a = i;
        this.b = g9a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                g9a g9a = this.b;
                if (!g9a.c.get()) {
                    g9a.b.execute(new t50(g9a, true, 10));
                    return;
                }
                return;
            default:
                g9a g9a2 = this.b;
                if (!g9a2.c.get()) {
                    g9a2.b.execute(new t50(g9a2, false, 10));
                    return;
                }
                return;
        }
    }
}
