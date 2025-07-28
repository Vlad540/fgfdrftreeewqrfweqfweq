package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/messages/media/mediabar/NumericCheckButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "id", "Ljue;", "setBackground", "(I)V", "number", "setNumber", "Landroid/graphics/drawable/Drawable;", "uncheckedBackground", "setUncheckedBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "checked", "w0", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NumericCheckButton extends AppCompatButton {
    public static final int y0 = zhc.q;
    public static final int z0 = zhc.o;
    public final tg o = vl.b().c();
    public boolean w0;
    public Drawable x0;

    public NumericCheckButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackground(y0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.mediabar.NumericCheckButton, android.view.View] */
    private final void setBackground(int i) {
        setBackground(gq3.b(getContext(), i));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [ru.ok.messages.media.mediabar.NumericCheckButton, android.view.View] */
    private final void setChecked(boolean z) {
        ScaleAnimation scaleAnimation;
        if (z != this.w0) {
            this.w0 = z;
            clearAnimation();
            tg tgVar = this.o;
            if (z) {
                scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 50.0f, 50.0f);
                scaleAnimation.setInterpolator(tgVar.a.f());
            } else {
                scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 50.0f, 50.0f);
                scaleAnimation.setRepeatCount(1);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setInterpolator(tgVar.a.p());
            }
            scaleAnimation.setDuration(100);
            startAnimation(scaleAnimation);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.TextView, ru.ok.messages.media.mediabar.NumericCheckButton, android.view.View] */
    public final void setNumber(int i) {
        if (i > 0) {
            setBackground(z0);
            String valueOf = i > 99999 ? "99999+" : String.valueOf(i);
            setTextSize(i < 1000 ? 12.0f : i > 99999 ? 7.0f : i > 9999 ? 8.0f : 10.0f);
            setText(valueOf);
            setChecked(true);
            return;
        }
        Drawable drawable = this.x0;
        if (drawable == null) {
            setBackground(y0);
        } else {
            setBackground(drawable);
        }
        setText((CharSequence) null);
        setChecked(false);
    }

    public final void setUncheckedBackground(Drawable drawable) {
        this.x0 = drawable;
    }
}
