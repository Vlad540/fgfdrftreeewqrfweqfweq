package defpackage;

/* renamed from: a4g  reason: default package */
public final class a4g extends bzf {
    public final mj4 d;
    public final vde e;
    public final /* synthetic */ g4g f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a4g(g4g g4g, vde vde) {
        super(3);
        mj4 mj4 = new mj4("OnRequestInstallCallback", 1);
        this.f = g4g;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = mj4;
        this.e = vde;
    }
}
