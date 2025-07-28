package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* renamed from: bg6  reason: default package */
public final class bg6 {
    public static final Rect b = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final k96 a;

    public bg6(k96 k96) {
        this.a = k96;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [i7c, java.lang.Object] */
    public final void a(View view, Rect rect, Float f, Integer num) {
        View view2 = view;
        Path path = new Path();
        Path path2 = new Path();
        Rect rect2 = new Rect();
        RectF rectF = new RectF();
        Rect rect3 = new Rect();
        RectF rectF2 = new RectF();
        ? obj = new Object();
        if (rect != null) {
            view.setBackground(new zf6(obj, path2, km4.y0.r(view).b().d));
            float[] fArr = new float[8];
            float[] fArr2 = new float[8];
            float[] fArr3 = new float[8];
            if (f != null) {
                for (int i = 0; i < 8; i++) {
                    fArr[i] = f.floatValue();
                    if (i < 4) {
                        fArr2[i] = f.floatValue();
                    } else {
                        fArr3[i] = f.floatValue();
                    }
                }
            }
            ((ArrayList) this.a.c).add(new ag6(obj, path2, path, rect2, rect, num, rect3, rectF, f, fArr, rectF2, view));
        }
    }
}
