package defpackage;

/* renamed from: ea5  reason: default package */
public final /* synthetic */ class ea5 implements q3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return new lx7(((a95) ((fa5) obj).a.get()).a(), new i74(26), 3);
            default:
                jk0 jk0 = ((mtf) obj).d;
                Object A = jk0.A();
                udd.q("mtf", "getWorkManager: enable = " + A);
                Boolean bool = (Boolean) jk0.A();
                if (bool != null && bool.booleanValue()) {
                    return ms9.m(Boolean.TRUE);
                }
                udd.q("mtf", "waiting for enable ...");
                return jk0;
        }
    }
}
