package defpackage;

/* renamed from: ct6  reason: default package */
public final class ct6 extends n1 implements ot6, uze {
    public static final ct6 b = new ct6(new uze[0]);
    public final uze[] a;

    public ct6(uze[] uzeArr) {
        this.a = uzeArr;
    }

    public static void x(StringBuilder sb, uze uze) {
        if (sxe.g(((n1) uze).e())) {
            sb.append(uze.a());
        } else {
            sb.append(uze.toString());
        }
    }

    public final String a() {
        uze[] uzeArr = this.a;
        if (uzeArr.length == 0) {
            return "{}";
        }
        StringBuilder l = hr1.l("{");
        uze uze = uzeArr[0];
        if (sxe.g(((n1) uze).e())) {
            l.append(uze.a());
        } else {
            m1.x(l, uze.toString());
        }
        l.append(":");
        l.append(uzeArr[1].a());
        for (int i = 2; i < uzeArr.length; i += 2) {
            l.append(",");
            uze uze2 = uzeArr[i];
            if (sxe.g(((n1) uze2).e())) {
                l.append(uze2.a());
            } else {
                m1.x(l, uze2.toString());
            }
            l.append(":");
            l.append(uzeArr[i + 1].a());
        }
        l.append("}");
        return l.toString();
    }

    public final int e() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        uze uze = (uze) obj;
        int e = ((n1) uze).e();
        if (e == 0) {
            throw null;
        } else if (e != 8) {
            return false;
        } else {
            ct6 g = uze.g();
            bt6 bt6 = new bt6(this.a);
            g.getClass();
            return bt6.equals(new bt6(g.a));
        }
    }

    public final ct6 g() {
        return this;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            uze[] uzeArr = this.a;
            if (i >= uzeArr.length) {
                return i2;
            }
            i2 += uzeArr[i + 1].hashCode() ^ uzeArr[i].hashCode();
            i += 2;
        }
    }

    public final String toString() {
        uze[] uzeArr = this.a;
        if (uzeArr.length == 0) {
            return "{}";
        }
        StringBuilder l = hr1.l("{");
        x(l, uzeArr[0]);
        l.append(":");
        x(l, uzeArr[1]);
        for (int i = 2; i < uzeArr.length; i += 2) {
            l.append(",");
            x(l, uzeArr[i]);
            l.append(":");
            x(l, uzeArr[i + 1]);
        }
        l.append("}");
        return l.toString();
    }

    public final ct6 w() {
        return this;
    }
}
