package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: j1d  reason: default package */
public final class j1d extends f1d {
    public final String D0;
    public final boolean E0;
    public final List F0;

    public j1d(h1d h1d) {
        super(h1d);
        this.D0 = h1d.m;
        this.E0 = h1d.n;
        this.F0 = (List) h1d.o;
    }

    public final uo8 y() {
        uo8 uo8 = new uo8();
        uo8.g = this.D0;
        uo8.u = this.E0;
        uo8.F = Collections.unmodifiableList(this.F0);
        return uo8;
    }
}
