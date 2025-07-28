package defpackage;

/* renamed from: ve1  reason: default package */
public final /* synthetic */ class ve1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ we1 b;

    public /* synthetic */ ve1(we1 we1, int i) {
        this.a = i;
        this.b = we1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((jb5) this.b.f.getValue()).q());
            default:
                return Boolean.valueOf(((jb5) this.b.f.getValue()).r());
        }
    }
}
