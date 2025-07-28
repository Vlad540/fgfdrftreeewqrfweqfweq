package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax1  reason: default package */
public final class ax1 extends l6c {
    public final Paint a;
    public final List b = Collections.unmodifiableList(new ArrayList());

    public ax1() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(vmb.m3_carousel_debug_keyline_width));
        for (u87 u87 : this.b) {
            u87.getClass();
            ThreadLocal threadLocal = j33.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).O0()) {
                u87.getClass();
                canvas.drawLine(0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.m(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.g(), paint);
            } else {
                u87.getClass();
                canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.j(), 0.0f, paint);
            }
        }
    }
}
