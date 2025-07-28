package defpackage;

/* renamed from: v5f  reason: default package */
public final /* synthetic */ class v5f implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6f b;

    public /* synthetic */ v5f(a6f a6f, int i) {
        this.a = i;
        this.b = a6f;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                t97 t97 = (t97) this.b.o.c;
                if (t97.a()) {
                    f9f f9f = (f9f) t97.getValue();
                    f9f.setAlpha(1.0f);
                    f9f.setVisibility(0);
                }
                return jue.a;
            case 1:
                return a6f.b(this.b);
            case 2:
                return a6f.d(this.b);
            default:
                return a6f.a(this.b);
        }
    }
}
