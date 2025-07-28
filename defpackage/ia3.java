package defpackage;

import java.util.Objects;
import java.util.Set;

/* renamed from: ia3  reason: default package */
public interface ia3 {
    static void p(fc9 fc9, ia3 ia3, ia3 ia32, z80 z80) {
        if (Objects.equals(z80, br6.J)) {
            ibc ibc = (ibc) ia32.d(z80, (Object) null);
            ibc ibc2 = (ibc) ia3.d(z80, (Object) null);
            ha3 m = ia32.m(z80);
            if (ibc != null) {
                if (ibc2 != null) {
                    ii5 ii5 = ibc.a;
                    if (ii5 == null) {
                        ii5 = ibc2.a;
                    }
                    jbc jbc = ibc.b;
                    if (jbc == null) {
                        jbc = ibc2.b;
                    }
                    int i = ibc.c;
                    if (i == 0) {
                        i = ibc2.c;
                    }
                    ibc2 = new ibc(ii5, jbc, i);
                }
                fc9.g(z80, m, ibc);
                return;
            }
            ibc = ibc2;
            fc9.g(z80, m, ibc);
            return;
        }
        fc9.g(z80, ia32.m(z80), ia32.h(z80));
    }

    static hga s(ia3 ia3, ia3 ia32) {
        if (ia3 == null && ia32 == null) {
            return hga.c;
        }
        fc9 e = ia32 != null ? fc9.e(ia32) : fc9.c();
        if (ia3 != null) {
            for (z80 p : ia3.f()) {
                p(e, ia32, ia3, p);
            }
        }
        return hga.a(e);
    }

    void b(j9 j9Var);

    Object d(z80 z80, Object obj);

    Set f();

    Object h(z80 z80);

    Set i(z80 z80);

    Object k(z80 z80, ha3 ha3);

    boolean l(z80 z80);

    ha3 m(z80 z80);
}
