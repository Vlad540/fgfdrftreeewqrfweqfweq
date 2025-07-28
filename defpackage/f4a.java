package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f4a  reason: default package */
public final class f4a extends View {
    public static final /* synthetic */ k77[] o;
    public final int a = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    public final yj b = new yj(this);
    public final Paint c;

    static {
        hc9 hc9 = new hc9(f4a.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;");
        m7c.a.getClass();
        o = new k77[]{hc9};
    }

    public f4a(Context context) {
        super(context, (AttributeSet) null);
        int i;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        e4a appearance = getAppearance();
        pda r = km4.y0.r(this);
        int ordinal = appearance.ordinal();
        if (ordinal == 0) {
            r.b().a.getClass();
            i = -16745729;
        } else if (ordinal == 1) {
            i = r.b().a.c;
        } else if (ordinal == 2) {
            i = r.b().a.g;
        } else if (ordinal == 3) {
            i = r.b().a.e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final e4a getAppearance() {
        k77 k77 = o[0];
        return (e4a) this.b.b;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, ((float) i) / 2.0f, ((float) i) / 2.0f, this.c);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(e4a e4a) {
        this.b.o1(this, o[0], e4a);
    }
}
