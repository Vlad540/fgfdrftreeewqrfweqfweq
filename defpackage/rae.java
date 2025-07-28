package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: rae  reason: default package */
public final /* synthetic */ class rae implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tae b;
    public final /* synthetic */ ea6 c;

    public /* synthetic */ rae(tae tae, ea6 ea6, int i) {
        this.a = i;
        this.b = tae;
        this.c = ea6;
    }

    public final void accept(Object obj) {
        ea6 ea6 = this.c;
        tae tae = this.b;
        switch (this.a) {
            case 0:
                sae sae = (sae) obj;
                tae.getClass();
                boolean z = sae.b;
                File file = sae.a;
                if (z) {
                    udd.q("tae", "Has tam emoji font file");
                    tae.d(file, ea6);
                    return;
                }
                udd.q("tae", "Hasn't tam emoji font file");
                udd.q("tae", "Download font");
                if (!tic.c(tae.x0)) {
                    udd.q("tae", "Font already downloading");
                    return;
                }
                t97 t97 = tae.Z;
                ((ed3) t97.getValue()).c(tae);
                if (((ed3) t97.getValue()).b() != wd3.c) {
                    if (ea6 != null) {
                        ea6.N();
                    }
                    udd.R("tae", (IOException) null, "Can't download now. Waiting for Wi-Fi", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                et9 et9 = new et9(new u95(tae, file, 2), 0);
                lce lce = (lce) tae.a.getValue();
                lce.getClass();
                fv9 o = new au9(et9, new ice(lce, 5, 2), 6).o(5, z3d.l);
                mbe mbe = (mbe) tae.X.getValue();
                mbe.getClass();
                ov9 r = o.r(((nbe) mbe).a());
                c97 c97 = new c97(new xz((Object) tae, (Object) file, (Object) ea6, 29), new rae(tae, ea6, 2), z3d.i);
                r.a(c97);
                tae.x0 = c97;
                return;
            case 1:
                ((g15) tae.Y.getValue()).c(new Exception("Can't read emoji font", (Throwable) obj), true);
                if (ea6 != null) {
                    ea6.N();
                }
                tae.y0 = null;
                return;
            default:
                ((g15) tae.Y.getValue()).c(new Exception("Can't download emoji font", (Throwable) obj), true);
                if (ea6 != null) {
                    ea6.N();
                }
                ((ed3) tae.Z.getValue()).e(tae);
                tae.y0 = null;
                return;
        }
    }
}
