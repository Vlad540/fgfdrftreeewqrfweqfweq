package defpackage;

/* renamed from: t5g  reason: default package */
public final class t5g extends bzf {
    public final o15 d;
    public final vde e;
    public final /* synthetic */ y5g f;
    public final /* synthetic */ y5g g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5g(y5g y5g, vde vde, String str) {
        super(2);
        this.g = y5g;
        o15 o15 = new o15("OnRequestInstallCallback", 2);
        this.f = y5g;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.d = o15;
        this.e = vde;
    }
}
