package defpackage;

/* renamed from: g93  reason: default package */
public final /* synthetic */ class g93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h93 b;
    public final /* synthetic */ p8f c;

    public /* synthetic */ g93(h93 h93, p8f p8f, int i) {
        this.a = i;
        this.b = h93;
        this.c = p8f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                this.c.getClass();
                return;
            case 1:
                this.b.getClass();
                this.c.l();
                return;
            default:
                this.b.getClass();
                this.c.onFirstFrameRendered();
                return;
        }
    }

    public /* synthetic */ g93(h93 h93, p8f p8f, r8f r8f) {
        this.a = 0;
        this.b = h93;
        this.c = p8f;
    }
}
