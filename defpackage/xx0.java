package defpackage;

/* renamed from: xx0  reason: default package */
public final /* synthetic */ class xx0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xx0(py0 py0, boolean z, int i) {
        this.a = i;
        this.b = py0;
        this.c = z;
    }

    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                boolean z = this.c;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    fn6.d(tn7, "CallAdminSettingsController", "Microphone in call was changed on " + z + " success", (Throwable) null);
                }
                grd grd = py0.E0;
                do {
                    value = grd.getValue();
                } while (!grd.b(value, ea.a((ea) value, false, false, z, false, false, false, 123)));
                py0.C0.g(new ab(true, z));
                return jue.a;
            case 1:
                py0 py02 = this.b;
                boolean z2 = this.c;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    tn7 tn72 = tn7.X;
                    fn62.d(tn72, "CallAdminSettingsController", "Cameras in call was changed on " + z2 + " success", (Throwable) null);
                }
                grd grd2 = py02.E0;
                do {
                    value2 = grd2.getValue();
                } while (!grd2.b(value2, ea.a((ea) value2, false, z2, false, false, false, false, 125)));
                py02.C0.g(new ya(true, z2));
                return jue.a;
            default:
                py0 py03 = this.b;
                boolean z3 = this.c;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    tn7 tn73 = tn7.X;
                    fn63.d(tn73, "CallAdminSettingsController", "Screen sharing in call was changed on " + z3 + " success", (Throwable) null);
                }
                grd grd3 = py03.E0;
                do {
                    value3 = grd3.getValue();
                } while (!grd3.b(value3, ea.a((ea) value3, false, false, false, z3, false, false, 119)));
                py03.C0.g(new eb(true, z3));
                return jue.a;
        }
    }
}
