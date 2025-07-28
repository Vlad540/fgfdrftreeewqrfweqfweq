package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: jxd  reason: default package */
public final /* synthetic */ class jxd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersShowcaseScreen b;

    public /* synthetic */ jxd(StickersShowcaseScreen stickersShowcaseScreen, int i) {
        this.a = i;
        this.b = stickersShowcaseScreen;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [a9a, android.view.View, java.lang.Object] */
    public final Object invoke() {
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickersShowcaseScreen.z0;
                stickersShowcaseScreen.getClass();
                k77 k77 = StickersShowcaseScreen.z0[0];
                long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                hxd hxd = hxd.a;
                Class<pae> cls = pae.class;
                return new sxd(longValue, (lwd) hxd.getAccessor().d(lwd.class).getValue(), (pae) hxd.getAccessor().c(cls), new qwd(hxd.getAccessor().d(lud.class), hxd.getAccessor().d(kvd.class), (pae) hxd.getAccessor().c(cls)), hxd.getAccessor().d(l95.class), hxd.getAccessor().d(luf.class), hxd.getAccessor().d(jb5.class));
            case 1:
                k77[] k77Arr2 = StickersShowcaseScreen.z0;
                ? a9a = new a9a(stickersShowcaseScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                a9a.setLayoutParams(layoutParams);
                a9a.setAppearance(s8a.a);
                a9a.setSize(v8a.a);
                return a9a;
            default:
                k77[] k77Arr3 = StickersShowcaseScreen.z0;
                p4a p4a = new p4a(stickersShowcaseScreen.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d));
                p4a.setSubtitle(new hge(rhc.c));
                return p4a;
        }
    }
}
