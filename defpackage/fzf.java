package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fzf  reason: default package */
public final class fzf {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final la6 a;

    public fzf(la6 la6) {
        this.a = la6;
    }

    public final n4g a(n4g n4g) {
        la6 la6 = this.a;
        la6.getClass();
        boolean z = true;
        if (!n4g.r && !((Boolean) BasePendingResult.s.get()).booleanValue()) {
            z = false;
        }
        n4g.r = z;
        qa6 qa6 = la6.y0;
        qa6.getClass();
        ozf ozf = new ozf(new xzf(n4g), qa6.x0.get(), la6);
        z59 z59 = qa6.B0;
        z59.sendMessage(z59.obtainMessage(4, ozf));
        return n4g;
    }
}
