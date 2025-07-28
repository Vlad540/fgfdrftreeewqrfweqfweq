package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: b67  reason: default package */
public abstract class b67 implements Closeable, Flushable {
    static {
        oa2.D(rzd.values());
        rzd.CAN_WRITE_FORMATTED_NUMBERS.b();
        rzd.CAN_WRITE_BINARY_NATIVELY.b();
    }

    public static void d(String str) {
        throw new JsonProcessingException(str, (e67) null, (NumberFormatException) null);
    }

    public abstract void S(double d);

    public abstract void U(float f);

    public final void a(i67 i67) {
        int i = 1;
        while (true) {
            q67 u0 = i67.u0();
            if (u0 != null) {
                boolean z = false;
                switch (u0.o) {
                    case 1:
                        q0();
                        break;
                    case 2:
                        n();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 3:
                        p0();
                        break;
                    case 4:
                        m();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 5:
                        o(i67.S());
                        continue;
                    case 6:
                        jja jja = (jja) i67;
                        q67 q67 = jja.b;
                        if (q67 == q67.VALUE_STRING) {
                            z = true;
                        } else if (q67 == q67.FIELD_NAME) {
                            z = jja.E0;
                        }
                        if (!z) {
                            r0(i67.q0());
                            break;
                        } else {
                            s0(i67.r0(), i67.t0(), i67.s0());
                            continue;
                        }
                    case 7:
                        int o0 = i67.o0();
                        if (o0 != 1) {
                            if (o0 != 3) {
                                m0(i67.n0());
                                break;
                            } else {
                                o0(i67.n());
                                break;
                            }
                        } else {
                            e0(i67.m0());
                            continue;
                        }
                    case 8:
                        int o02 = i67.o0();
                        if (o02 != 6) {
                            if (o02 != 4) {
                                S(i67.e0());
                                break;
                            } else {
                                U((float) ((jja) i67).e0());
                                break;
                            }
                        } else {
                            n0(i67.U());
                            continue;
                        }
                    case 9:
                        g(true);
                        continue;
                    case 10:
                        g(false);
                        continue;
                    case 11:
                        evf evf = (evf) this;
                        evf.A0("write a null");
                        evf.B0();
                        continue;
                    case 12:
                        evf evf2 = (evf) ((u66) this);
                        evf2.A0("write a null");
                        evf2.B0();
                        continue;
                    default:
                        throw new IllegalStateException("Internal error: unknown current token, " + u0);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void close();

    public abstract void e0(int i);

    public abstract void g(boolean z);

    public abstract void m();

    public abstract void m0(long j);

    public abstract void n();

    public abstract void n0(BigDecimal bigDecimal);

    public abstract void o(String str);

    public abstract void o0(BigInteger bigInteger);

    public abstract void p0();

    public abstract void q0();

    public abstract void r0(String str);

    public abstract void s0(char[] cArr, int i, int i2);
}
