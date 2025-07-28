package defpackage;

/* renamed from: dae  reason: default package */
public final class dae extends RuntimeException {
    public final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dae(String str, String str2) {
        super(str);
        this.a = str2;
    }

    public final String getLocalizedMessage() {
        return this.a;
    }
}
