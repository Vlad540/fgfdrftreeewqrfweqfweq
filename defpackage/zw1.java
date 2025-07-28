package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: zw1  reason: default package */
public final class zw1 extends hd7 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw1(Object obj, Context context, int i) {
        super(context);
        this.p = i;
        this.q = obj;
    }

    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / ((float) displayMetrics.densityDpi);
            case 2:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int f(int i) {
        switch (this.p) {
            case 1:
                return Math.min(100, super.f(i));
            default:
                return super.f(i);
        }
    }

    public PointF g(int i) {
        switch (this.p) {
            case 0:
                return ((CarouselLayoutManager) this.q).a(i);
            default:
                return super.g(i);
        }
    }

    public void j(View view, l34 l34) {
        switch (this.p) {
            case 1:
                e04 e04 = (e04) this.q;
                int[] b = e04.b(e04.a.getLayoutManager(), view);
                int i = b[0];
                int i2 = b[1];
                int e = e(Math.max(Math.abs(i), Math.abs(i2)));
                if (e > 0) {
                    l34.e(i, i2, e, this.i);
                    return;
                }
                return;
            case 2:
                e04 e042 = (e04) this.q;
                RecyclerView recyclerView = e042.a;
                if (recyclerView != null) {
                    int[] b2 = e042.b(recyclerView.getLayoutManager(), view);
                    int i3 = b2[0];
                    int i4 = b2[1];
                    int e2 = e(Math.max(Math.abs(i3), Math.abs(i4)));
                    if (e2 > 0) {
                        l34.e(i3, i4, e2, this.i);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.j(view, l34);
                return;
        }
    }
}
