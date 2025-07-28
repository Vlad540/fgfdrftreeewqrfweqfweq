package defpackage;

/* renamed from: n38  reason: default package */
public final /* synthetic */ class n38 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z38 b;
    public final /* synthetic */ r38 c;

    public /* synthetic */ n38(z38 z38, r38 r38, int i) {
        this.a = i;
        this.b = z38;
        this.c = r38;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z38 z38 = this.b;
                r38 r38 = this.c;
                z38.x0 = r38;
                if (r38 != null && z38.y0) {
                    z38.l(r38);
                }
                z38.c(new n38(z38, r38, 1), new eo1(1, z38));
                return;
            default:
                z38 z382 = this.b;
                r38 r382 = this.c;
                if (z382.a instanceof q0) {
                    r382.release();
                    return;
                }
                return;
        }
    }
}
