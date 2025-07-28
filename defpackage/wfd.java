package defpackage;

/* renamed from: wfd  reason: default package */
public enum wfd {
    ;
    
    public static final mk9 b = null;
    public final String a;

    static {
        wfd[] wfdArr;
        o = new pz4(wfdArr);
        b = new mk9(16);
    }

    /* access modifiers changed from: public */
    wfd(String str) {
        this.a = str;
    }

    public static final wfd a(String str) {
        Object obj;
        b.getClass();
        pz4 pz4 = o;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (hhd.f(((wfd) obj).a, str)) {
                break;
            }
        }
        return (wfd) obj;
    }
}
