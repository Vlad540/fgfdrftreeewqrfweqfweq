package defpackage;

/* renamed from: is0  reason: default package */
public abstract class is0 {
    public static final s5c a;
    public static final ThreadLocal b = new ThreadLocal();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? cie.a : null;
    }
}
