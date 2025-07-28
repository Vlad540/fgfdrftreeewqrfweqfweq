package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: svd  reason: default package */
public final /* synthetic */ class svd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSearchScreen b;

    public /* synthetic */ svd(StickersSearchScreen stickersSearchScreen, int i) {
        this.a = i;
        this.b = stickersSearchScreen;
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [a9a, android.view.View, java.lang.Object] */
    public final Object invoke() {
        StickersSearchScreen stickersSearchScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickersSearchScreen.y0;
                stickersSearchScreen.getClass();
                k77 k77 = StickersSearchScreen.y0[0];
                long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                qvd qvd = qvd.a;
                return new cwd(longValue, qvd.getAccessor().d(kvd.class), new wed(qvd.getAccessor().d(zsd.class), qvd.getAccessor().d(lwd.class)), qvd.getAccessor().d(luf.class), qvd.getAccessor().d(jb5.class), (pae) qvd.getAccessor().c(pae.class));
            case 1:
                k77[] k77Arr2 = StickersSearchScreen.y0;
                ? a9a = new a9a(stickersSearchScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                a9a.setLayoutParams(layoutParams);
                a9a.setAppearance(s8a.a);
                a9a.setSize(u8a.a);
                return a9a;
            default:
                k77[] k77Arr3 = StickersSearchScreen.y0;
                p4a p4a = new p4a(stickersSearchScreen.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d));
                p4a.setSubtitle(new hge(rhc.c));
                return p4a;
        }
    }
}
