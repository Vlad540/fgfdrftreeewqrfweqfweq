package defpackage;

/* renamed from: e1e  reason: default package */
public final class e1e extends hcd implements zqd {
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) icd.c(this.w0, (this.x0 + ((long) ((int) ((r() + ((long) this.z0)) - this.x0)))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            g(Integer.valueOf(((Number) icd.c(this.w0, (this.x0 + ((long) ((int) ((r() + ((long) this.z0)) - this.x0)))) - 1)).intValue() + i));
        }
    }
}
