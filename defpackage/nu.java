package defpackage;

/* renamed from: nu  reason: default package */
public final /* synthetic */ class nu implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb9 b;

    public /* synthetic */ nu(zb9 zb9, int i) {
        this.a = i;
        this.b = zb9;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.d(((rg6) obj).getId()));
            case 1:
                return Boolean.valueOf(this.b.d(((rg6) obj).getId()));
            default:
                return Boolean.valueOf(!this.b.a(((ira) obj).a));
        }
    }
}
