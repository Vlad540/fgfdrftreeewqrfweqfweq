package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: ztd  reason: default package */
public final /* synthetic */ class ztd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ ztd(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    public final void onClick(View view) {
        sgc router;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickerSetBottomSheet.E0;
                rr3 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.C();
                    return;
                }
                return;
            default:
                k77[] k77Arr2 = StickerSetBottomSheet.E0;
                ttd ttd = (ttd) stickerSetBottomSheet.w0.getValue();
                hud hud = (hud) ttd.G0.a.getValue();
                if (hud != null) {
                    qod D = xs7.D(ttd.a, ttd.c.b(), ru3.b, new std(hud, ttd, (Continuation) null));
                    ttd.K0.o1(ttd, ttd.L0[3], D);
                    return;
                }
                return;
        }
    }
}
