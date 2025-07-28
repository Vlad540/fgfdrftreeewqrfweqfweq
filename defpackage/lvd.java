package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: lvd  reason: default package */
public final /* synthetic */ class lvd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ lvd(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    public final Object invoke() {
        StickersScreen stickersScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StickersScreen.z0;
                k77 k77 = StickersScreen.z0[0];
                long longValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                uwd uwd = uwd.a;
                r7e d = uwd.getAccessor().d(zsd.class);
                r7e d2 = uwd.getAccessor().d(v2c.class);
                r7e d3 = uwd.getAccessor().d(fa5.class);
                r7e d4 = uwd.getAccessor().d(l95.class);
                r7e d5 = uwd.getAccessor().d(lud.class);
                r7e d6 = uwd.getAccessor().d(jb5.class);
                return new kyd(stickersScreen.a, longValue, (Context) uwd.getAccessor().c(Context.class), (pae) uwd.getAccessor().c(pae.class), d, d2, d3, d4, d5, d6);
            case 1:
                k77[] k77Arr2 = StickersScreen.z0;
                return new avd(stickersScreen.getContext());
            default:
                k77[] k77Arr3 = StickersScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                layoutParams.leftMargin = X;
                layoutParams.rightMargin = X;
                layoutParams.topMargin = X;
                layoutParams.bottomMargin = X;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setMode(u0a.b);
                oneMeButton.setAppearance(s0a.c);
                oneMeButton.setText(sca.n);
                a24.a0(oneMeButton, new wfc(7, stickersScreen));
                return oneMeButton;
        }
    }
}
