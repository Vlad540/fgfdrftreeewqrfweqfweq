package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.WeakHashMap;

public class MusicAttachView extends RelativeLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, pa9 {
    public final zg4 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final SimpleDraweeView w0;
    public final FrameLayout x0;
    public final wce y0;
    public final qa9 z0 = new qa9(this);

    public MusicAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4 b2 = zg4.b();
        this.a = b2;
        int i = b2.i;
        WeakHashMap weakHashMap = eaf.a;
        setPaddingRelative(i, 0, i, 0);
        up8 up8 = (up8) vl.b().getAccessor().c(up8.class);
        Context context2 = getContext();
        r7e r7e = wce.a0;
        this.y0 = fja.E(context2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x0 = frameLayout;
        frameLayout.setOnClickListener(this);
        this.x0.setId(yqb.view_music_attach__ll_play);
        int i2 = this.a.w;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        zg4 zg4 = this.a;
        layoutParams.topMargin = zg4.b;
        layoutParams.setMarginEnd(zg4.h);
        addView(this.x0, layoutParams);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.w0 = simpleDraweeView;
        simpleDraweeView.getHierarchy().h(jlc.g);
        pgc pgc = new pgc();
        pgc.b = true;
        this.w0.getHierarchy().n(pgc);
        this.x0.addView(this.w0, new FrameLayout.LayoutParams(-1, -1));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.o = appCompatTextView;
        appCompatTextView.setId(yqb.view_music_attach__tv_name);
        this.o.setTypeface(Typeface.create("sans-serif", 0));
        this.o.setMaxLines(1);
        this.o.setTextSize(0, this.a.I);
        AppCompatTextView appCompatTextView2 = this.o;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.o.setTextColor(this.y0.F);
        this.o.setGravity(8388611);
        this.o.setIncludeFontPadding(false);
        this.o.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, yqb.view_music_attach__ll_play);
        layoutParams2.addRule(17, yqb.view_music_attach__ll_play);
        layoutParams2.addRule(10, -1);
        this.o.setPaddingRelative(0, 0, this.a.e, 0);
        addView(this.o, layoutParams2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.c = appCompatTextView3;
        appCompatTextView3.setId(yqb.view_music_attach__tv_artist);
        this.c.setTypeface(Typeface.create("sans-serif", 0));
        this.c.setMaxLines(1);
        this.c.setTextSize(0, this.a.I);
        this.c.setEllipsize(truncateAt);
        this.c.setTextColor(this.y0.v);
        this.c.setIncludeFontPadding(false);
        at7.h(this.c, this.a.b);
        this.c.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, yqb.view_music_attach__ll_play);
        layoutParams3.addRule(17, yqb.view_music_attach__ll_play);
        layoutParams3.addRule(3, yqb.view_music_attach__tv_name);
        addView(this.c, layoutParams3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView4;
        appCompatTextView4.setTextSize(0, this.a.H);
        this.b.setTextColor(this.y0.v);
        this.b.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, this.a.m);
        layoutParams4.addRule(1, yqb.view_music_attach__ll_play);
        layoutParams4.addRule(17, yqb.view_music_attach__ll_play);
        layoutParams4.addRule(3, yqb.view_music_attach__tv_artist);
        addView(this.b, layoutParams4);
    }

    private Drawable getPlayPauseSelector() {
        return swb.Q(swb.H(Integer.valueOf(this.y0.q), (Integer) null, (Integer) null), swb.H(Integer.valueOf(n1g.c0(this.y0.q, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null);
    }

    public final void g() {
        if (!(this.x0.getForeground() instanceof u10)) {
            this.x0.setForeground(new u10(getContext()));
        }
        this.x0.getForeground().setLevel(0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qa9 qa9 = this.z0;
        getContext();
        qa9.a();
    }

    public final void onClick(View view) {
        if (view.getId() == yqb.view_music_attach__ll_play) {
            this.z0.getClass();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.g = true;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.z0.getClass();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.z0.e = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        qa9 qa9 = this.z0;
        seekBar.getProgress();
        qa9.getClass();
        at7.Q(new eq6(15, qa9), 500);
    }

    public void setArtistName(CharSequence charSequence) {
        this.c.setVisibility(0);
        this.c.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.b.setText(str);
    }

    public void setListener(a20 a20) {
        this.z0.getClass();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [fn4, android.graphics.drawable.Drawable] */
    public void setPlayButtonPauseSelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.x0.setForeground(new fn4(playPauseSelector, js.q(zhc.R, this.y0.s, getContext())));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [fn4, android.graphics.drawable.Drawable] */
    public void setPlayButtonPlaySelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.x0.setForeground(new fn4(playPauseSelector, js.q(zhc.U, this.y0.s, getContext())));
    }

    public void setPlayButtonPreview(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.w0.setImageURI(str);
        } else {
            this.w0.setController((gn4) null);
        }
    }

    public void setTrackName(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
