package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: l04  reason: default package */
public final class l04 implements Comparable, Serializable {
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer o;
    public int w0;

    public l04(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.o = num4;
        this.X = num5;
        this.Y = num6;
        this.Z = num7;
        d(1, 9999, num, "Year");
        d(1, 12, this.b, "Month");
        d(1, 31, this.c, "Day");
        int i = 0;
        d(0, 23, this.o, "Hour");
        d(0, 59, this.X, "Minute");
        d(0, 59, this.Y, "Second");
        d(0, 999999999, this.Z, "Nanosecond");
        Integer num8 = this.a;
        Integer num9 = this.b;
        Integer num10 = this.c;
        Object[] objArr = {num8, num9, num10};
        while (i < 3) {
            if (objArr[i] != null) {
                i++;
            } else {
                return;
            }
        }
        if (num10.intValue() > i(num8, num9).intValue()) {
            throw new o83("The day-of-the-month value '" + num10 + "' exceeds the number of days in the month: " + i(num8, num9), 1);
        }
    }

    public static void a(String str, Object obj, StringBuilder sb) {
        StringBuilder n = me4.n(str, ":");
        n.append(String.valueOf(obj));
        n.append(" ");
        sb.append(n.toString());
    }

    public static void d(int i, int i2, Integer num, String str) {
        if (num == null) {
            return;
        }
        if (num.intValue() < i || num.intValue() > i2) {
            throw new o83(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num, 1);
        }
    }

    public static l04 g(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new l04(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * 1000000));
    }

    public static Integer i(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            return 31;
        }
        if (num2.intValue() == 2) {
            return Integer.valueOf((num.intValue() % 100 != 0 ? num.intValue() % 4 != 0 : num.intValue() % 400 != 0) ? 28 : 29);
        } else if (num2.intValue() == 3) {
            return 31;
        } else {
            if (num2.intValue() == 4) {
                return 30;
            }
            if (num2.intValue() == 5) {
                return 31;
            }
            if (num2.intValue() == 6) {
                return 30;
            }
            if (num2.intValue() == 7) {
                return 31;
            }
            if (num2.intValue() == 8) {
                return 31;
            }
            if (num2.intValue() == 9) {
                return 30;
            }
            if (num2.intValue() == 10) {
                return 31;
            }
            if (num2.intValue() == 11) {
                return 30;
            }
            if (num2.intValue() == 12) {
                return 31;
            }
            throw new AssertionError("Month is out of range 1..12:" + num2);
        }
    }

    public final String b() {
        if (n(1) && m(2, 3, 4, 5, 6, 7)) {
            return "YYYY";
        }
        if (n(1, 2) && m(3, 4, 5, 6, 7)) {
            return "YYYY-MM";
        }
        if (n(1, 2, 3) && m(4, 5, 6, 7)) {
            return "YYYY-MM-DD";
        }
        if (n(1, 2, 3, 4) && m(5, 6, 7)) {
            return "YYYY-MM-DD hh";
        }
        if (n(1, 2, 3, 4, 5) && m(6, 7)) {
            return "YYYY-MM-DD hh:mm";
        }
        if (n(1, 2, 3, 4, 5, 6) && m(7)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        if (n(1, 2, 3, 4, 5, 6, 7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3) && n(4, 5, 6, 7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (m(1, 2, 3, 7) && n(4, 5, 6)) {
            return "hh:mm:ss";
        }
        if (!m(1, 2, 3, 6, 7) || !n(4, 5)) {
            return null;
        }
        return "hh:mm";
    }

    public final int c() {
        int intValue = this.a.intValue();
        int intValue2 = this.b.intValue();
        int i = (intValue2 - 14) / 12;
        return (((((((intValue2 - 2) - (i * 12)) * 367) / 12) + ((((intValue + 4800) + i) * 1461) / 4)) - (((((intValue + 4900) + i) / 100) * 3) / 4)) + this.c.intValue()) - 32075;
    }

    /* renamed from: e */
    public final int compareTo(l04 l04) {
        if (this == l04) {
            return 0;
        }
        l04.getClass();
        int e = gp0.e(this.a, l04.a);
        if (e != 0) {
            return e;
        }
        int e2 = gp0.e(this.b, l04.b);
        if (e2 != 0) {
            return e2;
        }
        int e3 = gp0.e(this.c, l04.c);
        if (e3 != 0) {
            return e3;
        }
        int e4 = gp0.e(this.o, l04.o);
        if (e4 != 0) {
            return e4;
        }
        int e5 = gp0.e(this.X, l04.X);
        if (e5 != 0) {
            return e5;
        }
        int e6 = gp0.e(this.Y, l04.Y);
        if (e6 != 0) {
            return e6;
        }
        int e7 = gp0.e(this.Z, l04.Z);
        if (e7 != 0) {
            return e7;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        throw new java.lang.IllegalArgumentException("This method does not currently support arrays.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 != r7) goto L_0x0005
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0011
        L_0x0005:
            java.lang.Class<l04> r0 = defpackage.l04.class
            boolean r0 = r0.isInstance(r7)
            if (r0 != 0) goto L_0x0010
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0061
            l04 r7 = (defpackage.l04) r7
            r7.getClass()
            java.lang.Object[] r6 = r6.j()
            java.lang.Object[] r7 = r7.j()
            r0 = 0
            r1 = r0
        L_0x0022:
            r2 = 7
            r3 = 1
            if (r1 >= r2) goto L_0x005c
            r2 = r6[r1]
            r4 = r7[r1]
            if (r2 == 0) goto L_0x0036
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L_0x0043
        L_0x0036:
            if (r4 == 0) goto L_0x004b
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r5.isArray()
            if (r5 != 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "This method does not currently support arrays."
            r6.<init>(r7)
            throw r6
        L_0x004b:
            if (r2 != 0) goto L_0x0052
            if (r4 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r3 = r0
            goto L_0x0056
        L_0x0052:
            boolean r3 = r2.equals(r4)
        L_0x0056:
            if (r3 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x005c:
            r0 = r3
        L_0x005d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0061:
            boolean r6 = r0.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l04.equals(java.lang.Object):boolean");
    }

    public final void f() {
        if (!n(1, 2, 3)) {
            throw new o83("DateTime does not include year/month/day.", 2);
        }
    }

    public final long h(TimeZone timeZone) {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.o;
        int i = 0;
        int intValue = num4 == null ? 0 : num4.intValue();
        Integer num5 = this.X;
        int intValue2 = num5 == null ? 0 : num5.intValue();
        Integer num6 = this.Y;
        int intValue3 = num6 == null ? 0 : num6.intValue();
        Integer num7 = this.Z;
        if (num7 != null) {
            i = num7.intValue();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(1, num.intValue());
        gregorianCalendar.set(2, num2.intValue() - 1);
        gregorianCalendar.set(5, num3.intValue());
        gregorianCalendar.set(11, intValue);
        gregorianCalendar.set(12, intValue2);
        gregorianCalendar.set(13, intValue3);
        gregorianCalendar.set(14, i / 1000000);
        return gregorianCalendar.getTimeInMillis();
    }

    public final int hashCode() {
        if (this.w0 == 0) {
            Object[] j = j();
            int i = 23;
            for (int i2 = 0; i2 < 7; i2++) {
                i = gp0.u(i, j[i2]);
            }
            this.w0 = i;
        }
        return this.w0;
    }

    public final Object[] j() {
        return new Object[]{this.a, this.b, this.c, this.o, this.X, this.Y, this.Z};
    }

    public final int k() {
        Integer num = this.Y;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.X;
        if (num2 != null) {
            intValue += num2.intValue() * 60;
        }
        Integer num3 = this.o;
        return num3 != null ? intValue + (num3.intValue() * 3600) : intValue;
    }

    public final l04 l(Integer num) {
        f();
        f();
        int intValue = num.intValue() + c() + 68569;
        int i = (intValue * 4) / 146097;
        int i2 = intValue - (((146097 * i) + 3) / 4);
        int i3 = ((i2 + 1) * 4000) / 1461001;
        int i4 = (i2 - ((i3 * 1461) / 4)) + 31;
        int i5 = (i4 * 80) / 2447;
        int i6 = i4 - ((i5 * 2447) / 80);
        int i7 = i5 / 11;
        l04 l04 = new l04(Integer.valueOf(((i - 49) * 100) + i3 + i7), Integer.valueOf((i5 + 2) - (i7 * 12)), Integer.valueOf(i6), (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        return new l04(l04.a, l04.b, l04.c, this.o, this.X, this.Y, this.Z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7.Y == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r7.X == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r7.o == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r7.c == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        if (r7.b == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r7.a == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r7.Z == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0005:
            if (r3 >= r0) goto L_0x0054
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L_0x0016
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.Z
            if (r4 != 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x0051
        L_0x0014:
            r4 = r2
            goto L_0x0051
        L_0x0016:
            r6 = 6
            if (r6 != r5) goto L_0x0020
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.Y
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0020:
            r6 = 5
            if (r6 != r5) goto L_0x002a
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.X
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x002a:
            r6 = 4
            if (r6 != r5) goto L_0x0034
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.o
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0034:
            r6 = 3
            if (r6 != r5) goto L_0x003e
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.c
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x003e:
            r6 = 2
            if (r6 != r5) goto L_0x0048
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.b
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0048:
            if (r1 != r5) goto L_0x0051
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.a
            if (r4 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l04.m(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7.Y != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r7.X != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r7.o != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r7.c != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        if (r7.b != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r7.a != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r7.Z != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int... r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0005:
            if (r3 >= r0) goto L_0x0054
            r5 = r8[r3]
            r6 = 7
            if (r6 != r5) goto L_0x0016
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.Z
            if (r4 == 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x0051
        L_0x0014:
            r4 = r2
            goto L_0x0051
        L_0x0016:
            r6 = 6
            if (r6 != r5) goto L_0x0020
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.Y
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0020:
            r6 = 5
            if (r6 != r5) goto L_0x002a
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.X
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x002a:
            r6 = 4
            if (r6 != r5) goto L_0x0034
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.o
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0034:
            r6 = 3
            if (r6 != r5) goto L_0x003e
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.c
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x003e:
            r6 = 2
            if (r6 != r5) goto L_0x0048
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.b
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0048:
            if (r1 != r5) goto L_0x0051
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r4 = r7.a
            if (r4 == 0) goto L_0x0014
            goto L_0x0012
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l04.n(int[]):boolean");
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [n04, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v4, types: [m04, java.lang.Object] */
    public final String toString() {
        int i;
        Iterator it;
        Matcher matcher;
        String str;
        if (b() != null) {
            o04 o04 = new o04(b());
            o04.c = new ArrayList();
            o04.b = new ArrayList();
            Pattern pattern = o04.d;
            String str2 = o04.a;
            Matcher matcher2 = pattern.matcher(str2);
            while (true) {
                i = 1;
                if (!matcher2.find()) {
                    break;
                }
                ? obj = new Object();
                obj.a = matcher2.start();
                obj.b = matcher2.end() - 1;
                o04.c.add(obj);
            }
            Iterator it2 = o04.f.iterator();
            String str3 = str2;
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                Matcher matcher3 = Pattern.compile(str4).matcher(str3);
                while (matcher3.find()) {
                    ? obj2 = new Object();
                    obj2.a = matcher3.start();
                    obj2.b = matcher3.end() - i;
                    Iterator it3 = o04.c.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            m04 m04 = (m04) it3.next();
                            it = it2;
                            int i2 = m04.a;
                            Iterator it4 = it3;
                            int i3 = obj2.a;
                            if (i2 <= i3 && i3 <= m04.b) {
                                matcher = matcher3;
                                break;
                            }
                            it2 = it;
                            it3 = it4;
                        } else {
                            it = it2;
                            String group = matcher3.group();
                            if ("YYYY".equals(group)) {
                                str = o04.c(this.a);
                            } else if ("YY".equals(group)) {
                                String c2 = o04.c(this.a);
                                str = vx3.L(c2) ? c2.substring(2) : BuildConfig.FLAVOR;
                            } else if ("MMMM".equals(group)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + vx3.F(str2));
                            } else if ("MMM".equals(group)) {
                                this.b.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + vx3.F(str2));
                            } else if ("MM".equals(group)) {
                                str = o04.a(o04.c(this.b));
                            } else if ("M".equals(group)) {
                                str = o04.c(this.b);
                            } else if ("DD".equals(group)) {
                                str = o04.a(o04.c(this.c));
                            } else if ("D".equals(group)) {
                                str = o04.c(this.c);
                            } else if ("WWWW".equals(group)) {
                                f();
                                c();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + vx3.F(str2));
                            } else if ("WWW".equals(group)) {
                                f();
                                c();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + vx3.F(str2));
                            } else if ("hh".equals(group)) {
                                str = o04.a(o04.c(this.o));
                            } else if ("h".equals(group)) {
                                str = o04.c(this.o);
                            } else if ("h12".equals(group)) {
                                str = o04.c(o04.b(this.o));
                            } else if ("hh12".equals(group)) {
                                str = o04.a(o04.c(o04.b(this.o)));
                            } else if ("a".equals(group)) {
                                this.o.getClass();
                                throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + vx3.F(str2));
                            } else if ("mm".equals(group)) {
                                str = o04.a(o04.c(this.X));
                            } else if ("m".equals(group)) {
                                str = o04.c(this.X);
                            } else if ("ss".equals(group)) {
                                str = o04.a(o04.c(this.Y));
                            } else if ("s".equals(group)) {
                                str = o04.c(this.Y);
                            } else if (!group.startsWith("f")) {
                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(group));
                            } else if (o04.e.matcher(group).matches()) {
                                String c3 = o04.c(this.Z);
                                while (true) {
                                    matcher = matcher3;
                                    if (c3.length() >= 9) {
                                        break;
                                    }
                                    c3 = "0".concat(c3);
                                    matcher3 = matcher;
                                }
                                int length = group.length();
                                str = (!vx3.L(c3) || c3.length() < length) ? c3 : c3.substring(0, length);
                                obj2.c = str;
                                o04.b.add(obj2);
                            } else {
                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(group));
                            }
                            matcher = matcher3;
                            obj2.c = str;
                            o04.b.add(obj2);
                        }
                    }
                    it2 = it;
                    matcher3 = matcher;
                    i = 1;
                }
                Iterator it5 = it2;
                StringBuilder sb = new StringBuilder();
                for (int i4 = 1; i4 <= str4.length(); i4++) {
                    sb.append("@");
                }
                str3 = str3.replace(str4, sb.toString());
                it2 = it5;
                i = 1;
            }
            StringBuilder sb2 = new StringBuilder();
            int i5 = 0;
            while (i5 < str2.length()) {
                String substring = str2.substring(i5, i5 + 1);
                Iterator it6 = o04.b.iterator();
                n04 n04 = null;
                while (it6.hasNext()) {
                    n04 n042 = (n04) it6.next();
                    if (n042.a == i5) {
                        n04 = n042;
                    }
                }
                if (n04 != null) {
                    sb2.append(n04.c);
                    i5 = n04.b;
                } else if (!"|".equals(substring)) {
                    sb2.append(substring);
                }
                i5++;
            }
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        a("Y", this.a, sb3);
        a("M", this.b, sb3);
        a("D", this.c, sb3);
        a("h", this.o, sb3);
        a("m", this.X, sb3);
        a("s", this.Y, sb3);
        a("f", this.Z, sb3);
        return sb3.toString().trim();
    }
}
