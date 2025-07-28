package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ij5  reason: default package */
public final class ij5 extends l6c {
    public final int X = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
    public final int Y;
    public final int Z;
    public final Context a;
    public final u16 b;
    public final yb9 c = new yb9(3);
    public final Rect o = new Rect();
    public boolean w0;
    public RecyclerView x0;
    public final t97 y0;

    public ij5(Application application, b09 b09) {
        this.a = application;
        this.b = b09;
        float f = (float) 6;
        this.Y = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.Z = a24.X(f * dh4.c().getDisplayMetrics().density);
        this.y0 = ez3.O(3, new gz3(11, this));
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        yb9 yb9 = this.c;
        if (yb9.e != 0) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getAlpha() != 0.0f) {
                    ao8 T = recyclerView.T(childAt);
                    ao8 ao8 = T instanceof ao8 ? T : null;
                    if (ao8 != null) {
                        int i2 = ao8.Y;
                        View view = ao8.a;
                        sn8 sn8 = view instanceof sn8 ? (sn8) view : null;
                        if (sn8 != null) {
                            boolean z = (67108864 & i2) == 0;
                            RectF rectF = sn8.C0;
                            if (z || ht8.a(i2, 0)) {
                                rectF.setEmpty();
                                sn8.setOnAvatarClickListener$message_list_release((u16) null);
                            } else {
                                az9 az9 = (az9) yb9.c(sn8.getAvatarId());
                                if (az9 != null) {
                                    Rect rect = this.o;
                                    sn8.getDrawingRect(rect);
                                    recyclerView.offsetDescendantRectToMyCoords(sn8, rect);
                                    az9.setAlpha(a24.X(childAt.getAlpha() * ((float) 255)));
                                    float translationX = view.getTranslationX() + ((float) this.Z);
                                    float contentViewTopMargin = (float) (sn8.getContentViewTopMargin() + this.Y);
                                    int save = canvas.save();
                                    canvas.translate(((float) rect.left) + translationX, ((float) rect.top) + contentViewTopMargin);
                                    try {
                                        az9.draw(canvas);
                                        rectF.left = translationX;
                                        rectF.top = contentViewTopMargin;
                                        float f = (float) sn8.b;
                                        rectF.right = translationX + f;
                                        rectF.bottom = contentViewTopMargin + f;
                                        sn8.setOnAvatarClickListener$message_list_release(this.b);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
