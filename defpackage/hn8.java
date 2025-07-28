package defpackage;

/* renamed from: hn8  reason: default package */
public final /* synthetic */ class hn8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn8 b;

    public /* synthetic */ hn8(mn8 mn8, int i) {
        this.a = i;
        this.b = mn8;
    }

    public final void run() {
        int i = this.a;
        mn8 mn8 = this.b;
        switch (i) {
            case 0:
                mn8.setCornersForCollage(mn8.y0);
                return;
            default:
                mn8.N();
                return;
        }
    }
}
