package defpackage;

/* renamed from: tf7  reason: default package */
public final /* synthetic */ class tf7 implements v1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg7 b;

    public /* synthetic */ tf7(gg7 gg7, int i) {
        this.a = i;
        this.b = gg7;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return this.b.j.equalsIgnoreCase(str);
            default:
                return this.b.m.equalsIgnoreCase(str);
        }
    }
}
