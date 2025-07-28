package defpackage;

/* renamed from: s51  reason: default package */
public final /* synthetic */ class s51 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w51 b;

    public /* synthetic */ s51(w51 w51, int i) {
        this.a = i;
        this.b = w51;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                s16 s16 = this.b.Q0;
                if (s16 != null) {
                    return (f5f) s16.invoke();
                }
                return null;
            default:
                return Integer.valueOf(this.b.P0.a);
        }
    }
}
