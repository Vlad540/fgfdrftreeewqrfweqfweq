package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: y51  reason: default package */
public final class y51 extends chd {
    public final w51 J0;

    public y51(FrameLayout frameLayout) {
        super(frameLayout);
        this.J0 = (w51) frameLayout.findViewById(uob.call_opponents);
    }

    public final void A(pg7 pg7) {
        this.J0.setOpponents((dga) pg7);
    }

    /* renamed from: F */
    public final void B(dga dga, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        w51 w51 = this.J0;
        if (list == null || list.isEmpty()) {
            w51.setOpponents(dga);
            return;
        }
        rg5 rg5 = new rg5(myc.L(new xi5(new es(2, list), new o8(18), oyc.a), x51.b));
        while (rg5.hasNext()) {
            cga cga = (cga) rg5.next();
            if (cga instanceof cga) {
                w51.setOpponents(cga.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
