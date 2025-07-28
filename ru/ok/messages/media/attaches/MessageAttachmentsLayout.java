package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

public class MessageAttachmentsLayout extends ViewGroup {
    public final mn8 a;
    public final SimpleDraweeView b;
    public final uy c;
    public final k93 o = vl.b();

    static {
        vl.o.getResources().getDimension(mmb.message_max_attach_width);
        vl.o.getResources().getDimension(mmb.message_min_attach_height);
    }

    public MessageAttachmentsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4.b();
        this.o.d();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.b = simpleDraweeView;
        simpleDraweeView.getHierarchy().h(jlc.g);
        this.c = new uy(this.b, (ty) null);
        this.o.a(10, 2);
        a24.Z(this.b, 1000, new eu5(14, this));
        this.b.setOnLongClickListener(new wk0(3, this));
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        mn8 mn8 = new mn8(getContext());
        this.a = mn8;
        mn8.setId(yqb.view_message__view_attaches);
        addView(this.a);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public mn8 getView() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        uy uyVar = this.c;
        if (uyVar != null) {
            uyVar.i();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uy uyVar = this.c;
        if (uyVar != null) {
            tic.b(uyVar.t);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onMeasure(int i, int i2) {
        this.a.measure(i, i2);
        setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }
}
