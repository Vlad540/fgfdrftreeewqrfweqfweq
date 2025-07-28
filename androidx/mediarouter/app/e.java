package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;

public abstract class e extends b7c {
    public xb8 J0;
    public final ImageButton K0;
    public final MediaRouteVolumeSlider L0;
    public final /* synthetic */ jb8 M0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(jb8 jb8, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int i;
        int i2;
        this.M0 = jb8;
        this.K0 = imageButton;
        this.L0 = mediaRouteVolumeSlider;
        Context context = jb8.C0;
        int i3 = znb.mr_cast_mute_button;
        int i4 = fc8.a;
        Drawable n = am7.n(context, i3);
        if (fc8.i(context)) {
            um4.g(n, hq3.a(context, fc8.a));
        }
        imageButton.setImageDrawable(n);
        Context context2 = jb8.C0;
        if (fc8.i(context2)) {
            i = hq3.a(context2, gmb.mr_cast_progressbar_progress_and_thumb_light);
            i2 = hq3.a(context2, gmb.mr_cast_progressbar_background_light);
        } else {
            i = hq3.a(context2, gmb.mr_cast_progressbar_progress_and_thumb_dark);
            i2 = hq3.a(context2, gmb.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(i, i2);
    }

    public final void A(xb8 xb8) {
        this.J0 = xb8;
        int i = xb8.o;
        boolean z = i == 0;
        ImageButton imageButton = this.K0;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new jsc(7, this));
        xb8 xb82 = this.J0;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.L0;
        mediaRouteVolumeSlider.setTag(xb82);
        mediaRouteVolumeSlider.setMax(xb8.p);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.M0.J0);
    }

    public final void B(boolean z) {
        ImageButton imageButton = this.K0;
        if (imageButton.isActivated() != z) {
            imageButton.setActivated(z);
            jb8 jb8 = this.M0;
            if (z) {
                jb8.M0.put(this.J0.c, Integer.valueOf(this.L0.getProgress()));
            } else {
                jb8.M0.remove(this.J0.c);
            }
        }
    }
}
