package defpackage;

/* renamed from: s95  reason: default package */
public final /* synthetic */ class s95 implements q3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s95(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                w95 w95 = (w95) this.c;
                w95.getClass();
                return w95.a(new r95(w95, this.b, 0));
            default:
                aa5 aa5 = (aa5) this.c;
                aa5.getClass();
                sid sid = new sid();
                aa5.f.put(Long.valueOf(((gy9) aa5.a).e(4, this.b)), sid);
                return sid;
        }
    }
}
