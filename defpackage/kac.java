package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kac  reason: default package */
public abstract class kac {
    public final nxb X;
    public final xu5 a;
    public final ws6 b;
    public final long c;
    public final List o;

    public kac(xu5 xu5, List list, vuc vuc, ArrayList arrayList) {
        oyb.d(!list.isEmpty());
        this.a = xu5;
        this.b = ws6.j(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.X = vuc.b(this);
        int i = oze.a;
        this.c = oze.a0(vuc.b, 1000000, vuc.a, RoundingMode.FLOOR);
    }

    public abstract String a();

    public abstract wy3 c();

    public abstract nxb d();

    public final nxb e() {
        return this.X;
    }
}
