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

/* renamed from: ie9  reason: default package */
public final class ie9 extends v2 implements lf9, xhe {
    public final float[] X;
    public VideoView Y;
    public VideoPlayerSeekBar Z;
    public final tg o;
    public VideoThumbnailView w0;
    public ImageButton x0;
    public ImageView y0;
    public LayerDrawable z0;

    public ie9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        m((ViewGroup) null, zrb.view_auto_play_video_player);
    }

    public static void A(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void a(int i, int i2) {
        this.Y.d();
        ? r1 = this.w0;
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
        js.D(this.z0.findDrawableByLayerId(16908288), E.r);
        Drawable findDrawableByLayerId = this.z0.findDrawableByLayerId(16908301);
        int i = E.t;
        js.D(findDrawableByLayerId, i);
        js.D(this.z0.findDrawableByLayerId(16908303), n1g.c0(i, 0.3f));
        this.x0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        ImageButton imageButton = this.x0;
        int i2 = E.r;
        imageButton.setBackground(swb.Q(swb.H(Integer.valueOf(i2), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v10, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r0v11, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    /* JADX WARNING: type inference failed for: r0v12, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.view.View] */
    public final void d(p7f p7f) {
        tg tgVar = this.o;
        if (tgVar.h()) {
            kre kre = new kre();
            kre.T(new fdf());
            kre.V(tgVar.a.b());
            kre.q(yqb.view_auto_play_video_player__v_video);
            kre.q(yqb.view_auto_play_video_player__iv_thumbnail);
            ire.a((ViewGroup) ((View) this.c), kre);
        }
        A(this.y0, p7f.c);
        if (p7f.g) {
            this.Z.setVisibility(8);
        } else {
            A(this.Z, true);
            ? r0 = this.Z;
            r0.setMax((int) p7f.j);
            r0.setProgress((int) p7f.k);
            this.Z.setSecondaryProgress((int) p7f.l);
        }
        ? r02 = this.Z;
        boolean z = p7f.b;
        A(r02, z);
        if (p7f.r) {
            this.x0.setVisibility(8);
        } else {
            this.x0.setSelected(p7f.e);
            A(this.x0, z);
        }
        n10 n10 = p7f.o;
        Drawable drawable = p7f.p;
        if (drawable != null) {
            this.w0.n(n10, drawable);
            return;
        }
        Uri uri = p7f.q;
        if (uri != null) {
            this.w0.o(n10, uri);
        }
    }

    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void n() {
        float[] fArr = this.X;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.Y = (VideoView) ((View) this.c).findViewById(yqb.view_auto_play_video_player__v_video);
        this.Z = (VideoPlayerSeekBar) ((View) this.c).findViewById(yqb.view_auto_play_video_player__sb_seek);
        this.z0 = (LayerDrawable) ((Context) this.b).getResources().getDrawable(zhc.O0);
        this.w0 = (VideoThumbnailView) ((View) this.c).findViewById(yqb.view_auto_play_video_player__iv_thumbnail);
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(yqb.view_auto_play_video_player__ib_sound);
        this.x0 = imageButton;
        Drawable drawable = ((View) this.c).getResources().getDrawable(zhc.g0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(zhc.i0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        imageButton.setImageDrawable(stateListDrawable);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(yqb.view_auto_play_video_player__progress);
        this.y0 = imageView;
        imageView.setImageDrawable(new u10(((View) this.c).getContext(), 0));
        at7.i(this.Y, new he9(this, 0));
        at7.i(this.w0, new he9(this, 1));
        at7.i(this.x0, new he9(this, 2));
        this.Y.setOnLongClickListener(new wk0(4, this));
        c();
    }

    public final void release() {
        this.Y.b();
    }
}
