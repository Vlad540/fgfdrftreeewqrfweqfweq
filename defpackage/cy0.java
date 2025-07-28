package defpackage;

/* renamed from: cy0  reason: default package */
public final /* synthetic */ class cy0 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ cy0(py0 py0, int i) {
        this.a = i;
        this.b = py0;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        py0 py0 = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "CallAdminSettingsController", rf0.h("Low hands for all failed due to: ", th.getMessage()), (Throwable) null);
                }
                py0.C0.g(new cb(false));
                return jue.a;
            case 1:
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, "CallAdminSettingsController", rf0.h("Disable cameras for all once failed due to: ", th.getMessage()), (Throwable) null);
                }
                py0.C0.g(new za(false));
                return jue.a;
            default:
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    fn63.d(tn7.X, "CallAdminSettingsController", rf0.h("Disable microphone for all once failed due to: ", th.getMessage()), (Throwable) null);
                }
                py0.C0.g(new bb(false));
                return jue.a;
        }
    }
}
