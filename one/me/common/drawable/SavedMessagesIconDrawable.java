package one.me.common.drawable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0018\u00010\u000bR\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/common/drawable/SavedMessagesIconDrawable;", "Landroid/graphics/drawable/Drawable;", "Lmhe;", "<init>", "()V", "Landroid/content/res/Resources;", "r", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Ljue;", "inflate", "(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Lpda;", "newAttrs", "onThemeChanged", "(Lpda;)V", "getIntrinsicWidth", "getIntrinsicHeight", "mutate", "()Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "Companion", "skc", "common_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class SavedMessagesIconDrawable extends Drawable implements mhe {
    private static final skc Companion = new Object();
    @Deprecated
    public static final int NORMAL_ICON_SIZE = 24;
    @Deprecated
    public static final int SMALL_ICON_SIZE = 20;
    @Deprecated
    public static final int SMALL_SIZE = 40;
    private final ShapeDrawable backgroundDrawable = new ShapeDrawable(new OvalShape());
    private Drawable iconDrawable;

    public void draw(Canvas canvas) {
        Rect bounds;
        this.backgroundDrawable.draw(canvas);
        Drawable drawable = this.iconDrawable;
        if (drawable != null && (bounds = drawable.getBounds()) != null) {
            float width = ((float) bounds.width()) / 2.0f;
            float exactCenterX = getBounds().exactCenterX() - width;
            float exactCenterY = getBounds().exactCenterY() - width;
            int save = canvas.save();
            canvas.translate(exactCenterX, exactCenterY);
            try {
                Drawable drawable2 = this.iconDrawable;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public int getIntrinsicHeight() {
        return a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
    }

    public int getIntrinsicWidth() {
        return a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
    }

    public int getOpacity() {
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = snb.favorites_fill_24;
        ThreadLocal threadLocal = ubc.a;
        this.iconDrawable = obc.a(resources, i, (Resources.Theme) null);
    }

    public Drawable mutate() {
        SavedMessagesIconDrawable savedMessagesIconDrawable = new SavedMessagesIconDrawable();
        Drawable drawable = this.iconDrawable;
        savedMessagesIconDrawable.iconDrawable = drawable != null ? drawable.mutate() : null;
        savedMessagesIconDrawable.setBounds(getBounds());
        return savedMessagesIconDrawable;
    }

    public void onBoundsChange(Rect rect) {
        this.backgroundDrawable.setBounds(rect);
        int X = rect.width() > a24.X(((float) 40) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 24) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, X, X);
        }
    }

    public void onThemeChanged(pda pda) {
        ShapeDrawable shapeDrawable = this.backgroundDrawable;
        pda.b().a.getClass();
        shapeDrawable.setTint(-16745729);
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.setTint(-1);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
