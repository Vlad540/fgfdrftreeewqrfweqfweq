package defpackage;

/* renamed from: v4a  reason: default package */
public final /* synthetic */ class v4a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4a b;

    public /* synthetic */ v4a(x4a x4a, int i) {
        this.a = i;
        this.b = x4a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b;
            case 1:
                x4a x4a = this.b;
                return new t4a(new duf(x4a.c, new v4a(x4a, 0)));
            default:
                return this.b.b();
        }
    }
}
