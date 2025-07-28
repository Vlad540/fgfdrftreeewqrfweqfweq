package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: hbb  reason: default package */
public final class hbb extends jgd {
    public final gbb X;

    public hbb(ExecutorService executorService, gbb gbb) {
        super(executorService);
        this.X = gbb;
    }

    /* renamed from: J */
    public final void r(ifb ifb, int i) {
        ncb ncb = (ncb) ((pg7) C(i));
        ifb.A(ncb);
        b7c b7c = null;
        if (ncb instanceof jcb) {
            if (ifb instanceof r07) {
                b7c = (r07) ifb;
            }
            if (b7c != null) {
                a24.a0(b7c.a, new q6(13, new nya(this, 6, ncb)));
            }
        } else if (ncb instanceof ccb) {
            boolean z = ifb instanceof da2;
            da2 da2 = z ? (da2) ifb : null;
            if (da2 != null) {
                a24.a0(da2.a, new q6(4, new fbb(this, 0)));
            }
            if (z) {
                b7c = (da2) ifb;
            }
            if (b7c != null) {
                ((z92) b7c.a).setOnMoreActionsClickListener(new fbb(this, 1));
            }
        }
    }

    public final int l(int i) {
        return ((ncb) ((pg7) C(i))).l();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [z92, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (kjd.p(i2, 8192)) {
            return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
        }
        if (kjd.p(i2, 4)) {
            return new s10(viewGroup.getContext());
        }
        if (kjd.p(i2, 16384)) {
            return new b7c(new z92(viewGroup.getContext(), (AttributeSet) null));
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
