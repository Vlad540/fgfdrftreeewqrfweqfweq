package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;

class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public View.OnClickListener A0;
    public final AnimationDrawable o;
    public final AnimationDrawable w0;
    public final String x0;
    public final String y0;
    public boolean z0;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) gq3.b(context, znb.mr_group_expand);
        this.o = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) gq3.b(context, znb.mr_group_collapse);
        this.w0 = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(fc8.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(nub.mr_controller_expand_group);
        this.x0 = string;
        this.y0 = context.getString(nub.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new h(this));
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0 = onClickListener;
    }
}
