package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachHeaderView extends ConstraintLayout {
    public zg4 K0;
    public int L0;
    public int M0;
    public AppCompatTextView N0;
    public AppCompatTextView O0;
    public AppCompatTextView P0;
    public SimpleDraweeView Q0;
    public wce R0;

    public ShareAttachHeaderView(Context context) {
        super(context);
        w();
    }

    public final void onMeasure(int i, int i2) {
        boolean z = this.Q0.getVisibility() == 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (z ? this.L0 - (this.M0 * 2) : 0), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.P0.measure(makeMeasureSpec, makeMeasureSpec2);
        this.N0.measure(makeMeasureSpec, makeMeasureSpec2);
        if (z) {
            int measuredHeight = this.N0.getMeasuredHeight() + this.P0.getMeasuredHeight();
            if (measuredHeight < this.L0) {
                this.Q0.getLayoutParams().width = measuredHeight;
                this.Q0.getLayoutParams().height = measuredHeight;
            } else {
                this.Q0.getLayoutParams().width = this.L0;
                this.Q0.getLayoutParams().height = this.L0;
            }
        }
        ShareAttachHeaderView.super.onMeasure(i, i2);
    }

    public void setImageVisibility(int i) {
        this.Q0.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewGroup, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    public final void w() {
        o2a b = vl.b();
        getContext();
        this.K0 = zg4.b();
        b.d();
        zg4 zg4 = this.K0;
        this.L0 = zg4.y;
        this.M0 = zg4.h;
        Context context = getContext();
        r7e r7e = wce.a0;
        this.R0 = fja.E(context);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.Q0 = simpleDraweeView;
        simpleDraweeView.setId(yqb.view_share_attach__iv_small_image);
        this.Q0.getHierarchy().h(jlc.g);
        float f = (float) this.K0.d;
        pgc a = pgc.a(f, f, f, f);
        a.h = true;
        this.Q0.getHierarchy().n(a);
        at7.g(this.Q0, this.M0);
        int i = this.K0.y;
        re3 re3 = new re3(this.M0 + i, i);
        re3.X = true;
        re3.W = true;
        addView(this.Q0, re3);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.P0 = appCompatTextView;
        appCompatTextView.setId(yqb.view_share_attach__tv_host);
        this.P0.setIncludeFontPadding(false);
        this.P0.setMaxLines(1);
        this.P0.setTextColor(this.R0.v);
        this.P0.setTextSize(0, this.K0.H);
        AppCompatTextView appCompatTextView2 = this.P0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.P0.setGravity(8388611);
        this.P0.setTextAlignment(5);
        re3 re32 = new re3(-2, -2);
        re32.W = true;
        re32.X = true;
        re32.E = 0.0f;
        addView(this.P0, re32);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.N0 = appCompatTextView3;
        appCompatTextView3.setId(yqb.view_share_attach__tv_title);
        this.N0.setIncludeFontPadding(false);
        this.N0.setMaxLines(2);
        this.N0.setTextSize(0, this.K0.I);
        this.N0.setTypeface(Typeface.DEFAULT_BOLD);
        this.N0.setEllipsize(truncateAt);
        this.N0.setGravity(8388611);
        this.N0.setTextAlignment(5);
        re3 re33 = new re3(-2, -2);
        re33.W = true;
        re33.X = true;
        re33.E = 0.0f;
        addView(this.N0, re33);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.O0 = appCompatTextView4;
        appCompatTextView4.setId(yqb.view_share_attach__tv_description);
        this.O0.setMaxLines(3);
        this.O0.setTextColor(this.R0.v);
        this.O0.setTextSize(0, this.K0.I);
        this.O0.setEllipsize(truncateAt);
        this.O0.setGravity(8388611);
        this.O0.setTextAlignment(5);
        re3 re34 = new re3(-2, -2);
        re34.W = true;
        re34.X = true;
        re34.E = 0.0f;
        addView(this.O0, re34);
        bf3 bf3 = new bf3();
        bf3.c(this);
        bf3.d(this.Q0.getId(), 3, 0, 3);
        bf3.d(this.Q0.getId(), 7, 0, 7);
        bf3.g(this.Q0.getId()).d.y = "1:1";
        bf3.d(this.P0.getId(), 6, 0, 6);
        bf3.d(this.P0.getId(), 3, 0, 3);
        bf3.d(this.P0.getId(), 7, this.Q0.getId(), 6);
        bf3.d(this.N0.getId(), 6, 0, 6);
        bf3.d(this.N0.getId(), 3, this.P0.getId(), 4);
        bf3.d(this.N0.getId(), 7, this.Q0.getId(), 6);
        xe3 xe3 = bf3.g(yqb.view_share_attach_header__vertical_barrier).d;
        xe3.h0 = 1;
        xe3.f0 = 3;
        xe3.g0 = 0;
        xe3.a = false;
        xe3.i0 = new int[]{this.Q0.getId(), this.P0.getId(), this.N0.getId()};
        bf3.d(this.O0.getId(), 6, 0, 6);
        bf3.d(this.O0.getId(), 3, yqb.view_share_attach_header__vertical_barrier, 3);
        bf3.d(this.O0.getId(), 7, 0, 7);
        bf3.d(this.O0.getId(), 4, 0, 4);
        bf3.a(this);
    }

    public ShareAttachHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }
}
