package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class VideoPlayerSeekBarPreview extends LinearLayout implements SeekBar.OnSeekBarChangeListener, xhe {
    public static final /* synthetic */ int I0 = 0;
    public qe4 A0;
    public qe4 B0;
    public final int C0;
    public final int D0;
    public long E0;
    public long F0;
    public int G0;
    public int H0;
    public final HashSet a = new HashSet();
    public final VideoPlayerSeekBar b;
    public final VideoFramePreview c;
    public final zy5 o;
    public final tg w0;
    public bx7 x0;
    public c97 y0;
    public u2f z0;

    /* JADX WARNING: type inference failed for: r4v3, types: [android.widget.SeekBar, ru.ok.messages.video.widgets.VideoPlayerSeekBar] */
    public VideoPlayerSeekBarPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zg4.b();
        this.C0 = dh4.b((int) 120.0f);
        this.D0 = dh4.b((int) 146.0f);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View inflate = View.inflate(context, zrb.view_video_player_seekbar_preview, this);
        this.c = (VideoFramePreview) inflate.findViewById(yqb.video_frame_preview);
        ? r4 = (VideoPlayerSeekBar) inflate.findViewById(yqb.video_player_seek_bar);
        this.b = r4;
        r4.setOnSeekBarChangeListener(this);
        this.w0 = vl.b().c();
        yy5 yy5 = (yy5) vl.b().getAccessor().c(yy5.class);
        yy5.getClass();
        this.o = new zy5((mbe) yy5.d.getValue(), (g15) yy5.b.getValue(), yy5.a, (tf4) yy5.c.getValue());
        c();
    }

    public final void a() {
        qe4 qe4 = this.A0;
        VideoFramePreview videoFramePreview = this.c;
        if (qe4 != null) {
            qe4.r();
            this.A0 = null;
            videoFramePreview.setVisibility(4);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() == 0 && this.B0 == null) {
            qe4 g = this.w0.g(videoFramePreview);
            g.F(new n7f(this, 1));
            this.B0 = g;
        }
    }

    public final void c() {
        Context context = getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        int i = E.w;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        videoPlayerSeekBar.setProgressColor(i);
        videoPlayerSeekBar.setThumbColor(E.w);
        this.c.c();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tic.b(this.x0);
        tic.b(this.y0);
        qe4 qe4 = this.A0;
        if (qe4 != null) {
            qe4.r();
        }
        qe4 qe42 = this.B0;
        if (qe42 != null) {
            qe42.r();
        }
        zy5 zy5 = this.o;
        kk7 kk7 = zy5.h;
        if (kk7 != null) {
            tic.b(kk7.g);
            try {
                kk7.h.release();
            } catch (Throwable th) {
                udd.s("kk7", "fail to release", th);
            }
            kk7.j = 0;
            List<Bitmap> list = (List) kk7.f.A();
            if (list != null) {
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
        }
        q8c q8c = zy5.i;
        if (q8c != null) {
            g0 g0Var = q8c.g;
            if (g0Var != null) {
                g0Var.a();
                q8c.g = null;
            }
            g0 g0Var2 = q8c.h;
            if (g0Var2 != null) {
                g0Var2.a();
                q8c.h = null;
            }
        }
        this.a.clear();
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.AbsSeekBar, android.view.View] */
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f;
        ax7 ax7;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z);
        }
        if (z && this.z0 == null) {
            return;
        }
        if (!z) {
            a();
            return;
        }
        long j = (long) i;
        if (this.z0 != null) {
            zy5 zy5 = this.o;
            if (zy5.b() && (((jj0) this.z0).a == 0 || ((double) Math.abs(this.E0 - j)) > ((double) ((jj0) this.z0).a) * 0.01d)) {
                if (tic.c(this.y0)) {
                    nu9 n = ms9.u(1000, TimeUnit.MILLISECONDS, cnc.a()).n(de.a());
                    c97 c97 = new c97(new m7f(this, 0), new are(26), z3d.i);
                    n.a(c97);
                    this.y0 = c97;
                }
                tic.b(this.x0);
                u2f u2f = zy5.e;
                if (u2f == null) {
                    udd.s("zy5", "You should call setVideoContent before extractFrame!", (Throwable) null);
                    ax7 = hx7.a;
                } else {
                    Uri l = ((jj0) u2f).l();
                    int i2 = mze.a;
                    String scheme = l.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        kk7 kk7 = zy5.h;
                        int min = Math.min(kk7.i - 1, (int) Math.floor((double) (((float) j) / ((float) (kk7.j / ((long) kk7.i))))));
                        jk0 jk0 = kk7.f;
                        x34 x34 = new x34(min, 3);
                        jk0.getClass();
                        ax7 = new nx7(new ot9(new ps9(jk0, x34, 1)), new x34(min, 4), 0);
                    } else {
                        q8c q8c = zy5.i;
                        g0 g0Var = q8c.h;
                        if (g0Var != null) {
                            g0Var.a();
                            q8c.h = null;
                        }
                        ax7 = new fx7(new sq1(q8c, j, 7));
                    }
                }
                vx7 f2 = ax7.f(de.a());
                bx7 bx7 = new bx7(new m7f(this, 1), new sq1(this, j, 10), new f5(23, this));
                f2.a(bx7);
                this.x0 = bx7;
                this.E0 = j;
            }
            qe4 qe4 = this.B0;
            VideoFramePreview videoFramePreview = this.c;
            if (qe4 != null) {
                qe4.r();
                this.B0 = null;
                videoFramePreview.setVisibility(0);
                videoFramePreview.setAlpha(1.0f);
            }
            if (videoFramePreview.getVisibility() != 0 && this.A0 == null) {
                videoFramePreview.setAlpha(0.0f);
                qe4 j2 = this.w0.j(videoFramePreview);
                j2.F(new n7f(this, 0));
                this.A0 = j2;
            }
            AppCompatTextView appCompatTextView = videoFramePreview.x0;
            String[] strArr = dhe.b;
            appCompatTextView.setText(d8.a(j));
            boolean w = xy6.w(this);
            ? r12 = this.b;
            if (w) {
                int paddingLeft = getPaddingLeft() + r12.getThumb().getBounds().centerX();
                f = Math.min((float) (-this.G0), Math.max((float) ((videoFramePreview.getWidth() - this.H0) - r12.getWidth()), (((float) videoFramePreview.getWidth()) / 2.0f) + ((float) ((r12.getThumbOffset() + paddingLeft) - r12.getWidth()))));
            } else {
                int paddingLeft2 = getPaddingLeft() + r12.getThumb().getBounds().centerX();
                f = Math.min((float) ((r12.getWidth() + this.H0) - videoFramePreview.getWidth()), Math.max((float) this.G0, ((float) (r12.getThumbOffset() + paddingLeft2)) - (((float) videoFramePreview.getWidth()) / 2.0f)));
            }
            videoFramePreview.setTranslationX(f);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
        if (this.z0 != null) {
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ru.ok.messages.video.widgets.VideoPlayerSeekBar, android.widget.ProgressBar] */
    public void setSecondaryProgress(long j) {
        this.b.setSecondaryProgress((int) j);
    }

    public void setVideoContent(u2f u2f) {
        int i;
        if (!u2f.equals(this.z0)) {
            this.z0 = u2f;
            int width = u2f.getWidth();
            int height = u2f.getHeight();
            int i2 = this.C0;
            if (width <= 0 || height <= 0) {
                i = i2;
            } else if (width < height) {
                int[] s = at7.s(i2, i2, width, height);
                i2 = s[0];
                i = s[1];
            } else {
                int i3 = this.D0;
                int[] s2 = at7.s(i3, i3, width, height);
                i2 = s2[0];
                i = s2[1];
            }
            VideoFramePreview videoFramePreview = this.c;
            ViewGroup.LayoutParams layoutParams = videoFramePreview.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i;
            videoFramePreview.setLayoutParams(layoutParams);
            zy5 zy5 = this.o;
            zy5.a(u2f, i2, i);
            if (zy5.b()) {
                videoFramePreview.setPreviewEnabled(true);
                if (zy5.e == null) {
                    udd.s("zy5", "You should call setVideoContent before prepare!", (Throwable) null);
                } else if (zy5.b()) {
                    Uri l = ((jj0) zy5.e).l();
                    int i4 = mze.a;
                    String scheme = l.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        kk7 kk7 = zy5.h;
                        if (kk7.e == null) {
                            udd.s("kk7", "You should call setVideoContent before prepare!", (Throwable) null);
                            return;
                        }
                        n73 n73 = new n73(2, new hy5(9, kk7));
                        mbe mbe = kk7.a;
                        mbe.getClass();
                        nbe nbe = (nbe) mbe;
                        nu9 n = n73.r(nbe.a()).n(nbe.b());
                        jk0 jk0 = kk7.f;
                        Objects.requireNonNull(jk0);
                        c97 c97 = new c97(new hy5(10, jk0), new j67(1), z3d.i);
                        n.a(c97);
                        kk7.g = c97;
                        return;
                    }
                    q8c q8c = zy5.i;
                    u2f u2f2 = q8c.e;
                    if (u2f2 == null) {
                        udd.s("q8c", "You should call setVideoContent before prepare!", (Throwable) null);
                        return;
                    }
                    xx xxVar = ((jj0) u2f2).f;
                    if (xxVar == null) {
                        udd.s("q8c", "Video collage is null", (Throwable) null);
                        return;
                    }
                    q8c.g = q8c.f.f(ur6.d(Uri.parse((String) xxVar.Y)).a(), (m18) null);
                }
            } else {
                videoFramePreview.setPreviewEnabled(false);
                videoFramePreview.a(false);
            }
        }
    }
}
