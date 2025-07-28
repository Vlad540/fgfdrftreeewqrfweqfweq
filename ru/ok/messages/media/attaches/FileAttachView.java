package ru.ok.messages.media.attaches;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Arrays;
import java.util.WeakHashMap;

public class FileAttachView extends ConstraintLayout implements pa9 {
    public static final Typeface b1 = Typeface.create("sans-serif", 0);
    public static final Typeface c1 = Typeface.create("sans-serif", 1);
    public final k93 K0 = vl.b();
    public final zg4 L0;
    public MessageAttachmentsLayout M0;
    public final ViewStub N0;
    public final ViewStub O0;
    public final AppCompatTextView P0;
    public final AppCompatTextView Q0;
    public final AppCompatTextView R0;
    public final AppCompatImageView S0;
    public final AppCompatImageView T0;
    public final DraweeViewWithSensitiveWarningIcon U0;
    public final SimpleDraweeView V0;
    public final AppCompatTextView W0;
    public final AppCompatImageView X0;
    public qa9 Y0;
    public final wce Z0;
    public final Barrier a1;

    /* JADX WARNING: type inference failed for: r11v51, types: [ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v14, types: [ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon, android.view.View] */
    public FileAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.L0 = zg4.b();
        this.K0.d();
        this.K0.n().getClass();
        up8 up8 = (up8) this.K0.getAccessor().c(up8.class);
        Context context2 = getContext();
        r7e r7e = wce.a0;
        this.Z0 = fja.E(context2);
        this.K0.p().getClass();
        hy hyVar = (hy) ((nqc) oae.b()).getAccessor().c(hy.class);
        ViewStub viewStub = new ViewStub(getContext());
        this.N0 = viewStub;
        viewStub.setId(yqb.view_file_attach__attachments);
        this.N0.setInflatedId(yqb.view_file_attach__attachments);
        this.N0.setLayoutResource(zrb.ll_view_file_attach__message_attachments_layout_view);
        re3 re3 = new re3(-2, -2);
        re3.i = 0;
        re3.t = 0;
        re3.v = 0;
        int i = this.L0.i;
        re3.rightMargin = i;
        re3.leftMargin = i;
        re3.W = true;
        addView(this.N0, re3);
        this.O0 = new ViewStub(getContext());
        re3 re32 = new re3(-2, -2);
        this.O0.setId(yqb.view_file_attach__sticker);
        this.O0.setInflatedId(yqb.view_file_attach__sticker);
        this.O0.setLayoutResource(zrb.ll_view_file_attach__sticker_view);
        re32.i = 0;
        re32.t = 0;
        re32.v = 0;
        addView(this.O0, re32);
        Barrier barrier = new Barrier(getContext());
        this.a1 = barrier;
        barrier.setId(yqb.view_file_attach__big_preview_barrier);
        this.a1.setType(3);
        this.a1.setReferencedIds(new int[]{yqb.view_file_attach__attachments, yqb.view_file_attach__sticker});
        addView(this.a1, new re3(-2, -2));
        int i2 = this.L0.u;
        re3 re33 = new re3(i2, i2);
        re33.j = yqb.view_file_attach__big_preview_barrier;
        re33.l = 0;
        re33.t = 0;
        re33.setMarginStart(this.L0.i);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.V0 = simpleDraweeView;
        simpleDraweeView.setId(yqb.view_file_attach__iv_bg);
        pgc pgc = new pgc();
        float[] fArr = new float[8];
        pgc.c = fArr;
        Arrays.fill(fArr, (float) this.L0.j);
        this.V0.getHierarchy().n(pgc);
        this.V0.setClickable(false);
        addView(this.V0, re33);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.W0 = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.W0.setTypeface(c1);
        this.W0.setTextSize(0, this.L0.H);
        this.W0.setTextColor(this.Z0.s);
        AppCompatTextView appCompatTextView2 = this.W0;
        int i3 = this.L0.b;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        this.W0.setMaxLines(1);
        AppCompatTextView appCompatTextView3 = this.W0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        appCompatTextView3.setEllipsize(truncateAt);
        this.W0.setAllCaps(true);
        re3 re34 = new re3(0, 0);
        int i4 = yqb.view_file_attach__iv_bg;
        re34.i = i4;
        re34.t = i4;
        re34.v = i4;
        re34.l = i4;
        addView(this.W0, re34);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.X0 = appCompatImageView;
        appCompatImageView.setImageDrawable(gq3.b(getContext(), zhc.f0));
        re3 re35 = new re3(-2, -2);
        int i5 = yqb.view_file_attach__iv_bg;
        re35.i = i5;
        re35.t = i5;
        re35.v = i5;
        re35.l = i5;
        addView(this.X0, re35);
        DraweeViewWithSensitiveWarningIcon draweeViewWithSensitiveWarningIcon = new DraweeViewWithSensitiveWarningIcon(getContext(), (AttributeSet) null, 6);
        this.U0 = draweeViewWithSensitiveWarningIcon;
        draweeViewWithSensitiveWarningIcon.getHierarchy().h(jlc.g);
        pgc pgc2 = new pgc();
        float[] fArr2 = new float[8];
        pgc2.c = fArr2;
        Arrays.fill(fArr2, (float) this.L0.f);
        this.U0.getHierarchy().n(pgc2);
        this.U0.setClickable(false);
        re3 re36 = new re3(0, 0);
        int i6 = yqb.view_file_attach__iv_bg;
        re36.i = i6;
        re36.t = i6;
        re36.v = i6;
        re36.l = i6;
        addView(this.U0, re36);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.T0 = appCompatImageView2;
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER);
        re3 re37 = new re3(-2, -2);
        int i7 = yqb.view_file_attach__iv_bg;
        re37.i = i7;
        re37.t = i7;
        re37.v = i7;
        re37.l = i7;
        a24.Z(this.T0, 800, new vc5(this, 0));
        addView(this.T0, re37);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.P0 = appCompatTextView4;
        appCompatTextView4.setId(yqb.view_file_attach__tv_title);
        AppCompatTextView appCompatTextView5 = this.P0;
        int i8 = this.L0.i;
        WeakHashMap weakHashMap = eaf.a;
        appCompatTextView5.setPaddingRelative(i8, 0, i8, 0);
        AppCompatTextView appCompatTextView6 = this.P0;
        Typeface typeface = b1;
        appCompatTextView6.setTypeface(typeface);
        this.P0.setSingleLine();
        this.P0.setTextSize(0, this.L0.I);
        this.P0.setEllipsize(truncateAt);
        this.P0.setTextColor(this.Z0.F);
        this.P0.setIncludeFontPadding(false);
        re3 re38 = new re3(0, -2);
        int i9 = yqb.view_file_attach__iv_bg;
        re38.i = i9;
        re38.s = i9;
        re38.u = yqb.view_file_attach__btn_load;
        re38.k = yqb.view_file_attach__tv_subtitle;
        re38.L = 1;
        re38.K = 2;
        re38.E = 0.0f;
        re38.x = this.L0.i;
        re38.topMargin = 0;
        addView(this.P0, re38);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.Q0 = appCompatTextView7;
        appCompatTextView7.setId(yqb.view_file_attach__tv_subtitle);
        AppCompatTextView appCompatTextView8 = this.Q0;
        int i10 = this.L0.i;
        appCompatTextView8.setPaddingRelative(i10, 0, i10, 0);
        this.Q0.setTypeface(typeface);
        this.Q0.setSingleLine();
        this.Q0.setTextSize(0, this.L0.I);
        AppCompatTextView appCompatTextView9 = this.Q0;
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        appCompatTextView9.setEllipsize(truncateAt2);
        this.Q0.setTextColor(this.Z0.v);
        this.Q0.setIncludeFontPadding(false);
        re3 re39 = new re3(0, -2);
        re39.j = yqb.view_file_attach__tv_title;
        re39.s = yqb.view_file_attach__iv_bg;
        re39.u = yqb.view_file_attach__btn_load;
        re39.k = yqb.view_file_attach__tv_duration;
        re39.L = 1;
        re39.E = 0.0f;
        addView(this.Q0, re39);
        AppCompatTextView appCompatTextView10 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.R0 = appCompatTextView10;
        appCompatTextView10.setId(yqb.view_file_attach__tv_duration);
        AppCompatTextView appCompatTextView11 = this.R0;
        int i11 = this.L0.i;
        appCompatTextView11.setPaddingRelative(i11, 0, i11, 0);
        this.R0.setTypeface(typeface);
        this.R0.setSingleLine();
        this.R0.setTextSize(0, this.L0.H);
        this.R0.setEllipsize(truncateAt2);
        this.R0.setTextColor(this.Z0.v);
        this.R0.setVisibility(8);
        re3 re310 = new re3(0, -2);
        re310.j = yqb.view_file_attach__tv_subtitle;
        int i12 = yqb.view_file_attach__iv_bg;
        re310.s = i12;
        re310.u = yqb.view_file_attach__btn_load;
        re310.l = i12;
        re310.L = 1;
        re310.E = 0.0f;
        addView(this.R0, re310);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.S0 = appCompatImageView3;
        appCompatImageView3.setId(yqb.view_file_attach__btn_load);
        this.S0.setScaleType(ImageView.ScaleType.FIT_XY);
        this.S0.setImageTintList(ColorStateList.valueOf(km4.y0.r(this).a().a(true).c.a));
        int i13 = this.L0.s;
        re3 re311 = new re3(i13, i13);
        re311.j = yqb.view_file_attach__big_preview_barrier;
        re311.v = 0;
        re311.setMarginEnd(this.L0.f);
        a24.Z(this.S0, 800, new vc5(this, 1));
        addView(this.S0, re311);
        at7.i(this, new f5(7, this));
    }

    private qa9 getMusicAttachViewController() {
        if (this.Y0 == null) {
            this.Y0 = new qa9(this);
        }
        return this.Y0;
    }

    private String getSubtitleForDownload() {
        throw null;
    }

    private String getSubtitleForUpload() {
        throw null;
    }

    public static void w(FileAttachView fileAttachView) {
        if (fileAttachView.Y0 != null) {
            fileAttachView.getMusicAttachViewController().getClass();
            return;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public final void g() {
        u10 u10 = new u10(getContext());
        u10.l.setColor(0);
        u10.c = this.L0.v;
        u10.d = true;
        throw null;
    }

    public mn8 getMessageAttachmentsView() {
        if (this.M0 == null) {
            this.M0 = (MessageAttachmentsLayout) this.N0.inflate();
        }
        return this.M0.getView();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public final void onAttachedToWindow() {
        FileAttachView.super.onAttachedToWindow();
        if (this.Y0 != null) {
            qa9 musicAttachViewController = getMusicAttachViewController();
            getContext();
            musicAttachViewController.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public final void onDetachedFromWindow() {
        FileAttachView.super.onDetachedFromWindow();
        if (this.Y0 != null) {
            getMusicAttachViewController().g = true;
        }
    }

    public void setArtistName(CharSequence charSequence) {
        this.Q0.setVisibility(0);
        this.Q0.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.R0.setText(str);
    }

    public void setListener(wc5 wc5) {
        qa9 qa9 = this.Y0;
        if (qa9 != null) {
            qa9.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        FileAttachView.super.setOnLongClickListener(onLongClickListener);
    }

    public void setPipRequestListener(ln8 ln8) {
        getMessageAttachmentsView().setPipRequestListener(ln8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public void setPlayButtonPauseSelector(boolean z) {
        getContext();
        int i = phc.a;
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.messages.media.attaches.FileAttachView] */
    public void setPlayButtonPlaySelector(boolean z) {
        getContext();
        int i = phc.a;
        throw null;
    }

    public void setPlayButtonPreview(String str) {
    }

    public void setTrackName(CharSequence charSequence) {
        this.P0.setText(charSequence);
    }
}
