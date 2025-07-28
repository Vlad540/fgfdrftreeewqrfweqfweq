package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: v2e  reason: default package */
public final class v2e extends jgd {
    public final u2e X;

    public v2e(u2e u2e, ExecutorService executorService) {
        super(executorService);
        this.X = u2e;
    }

    /* renamed from: J */
    public final void r(y2e y2e, int i) {
        x2e x2e = (x2e) ((pg7) C(i));
        kh3 kh3 = y2e.a;
        kh3.setId(y9a.B);
        CharSequence charSequence = x2e.b;
        kh3.setName(charSequence);
        kh3.setMessage(x2e.o);
        int i2 = x2e.Z;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                kh3.O(x2e.a, charSequence, x2e.c);
            } else {
                kh3.K0.setVisibility(8);
                kh3.K();
            }
            boolean z = !x2e.Y.isEmpty();
            u2e u2e = this.X;
            if (z) {
                kh3.S(kh3, Integer.valueOf(x9a.a), (u0a) null, new k61(u2e, kh3, x2e, 11), 6);
            } else {
                kh3.S(kh3, (Integer) null, (u0a) null, (s16) null, 6);
            }
            a24.a0(kh3, new p7d(u2e, 10, x2e));
            return;
        }
        throw null;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        return new b7c(new kh3(viewGroup.getContext(), (AttributeSet) null));
    }
}
