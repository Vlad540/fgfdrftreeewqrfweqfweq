package defpackage;

/* renamed from: zac  reason: default package */
public final /* synthetic */ class zac implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ abc b;

    public /* synthetic */ zac(abc abc, int i) {
        this.a = i;
        this.b = abc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ga0 ga0 = this.b.c;
                if (((abc) ga0.g) != null) {
                    ga0.b();
                    return;
                }
                return;
            default:
                ga0 ga02 = this.b.c;
                if (((abc) ga02.g) != null && (ga02.b & 3) != 0) {
                    ga02.b();
                    return;
                }
                return;
        }
    }
}
