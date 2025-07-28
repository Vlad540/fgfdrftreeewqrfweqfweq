package defpackage;

import android.text.Layout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: qs8  reason: default package */
public final class qs8 {
    public final i22 a;
    public final xm8 b;
    public final t97 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public qs8(i22 i22, xm8 xm8, r7e r7e) {
        this.a = i22;
        this.b = xm8;
        this.c = r7e;
    }

    public final Layout a() {
        return (Layout) this.c.getValue();
    }

    public final void b(Layout layout) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ts8 ts8 = (ts8) ((ps8) it.next());
            ts8.getClass();
            ts8.post(new zo5(ts8, 26, this));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs8)) {
            return false;
        }
        qs8 qs8 = (qs8) obj;
        if (a() != qs8.a()) {
            return false;
        }
        Long l = null;
        i22 i22 = this.a;
        Long valueOf = i22 != null ? Long.valueOf(i22.a) : null;
        i22 i222 = qs8.a;
        if (i222 != null) {
            l = Long.valueOf(i222.a);
        }
        return hhd.f(valueOf, l) && this.b.a.b == qs8.b.a.b;
    }

    public final int hashCode() {
        i22 i22 = this.a;
        Long valueOf = i22 != null ? Long.valueOf(i22.a) : null;
        return a().hashCode() + sxe.m((valueOf != null ? valueOf.hashCode() : 0) * 31, 31, this.b.a.b);
    }
}
