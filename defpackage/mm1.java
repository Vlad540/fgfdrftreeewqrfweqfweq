package defpackage;

/* renamed from: mm1  reason: default package */
public final /* synthetic */ class mm1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm1 b;

    public /* synthetic */ mm1(sm1 sm1, int i) {
        this.a = i;
        this.b = sm1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return sm1.x(this.b);
            case 1:
                s16 s16 = this.b.U0;
                if (s16 != null) {
                    return (f5f) s16.invoke();
                }
                return null;
            default:
                return sm1.C(this.b);
        }
    }
}
