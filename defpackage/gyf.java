package defpackage;

/* renamed from: gyf  reason: default package */
public final class gyf {
    public static final r7e c = new r7e(new vif(10));
    public final String a = gyf.class.getName();
    public final Throwable b;

    public gyf() {
        if (fyf.a.get() == null) {
            try {
                System.loadLibrary("gleff");
                th = null;
            } catch (Throwable th) {
                th = th;
                udd.s(this.a, "failed to load gl-effects library with system loader", th);
            }
            this.b = th;
            return;
        }
        throw new ClassCastException();
    }
}
