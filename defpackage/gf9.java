package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: gf9  reason: default package */
public final class gf9 extends v2 implements lf9, xhe {
    public ImageButton A0;
    public VideoPlayerSeekBar B0;
    public VideoThumbnailView C0;
    public LayerDrawable D0;
    public final float[] X;
    public VideoView Y;
    public ImageButton Z;
    public final tg o;
    public ImageButton w0;
    public ImageView x0;
    public ImageButton y0;
    public ImageButton z0;

    public gf9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        m((ViewGroup) null, zrb.view_small_video_player);
    }

    public static StateListDrawable A(wce wce) {
        int i = wce.r;
        return swb.Q(swb.H(Integer.valueOf(i), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(i, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null);
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void a(int i, int i2) {
        this.Y.d();
        ? r1 = this.C0;
        r1.D0 = i;
        r1.E0 = i2;
        r1.requestLayout();
    }

    public final void b(a9f a9f) {
        this.Y.a(a9f);
    }

    public final void c() {
        r7e r7e = wce.a0;
        wce E = fja.E((Context) this.b);
        js.D(this.D0.findDrawableByLayerId(16908288), E.r);
        Drawable findDrawableByLayerId = this.D0.findDrawableByLayerId(16908301);
        int i = E.t;
        js.D(findDrawableByLayerId, i);
        js.D(this.D0.findDrawableByLayerId(16908303), n1g.c0(i, 0.3f));
        ImageButton imageButton = this.Z;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.w0.setColorFilter(i, mode);
        this.y0.setColorFilter(i, mode);
        this.z0.setColorFilter(i, mode);
        this.A0.setColorFilter(i, mode);
        this.Z.setBackground(A(E));
        this.w0.setBackground(A(E));
        this.y0.setBackground(A(E));
        this.z0.setBackground(A(E));
        this.A0.setBackground(A(E));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r0v4, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r0v5, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    public final void d(p7f p7f) {
        tg tgVar = this.o;
        if (tgVar.h()) {
            kre kre = new kre();
            kre.T(new fdf());
            kre.V(tgVar.a.b());
            kre.q(yqb.view_small_video_player__v_video);
            kre.q(yqb.view_small_video_player__iv_thumbnail);
            ire.a((ViewGroup) ((View) this.c), kre);
        }
        boolean z = p7f.a;
        boolean z2 = p7f.c;
        if (z) {
            if (z2) {
                this.w0.setVisibility(8);
                this.Z.setVisibility(8);
            } else if (p7f.b) {
                B(this.w0, true);
                this.Z.setVisibility(8);
            } else {
                this.w0.setVisibility(8);
                B(this.Z, true);
            }
            B(this.z0, true);
            if (p7f.d) {
                B(this.A0, true);
                this.y0.setVisibility(8);
            } else {
                this.A0.setVisibility(8);
                B(this.y0, true);
            }
        } else {
            this.w0.setVisibility(8);
            this.Z.setVisibility(8);
            this.A0.setVisibility(8);
            this.y0.setVisibility(8);
            this.z0.setVisibility(8);
        }
        B(this.x0, z2);
        if (p7f.g) {
            this.B0.setVisibility(8);
        } else {
            B(this.B0, true);
            ? r0 = this.B0;
            r0.setMax((int) p7f.j);
            r0.setProgress((int) p7f.k);
            this.B0.setSecondaryProgress((int) p7f.l);
        }
        n10 n10 = p7f.o;
        Drawable drawable = p7f.p;
        if (drawable != null) {
            this.C0.n(n10, drawable);
            return;
        }
        Uri uri = p7f.q;
        if (uri != null) {
            this.C0.o(n10, uri);
        }
    }

    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r0v48, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void n() {
        float[] fArr = this.X;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.Y = (VideoView) ((View) this.c).findViewById(yqb.view_small_video_player__v_video);
        this.Z = (ImageButton) ((View) this.c).findViewById(yqb.view_small_video_player__ib_play);
        this.w0 = (ImageButton) ((View) this.c).findViewById(yqb.view_small_video_player__ib_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(yqb.view_small_video_player__progress);
        this.x0 = imageView;
        imageView.setImageDrawable(new u10(((View) this.c).getContext(), 0));
        this.B0 = (VideoPlayerSeekBar) ((View) this.c).findViewById(yqb.view_small_video_player__sb_seek);
        LayerDrawable layerDrawable = (LayerDrawable) ((Context) this.b).getResources().getDrawable(zhc.O0);
        this.D0 = layerDrawable;
        this.B0.setProgressDrawable(layerDrawable);
        this.y0 = (ImageButton) ((View) this.c).findViewById(yqb.view_small_video_player__ib_pip);
        this.z0 = (ImageButton) ((View) this.c).findViewById(yqb.view_small_video_player__ib_full_screen);
        this.A0 = (ImageButton) ((View) this.c).findViewById(yqb.view_small_video_player__ib_close);
        this.C0 = (VideoThumbnailView) ((View) this.c).findViewById(yqb.view_small_video_player__iv_thumbnail);
        at7.i(this.Y, new ff9(this, 0));
        at7.i(this.Z, new ff9(this, 1));
        at7.i(this.w0, new ff9(this, 2));
        at7.i(this.y0, new ff9(this, 3));
        at7.i(this.z0, new ff9(this, 4));
        at7.i(this.A0, new ff9(this, 5));
        at7.i(this.C0, new ff9(this, 6));
        this.Y.setOnLongClickListener(new wk0(6, this));
        c();
    }

    public final void release() {
        this.Y.b();
    }
}
