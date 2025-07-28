package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: zj9  reason: default package */
public final class zj9 implements bk9 {
    public final long b;
    public final long c;

    public zj9(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final Date a(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = zp4.o;
        eq4 eq4 = eq4.Y;
        long j = this.c;
        return new Date(year, month, date2, (int) zp4.i(j, eq4), (int) (zp4.i(j, eq4.X) % ((long) 60)));
    }

    public final boolean b() {
        Date time = Calendar.getInstance().getTime();
        Date c2 = c(time);
        Date a = a(time);
        if ((time.compareTo(c2) < 0 || time.compareTo(a) > 0) && c2.compareTo(a) > 0) {
            c2.setTime(c2.getTime() - TimeUnit.DAYS.toMillis(1));
        } else if (a.compareTo(c2) < 0) {
            a.setTime(TimeUnit.DAYS.toMillis(1) + a.getTime());
        }
        return time.compareTo(c2) >= 0 && time.compareTo(a) < 0;
    }

    public final Date c(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = zp4.o;
        eq4 eq4 = eq4.Y;
        long j = this.b;
        return new Date(year, month, date2, (int) zp4.i(j, eq4), (int) (zp4.i(j, eq4.X) % ((long) 60)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj9)) {
            return false;
        }
        zj9 zj9 = (zj9) obj;
        return zp4.d(this.b, zj9.b) && zp4.d(this.c, zj9.c);
    }

    public final int hashCode() {
        int i = zp4.o;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return c3d.i("Schedule(startTime=", zp4.j(this.b), ", endTime=", zp4.j(this.c), ")");
    }
}
