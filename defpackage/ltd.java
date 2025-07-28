package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: ltd  reason: default package */
public final /* synthetic */ class ltd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ ltd(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final void onClick(View view) {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickerPreviewScreen.E0;
                stickerPreviewScreen.getRouter().C();
                return;
            case 1:
                k77[] k77Arr2 = StickerPreviewScreen.E0;
                stickerPreviewScreen.getRouter().C();
                cvd cvd = cvd.c;
                k77 k77 = StickerPreviewScreen.E0[2];
                long longValue = ((Number) stickerPreviewScreen.b.a(stickerPreviewScreen)).longValue();
                d34 P1 = cvd.P1();
                P1.b(":chats/forward?messages_ids=" + longValue, (Bundle) null);
                return;
            case 2:
                k77[] k77Arr3 = StickerPreviewScreen.E0;
                ttd m0 = stickerPreviewScreen.m0();
                ktd ktd = (ktd) m0.C0.a.getValue();
                long j = m0.b;
                if (j > 0 && ktd != null && !ktd.equals(ktd.D0)) {
                    ((luf) m0.x0.getValue()).a(new u0d(new t0d(j, ktd.a, 1)));
                    taf.o(m0.z0, v03.b);
                }
                tt6 tt6 = (tt6) bvd.a.getAccessor().e();
                if (tt6 != null) {
                    tt6.f(z3d.N(new st6[]{new st6(qt6.b, 1), new st6(qt6.Y, 1)}), mnc.CHAT);
                    return;
                }
                return;
            default:
                k77[] k77Arr4 = StickerPreviewScreen.E0;
                ttd m02 = stickerPreviewScreen.m0();
                ktd ktd2 = (ktd) m02.C0.a.getValue();
                if (ktd2 != null && !ktd2.equals(ktd.D0)) {
                    qod D = xs7.D(m02.a, m02.c.b(), ru3.b, new rtd(ktd2, m02, (Continuation) null));
                    m02.J0.o1(m02, ttd.L0[2], D);
                    return;
                }
                return;
        }
    }
}
