package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: bf9  reason: default package */
public final class bf9 extends v2 implements lf9 {
    public VideoView X;
    public final float[] o;

    public bf9(Context context, float[] fArr) {
        super(context);
        this.o = fArr;
        m((ViewGroup) null, zrb.view_raw_video_player);
    }

    public final void a(int i, int i2) {
        this.X.d();
    }

    public final void b(a9f a9f) {
        this.X.a(a9f);
    }

    public final void d(p7f p7f) {
    }

    public final BitmapDrawable e() {
        return this.X.getVideoScreenShot();
    }

    public final void n() {
        float[] fArr = this.o;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        VideoView videoView = (VideoView) ((View) this.c).findViewById(yqb.view_raw_video_player__v_video);
        this.X = videoView;
        videoView.setOnClickListener(new c14((View.OnClickListener) new eu5(17, this), 0));
        this.X.setOnLongClickListener(new wk0(5, this));
    }

    public final void release() {
        this.X.b();
    }
}
