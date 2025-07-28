package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jac  reason: default package */
public abstract class jac {
    public final mxb X;
    public final vu5 a;
    public final ws6 b;
    public final long c;
    public final List o;

    public jac(vu5 vu5, List list, vuc vuc, ArrayList arrayList) {
        swb.e(!list.isEmpty());
        this.a = vu5;
        this.b = ws6.j(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.X = vuc.a(this);
        this.c = mze.J(vuc.b, 1000000, vuc.a);
    }

    public abstract String a();

    public abstract vy3 c();

    public abstract mxb d();
}
