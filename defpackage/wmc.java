package defpackage;

/* renamed from: wmc  reason: default package */
public abstract class wmc {
    public static final boolean a;

    static {
        boolean z = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z = "true".equals(property);
            }
        } catch (Throwable th) {
            ek8.a0(th);
        }
        a = z;
    }
}
