package defpackage;

/* renamed from: x2c  reason: default package */
public final class x2c extends lbe {
    public String c;
    public boolean o = true;

    public x2c(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.o = ws8.u0();
        } else if (!str.equals("redirectHost")) {
            ws8.z();
        } else {
            this.c = jjd.M(ws8);
        }
    }

    public final String c() {
        int indexOf;
        if (r1g.p(this.c) || (indexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(indexOf + 1, str.length());
    }

    public final String toString() {
        String str = this.c;
        boolean z = this.o;
        return "{redirectHost='" + str + "', tls=" + z + "}";
    }
}
