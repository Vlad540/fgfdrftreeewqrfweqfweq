package defpackage;

/* renamed from: lz4  reason: default package */
public abstract class lz4 extends v2 {
    public abstract void A(yz5 yz5, Object obj);

    public final void B(Iterable iterable) {
        yz5 f = f();
        try {
            for (Object A : iterable) {
                A(f, A);
                f.m();
            }
        } finally {
            u(f);
        }
    }

    public final void C(Object obj) {
        yz5 f = f();
        try {
            A(f, obj);
            f.m();
        } finally {
            u(f);
        }
    }

    public final long D(Object obj) {
        yz5 f = f();
        try {
            A(f, obj);
            return f.m();
        } finally {
            u(f);
        }
    }
}
