package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;

/* renamed from: zf6  reason: default package */
public final class zf6 extends ColorDrawable {
    public final /* synthetic */ i7c a;
    public final /* synthetic */ Path b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zf6(i7c i7c, Path path, int i) {
        super(i);
        this.a = i7c;
        this.b = path;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        if (this.a.a) {
            canvas.clipOutPath(this.b);
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
