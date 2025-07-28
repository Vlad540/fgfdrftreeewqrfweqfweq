package ru.ok.utils.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R/\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/utils/widgets/BadgeCountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lxhe;", "", "backgroundColor", "Ljue;", "setBackgroundColor", "(I)V", "", "y0", "Z", "getNeedPlusIndicator", "()Z", "setNeedPlusIndicator", "(Z)V", "needPlusIndicator", "z0", "getManageVisibility", "setManageVisibility", "manageVisibility", "<set-?>", "A0", "Lp0c;", "getCount", "()I", "setCount", "count", "Lve0;", "B0", "getStyle", "()Lve0;", "setStyle", "(Lve0;)V", "style", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
public final class BadgeCountView extends AppCompatTextView implements xhe {
    public static final /* synthetic */ k77[] D0;
    public final sb0 A0;
    public final yj B0;
    public int C0;
    public boolean y0;
    public boolean z0 = true;

    static {
        Class<BadgeCountView> cls = BadgeCountView.class;
        D0 = new k77[]{new hc9(cls, "count", "getCount()I"), c3d.g(m7c.a, cls, "style", "getStyle()Lru/ok/utils/widgets/BadgeCountView$Style;")};
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.utils.widgets.BadgeCountView, android.widget.TextView, android.view.View, java.lang.Object] */
    public BadgeCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(17);
        setIncludeFontPadding(false);
        setTextAlignment(4);
        setVisibility(8);
        c();
        this.A0 = new sb0((BadgeCountView) this, context);
        this.B0 = new yj(1, this);
        this.C0 = -1;
    }

    private final ve0 getStyle() {
        k77 k77 = D0[1];
        return (ve0) this.B0.b;
    }

    /* access modifiers changed from: private */
    public final void setStyle(ve0 ve0) {
        this.B0.o1(this, D0[1], ve0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.utils.widgets.BadgeCountView, android.widget.TextView, android.view.View] */
    public final void c() {
        wce wce;
        if (isInEditMode()) {
            setTextColor(-1);
            setBackgroundColor(-16776961);
            setCount(20);
            this.y0 = true;
            return;
        }
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        setTextColor(wce.F);
        setBackgroundColor(wce.H);
    }

    public final int getCount() {
        k77 k77 = D0[0];
        return ((Number) this.A0.b).intValue();
    }

    public final boolean getManageVisibility() {
        return this.z0;
    }

    public final boolean getNeedPlusIndicator() {
        return this.y0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.utils.widgets.BadgeCountView, android.view.View] */
    public void setBackgroundColor(int i) {
        this.C0 = i;
        Drawable background = getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(i);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(i);
        }
    }

    public final void setCount(int i) {
        this.A0.o1(this, D0[0], Integer.valueOf(i));
    }

    public final void setManageVisibility(boolean z) {
        this.z0 = z;
    }

    public final void setNeedPlusIndicator(boolean z) {
        this.y0 = z;
    }
}
