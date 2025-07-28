package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class ShareAttachView extends FrameLayout implements in8, View.OnClickListener {
    public final ShareAttachBigImageBgView A0;
    public final ShareMediaView B0;
    public final wce C0;
    public boolean D0 = true;
    public final zg4 a;
    public final LinearLayout b;
    public final FrameLayout c;
    public final ShareAttachHeaderView o;
    public final View w0;
    public final View x0;
    public final ShareAttachHeaderView y0;
    public final ShareAttachBigImageView z0;

    /* JADX WARNING: type inference failed for: r7v6, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    /* JADX WARNING: type inference failed for: r0v22, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    /* JADX WARNING: type inference failed for: r4v2, types: [ru.ok.messages.media.attaches.ShareAttachBigImageBgView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v3, types: [ru.ok.messages.media.attaches.ShareAttachBigImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v20, types: [mn8, android.view.View, ru.ok.messages.media.attaches.ShareMediaView] */
    /* JADX WARNING: type inference failed for: r6v2, types: [ru.ok.messages.media.attaches.ShareAttachBigImageBgView, android.view.View] */
    public ShareAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.a = zg4.b();
        Context context2 = getContext();
        r7e r7e = wce.a0;
        this.C0 = fja.E(context2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.b, new FrameLayout.LayoutParams(this.D0 ? -1 : -2, -2));
        ? shareAttachHeaderView = new ShareAttachHeaderView(getContext());
        this.o = shareAttachHeaderView;
        zg4 zg4 = this.a;
        int i = zg4.h;
        shareAttachHeaderView.setPadding(i, i, i, zg4.f);
        this.b.addView(this.o, new LinearLayout.LayoutParams(this.D0 ? -1 : -2, -2));
        View view = new View(getContext());
        this.w0 = view;
        view.setBackgroundColor(this.C0.p);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.a.a);
        layoutParams.setMarginStart(this.a.h);
        layoutParams.setMarginEnd(this.a.h);
        this.b.addView(this.w0, layoutParams);
        ? shareAttachHeaderView2 = new ShareAttachHeaderView(getContext());
        this.y0 = shareAttachHeaderView2;
        int i2 = this.a.h;
        shareAttachHeaderView2.setPadding(i2, i2, i2, 0);
        this.b.addView(this.y0, new LinearLayout.LayoutParams(this.D0 ? -1 : -2, -2));
        this.c = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.a.f;
        this.b.addView(this.c, layoutParams2);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        o2a b2 = vl.b();
        int i3 = po0.f;
        b2.a(25, 1);
        b2.d();
        this.A0 = simpleDraweeView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.c.addView(this.A0, layoutParams3);
        SimpleDraweeView simpleDraweeView2 = new SimpleDraweeView(getContext());
        o2a b3 = vl.b();
        simpleDraweeView2.getContext();
        zg4.b();
        b3.d();
        this.z0 = simpleDraweeView2;
        simpleDraweeView2.getHierarchy().h(jlc.g);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        this.c.addView(this.z0, layoutParams4);
        ? mn8 = new mn8(getContext());
        mn8.getContext();
        zg4.b();
        int i4 = (int) 9.0f;
        mn8.c1 = (float) dh4.b(i4);
        this.B0 = mn8;
        mn8.setId(yqb.view_share_attach__media);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        this.c.addView(this.B0, layoutParams5);
        View view2 = new View(getContext());
        this.x0 = view2;
        view2.setBackgroundColor(this.C0.p);
        this.c.addView(this.x0, new FrameLayout.LayoutParams(-1, this.a.a));
        setClickable(true);
        this.a.getClass();
        this.a.getClass();
        pgc a2 = pgc.a(0.0f, 0.0f, (float) dh4.b(i4), (float) dh4.b(i4));
        a2.h = true;
        this.A0.getHierarchy().n(a2);
        this.A0.setOnClickListener(this);
        this.B0.setAttachClickListener(this);
    }

    public mn8 getMediaView() {
        return this.B0;
    }

    public final void onClick(View view) {
        this.B0.getVisibility();
        callOnClick();
    }

    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        throw null;
    }

    public void setEmbeddedPlayer(boolean z) {
        this.B0.setEmbeddedPlayer(z);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View, ru.ok.messages.media.attaches.ShareAttachHeaderView] */
    public void setMatchHeaderWidthToParentWidth(boolean z) {
        if (this.D0 != z) {
            this.D0 = z;
            int i = -1;
            this.b.setLayoutParams(new FrameLayout.LayoutParams(z ? -1 : -2, -2));
            this.y0.setLayoutParams(new LinearLayout.LayoutParams(z ? -1 : -2, -2));
            ? r5 = this.o;
            if (!z) {
                i = -2;
            }
            r5.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
        }
    }

    public void setMediaClickListener(sad sad) {
    }

    public void setPipRequestListener(ln8 ln8) {
        this.B0.setPipRequestListener(ln8);
    }
}
