package defpackage;

/* renamed from: p4b  reason: default package */
public final /* synthetic */ class p4b implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4b b;

    public /* synthetic */ p4b(r4b r4b, int i) {
        this.a = i;
        this.b = r4b;
    }

    public final void accept(Object obj) {
        int i = this.a;
        ja0 ja0 = (ja0) obj;
        r4b r4b = this.b;
        r4b.getClass();
        switch (i) {
            case 0:
                if (ja0.a.f.g) {
                    ja0.b.close();
                    return;
                }
                r4b.a.execute(new q4b(r4b, ja0, 1));
                return;
            default:
                if (ja0.a.f.g) {
                    ja0.b.close();
                    return;
                }
                r4b.a.execute(new q4b(r4b, ja0, 0));
                return;
        }
    }
}
