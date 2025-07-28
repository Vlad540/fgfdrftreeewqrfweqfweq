package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: d18  reason: default package */
public final class d18 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ d18(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                MediaBarWidget.n0(mediaBarWidget);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                k77[] k77Arr = MediaBarWidget.h1;
                if (mediaBarWidget.A0().s()) {
                    mediaBarWidget.w0().k();
                    return;
                }
                z0b w0 = mediaBarWidget.w0();
                int i9 = z0b.A0;
                w0.setHalfScreen((i26) null);
                return;
        }
    }
}
