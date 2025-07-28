package defpackage;

/* renamed from: ioe  reason: default package */
public final class ioe implements xwb {
    public final aoe a;
    public final xwb b;

    public ioe(aoe aoe, xwb xwb) {
        this.a = aoe;
        this.b = xwb;
    }

    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        aoe aoe = this.a;
        aoe.getClass();
        try {
            ((tne) aoe.b.getValue()).a((String) null, th);
        } catch (Throwable unused) {
        }
    }
}
