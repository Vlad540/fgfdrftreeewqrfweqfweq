package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* renamed from: se9  reason: default package */
public final class se9 extends v2 implements lf9, xhe, SeekBar.OnSeekBarChangeListener {
    public VideoThumbnailView A0;
    public TextView B0;
    public TextView C0;
    public ImageButton D0;
    public View E0;
    public View F0;
    public View G0;
    public LiveVideoPlaceHolderView H0;
    public p7f I0;
    public final bd X;
    public VideoView Y;
    public PinchToZoomVideoViewWrapper Z;
    public final tg o;
    public ImageButton w0;
    public ImageButton x0;
    public ImageView y0;
    public VideoPlayerSeekBarPreview z0;

    public se9(Context context, View view, tg tgVar, bd bdVar) {
        super(context);
        this.o = tgVar;
        this.X = bdVar;
        this.c = view;
        n();
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A(Rect rect) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E0.getLayoutParams();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        this.E0.setLayoutParams(marginLayoutParams);
        View view = this.G0;
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, this.G0.getPaddingBottom());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ru.ok.messages.views.widgets.VideoThumbnailView, android.view.View] */
    public final void a(int i, int i2) {
        this.Y.d();
        ? r1 = this.A0;
        r1.D0 = i;
        r1.E0 = i2;
        r1.requestLayout();
    }

    public final void b(a9f a9f) {
        this.Y.a(a9f);
    }

    public final void c() {
        r7e r7e = wce.a0;
        Context context = (Context) this.b;
        wce E = fja.E(context);
        ImageButton imageButton = this.w0;
        int i = E.t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.x0.setColorFilter(E.t, mode);
        ImageButton imageButton2 = this.w0;
        int i2 = E.r;
        imageButton2.setBackground(swb.Q(swb.H(Integer.valueOf(i2), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        this.x0.setBackground(swb.Q(swb.H(Integer.valueOf(i2), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        TextView textView = this.C0;
        int i3 = E.w;
        textView.setTextColor(i3);
        this.B0.setTextColor(i3);
        ImageButton imageButton3 = this.D0;
        ow5 ow5 = new ow5(js.q(eic.a, i3, context));
        ow5.x0 = new RectF();
        ow5.y0 = new Path();
        vl vlVar = vl.o;
        zg4 b = zg4.b();
        ow5.X = b;
        Paint paint = new Paint();
        ow5.Z = paint;
        paint.setColor(-16777216);
        paint.setTextSize(b.G);
        paint.setStrokeWidth((float) b.a);
        paint.setTypeface(o8f.z0);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        ow5.w0 = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        imageButton3.setImageDrawable(ow5);
        this.D0.setBackground(E.a());
        this.z0.c();
        this.F0.setBackgroundColor(E.m);
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v2, types: [ru.ok.messages.video.widgets.LiveVideoPlaceHolderView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v25, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    public final void d(p7f p7f) {
        Drawable drawable;
        this.I0 = p7f;
        tg tgVar = this.o;
        if (tgVar.h()) {
            kre kre = new kre();
            kre.T(new fdf());
            kre.V(tgVar.a.b());
            kre.q(yqb.view_full_screen_video_player__v_video);
            kre.q(yqb.view_full_screen_video_player__iv_thumbnail);
            ire.a((ViewGroup) ((View) this.c), kre);
        }
        int i = 0;
        boolean z = p7f.a;
        boolean z2 = p7f.c;
        if (z) {
            B(this.E0, true);
            boolean z3 = p7f.i;
            boolean z4 = p7f.b;
            if (z2) {
                if (z4) {
                    B(this.x0, true);
                    this.w0.setVisibility(8);
                } else {
                    this.x0.setVisibility(8);
                    B(this.w0, !z3);
                }
                B(this.y0, true);
            } else {
                if (z4) {
                    B(this.x0, true);
                    this.w0.setVisibility(8);
                } else {
                    this.x0.setVisibility(8);
                    B(this.w0, !z3);
                }
                this.y0.setVisibility(8);
            }
            B(this.B0, true);
            String str = null;
            if (p7f.g) {
                this.z0.setVisibility(8);
                int i2 = zhc.w0;
                TextView textView = this.B0;
                Context context = (Context) this.b;
                if (i2 != -1) {
                    try {
                        drawable = gq3.b(context, i2);
                    } catch (Resources.NotFoundException unused) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else {
                    drawable = null;
                }
                gp0.D(drawable, (Drawable) null, (Drawable) null, (Drawable) null, textView);
                this.B0.setText(cic.l3);
                this.C0.setVisibility(8);
            } else {
                this.B0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                B(this.z0, true);
                ? r2 = this.z0.b;
                long j = p7f.j;
                r2.setMax((int) j);
                long j2 = p7f.k;
                r2.setProgress((int) j2);
                this.z0.setSecondaryProgress(p7f.l);
                if (j >= 0) {
                    TextView textView2 = this.C0;
                    String[] strArr = dhe.b;
                    textView2.setText(d8.a(j));
                    this.C0.setVisibility(0);
                } else {
                    this.C0.setVisibility(8);
                }
                B(this.C0, true);
                TextView textView3 = this.B0;
                String[] strArr2 = dhe.b;
                textView3.setText(d8.a(j2));
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.z0;
                int width = this.C0.getWidth();
                videoPlayerSeekBarPreview.G0 = -this.B0.getWidth();
                videoPlayerSeekBarPreview.H0 = width;
            }
            if (p7f.f) {
                B(this.D0, true);
                qjb qjb = p7f.m;
                if (qjb != null) {
                    str = qjb.a;
                }
                ow5 ow5 = (o8f) this.D0.getDrawable();
                ow5.Y = str;
                if (!r1g.p(str)) {
                    int measureText = r1g.p(ow5.Y) ? 0 : (int) ow5.Z.measureText(ow5.Y);
                    RectF rectF = ow5.x0;
                    int intrinsicWidth = ow5.getIntrinsicWidth() - measureText;
                    zg4 zg4 = ow5.X;
                    rectF.set((float) (intrinsicWidth - zg4.b), (((float) ow5.getIntrinsicHeight()) - ow5.Z.getTextSize()) - ((float) zg4.d), (float) ow5.getIntrinsicWidth(), (float) (ow5.getIntrinsicHeight() - zg4.b));
                    Path path = ow5.y0;
                    path.reset();
                    float f = rectF.left;
                    float f2 = (float) zg4.b;
                    RectF rectF2 = new RectF(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
                    float f3 = (float) zg4.b;
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                }
                ow5.invalidateSelf();
                this.D0.requestLayout();
            } else {
                this.D0.setVisibility(8);
            }
        } else {
            this.E0.setVisibility(8);
            B(this.y0, z2);
            this.w0.setVisibility(8);
            this.x0.setVisibility(8);
            this.z0.setVisibility(8);
            this.C0.setVisibility(8);
            this.B0.setVisibility(8);
            this.D0.setVisibility(8);
        }
        n10 n10 = p7f.o;
        Drawable drawable2 = p7f.p;
        if (drawable2 != null) {
            this.A0.n(n10, drawable2);
        } else {
            Uri uri = p7f.q;
            if (uri != null) {
                this.A0.o(n10, uri);
            }
        }
        u2f u2f = p7f.n;
        if (u2f != null) {
            this.z0.setVideoContent(u2f);
        }
        VideoView videoView = this.Y;
        if (!p7f.s) {
            i = 4;
        }
        videoView.setVisibility(i);
        this.Z.setEnabled(p7f.t);
        if (p7f.h) {
            LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.H0;
            liveVideoPlaceHolderView.P0 = n10;
            liveVideoPlaceHolderView.x();
            B(this.H0, true);
            return;
        }
        this.H0.setVisibility(8);
    }

    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [me9, java.lang.Object] */
    public final void n() {
        this.Y = (VideoView) ((View) this.c).findViewById(yqb.view_full_screen_video_player__v_video);
        this.Z = (PinchToZoomVideoViewWrapper) ((View) this.c).findViewById(yqb.view_full_screen_video_player__pinch_to_zoom_v_video_wrapper);
        this.w0 = (ImageButton) ((View) this.c).findViewById(yqb.view_full_screen_video_player__btn_play);
        this.x0 = (ImageButton) ((View) this.c).findViewById(yqb.view_full_screen_video_player__btn_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(yqb.view_full_screen_video_player__progress);
        this.y0 = imageView;
        imageView.setImageDrawable(new u10(((View) this.c).getContext(), 0));
        this.z0 = (VideoPlayerSeekBarPreview) ((View) this.c).findViewById(yqb.view_video_player_controls__sb_seek_preview);
        this.A0 = (VideoThumbnailView) ((View) this.c).findViewById(yqb.view_full_screen_video_player__iv_thumbnail);
        this.B0 = (TextView) ((View) this.c).findViewById(yqb.view_video_player_controls__tv_time);
        this.C0 = (TextView) ((View) this.c).findViewById(yqb.view_video_player_controls__tv_duration);
        this.D0 = (ImageButton) ((View) this.c).findViewById(yqb.view_video_player_controls__btn_settings);
        this.E0 = ((View) this.c).findViewById(yqb.view_full_screen_video_player__controls);
        this.F0 = ((View) this.c).findViewById(yqb.view_video_player_controls__v_background);
        this.G0 = ((View) this.c).findViewById(yqb.view_video_player_controls__cl_content);
        this.H0 = (LiveVideoPlaceHolderView) ((View) this.c).findViewById(yqb.view_full_screen_video_player__live_placeholder);
        ((ViewGroup) this.E0).setClipChildren(false);
        ((ViewGroup) this.G0).setClipChildren(false);
        at7.i(this.w0, new re9(this, 0));
        at7.i(this.x0, new re9(this, 1));
        at7.i(this.D0, new re9(this, 2));
        this.z0.a.add(this);
        c();
        tg tgVar = this.o;
        Context context = (Context) this.b;
        oe9 oe9 = new oe9(context, (DoubleTapVideoViewWrapper) ((View) this.c).findViewById(yqb.view_full_screen_video_player__double_tap_wrapper), tgVar);
        ? obj = new Object();
        obj.c = false;
        obj.a = 0;
        new id9(oe9, new ne9((me9) obj), context, this.X).y0 = this;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        o(new ai0(24));
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        o(new jv1(4, seekBar));
    }

    public final void release() {
        this.Y.b();
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.Z;
        pinchToZoomVideoViewWrapper.c = kva.b;
        pinchToZoomVideoViewWrapper.w0 = 1.0f;
    }
}
