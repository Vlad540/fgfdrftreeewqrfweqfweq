package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ok/messages/media/attaches/DraweeViewWithSensitiveWarningIcon;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "", "B0", "Z", "getNeedToDrawSensitiveWarningIcon", "()Z", "setNeedToDrawSensitiveWarningIcon", "(Z)V", "needToDrawSensitiveWarningIcon", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class DraweeViewWithSensitiveWarningIcon extends SimpleDraweeView {
    public boolean B0;
    public final Drawable C0;

    public DraweeViewWithSensitiveWarningIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean getNeedToDrawSensitiveWarningIcon() {
        return this.B0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.attaches.DraweeViewWithSensitiveWarningIcon, android.view.View] */
    public final void onDraw(Canvas canvas) {
        DraweeViewWithSensitiveWarningIcon.super.onDraw(canvas);
        if (this.B0) {
            this.C0.draw(canvas);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Drawable drawable = this.C0;
        drawable.setBounds((i - drawable.getIntrinsicWidth()) / 2, (i2 - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + i) / 2, (drawable.getIntrinsicHeight() + i2) / 2);
    }

    public final void setNeedToDrawSensitiveWarningIcon(boolean z) {
        this.B0 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraweeViewWithSensitiveWarningIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Drawable b = gq3.b(context, zhc.f0);
        b.setTint(-1);
        this.C0 = b;
    }
}
