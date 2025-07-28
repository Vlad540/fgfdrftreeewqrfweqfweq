package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: n2c  reason: default package */
public final class n2c {
    public final bec a;
    public final f03 b;

    public n2c(bec bec, f03 f03) {
        this.a = bec;
        this.b = f03;
    }

    public static ox7 d(b2c b2c, f2c f2c) {
        long j = f2c.b;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        r2c r2c = f2c.a;
        if (i > 0) {
            b2c.getClass();
            pec a2 = pec.a(2, "SELECT * FROM recent WHERE recent_type=? AND server_id=?");
            a2.j(1, (long) r2c.a);
            a2.j(2, j);
            return new ox7(new z1c(b2c, a2, 3));
        }
        int ordinal = r2c.ordinal();
        int i2 = r2c.a;
        if (ordinal == 1) {
            b2c.getClass();
            pec a3 = pec.a(2, "SELECT * FROM recent WHERE recent_type=? AND emoji=?");
            a3.j(1, (long) i2);
            String str = ((vu4) f2c).c;
            if (str == null) {
                a3.W(2);
            } else {
                a3.f(2, str);
            }
            return new ox7(new z1c(b2c, a3, 1));
        } else if (ordinal == 2) {
            b2c.getClass();
            pec a4 = pec.a(2, "SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
            a4.j(1, (long) i2);
            a4.j(2, ((utd) f2c).c);
            return new ox7(new z1c(b2c, a4, 0));
        } else if (ordinal == 3) {
            long j2 = ((c96) f2c).c.w0;
            b2c.getClass();
            pec a5 = pec.a(2, "SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
            a5.j(1, (long) i2);
            a5.j(2, j2);
            return new ox7(new z1c(b2c, a5, 2));
        } else {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + r2c);
        }
    }

    public final ms9 a(List list) {
        return new lx7(b(), new d52(21, list), 3).i(new d52(22, list), Integer.MAX_VALUE);
    }

    public final phd b() {
        return this.a.n().h(new lpa(13));
    }

    public final w63 c(List list) {
        return new w63(this.a.n(), 2, new m2c(this, list, 1));
    }
}
