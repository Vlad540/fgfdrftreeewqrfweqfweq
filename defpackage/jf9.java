package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: jf9  reason: default package */
public final class jf9 extends v2 implements xhe, qx9, ge9 {
    public TextView A0;
    public TextView B0;
    public RangeSeekBarView C0;
    public ViewGroup D0;
    public TextView E0;
    public AppCompatImageButton F0;
    public AppCompatImageButton G0;
    public ProgressBar H0;
    public wce I0;
    public final mn X;
    public final FrgTrimVideo Y;
    public final tg Z;
    public final FrgTrimVideo o;
    public mif w0;
    public VideoView x0;
    public ImageButton y0;
    public ImageButton z0;

    public jf9(Context context, ViewGroup viewGroup, FrgTrimVideo frgTrimVideo, mn mnVar, FrgTrimVideo frgTrimVideo2, tg tgVar) {
        super(context);
        this.o = frgTrimVideo;
        this.X = mnVar;
        this.Y = frgTrimVideo2;
        this.Z = tgVar;
        m(viewGroup, zrb.cl_trim_video);
    }

    public final void A(long j, long j2, long j3, long j4) {
        RangeSeekBarView rangeSeekBarView = this.C0;
        rangeSeekBarView.I0 = j4;
        rangeSeekBarView.M0 = this.o;
        float f = (float) j4;
        rangeSeekBarView.H0 = ((float) j) / f;
        rangeSeekBarView.F0 = ((float) j2) / f;
        rangeSeekBarView.G0 = ((float) j3) / f;
        rangeSeekBarView.D0 = 1000.0f / f;
        rangeSeekBarView.E0 = 1.0f;
        rangeSeekBarView.J0 = true;
        RangeSeekBarView.V0 = 1.0f;
        RangeSeekBarView.W0 = 1.0f;
        rangeSeekBarView.invalidate();
        TextView textView = this.A0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        textView.setText(xs7.q(timeUnit.toSeconds(j2)));
        this.B0.setText(xs7.q(timeUnit.toSeconds(j3)));
    }

    public final void B(boolean z) {
        if (z) {
            this.E0.setAlpha(1.0f);
            this.E0.setBackground(this.I0.a());
            return;
        }
        this.E0.setAlpha(0.3f);
        this.E0.setBackground((Drawable) null);
    }

    public final void C(boolean z, boolean z2) {
        tg tgVar = this.Z;
        if (z) {
            tgVar.j((Toolbar) this.w0.b);
            tgVar.j(this.D0);
        } else {
            tgVar.g((Toolbar) this.w0.b);
            tgVar.g(this.D0);
        }
        FrgTrimVideo frgTrimVideo = this.Y;
        if (z) {
            if (frgTrimVideo.c0() != null) {
                frgTrimVideo.c0().g0((View.OnSystemUiVisibilityChangeListener) null);
            }
        } else if (frgTrimVideo.c0() != null) {
            frgTrimVideo.c0().b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (z2) {
            if (z) {
                tgVar.j(this.z0);
            } else {
                tgVar.g(this.z0);
            }
        } else if (z) {
            tgVar.j(this.y0);
        }
    }

    public final void c() {
        String str;
        if (((View) this.c) != null) {
            r7e r7e = wce.a0;
            wce E = fja.E((Context) this.b);
            this.I0 = E;
            ((View) this.c).setBackgroundColor(E.m);
            wce wce = this.I0;
            Toolbar findViewById = ((View) this.c).findViewById(yqb.trim_video__toolbar);
            int i = zg4.b().p;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                findViewById.setLayoutParams(marginLayoutParams);
            }
            ci9 ci9 = new ci9(this.X, findViewById);
            ci9.c = wce;
            mif mif = new mif(ci9);
            this.w0 = mif;
            Toolbar toolbar = (Toolbar) mif.b;
            if (toolbar != null) {
                toolbar.setNavigationIcon((Drawable) null);
            }
            mif mif2 = this.w0;
            int i2 = cic.a3;
            mn mnVar = (mn) mif2.a;
            if (i2 == 0) {
                mnVar.getClass();
                str = "";
            } else if (((WeakReference) mnVar.c).get() != null) {
                str = ((im) ((WeakReference) mnVar.c).get()).getString(i2);
            } else {
                WeakReference weakReference = (WeakReference) mnVar.b;
                if (weakReference.get() != null) {
                    str = ((a) weakReference.get()).i0(i2);
                } else {
                    throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
                }
            }
            TextView textView = (TextView) mif2.o;
            if (!(textView == null || i2 == -1)) {
                textView.setText(str);
            }
            mif mif3 = this.w0;
            View view = (View) mif3.Y;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 17;
                ((View) mif3.Y).setLayoutParams(layoutParams);
            } else {
                TextView textView2 = (TextView) mif3.o;
                if (textView2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                    layoutParams2.gravity = 17;
                    ((TextView) mif3.o).setLayoutParams(layoutParams2);
                }
            }
            TextView textView3 = (TextView) mif3.X;
            if (textView3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams3.gravity = 17;
                ((TextView) mif3.X).setLayoutParams(layoutParams3);
            }
            this.y0.setColorFilter(this.I0.t);
            this.z0.setColorFilter(this.I0.t);
            ImageButton imageButton = this.y0;
            wce wce2 = this.I0;
            imageButton.setBackground(swb.Q(swb.H(Integer.valueOf(wce2.r), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(wce2.r, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
            ImageButton imageButton2 = this.z0;
            wce wce3 = this.I0;
            imageButton2.setBackground(swb.Q(swb.H(Integer.valueOf(wce3.r), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(wce3.r, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
            this.A0.setTextColor(this.I0.M);
            this.B0.setTextColor(this.I0.M);
            um4.g(this.F0.getDrawable(), this.I0.w);
            um4.g(this.G0.getDrawable(), this.I0.k);
            this.F0.setBackground(this.I0.a());
            this.G0.setBackground(this.I0.a());
            this.E0.setTextColor(this.I0.w);
            if (this.E0.getAlpha() == 1.0f) {
                this.E0.setBackground(this.I0.a());
            }
            this.E0.setBackground(this.I0.a());
            this.D0.setBackgroundColor(this.I0.m);
            um4.g(this.H0.getIndeterminateDrawable(), this.I0.k);
        }
    }

    public final void n() {
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(yqb.trim_video__btn_play);
        this.y0 = imageButton;
        at7.i(imageButton, new if9(this, 0));
        ImageButton imageButton2 = (ImageButton) ((View) this.c).findViewById(yqb.trim_video__btn_pause);
        this.z0 = imageButton2;
        at7.i(imageButton2, new if9(this, 1));
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) ((View) this.c).findViewById(yqb.trim_video__range_seek_bar_view);
        this.C0 = rangeSeekBarView;
        rangeSeekBarView.setOnChangeRangeSeekBarListener(this);
        this.A0 = (TextView) ((View) this.c).findViewById(yqb.trim_video__startTime);
        this.B0 = (TextView) ((View) this.c).findViewById(yqb.trim_video__endTime);
        AppCompatImageButton findViewById = ((View) this.c).findViewById(yqb.trim_video__close);
        this.F0 = findViewById;
        at7.i(findViewById, new if9(this, 2));
        TextView textView = (TextView) ((View) this.c).findViewById(yqb.trim_video__reset);
        this.E0 = textView;
        at7.i(textView, new if9(this, 3));
        AppCompatImageButton findViewById2 = ((View) this.c).findViewById(yqb.trim_video__apply);
        this.G0 = findViewById2;
        at7.i(findViewById2, new if9(this, 4));
        this.H0 = (ProgressBar) ((View) this.c).findViewById(yqb.trim_video__apply_progress);
        this.D0 = (ViewGroup) ((View) this.c).findViewById(yqb.trim_video__bottom_group);
        VideoView videoView = (VideoView) ((View) this.c).findViewById(yqb.trim_video__view_video);
        this.x0 = videoView;
        at7.i(videoView, new if9(this, 5));
        c();
        ViewGroup viewGroup = this.D0;
        ss8 ss8 = new ss8(10, (Object) this);
        WeakHashMap weakHashMap = eaf.a;
        t9f.u(viewGroup, ss8);
        r9f.c(this.D0);
    }

    public final void t(Object obj) {
        de9 de9 = (de9) obj;
        super.t(de9);
        this.x0.a(de9);
    }
}
