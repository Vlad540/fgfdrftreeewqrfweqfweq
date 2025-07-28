package defpackage;

/* renamed from: ysd  reason: default package */
public final /* synthetic */ class ysd implements v1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Long b;

    public /* synthetic */ ysd(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((osd) obj).a == this.b.longValue();
            default:
                return ((bud) obj).a == this.b.longValue();
        }
    }
}
