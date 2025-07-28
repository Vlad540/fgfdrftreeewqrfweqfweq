package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: b2d  reason: default package */
public final class b2d extends x1d {
    public final ga3 j = new ga3(6);
    public boolean k = true;
    public boolean l = false;
    public final ArrayList m = new ArrayList();

    public final void a(c2d c2d) {
        Map map;
        Object obj;
        pw1 pw1 = c2d.g;
        int i = pw1.c;
        w30 w30 = this.b;
        if (i != -1) {
            this.l = true;
            int i2 = w30.c;
            Integer valueOf = Integer.valueOf(i);
            List list = c2d.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            w30.c = i;
        }
        z80 z80 = pw1.k;
        Range range = va0.f;
        ia3 ia3 = pw1.b;
        Range range2 = (Range) ia3.d(z80, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            fc9 fc9 = (fc9) w30.f;
            fc9.getClass();
            try {
                obj = fc9.h(z80);
            } catch (IllegalArgumentException unused) {
                obj = range;
            }
            if (((Range) obj).equals(range)) {
                ((fc9) w30.f).j(pw1.k, range2);
            } else {
                fc9 fc92 = (fc9) w30.f;
                z80 z802 = pw1.k;
                Object obj2 = va0.f;
                fc92.getClass();
                try {
                    obj2 = fc92.h(z802);
                } catch (IllegalArgumentException unused2) {
                }
                if (!((Range) obj2).equals(range2)) {
                    this.k = false;
                }
            }
        }
        int b = pw1.b();
        if (b != 0) {
            w30.getClass();
            if (b != 0) {
                ((fc9) w30.f).j(pye.t0, Integer.valueOf(b));
            }
        }
        int c = pw1.c();
        if (c != 0) {
            w30.getClass();
            if (c != 0) {
                ((fc9) w30.f).j(pye.u0, Integer.valueOf(c));
            }
        }
        pw1 pw12 = c2d.g;
        s9e s9e = pw12.g;
        Map map2 = ((nc9) w30.g).a;
        if (!(map2 == null || (map = s9e.a) == null)) {
            map2.putAll(map);
        }
        this.c.addAll(c2d.c);
        this.d.addAll(c2d.d);
        w30.a(pw12.e);
        this.e.addAll(c2d.e);
        a2d a2d = c2d.f;
        if (a2d != null) {
            this.m.add(a2d);
        }
        InputConfiguration inputConfiguration = c2d.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<ra0> linkedHashSet = this.a;
        linkedHashSet.addAll(c2d.a);
        HashSet hashSet = (HashSet) w30.e;
        hashSet.addAll(Collections.unmodifiableList(pw1.a));
        ArrayList arrayList = new ArrayList();
        for (ra0 ra0 : linkedHashSet) {
            arrayList.add(ra0.a);
            for (xc4 add : ra0.b) {
                arrayList.add(add);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            this.k = false;
        }
        int i3 = this.h;
        int i4 = c2d.h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            this.k = false;
        } else if (i4 != 0) {
            this.h = i4;
        }
        ra0 ra02 = c2d.b;
        if (ra02 != null) {
            ra0 ra03 = this.i;
            if (ra03 == ra02 || ra03 == null) {
                this.i = ra02;
            } else {
                this.k = false;
            }
        }
        w30.c(ia3);
    }

    public final c2d b() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.a);
            ga3 ga3 = this.j;
            if (ga3.b) {
                Collections.sort(arrayList, new i63(5, ga3));
            }
            return new c2d(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), !this.m.isEmpty() ? new fp6(4, this) : null, this.g, this.h, this.i);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
