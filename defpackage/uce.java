package defpackage;

import android.view.TextureView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: uce  reason: default package */
public final class uce extends TextureView {
    public tce a;

    public final void onDetachedFromWindow() {
        a9f a9f;
        tce tce = this.a;
        if (!(tce == null || (a9f = ((VideoView) ((xle) tce).b).o) == null)) {
            a9f.f1();
        }
        super.onDetachedFromWindow();
    }

    public void setListener(tce tce) {
        this.a = tce;
    }
}
