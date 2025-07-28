package defpackage;

import java.util.Objects;

/* renamed from: ft6  reason: default package */
public final class ft6 extends ms6 {
    public final /* bridge */ /* synthetic */ ms6 c(Object obj) {
        j(obj);
        return this;
    }

    public final void j(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final void k(Iterable iterable) {
        iterable.getClass();
        e(iterable);
    }

    public final gt6 l() {
        int i = this.b;
        if (i == 0) {
            int i2 = gt6.c;
            return k8c.y0;
        } else if (i != 1) {
            gt6 i3 = gt6.i(i, this.c);
            this.b = i3.size();
            this.a = true;
            return i3;
        } else {
            Object obj = this.c[0];
            Objects.requireNonNull(obj);
            int i4 = gt6.c;
            return new ejd(obj);
        }
    }
}
