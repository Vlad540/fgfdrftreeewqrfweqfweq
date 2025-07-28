package defpackage;

/* renamed from: kz4  reason: default package */
public abstract class kz4 extends v2 {
    public abstract void A(yz5 yz5, Object obj);

    public final int B(Object obj) {
        yz5 f = f();
        try {
            A(f, obj);
            return f.n();
        } finally {
            u(f);
        }
    }

    public final void C(Iterable iterable) {
        yz5 f = f();
        try {
            for (Object A : iterable) {
                A(f, A);
                f.n();
            }
        } finally {
            u(f);
        }
    }
}
