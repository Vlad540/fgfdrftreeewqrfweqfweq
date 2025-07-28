package defpackage;

/* renamed from: fk9  reason: default package */
public final class fk9 implements tze {
    public final hge a(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '-' && charAt != ' ') {
                return null;
            }
        }
        Integer D = a24.D(i, m7c.a(fk9.class));
        if (D != null) {
            return new hge(D.intValue());
        }
        return null;
    }
}
