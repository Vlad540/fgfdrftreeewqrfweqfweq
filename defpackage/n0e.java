package defpackage;

/* renamed from: n0e  reason: default package */
public abstract class n0e extends m0e {
    public static Double F(String str) {
        try {
            if (xnc.a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
