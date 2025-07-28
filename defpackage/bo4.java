package defpackage;

/* renamed from: bo4  reason: default package */
public final /* synthetic */ class bo4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo4 b;
    public final /* synthetic */ ho4 c;

    public /* synthetic */ bo4(fo4 fo4, ho4 ho4, int i) {
        this.a = i;
        this.b = fo4;
        this.c = ho4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fo4 fo4 = this.b;
                this.c.D(fo4.a, fo4.b);
                return;
            case 1:
                fo4 fo42 = this.b;
                this.c.B(fo42.a, fo42.b);
                return;
            case 2:
                fo4 fo43 = this.b;
                this.c.y(fo43.a, fo43.b);
                return;
            default:
                fo4 fo44 = this.b;
                this.c.C(fo44.a, fo44.b);
                return;
        }
    }
}
