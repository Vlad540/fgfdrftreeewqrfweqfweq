package defpackage;

/* renamed from: s0b  reason: default package */
public final /* synthetic */ class s0b implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0b b;

    public /* synthetic */ s0b(z0b z0b, int i) {
        this.a = i;
        this.b = z0b;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                z0b.b(this.b, floatValue);
                return jue.a;
            case 1:
                z0b.c(this.b, floatValue, f.floatValue());
                return jue.a;
            default:
                f.getClass();
                z0b.a(this.b, floatValue);
                return jue.a;
        }
    }
}
