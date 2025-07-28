package defpackage;

/* renamed from: v50  reason: default package */
public final /* synthetic */ class v50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe4 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ v50(qe4 qe4, Exception exc, int i) {
        this.a = i;
        this.b = qe4;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        qe4 qe4 = this.b;
        int i = this.a;
        qe4.getClass();
        switch (i) {
            case 0:
                int i2 = oze.a;
                g44 g44 = ((h45) qe4.c).a.H0;
                gd I = g44.I();
                g44.J(I, 1029, new t34((Object) I, 19, (Object) exc));
                return;
            default:
                int i3 = oze.a;
                g44 g442 = ((h45) qe4.c).a.H0;
                gd I2 = g442.I();
                g442.J(I2, 1014, new t34((Object) I2, 23, (Object) exc));
                return;
        }
    }
}
