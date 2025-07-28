package defpackage;

/* renamed from: ld4  reason: default package */
public final /* synthetic */ class ld4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md4 b;

    public /* synthetic */ ld4(md4 md4, int i) {
        this.a = i;
        this.b = md4;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b == md4.REGULAR);
            default:
                return Boolean.valueOf(this.b == md4.DELAYED);
        }
    }
}
