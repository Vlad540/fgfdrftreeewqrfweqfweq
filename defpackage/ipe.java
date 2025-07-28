package defpackage;

/* renamed from: ipe  reason: default package */
public final class ipe {
    public static final ipe d = new ipe(new me9());
    public static final String e = Integer.toString(1, 36);
    public static final String f = Integer.toString(2, 36);
    public static final String g = Integer.toString(3, 36);
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i = oze.a;
    }

    public ipe(me9 me9) {
        this.a = me9.a;
        this.b = me9.b;
        this.c = me9.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ipe.class != obj.getClass()) {
            return false;
        }
        ipe ipe = (ipe) obj;
        return this.a == ipe.a && this.b == ipe.b && this.c == ipe.c;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
