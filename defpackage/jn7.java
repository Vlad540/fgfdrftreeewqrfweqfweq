package defpackage;

/* renamed from: jn7  reason: default package */
public final /* synthetic */ class jn7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn7 b;

    public /* synthetic */ jn7(nn7 nn7, int i) {
        this.a = i;
        this.b = nn7;
    }

    public final Object invoke() {
        nn7 nn7 = this.b;
        switch (this.a) {
            case 0:
                ThreadLocal threadLocal = nn7.h;
                return hhd.i(nn7.d, nn7.b);
            default:
                ThreadLocal threadLocal2 = nn7.h;
                return hhd.j(nn7.d, nn7.b);
        }
    }
}
