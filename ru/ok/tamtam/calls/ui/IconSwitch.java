package ru.ok.tamtam.calls.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ok/tamtam/calls/ui/IconSwitch;", "Landroid/widget/LinearLayout;", "Lade;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "Ljue;", "setText", "(I)V", "", "(Ljava/lang/CharSequence;)V", "res", "setIconDrawable", "orientation", "setOrientation", "Ljo6;", "listener", "setListener", "(Ljo6;)V", "", "checked", "setChecked", "(Z)V", "Landroidx/appcompat/widget/AppCompatImageView;", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/SwitchCompat;", "b", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitch", "()Landroidx/appcompat/widget/SwitchCompat;", "switch", "call-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class IconSwitch extends LinearLayout implements ade, Checkable {
    public static final /* synthetic */ int c = 0;
    public final AppCompatImageView a;
    public final SwitchCompat b;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, android.widget.CompoundButton$OnCheckedChangeListener] */
    public IconSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        wce wce;
        setOrientation(0);
        setClickable(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, attributeSet);
        this.a = appCompatImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        addView(appCompatImageView, layoutParams);
        SwitchCompat switchCompat = new SwitchCompat(context, attributeSet);
        switchCompat.setTextAlignment(2);
        switchCompat.setTextSize(16.0f);
        if (context.getResources().getConfiguration().orientation == 2) {
            switchCompat.setSwitchPadding(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        }
        this.b = switchCompat;
        addView(switchCompat, new LinearLayout.LayoutParams(-1, -2));
        switchCompat.setOnCheckedChangeListener(new Object());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, awb.IconSwitch);
            appCompatImageView.setImageDrawable(obtainStyledAttributes.getDrawable(awb.IconSwitch_icon_switch_start_drawable));
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context2);
        }
        z(wce);
    }

    public final AppCompatImageView getIcon() {
        return this.a;
    }

    public final SwitchCompat getSwitch() {
        return this.b;
    }

    public final boolean isChecked() {
        return this.b.isChecked();
    }

    public void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    public final void setIconDrawable(int i) {
        this.a.setImageDrawable(gq3.b(getContext(), i));
    }

    public final void setListener(jo6 jo6) {
    }

    public void setOrientation(int i) {
        super.setOrientation(0);
    }

    public final void setText(int i) {
        this.b.setText(i);
    }

    public final void toggle() {
        this.b.toggle();
    }

    public final void z(wce wce) {
        AppCompatImageView appCompatImageView = this.a;
        int i = wce.w;
        appCompatImageView.setColorFilter(i);
        SwitchCompat switchCompat = this.b;
        switchCompat.setTextColor(i);
        int i2 = wce.l;
        int i3 = wce.k;
        switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i3, i2}));
        switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{n1g.c0(i3, 0.3f), n1g.c0(wce.M, 0.3f)}));
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
