package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: yie  reason: default package */
public final class yie {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public float f = 1.0f;
    public Paint g;
    public final r7e h;
    public final Shader.TileMode i;
    public boolean j;

    public yie(String str, int i2, int i3) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = i2;
        this.e = i3;
        Paint paint = new Paint(2);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.g = paint;
        this.h = new r7e(new q6e(0, this));
        this.i = Shader.TileMode.REPEAT;
    }
}
