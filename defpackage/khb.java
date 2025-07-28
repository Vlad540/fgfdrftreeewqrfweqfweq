package defpackage;

/* renamed from: khb  reason: default package */
public class khb extends lhb implements j77 {
    public khb(Class cls, String str, String str2, int i) {
        super(mn1.NO_RECEIVER, cls, str, str2, i);
    }

    public final v67 computeReflected() {
        m7c.a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    public final void getGetter() {
        ((j77) getReflected()).getGetter();
    }

    public final Object invoke(Object obj) {
        return get(obj);
    }
}
