package defpackage;

import java.math.BigDecimal;

/* renamed from: u66  reason: default package */
public abstract class u66 extends b67 {
    public int a;
    public boolean b;
    public s67 c;

    static {
        int i = a67.WRITE_NUMBERS_AS_STRINGS.b;
        int i2 = a67.ESCAPE_NON_ASCII.b;
        int i3 = a67.STRICT_DUPLICATE_DETECTION.b;
    }

    public final String t0(BigDecimal bigDecimal) {
        if (!a67.WRITE_BIGDECIMAL_AS_PLAIN.a(this.a)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        b67.d(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        throw null;
    }

    public final boolean u0(a67 a67) {
        return (this.a & a67.b) != 0;
    }
}
