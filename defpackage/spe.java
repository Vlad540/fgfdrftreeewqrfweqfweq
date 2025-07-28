package defpackage;

/* renamed from: spe  reason: default package */
public final class spe {
    public static final spe b = new spe(e8c.X);
    public static final String c = Integer.toString(0, 36);
    public final ws6 a;

    static {
        po5 po5 = ws6.b;
        int i = oze.a;
    }

    public spe(e8c e8c) {
        this.a = ws6.j(e8c);
    }

    public final ws6 a() {
        return this.a;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            ws6 ws6 = this.a;
            if (i2 >= ws6.size()) {
                return false;
            }
            rpe rpe = (rpe) ws6.get(i2);
            if (rpe.f() && rpe.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || spe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((spe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
