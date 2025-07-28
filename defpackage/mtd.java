package defpackage;

import android.widget.FrameLayout;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: mtd  reason: default package */
public final /* synthetic */ class mtd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ mtd(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final Object invoke() {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickerPreviewScreen.E0;
                stickerPreviewScreen.getClass();
                k77 k77 = StickerPreviewScreen.E0[1];
                long longValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                bvd bvd = bvd.a;
                bvd.getAccessor().d(zsd.class);
                return new ttd(longValue, (pae) bvd.getAccessor().c(pae.class), bvd.getAccessor().d(kvd.class), bvd.getAccessor().d(lud.class), bvd.getAccessor().d(fa5.class), bvd.getAccessor().d(l95.class), bvd.getAccessor().d(bv2.class), bvd.getAccessor().d(luf.class), bvd.getAccessor().d(jb5.class));
            case 1:
                k77[] k77Arr2 = StickerPreviewScreen.E0;
                tsd tsd = new tsd(stickerPreviewScreen.getContext());
                tsd.setId(mca.f);
                int X = a24.X(((float) 160) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(X, X);
                layoutParams.gravity = 17;
                tsd.setLayoutParams(layoutParams);
                return tsd;
            case 2:
                k77[] k77Arr3 = StickerPreviewScreen.E0;
                gr7 gr7 = new gr7(stickerPreviewScreen.getContext());
                gr7.setId(mca.e);
                int X2 = a24.X(((float) 160) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(X2, X2);
                layoutParams2.gravity = 17;
                gr7.setLayoutParams(layoutParams2);
                return gr7;
            default:
                k77[] k77Arr4 = StickerPreviewScreen.E0;
                cqf cqf = new cqf(stickerPreviewScreen.getContext());
                cqf.setId(mca.l);
                int X3 = a24.X(((float) 160) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(X3, X3);
                layoutParams3.gravity = 17;
                cqf.setLayoutParams(layoutParams3);
                return cqf;
        }
    }
}
