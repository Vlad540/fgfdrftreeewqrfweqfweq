package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: f58  reason: default package */
public final /* synthetic */ class f58 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaGalleryWidget b;

    public /* synthetic */ f58(MediaGalleryWidget mediaGalleryWidget, int i) {
        this.a = i;
        this.b = mediaGalleryWidget;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View, java.lang.Object, ty4] */
    public final Object invoke() {
        MediaGalleryWidget mediaGalleryWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaGalleryWidget.Z;
                return new c46(mediaGalleryWidget.n0());
            default:
                k77[] k77Arr2 = MediaGalleryWidget.Z;
                ? ty4 = new ty4(mediaGalleryWidget.getContext(), (AttributeSet) null);
                ty4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return ty4;
        }
    }
}
