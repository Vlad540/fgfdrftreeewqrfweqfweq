package defpackage;

import android.graphics.Bitmap;
import ru.ok.messages.video.widgets.VideoFramePreview;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: m7f  reason: default package */
public final /* synthetic */ class m7f implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerSeekBarPreview b;

    public /* synthetic */ m7f(VideoPlayerSeekBarPreview videoPlayerSeekBarPreview, int i) {
        this.a = i;
        this.b = videoPlayerSeekBarPreview;
    }

    public final void accept(Object obj) {
        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                int i = VideoPlayerSeekBarPreview.I0;
                videoPlayerSeekBarPreview.getClass();
                if (System.currentTimeMillis() - videoPlayerSeekBarPreview.F0 > 1000) {
                    videoPlayerSeekBarPreview.c.a(true);
                    return;
                }
                return;
            default:
                int i2 = VideoPlayerSeekBarPreview.I0;
                videoPlayerSeekBarPreview.getClass();
                videoPlayerSeekBarPreview.F0 = System.currentTimeMillis();
                tic.b(videoPlayerSeekBarPreview.y0);
                VideoFramePreview videoFramePreview = videoPlayerSeekBarPreview.c;
                videoFramePreview.w0.setImageBitmap((Bitmap) obj);
                videoFramePreview.a(false);
                return;
        }
    }
}
