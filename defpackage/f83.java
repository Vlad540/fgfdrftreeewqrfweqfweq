package defpackage;

import java.util.Set;

/* renamed from: f83  reason: default package */
public interface f83 {
    Object a(Class cls) {
        return f(pjb.a(cls));
    }

    Set b(pjb pjb) {
        return (Set) d(pjb).get();
    }

    jib c(Class cls) {
        return e(pjb.a(cls));
    }

    jib d(pjb pjb);

    jib e(pjb pjb);

    Object f(pjb pjb) {
        jib e = e(pjb);
        if (e == null) {
            return null;
        }
        return e.get();
    }
}
