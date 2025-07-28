package defpackage;

/* renamed from: mrf  reason: default package */
public final class mrf {
    public final jc9 a = new jc9(1);
    public final jc9 b = new jc9(1);

    public final taf a(Class cls) {
        String h = rf0.h("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        jc9 jc9 = this.a;
        taf taf = (taf) jc9.f(h);
        if (cls.isInstance(taf)) {
            Object cast = cls.cast(taf);
            if (cast != null) {
                return (taf) cast;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        jc9 jc92 = this.b;
        saf saf = (saf) jc92.f(h);
        Object f = jc92.f(h);
        if (f != null) {
            taf a2 = ((saf) f).a(cls);
            jc9.k(h, a2);
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
