package defpackage;

import java.io.File;

/* renamed from: bl7  reason: default package */
public final class bl7 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public bl7(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, oz, cl7] */
    public final cl7 a(pl7 pl7, tk7 tk7) {
        boolean z = tk7 instanceof mz;
        t97 t97 = this.b;
        t97 t972 = this.a;
        if (!z) {
            return new cl7(pl7, (pwc) t972.getValue(), (mbe) t97.getValue(), tk7);
        }
        pwc pwc = (pwc) t972.getValue();
        mz mzVar = (mz) tk7;
        ry ryVar = (ry) this.c.getValue();
        ? cl7 = new cl7(pl7, pwc, (mbe) t97.getValue(), mzVar);
        String str = mzVar.y0.r;
        if (str == null || str.length() == 0) {
            udd.q("oz", "Start download attach");
            pl7.C(true);
            j8e a2 = ryVar.a(mzVar.y0);
            a2.G(new j9(cl7, 1, mzVar), new rgc(4, cl7));
            cl7.Y = a2;
            return cl7;
        }
        pwc.o(mzVar, new File(mzVar.y0.r));
        pl7.C(false);
        return cl7;
    }
}
