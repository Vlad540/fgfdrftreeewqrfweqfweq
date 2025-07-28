package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: u9c  reason: default package */
public final class u9c extends ArrayList {
    public final Collection a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u9c() {
        /*
            r1 = this;
            hw4 r0 = hw4.a
            r1.<init>(r0)
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9c.<init>():void");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof s9c)) {
            return false;
        }
        return super.contains((s9c) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9c) && hhd.f(this.a, ((u9c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof s9c)) {
            return -1;
        }
        return super.indexOf((s9c) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof s9c)) {
            return -1;
        }
        return super.lastIndexOf((s9c) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof s9c)) {
            return false;
        }
        return super.remove((s9c) obj);
    }

    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
