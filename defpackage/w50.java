package defpackage;

/* renamed from: w50  reason: default package */
public final /* synthetic */ class w50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ w50(otf otf, Exception exc, int i) {
        this.a = i;
        this.b = otf;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        otf otf = this.b;
        int i = this.a;
        otf.getClass();
        switch (i) {
            case 0:
                int i2 = mze.a;
                f44 f44 = ((g45) otf.b).a.G0;
                fd P = f44.P();
                f44.Q(P, 1029, new z34(P, exc, 27));
                return;
            default:
                int i3 = mze.a;
                f44 f442 = ((g45) otf.b).a.G0;
                fd P2 = f442.P();
                f442.Q(P2, 1014, new t34((Object) P2, 22, (Object) exc));
                return;
        }
    }
}
