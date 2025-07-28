package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jgd  reason: default package */
public abstract class jgd extends ig7 {
    public jgd(Executor executor) {
        super(new qe4(executor, 4, new w04(9)));
        jgd.super.A(true);
    }

    public final pg7 G(int i) {
        if (i < 0 || i >= this.o.f.size()) {
            return null;
        }
        return (pg7) C(i);
    }

    /* renamed from: H */
    public void r(chd chd, int i) {
        chd.A((pg7) C(i));
    }

    /* renamed from: I */
    public void y(chd chd) {
        chd.D();
    }

    public long k(int i) {
        return ((pg7) C(i)).getItemId();
    }

    public int l(int i) {
        return ((pg7) C(i)).l();
    }
}
