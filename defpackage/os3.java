package defpackage;

/* renamed from: os3  reason: default package */
public final /* synthetic */ class os3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs3 b;

    public /* synthetic */ os3(rs3 rs3, int i) {
        this.a = i;
        this.b = rs3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ps3(this.b, 1);
            default:
                return new ps3(this.b, 0);
        }
    }
}
