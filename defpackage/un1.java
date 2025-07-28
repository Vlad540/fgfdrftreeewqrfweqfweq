package defpackage;

/* renamed from: un1  reason: default package */
public final class un1 extends n3 {
    public final /* synthetic */ vn1 w0;

    public un1(vn1 vn1) {
        this.w0 = vn1;
    }

    public final String g() {
        sn1 sn1 = (sn1) this.w0.a.get();
        if (sn1 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + sn1.a + "]";
    }
}
