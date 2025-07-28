package defpackage;

import java.util.concurrent.CancellationException;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: tvd  reason: default package */
public final class tvd implements oaa {
    public final /* synthetic */ StickersSearchScreen a;

    public tvd(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    public final void I(CharSequence charSequence) {
        k77[] k77Arr = StickersSearchScreen.y0;
        cwd m0 = this.a.m0();
        if (!hhd.f(charSequence, ((xvd) m0.A0.get()).a)) {
            qod qod = m0.C0;
            String str = null;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            grd grd = m0.Z;
            grd.m((Object) null, new xrc(1, ((xrc) grd.getValue()).b));
            if (charSequence != null) {
                str = charSequence.toString();
            }
            m0.y0.setValue(str);
        }
    }

    public final void p() {
        this.a.getRouter().C();
    }
}
