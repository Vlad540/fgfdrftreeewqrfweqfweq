package defpackage;

/* renamed from: xfa  reason: default package */
public final class xfa extends hhd {
    public final Throwable e;

    public xfa(Throwable th) {
        this.e = th;
    }

    public final String toString() {
        return "FAILURE (" + this.e.getMessage() + ")";
    }
}
