package defpackage;

import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: xd5  reason: default package */
public final /* synthetic */ class xd5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd5 b;

    public /* synthetic */ xd5(yd5 yd5, int i) {
        this.a = i;
        this.b = yd5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
            case 1:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
            default:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
        }
    }
}
