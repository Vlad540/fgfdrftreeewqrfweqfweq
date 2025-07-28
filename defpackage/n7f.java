package defpackage;

import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: n7f  reason: default package */
public final class n7f extends gt0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ VideoPlayerSeekBarPreview i;

    public /* synthetic */ n7f(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i2) {
        this.h = i2;
        this.i = videoPlayerSeekBarPreview;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                this.i.A0 = null;
                return;
            default:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.i;
                videoPlayerSeekBarPreview.c.setVisibility(4);
                videoPlayerSeekBarPreview.c.setAlpha(1.0f);
                videoPlayerSeekBarPreview.B0 = null;
                return;
        }
    }

    public void E() {
        switch (this.h) {
            case 0:
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.i;
                videoPlayerSeekBarPreview.c.setVisibility(0);
                videoPlayerSeekBarPreview.c.setAlpha(0.0f);
                return;
            default:
                return;
        }
    }
}
