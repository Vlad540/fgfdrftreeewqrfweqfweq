package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: ji9  reason: default package */
public final class ji9 extends zcd {
    public static final /* synthetic */ k77[] j;
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final yj i = new yj(this);

    static {
        k77 hc9 = new hc9(ji9.class, "cornerRadius", "getCornerRadius()F");
        m7c.a.getClass();
        j = new k77[]{hc9};
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.h;
        rectF.set(getBounds());
        Path path = this.g;
        path.reset();
        k77[] k77Arr = j;
        k77 k77 = k77Arr[0];
        yj yjVar = this.i;
        float floatValue = ((Number) yjVar.b).floatValue();
        k77 k772 = k77Arr[0];
        path.addRoundRect(rectF, floatValue, ((Number) yjVar.b).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}
