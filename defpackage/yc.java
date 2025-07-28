package defpackage;

/* renamed from: yc  reason: default package */
public final class yc implements tze {
    public final p7c a = new p7c("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    public final hge a(int i, String str) {
        Integer D;
        if (str.length() <= 0 || this.a.a(str) || (D = a24.D(i, m7c.a(yc.class))) == null) {
            return null;
        }
        return new hge(D.intValue());
    }
}
