package defpackage;

/* renamed from: yd4  reason: default package */
public final /* synthetic */ class yd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ c9 o;

    public /* synthetic */ yd4(ae4 ae4, Runnable runnable, c9 c9Var, int i) {
        this.a = i;
        this.b = ae4;
        this.c = runnable;
        this.o = c9Var;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ae4 ae4 = this.b;
                ae4.getClass();
                ae4.a.execute(new wd4(this.c, this.o, 0));
                return;
            case 1:
                ae4 ae42 = this.b;
                ae42.getClass();
                ae42.a.execute(new wd4(this.c, this.o, 2));
                return;
            default:
                ae4 ae43 = this.b;
                ae43.getClass();
                ae43.a.execute(new wd4(this.c, this.o, 1));
                return;
        }
    }
}
