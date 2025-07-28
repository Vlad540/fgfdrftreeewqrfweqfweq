package defpackage;

/* renamed from: hn0  reason: default package */
public final /* synthetic */ class hn0 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn0 b;

    public /* synthetic */ hn0(jn0 jn0, int i) {
        this.a = i;
        this.b = jn0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jn0 jn0 = this.b;
                if (jn0.o.isEmpty()) {
                    q9c q9c = jn0.Z;
                    q9c.getClass();
                    ((lh0) q9c).c();
                    b24.a();
                    return;
                }
                jn0.y0 = true;
                return;
            case 1:
                jn0 jn02 = this.b;
                jn02.x0++;
                jn02.A();
                return;
            default:
                jn0 jn03 = this.b;
                p96 p96 = jn03.w0;
                if (p96 != null) {
                    p96.a();
                }
                jn03.o.clear();
                return;
        }
    }
}
