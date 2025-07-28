package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

final class OverlayListView extends ListView {
    public final ArrayList a = new ArrayList();

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oha oha = (oha) it.next();
                BitmapDrawable bitmapDrawable = oha.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (oha.l) {
                    z = false;
                } else {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - oha.j)) / ((float) oha.e)));
                    if (oha.k) {
                        f = max;
                    }
                    Interpolator interpolator = oha.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (((float) oha.g) * interpolation);
                    Rect rect = oha.f;
                    Rect rect2 = oha.c;
                    rect2.top = rect.top + i;
                    rect2.bottom = rect.bottom + i;
                    float f2 = oha.h;
                    float g = us8.g(oha.i, f2, interpolation, f2);
                    oha.b = g;
                    BitmapDrawable bitmapDrawable2 = oha.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (g * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (oha.k && f >= 1.0f) {
                        oha.l = true;
                        afc afc = oha.m;
                        if (afc != null) {
                            d dVar = (d) afc.b;
                            dVar.X0.remove((xb8) afc.a);
                            dVar.T0.notifyDataSetChanged();
                        }
                    }
                    z = !oha.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
