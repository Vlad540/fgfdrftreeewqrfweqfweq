package defpackage;

/* renamed from: wd4  reason: default package */
public final /* synthetic */ class wd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ c9 c;

    public /* synthetic */ wd4(Runnable runnable, c9 c9Var, int i) {
        this.a = i;
        this.b = runnable;
        this.c = c9Var;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Exception e) {
                    ((ce4) this.c.b).j(e);
                    throw e;
                }
            case 1:
                try {
                    this.b.run();
                    return;
                } catch (Exception e2) {
                    ((ce4) this.c.b).j(e2);
                    return;
                }
            default:
                Runnable runnable = this.b;
                c9 c9Var = this.c;
                try {
                    runnable.run();
                    ((ce4) c9Var.b).i((Object) null);
                    return;
                } catch (Exception e3) {
                    ((ce4) c9Var.b).j(e3);
                    return;
                }
        }
    }
}
