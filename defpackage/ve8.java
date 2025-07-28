package defpackage;

/* renamed from: ve8  reason: default package */
public final /* synthetic */ class ve8 implements Runnable {
    public final /* synthetic */ i78 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ af8 b;
    public final /* synthetic */ bf8 c;
    public final /* synthetic */ xi7 o;

    public /* synthetic */ ve8(af8 af8, bf8 bf8, xi7 xi7, i78 i78, int i) {
        this.a = i;
        this.b = af8;
        this.c = bf8;
        this.o = xi7;
        this.X = i78;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                af8 af8 = this.b;
                this.c.L(af8.b, (re8) af8.c, this.o, this.X);
                return;
            case 1:
                af8 af82 = this.b;
                this.c.K(af82.b, (re8) af82.c, this.o, this.X);
                return;
            default:
                af8 af83 = this.b;
                this.c.e(af83.b, (re8) af83.c, this.o, this.X);
                return;
        }
    }
}
