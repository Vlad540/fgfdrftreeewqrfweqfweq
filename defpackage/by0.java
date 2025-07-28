package defpackage;

/* renamed from: by0  reason: default package */
public final /* synthetic */ class by0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ by0(py0 py0, int i) {
        this.a = i;
        this.b = py0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "CallAdminSettingsController", "Low hands for all success.", (Throwable) null);
                }
                py0.C0.g(new cb(true));
                return jue.a;
            case 1:
                return new fy0(this.b, 0);
            case 2:
                return new ly0(this.b);
            case 3:
                py0 py02 = this.b;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, "CallAdminSettingsController", "Disable cameras for all once was success", (Throwable) null);
                }
                py02.C0.g(new za(true));
                return jue.a;
            default:
                py0 py03 = this.b;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    fn63.d(tn7.X, "CallAdminSettingsController", "Disable microphone for all once was success", (Throwable) null);
                }
                py03.C0.g(new bb(true));
                return jue.a;
        }
    }
}
