package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: vc3  reason: default package */
public final /* synthetic */ class vc3 implements xc3 {
    public final /* synthetic */ nxc a;
    public final /* synthetic */ ic8 b;

    public /* synthetic */ vc3(nxc nxc, ic8 ic8, eya eya) {
        this.a = nxc;
        this.b = ic8;
    }

    public final ch7 run() {
        cd8 cd8 = (cd8) ((WeakReference) this.a.o).get();
        if (cd8 != null) {
            cd8.p(this.b);
        }
        return bs6.b;
    }
}
