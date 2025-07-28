package defpackage;

/* renamed from: ya4  reason: default package */
public final /* synthetic */ class ya4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn1 b;

    public /* synthetic */ ya4(sn1 sn1, int i) {
        this.a = i;
        this.b = sn1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            default:
                this.b.b((Object) null);
                return;
        }
    }
}
