package defpackage;

import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;

/* renamed from: do2  reason: default package */
public final class do2 extends e0 implements ku3 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do2(gu3 gu3, int i) {
        super(gu3);
        this.a = i;
    }

    public final void g(hu3 hu3, Throwable th) {
        switch (this.a) {
            case 0:
                udd.u("fo2", th, "fail in %s", new Object[]{hu3});
                return;
            default:
                IllegalStateException illegalStateException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException(th);
                }
                y0f.a.c().a("ONEME-8759", illegalStateException);
                return;
        }
    }
}
