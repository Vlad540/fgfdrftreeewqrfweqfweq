package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kk1  reason: default package */
public final class kk1 extends chd implements zk1 {
    public final al1 J0;

    public kk1(ik1 ik1, al1 al1) {
        super(ik1);
        this.J0 = al1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kk1, java.lang.Object, b7c] */
    public final void A(pg7 pg7) {
        zb1 zb1 = (zb1) pg7;
        al1 al1 = this.J0;
        al1.a.add(this);
        x(al1.b);
        ik1 ik1 = (ik1) this.a;
        ik1.setOpponents(zb1.b);
        ik1.G(zb1.c, zb1.o);
        x(al1.b);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kk1, java.lang.Object, b7c] */
    public final void B(pg7 pg7, Object obj) {
        zb1 zb1 = (zb1) pg7;
        yb1 yb1 = obj instanceof yb1 ? (yb1) obj : null;
        View view = this.a;
        if (yb1 != null) {
            BitSet bitSet = (BitSet) yb1.b;
            if (bitSet.get(0)) {
                ((ik1) view).setOpponents(zb1.b);
            }
            if (bitSet.get(1)) {
                ((ik1) view).G(zb1.c, zb1.o);
                return;
            }
            return;
        }
        al1 al1 = this.J0;
        al1.a.add(this);
        x(al1.b);
        ik1 ik1 = (ik1) view;
        ik1.setOpponents(zb1.b);
        ik1.G(zb1.c, zb1.o);
        x(al1.b);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kk1, b7c] */
    public final void x(yk1 yk1) {
        int i = yk1 != null ? yk1.a : 0;
        int i2 = i == 0 ? -1 : jk1.$EnumSwitchMapping$0[hr1.t(i)];
        if (i2 != -1) {
            View view = this.a;
            if (i2 == 1) {
                ik1 ik1 = (ik1) view;
                ik1.setStatus((CharSequence) null);
                ik1.setTitle((CharSequence) null);
            } else if (i2 == 2) {
                ik1 ik12 = (ik1) view;
                ik12.setTitle(yk1.b);
                ik12.setStatus(yk1.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
