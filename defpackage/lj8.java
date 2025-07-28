package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lj8  reason: default package */
public final class lj8 extends taf {
    public final l05 X;
    public final l05 Y;
    public final grd Z;
    public final u16 b;
    public final o94 c;
    public final s16 o;
    public final t0c w0;
    public final grd x0;
    public final t0c y0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public lj8(u16 u16, h9 h9Var, int i) {
        this(u16, (i & 2) != 0 ? (o94) ej8.a.getAccessor().c(o94.class) : h9Var, (s16) new ib7(24));
    }

    public final void q() {
        this.Z.setValue((Object) null);
    }

    public final boolean r() {
        return this.w0.a.getValue() != null;
    }

    public final void s(List list) {
        taf.o(this.Y, new bj8(list));
    }

    public final void t(long j, boolean z) {
        grd grd;
        Object value;
        Set v0;
        if (!r()) {
            taf.o(this.X, new gj8(j));
        } else if (z) {
            do {
                grd = this.Z;
                value = grd.getValue();
                Set set = (Set) value;
                v0 = set != null ? o23.v0(set) : new LinkedHashSet();
                if (v0.contains(Long.valueOf(j))) {
                    v0.remove(Long.valueOf(j));
                } else {
                    v0.add(Long.valueOf(j));
                }
            } while (!grd.b(value, v0));
        }
    }

    public final void u(String str) {
        this.x0.setValue(str);
    }

    public lj8(u16 u16, o94 o94, s16 s16) {
        this.b = u16;
        this.c = o94;
        this.o = s16;
        this.X = new l05(0);
        this.Y = new l05(0);
        grd a = hrd.a((Object) null);
        this.Z = a;
        this.w0 = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.x0 = a2;
        this.y0 = new t0c(a2);
    }
}
