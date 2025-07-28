package defpackage;

/* renamed from: ica  reason: default package */
public final class ica implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jca b;

    public /* synthetic */ ica(jca jca, int i) {
        this.a = i;
        this.b = jca;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                return;
            default:
                this.b.invalidate();
                return;
        }
    }
}
