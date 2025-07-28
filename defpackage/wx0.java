package defpackage;

/* renamed from: wx0  reason: default package */
public final /* synthetic */ class wx0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ le1 c;

    public /* synthetic */ wx0(py0 py0, le1 le1, int i) {
        this.a = i;
        this.b = py0;
        this.c = le1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                le1 le1 = this.c;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    fn6.d(tn7, "CallAdminSettingsController", "Disable screen sharing for " + le1 + " was success", (Throwable) null);
                }
                py0.C0.g(new jb(le1));
                return jue.a;
            case 1:
                py0 py02 = this.b;
                le1 le12 = this.c;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    tn7 tn72 = tn7.X;
                    fn62.d(tn72, "CallAdminSettingsController", "Disable microphone for " + le12 + " was success", (Throwable) null);
                }
                py02.C0.g(new gb(le12, true));
                return jue.a;
            default:
                py0 py03 = this.b;
                le1 le13 = this.c;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    tn7 tn73 = tn7.X;
                    fn63.d(tn73, "CallAdminSettingsController", "Disable camera for " + le13 + " was success", (Throwable) null);
                }
                py03.C0.g(new fb(le13, true));
                return jue.a;
        }
    }
}
