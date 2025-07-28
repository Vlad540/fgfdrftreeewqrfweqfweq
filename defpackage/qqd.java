package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: qqd  reason: default package */
public final class qqd implements xrd {
    public final pf8 a;
    public final xwb b;
    public final boolean c;
    public et4 d;
    public double e;
    public final yq7 f = new Object();
    public BigInteger g;
    public BigInteger h;
    public final ygd i;
    public final CopyOnWriteArrayList j;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, yq7] */
    public qqd(pf8 pf8, xwb xwb, boolean z) {
        this.a = pf8;
        this.b = xwb;
        this.c = z;
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new ygd();
        this.j = new CopyOnWriteArrayList();
        pf8.c(this, 5, TimeUnit.SECONDS);
    }

    public final void a(zwb zwb) {
        BigInteger bigInteger;
        String str;
        Double F;
        zwb zwb2 = zwb;
        double d2 = 0.0d;
        if (this.i.g(zwb2.c)) {
            this.d = null;
            this.e = 0.0d;
            BigInteger bigInteger2 = BigInteger.ZERO;
            this.g = bigInteger2;
            this.h = bigInteger2;
            yq7 yq7 = this.f;
            yq7.a = 0;
            yq7.b = 0;
        }
        iw1 c2 = zwb.c();
        if (!(c2 == null || (str = c2.h) == null || (F = n0e.F(str)) == null)) {
            double doubleValue = F.doubleValue();
            et4 et4 = this.d;
            if (et4 != null) {
                et4.a(doubleValue);
            } else {
                this.d = new et4(doubleValue);
            }
        }
        List<eod> list = zwb2.c;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (eod eod : list) {
            if (eod.b == 2 && eod.a == 2) {
                arrayList.add((dod) eod);
            }
        }
        dod dod = (dod) o23.X(arrayList);
        if (dod != null) {
            BigInteger bigInteger3 = dod.h;
            xwb xwb = this.b;
            if (bigInteger3 == null || (bigInteger = dod.i) == null) {
                this.e = 0.0d;
                xwb.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (this.c) {
                    long longValue = bigInteger.longValue();
                    long longValue2 = bigInteger3.longValue();
                    yq7 yq72 = this.f;
                    this.e = yq72.a(longValue, longValue2);
                    long j2 = yq72.d;
                    long j3 = yq72.c;
                    StringBuilder sb = new StringBuilder("Sent stats: sent=");
                    sb.append(j2);
                    sb.append(" (total=");
                    sb.append(bigInteger3);
                    hr1.s(sb, "), lost=", j3, " (total=");
                    sb.append(bigInteger);
                    sb.append(")");
                    xwb.log("MediaAdaptation", sb.toString());
                    double d3 = this.e;
                    xwb.log("MediaAdaptation", "Lost packets fraction updated to " + d3);
                } else {
                    if (bigInteger3.compareTo(this.g) < 0) {
                        this.g = bigInteger3;
                    }
                    if (bigInteger.compareTo(this.h) < 0) {
                        this.h = bigInteger;
                    }
                    BigInteger subtract = bigInteger.subtract(this.h);
                    BigInteger subtract2 = bigInteger3.subtract(this.g);
                    xwb.log("MediaAdaptation", "Sent stats: sent=" + subtract2 + " (total=" + bigInteger3 + "), lost=" + subtract + " (total=" + bigInteger + ")");
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    double doubleValue2 = (subtract2.compareTo(bigInteger4) <= 0 || subtract.compareTo(bigInteger4) <= 0) ? 0.0d : subtract.doubleValue() / subtract2.doubleValue();
                    this.e = doubleValue2;
                    xwb.log("MediaAdaptation", "Lost packets fraction updated to " + doubleValue2);
                    this.g = bigInteger3;
                    this.h = bigInteger;
                }
                d2 = 0.0d;
            }
        }
        if (this.j.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        et4 et42 = this.d;
        if (et42 != null) {
            d2 = et42.b;
        }
        ny7 ny7 = new ny7(d2, this.e);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            py7 py7 = (py7) it.next();
            my7 my7 = py7.i;
            ky7 ky7 = my7.a;
            double d4 = ky7.a;
            double d5 = ny7.a;
            int i2 = (d5 > d4 ? 1 : (d5 == d4 ? 0 : -1));
            eje eje = py7.c;
            xwb xwb2 = py7.d;
            double d6 = ny7.b;
            eje eje2 = eje;
            if ((i2 > 0 || d6 < ky7.b) && ((d5 <= d4 || d6 < ky7.c) && d5 < ky7.d)) {
                ly7 ly7 = my7.b;
                if ((d5 >= ly7.a || d6 > ly7.b) && (d5 >= ly7.c || d6 > ly7.d)) {
                    xwb2.log("MediaAdaptation", "Ignore inbound state update " + ny7);
                } else {
                    int i3 = py7.k;
                    xwb2.log("MediaAdaptation", "Good network detected. Current condition is " + wn6.s(i3) + ", state is " + ny7);
                    ((fje) eje2).getClass();
                    if (SystemClock.elapsedRealtime() - py7.f > my7.b.e && py7.k != 1) {
                        py7.c(1, ny7);
                    }
                }
            } else {
                int i4 = py7.k;
                xwb2.log("MediaAdaptation", "Bad network detected. Current condition is " + wn6.s(i4) + ", state is " + ny7);
                ky7 ky72 = my7.a;
                int i5 = 3;
                if (d5 < ky72.d) {
                    int i6 = py7.k;
                    i5 = (i6 != 3 || d5 < ky72.e) ? 2 : i6;
                }
                ((fje) eje2).getClass();
                py7.f = SystemClock.elapsedRealtime();
                if (py7.k != i5) {
                    py7.c(i5, ny7);
                }
            }
        }
    }
}
