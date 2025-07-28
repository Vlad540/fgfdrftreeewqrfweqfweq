package defpackage;

/* renamed from: z6e  reason: default package */
public final /* synthetic */ class z6e implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7e b;

    public /* synthetic */ z6e(b7e b7e, int i) {
        this.a = i;
        this.b = b7e;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                b7e.a(this.b, floatValue);
                return jue.a;
            default:
                b7e.b(this.b, floatValue, f.floatValue());
                return jue.a;
        }
    }
}
