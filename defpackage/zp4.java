package defpackage;

/* renamed from: zp4  reason: default package */
public final class zp4 implements Comparable {
    public static final long b = mt0.g(4611686018427387903L);
    public static final long c = mt0.g(-4611686018427387903L);
    public static final /* synthetic */ int o = 0;
    public final long a;

    static {
        int i = bq4.a;
    }

    public /* synthetic */ zp4(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = (long) 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return mt0.g(gwf.k(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return mt0.i((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String h0 = h0e.h0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = h0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (h0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append(h0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append(h0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return hhd.p(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || !(f(j) ^ true)) ? i(j, eq4.MILLISECONDS) : j >> 1;
    }

    public static final boolean f(long j) {
        return j == b || j == c;
    }

    public static final long g(long j, long j2) {
        return h(j, k(j2));
    }

    public static final long h(long j, long j2) {
        if (f(j)) {
            if ((!f(j2)) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (f(j2)) {
            return j2;
        } else {
            int i = ((int) j) & 1;
            if (i != (((int) j2) & 1)) {
                return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
            }
            long j3 = (j >> 1) + (j2 >> 1);
            return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? mt0.g(j3 / ((long) 1000000)) : mt0.i(j3) : mt0.h(j3);
        }
    }

    public static final long i(long j, eq4 eq4) {
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return eq4.a.convert(j >> 1, ((((int) j) & 1) == 0 ? eq4.NANOSECONDS : eq4.MILLISECONDS).a);
    }

    public static String j(long j) {
        int i;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        boolean z = i2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long k = i2 < 0 ? k(j) : j;
        long i3 = i(k, eq4.DAYS);
        int i4 = f(k) ? 0 : (int) (i(k, eq4.HOURS) % ((long) 24));
        int i5 = f(k) ? 0 : (int) (i(k, eq4.MINUTES) % ((long) 60));
        int i6 = f(k) ? 0 : (int) (i(k, eq4.SECONDS) % ((long) 60));
        int i7 = 0;
        if (!f(k)) {
            if ((((int) k) & 1) == 1) {
                i7 = 1;
            }
            i7 = (int) (i7 != 0 ? ((k >> 1) % ((long) 1000)) * ((long) 1000000) : (k >> 1) % ((long) 1000000000));
        }
        boolean z2 = i3 != 0;
        boolean z3 = i4 != 0;
        boolean z4 = i5 != 0;
        boolean z5 = (i6 == 0 && i7 == 0) ? false : true;
        if (z2) {
            sb.append(i3);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i8 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i4);
            sb.append('h');
            i = i8;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i9 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i5);
            sb.append('m');
            i = i9;
        }
        if (z5) {
            int i10 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (i6 != 0 || z2 || z3 || z4) {
                b(sb, i6, i7, 9, "s", false);
            } else if (i7 >= 1000000) {
                b(sb, i7 / 1000000, i7 % 1000000, 6, "ms", false);
            } else if (i7 >= 1000) {
                b(sb, i7 / 1000, i7 % 1000, 3, "us", false);
            } else {
                sb.append(i7);
                sb.append("ns");
            }
            i = i10;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = bq4.a;
        return j2;
    }

    public final int compareTo(Object obj) {
        return c(this.a, ((zp4) obj).a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zp4)) {
            return false;
        }
        return this.a == ((zp4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
