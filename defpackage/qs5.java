package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.sdk.arch.Widget;

/* renamed from: qs5  reason: default package */
public final class qs5 extends lx3 {
    public static final oa2 E0 = new Object();
    public final rr3 A0;
    public final b B0;
    public final ps5 C0;
    public List D0 = hw4.a;

    public qs5(rr3 rr3, b bVar, ps5 ps5) {
        super(rr3, 0);
        this.A0 = rr3;
        this.B0 = bVar;
        this.C0 = ps5;
    }

    public final void E(sgc sgc, int i) {
        if (!sgc.n()) {
            Widget t = this.C0.t(((dr5) this.D0.get(i)).a, this.B0);
            t.setTargetController(this.A0);
            t.setRetainViewMode(qr3.b);
            sgc.R(new vgc(t, (String) null, (wr3) null, (wr3) null, false, -1));
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [qs5, f6c, java.lang.Object] */
    public final void M(List list) {
        if (!this.D0.isEmpty() || !(!list.isEmpty())) {
            ug4 e = iu7.e(new l61(2, this.D0, list));
            this.D0 = list;
            e.a(new c9(0, this));
            return;
        }
        this.D0 = list;
        p(0, list.size());
    }

    public final int j() {
        return this.D0.size();
    }

    public final long k(int i) {
        dr5 dr5 = (dr5) o23.Y(i, this.D0);
        String str = dr5 != null ? dr5.a : null;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
