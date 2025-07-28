package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: jja  reason: default package */
public abstract class jja extends i67 {
    public static final byte[] N0 = new byte[0];
    public static final BigInteger O0;
    public static final BigInteger P0;
    public static final BigInteger Q0;
    public static final BigInteger R0;
    public static final BigDecimal S0;
    public static final BigDecimal T0;
    public static final BigDecimal U0;
    public static final BigDecimal V0;
    public k67 A0;
    public q67 B0;
    public final bfe C0;
    public char[] D0;
    public boolean E0;
    public int F0 = 0;
    public int G0;
    public long H0;
    public double I0;
    public BigInteger J0;
    public BigDecimal K0;
    public boolean L0;
    public int M0;
    public int X;
    public int Y;
    public long Z;
    public q67 b;
    public final tn6 c;
    public boolean o;
    public int w0 = 1;
    public int x0;
    public int y0 = 1;
    public int z0;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        O0 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        P0 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        Q0 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        R0 = valueOf4;
        S0 = new BigDecimal(valueOf3);
        T0 = new BigDecimal(valueOf4);
        U0 = new BigDecimal(valueOf);
        V0 = new BigDecimal(valueOf2);
    }

    public jja(tn6 tn6, int i) {
        this.a = i;
        this.c = tn6;
        this.C0 = new bfe(tn6.d);
        this.A0 = new k67((k67) null, g67.STRICT_DUPLICATE_DETECTION.a(i) ? new nxc(this) : null, 0, 1, 0);
    }

    public static String A0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public static String B0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public static int[] N0(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public static final String w0(int i) {
        char c2 = (char) i;
        if (Character.isISOControl(c2)) {
            return rf0.f(i, "(CTRL-CHAR, code ", ")");
        }
        if (i > 255) {
            return "'" + c2 + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c2 + "' (code " + i + ")";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C0(int r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 1
            boolean r3 = r1.o
            r4 = 0
            if (r3 != 0) goto L_0x01a9
            q67 r3 = r1.b
            q67 r5 = defpackage.q67.VALUE_NUMBER_INT
            java.lang.String r8 = "2.2250738585072012e-308"
            java.lang.String r9 = ")"
            java.lang.String r10 = "Malformed numeric value ("
            r11 = 8
            bfe r12 = r1.C0
            if (r3 != r5) goto L_0x0144
            int r3 = r1.M0
            r5 = 9
            if (r3 > r5) goto L_0x002b
            boolean r0 = r1.L0
            int r0 = r12.f(r0)
            r1.G0 = r0
            r1.F0 = r2
            return
        L_0x002b:
            r5 = 0
            r13 = 18
            r14 = 2
            if (r3 > r13) goto L_0x008f
            boolean r0 = r1.L0
            int r4 = r12.d
            if (r4 < 0) goto L_0x0050
            java.lang.Object r6 = r12.i
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x0049
            int r4 = r4 + r2
            int r0 = r12.e
            int r0 = r0 - r2
            long r4 = defpackage.yr9.c(r6, r4, r0)
        L_0x0047:
            long r4 = -r4
            goto L_0x0068
        L_0x0049:
            int r0 = r12.e
            long r4 = defpackage.yr9.c(r6, r4, r0)
            goto L_0x0068
        L_0x0050:
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r12.j
            char[] r0 = (char[]) r0
            int r4 = r12.g
            int r4 = r4 - r2
            long r4 = defpackage.yr9.c(r0, r2, r4)
            goto L_0x0047
        L_0x005e:
            java.lang.Object r0 = r12.j
            char[] r0 = (char[]) r0
            int r4 = r12.g
            long r4 = defpackage.yr9.c(r0, r5, r4)
        L_0x0068:
            r0 = 10
            if (r3 != r0) goto L_0x008a
            boolean r0 = r1.L0
            if (r0 == 0) goto L_0x007d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            int r0 = (int) r4
            r1.G0 = r0
            r1.F0 = r2
            return
        L_0x007d:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            int r0 = (int) r4
            r1.G0 = r0
            r1.F0 = r2
            return
        L_0x008a:
            r1.H0 = r4
            r1.F0 = r14
            return
        L_0x008f:
            java.lang.String r3 = r12.g()
            int r13 = r1.M0     // Catch:{ NumberFormatException -> 0x00df }
            char[] r15 = r12.m()     // Catch:{ NumberFormatException -> 0x00df }
            int r12 = r12.d     // Catch:{ NumberFormatException -> 0x00df }
            if (r12 < 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r12 = r5
        L_0x009f:
            boolean r5 = r1.L0     // Catch:{ NumberFormatException -> 0x00df }
            if (r5 == 0) goto L_0x00a4
            int r12 = r12 + r2
        L_0x00a4:
            if (r5 == 0) goto L_0x00a9
            java.lang.String r5 = defpackage.yr9.a     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r5 = defpackage.yr9.b     // Catch:{ NumberFormatException -> 0x00df }
        L_0x00ab:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00df }
            if (r13 >= r6) goto L_0x00b3
            goto L_0x011e
        L_0x00b3:
            if (r13 <= r6) goto L_0x00b6
            goto L_0x00c8
        L_0x00b6:
            r7 = 0
        L_0x00b7:
            if (r7 >= r6) goto L_0x011e
            int r13 = r12 + r7
            char r13 = r15[r13]     // Catch:{ NumberFormatException -> 0x00df }
            char r16 = r5.charAt(r7)     // Catch:{ NumberFormatException -> 0x00df }
            int r13 = r13 - r16
            if (r13 == 0) goto L_0x011c
            if (r13 >= 0) goto L_0x00c8
            goto L_0x011e
        L_0x00c8:
            if (r0 == r2) goto L_0x00f5
            if (r0 != r14) goto L_0x00cd
            goto L_0x00f5
        L_0x00cd:
            if (r0 == r11) goto L_0x00e1
            r2 = 32
            if (r0 != r2) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x00df }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r1.J0 = r0     // Catch:{ NumberFormatException -> 0x00df }
            r0 = 4
            r1.F0 = r0     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x0126
        L_0x00df:
            r0 = move-exception
            goto L_0x0127
        L_0x00e1:
            java.lang.String r0 = defpackage.yr9.a     // Catch:{ NumberFormatException -> 0x00df }
            boolean r0 = r8.equals(r3)     // Catch:{ NumberFormatException -> 0x00df }
            if (r0 == 0) goto L_0x00ec
            r6 = 1
            goto L_0x00f0
        L_0x00ec:
            double r6 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00df }
        L_0x00f0:
            r1.I0 = r6     // Catch:{ NumberFormatException -> 0x00df }
            r1.F0 = r11     // Catch:{ NumberFormatException -> 0x00df }
            goto L_0x0126
        L_0x00f5:
            if (r0 != r2) goto L_0x0118
            java.lang.String r0 = A0(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x00df }
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00df }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r4}     // Catch:{ NumberFormatException -> 0x00df }
            java.lang.String r2 = "Numeric value (%s) out of range of int (%d - %s)"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ NumberFormatException -> 0x00df }
            com.fasterxml.jackson.core.exc.InputCoercionException r2 = new com.fasterxml.jackson.core.exc.InputCoercionException     // Catch:{ NumberFormatException -> 0x00df }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00df }
            throw r2     // Catch:{ NumberFormatException -> 0x00df }
        L_0x0118:
            r1.O0(r3)     // Catch:{ NumberFormatException -> 0x00df }
            throw r4     // Catch:{ NumberFormatException -> 0x00df }
        L_0x011c:
            int r7 = r7 + r2
            goto L_0x00b7
        L_0x011e:
            long r4 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00df }
            r1.H0 = r4     // Catch:{ NumberFormatException -> 0x00df }
            r1.F0 = r14     // Catch:{ NumberFormatException -> 0x00df }
        L_0x0126:
            return
        L_0x0127:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            java.lang.String r3 = B0(r3)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            e67 r1 = r17.o()
            r3.<init>(r2, r1, r0)
            throw r3
        L_0x0144:
            q67 r2 = defpackage.q67.VALUE_NUMBER_FLOAT
            if (r3 != r2) goto L_0x0190
            r2 = 16
            if (r0 != r2) goto L_0x0157
            java.math.BigDecimal r0 = r12.e()     // Catch:{ NumberFormatException -> 0x0155 }
            r1.K0 = r0     // Catch:{ NumberFormatException -> 0x0155 }
            r1.F0 = r2     // Catch:{ NumberFormatException -> 0x0155 }
            goto L_0x016e
        L_0x0155:
            r0 = move-exception
            goto L_0x016f
        L_0x0157:
            java.lang.String r0 = r12.g()     // Catch:{ NumberFormatException -> 0x0155 }
            java.lang.String r2 = defpackage.yr9.a     // Catch:{ NumberFormatException -> 0x0155 }
            boolean r2 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x0155 }
            if (r2 == 0) goto L_0x0166
            r6 = 1
            goto L_0x016a
        L_0x0166:
            double r6 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0155 }
        L_0x016a:
            r1.I0 = r6     // Catch:{ NumberFormatException -> 0x0155 }
            r1.F0 = r11     // Catch:{ NumberFormatException -> 0x0155 }
        L_0x016e:
            return
        L_0x016f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            java.lang.String r3 = r12.g()
            java.lang.String r3 = B0(r3)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            e67 r1 = r17.o()
            r3.<init>(r2, r1, r0)
            throw r3
        L_0x0190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Current token ("
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = ") not numeric, can not use numeric value accessors"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r1, r0)
            throw r2
        L_0x01a9:
            java.lang.String r0 = "Internal error: _parseNumericValue called when parser instance closed"
            r1.E0(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.C0(int):void");
    }

    public void D0() {
        char[] cArr;
        bfe bfe = this.C0;
        bfe.d = -1;
        bfe.g = 0;
        bfe.e = 0;
        bfe.i = null;
        bfe.k = null;
        if (bfe.b) {
            bfe.c();
        }
        hs0 hs0 = (hs0) bfe.h;
        if (!(hs0 == null || (cArr = (char[]) bfe.j) == null)) {
            bfe.j = null;
            hs0.b.set(2, cArr);
        }
        char[] cArr2 = this.D0;
        if (cArr2 != null) {
            this.D0 = null;
            tn6 tn6 = this.c;
            char[] cArr3 = tn6.h;
            if (cArr2 == cArr3 || cArr2.length >= cArr3.length) {
                tn6.h = null;
                tn6.d.b.set(3, cArr2);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void E0(String str) {
        throw new StreamReadException(this, str);
    }

    public final void F0(String str) {
        throw new StreamReadException(this, rf0.h("Unexpected end-of-input", str));
    }

    public final void G0(q67 q67) {
        F0(q67 != q67.VALUE_STRING ? (q67 == q67.VALUE_NUMBER_INT || q67 == q67.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    public final void H0(char c2, int i) {
        k67 k67 = this.A0;
        E0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c2), k67.e(), new e67(k67.g, k67.h, -1, -1, x0())}));
        throw null;
    }

    public final void I0(int i, String str) {
        if (i >= 0) {
            String i2 = wn6.i("Unexpected character (", w0(i), ")");
            if (str != null) {
                i2 = me4.i(i2, ": ", str);
            }
            E0(i2);
            throw null;
        }
        F0(" in " + this.b);
        throw null;
    }

    public final void J0(int i) {
        E0("Illegal character (" + w0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    public final void K0(int i, String str) {
        if (!g67.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.a) || i > 32) {
            E0("Illegal unquoted character (" + w0((char) i) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    public final String L0() {
        return g67.ALLOW_NON_NUMERIC_NUMBERS.a(this.a) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void M0() {
        int i = this.F0;
        if ((i & 2) != 0) {
            long j = this.H0;
            int i2 = (int) j;
            if (((long) i2) == j) {
                this.G0 = i2;
            } else {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE}));
            }
        } else if ((i & 4) != 0) {
            if (O0.compareTo(this.J0) > 0 || P0.compareTo(this.J0) < 0) {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE}));
            }
            this.G0 = this.J0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.I0;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE}));
            }
            this.G0 = (int) d;
        } else if ((i & 16) == 0) {
            f1f.a();
            throw null;
        } else if (U0.compareTo(this.K0) > 0 || V0.compareTo(this.K0) < 0) {
            throw new StreamReadException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE}));
        } else {
            this.G0 = this.K0.intValue();
        }
        this.F0 |= 1;
    }

    public final void O0(String str) {
        throw new StreamReadException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{A0(str), Long.MIN_VALUE, Long.MAX_VALUE}));
    }

    public final void P0(int i, String str) {
        String i2 = wn6.i("Unexpected character (", w0(i), ") in numeric value");
        E0(i2 + ": " + str);
        throw null;
    }

    public final q67 Q0(String str, double d) {
        bfe bfe = this.C0;
        bfe.i = null;
        bfe.d = -1;
        bfe.e = 0;
        bfe.c = str;
        bfe.k = null;
        if (bfe.b) {
            bfe.c();
        }
        bfe.g = 0;
        this.I0 = d;
        this.F0 = 8;
        return q67.VALUE_NUMBER_FLOAT;
    }

    public final q67 R0(int i, boolean z) {
        this.L0 = z;
        this.M0 = i;
        this.F0 = 0;
        return q67.VALUE_NUMBER_INT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.A0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String S() {
        /*
            r2 = this;
            q67 r0 = r2.b
            q67 r1 = defpackage.q67.START_OBJECT
            if (r0 == r1) goto L_0x000a
            q67 r1 = defpackage.q67.START_ARRAY
            if (r0 != r1) goto L_0x0013
        L_0x000a:
            k67 r0 = r2.A0
            k67 r0 = r0.c
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = r0.f
            return r2
        L_0x0013:
            k67 r2 = r2.A0
            java.lang.String r2 = r2.f
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.S():java.lang.String");
    }

    public final BigDecimal U() {
        int i = this.F0;
        if ((i & 16) == 0) {
            if (i == 0) {
                C0(16);
            }
            int i2 = this.F0;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String q0 = q0();
                    String str = yr9.a;
                    try {
                        this.K0 = new BigDecimal(q0);
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException(wn6.i("Value \"", q0, "\" can not be represented as BigDecimal"));
                    }
                } else if ((i2 & 4) != 0) {
                    this.K0 = new BigDecimal(this.J0);
                } else if ((i2 & 2) != 0) {
                    this.K0 = BigDecimal.valueOf(this.H0);
                } else if ((i2 & 1) != 0) {
                    this.K0 = BigDecimal.valueOf((long) this.G0);
                } else {
                    f1f.a();
                    throw null;
                }
                this.F0 |= 16;
            }
        }
        return this.K0;
    }

    public final void close() {
        if (!this.o) {
            this.X = Math.max(this.X, this.Y);
            this.o = true;
            try {
                v0();
            } finally {
                D0();
            }
        }
    }

    public final double e0() {
        int i = this.F0;
        if ((i & 8) == 0) {
            if (i == 0) {
                C0(8);
            }
            int i2 = this.F0;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.I0 = this.K0.doubleValue();
                } else if ((i2 & 4) != 0) {
                    this.I0 = this.J0.doubleValue();
                } else if ((i2 & 2) != 0) {
                    this.I0 = (double) this.H0;
                } else if ((i2 & 1) != 0) {
                    this.I0 = (double) this.G0;
                } else {
                    f1f.a();
                    throw null;
                }
                this.F0 |= 8;
            }
        }
        return this.I0;
    }

    public final int m() {
        q67 q67 = this.b;
        if (q67 == null) {
            return 0;
        }
        return q67.o;
    }

    public final int m0() {
        int i = this.F0;
        if ((i & 1) == 0) {
            if (i == 0) {
                if (this.o) {
                    E0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                } else if (this.b != q67.VALUE_NUMBER_INT || this.M0 > 9) {
                    C0(1);
                    if ((this.F0 & 1) == 0) {
                        M0();
                    }
                    return this.G0;
                } else {
                    int f = this.C0.f(this.L0);
                    this.G0 = f;
                    this.F0 = 1;
                    return f;
                }
            } else if ((i & 1) == 0) {
                M0();
            }
        }
        return this.G0;
    }

    public final BigInteger n() {
        int i = this.F0;
        if ((i & 4) == 0) {
            if (i == 0) {
                C0(4);
            }
            int i2 = this.F0;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.J0 = this.K0.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.J0 = BigInteger.valueOf(this.H0);
                } else if ((i2 & 1) != 0) {
                    this.J0 = BigInteger.valueOf((long) this.G0);
                } else if ((i2 & 8) != 0) {
                    this.J0 = BigDecimal.valueOf(this.I0).toBigInteger();
                } else {
                    f1f.a();
                    throw null;
                }
                this.F0 |= 4;
            }
        }
        return this.J0;
    }

    public final long n0() {
        int i = this.F0;
        if ((i & 2) == 0) {
            if (i == 0) {
                C0(2);
            }
            int i2 = this.F0;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.H0 = (long) this.G0;
                } else if ((i2 & 4) != 0) {
                    if (Q0.compareTo(this.J0) > 0 || R0.compareTo(this.J0) < 0) {
                        O0(q0());
                        throw null;
                    }
                    this.H0 = this.J0.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.I0;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        O0(q0());
                        throw null;
                    }
                    this.H0 = (long) d;
                } else if ((i2 & 16) == 0) {
                    f1f.a();
                    throw null;
                } else if (S0.compareTo(this.K0) > 0 || T0.compareTo(this.K0) < 0) {
                    O0(q0());
                    throw null;
                } else {
                    this.H0 = this.K0.longValue();
                }
                this.F0 |= 2;
            }
        }
        return this.H0;
    }

    public final int o0() {
        if (this.F0 == 0) {
            C0(0);
        }
        if (this.b != q67.VALUE_NUMBER_INT) {
            return (this.F0 & 16) != 0 ? 6 : 5;
        }
        int i = this.F0;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 2) != 0 ? 2 : 3;
    }

    public final Number p0() {
        if (this.F0 == 0) {
            C0(0);
        }
        if (this.b == q67.VALUE_NUMBER_INT) {
            int i = this.F0;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.G0);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.H0);
            }
            if ((i & 4) != 0) {
                return this.J0;
            }
            f1f.a();
            throw null;
        }
        int i2 = this.F0;
        if ((i2 & 16) != 0) {
            return this.K0;
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(this.I0);
        }
        f1f.a();
        throw null;
    }

    public abstract void v0();

    public final Object x0() {
        if (g67.INCLUDE_SOURCE_IN_LOCATION.a(this.a)) {
            return this.c.a;
        }
        return null;
    }

    public final void y0() {
        if (!this.A0.d()) {
            String str = this.A0.b() ? "Array" : "Object";
            k67 k67 = this.A0;
            e67 e67 = new e67(k67.g, k67.h, -1, -1, x0());
            F0(": expected close marker for " + str + " (start marker at " + e67 + ")");
            throw null;
        }
    }

    public final void z0(char c2) {
        g67 g67 = g67.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.a;
        if (!g67.a(i)) {
            if (c2 != '\'' || !g67.ALLOW_SINGLE_QUOTES.a(i)) {
                E0("Unrecognized character escape " + w0(c2));
                throw null;
            }
        }
    }
}
