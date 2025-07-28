package defpackage;

/* renamed from: dy0  reason: default package */
public final /* synthetic */ class dy0 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ le1 c;

    public /* synthetic */ dy0(py0 py0, le1 le1, int i) {
        this.a = i;
        this.b = py0;
        this.c = le1;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                le1 le1 = this.c;
                Throwable th = (Throwable) obj;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    String message = th.getMessage();
                    fn6.d(tn7, "CallAdminSettingsController", "Disable screen sharing for " + le1 + " failed due to: " + message, (Throwable) null);
                }
                py0.C0.g(new jb(le1));
                return jue.a;
            case 1:
                py0 py02 = this.b;
                le1 le12 = this.c;
                Throwable th2 = (Throwable) obj;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    tn7 tn72 = tn7.X;
                    String message2 = th2.getMessage();
                    fn62.d(tn72, "CallAdminSettingsController", "Disable microphone for " + le12 + " failed due to: " + message2, (Throwable) null);
                }
                py02.C0.g(new gb(le12, false));
                return jue.a;
            default:
                py0 py03 = this.b;
                le1 le13 = this.c;
                Throwable th3 = (Throwable) obj;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    tn7 tn73 = tn7.X;
                    String message3 = th3.getMessage();
                    fn63.d(tn73, "CallAdminSettingsController", "Disable camera for " + le13 + " failed due to: " + message3, (Throwable) null);
                }
                py03.C0.g(new fb(le13, false));
                return jue.a;
        }
    }
}
