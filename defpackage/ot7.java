package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Map;

/* renamed from: ot7  reason: default package */
public final /* synthetic */ class ot7 implements ou9 {
    public final /* synthetic */ Context X;
    public final /* synthetic */ st7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ev7 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ ot7(st7 st7, long j, ev7 ev7, boolean z, Context context) {
        this.a = st7;
        this.b = j;
        this.c = ev7;
        this.o = z;
        this.X = context;
    }

    public final void d(at9 at9) {
        float f;
        float f2;
        at9 at92 = at9;
        st7 st7 = this.a;
        st7.getClass();
        st7.a();
        long j = this.b;
        ev7 ev7 = this.c;
        boolean z = this.o;
        qt7 qt7 = new qt7(j, ev7, z);
        Map map = st7.d;
        pt7 pt7 = (pt7) map.get(qt7);
        if (!at9.h()) {
            if (pt7 == null) {
                Context context = this.X;
                at92.c(st7.b(context, ev7, true, z).b);
                st7.a();
                qt7 qt72 = new qt7(j, ev7, z);
                pt7 pt72 = (pt7) map.get(qt72);
                if (pt72 == null) {
                    Bitmap bitmap = st7.b(context, ev7, true, z).a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    cbe cbe = st7.f;
                    tf3 i = ((di3) cbe.e.getValue()).i(j, false);
                    Bitmap a2 = lc0.a(cbe.a, (w6a) cbe.c.getValue(), (t52) cbe.d.getValue(), (pc0) cbe.b.getValue(), i, (String) null, ((lqc) ((f03) cbe.f.getValue())).p(), (qmc) cbe.g.getValue());
                    int ordinal = ev7.ordinal();
                    if (ordinal == 0) {
                        f2 = 0.65f;
                        f = 2.63f;
                    } else if (ordinal == 1) {
                        f2 = 0.72f;
                        f = 2.59f;
                    } else {
                        throw new IllegalStateException("Wrong marker weight");
                    }
                    float f3 = (float) width;
                    float f4 = f2 * f3;
                    int width2 = (int) ((f4 / ((float) a2.getWidth())) * ((float) a2.getHeight()));
                    Bitmap P = at7.P((int) f4, width2, a2);
                    a2.recycle();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.drawBitmap(P, (f3 / 2.0f) - (f4 / 2.0f), (((float) height) / f) - (((float) width2) / 2.0f), (Paint) null);
                    P.recycle();
                    a2.recycle();
                    st7.g.getClass();
                    pt72 = new pt7(createBitmap, qr4.p(createBitmap));
                    map.put(qt72, pt72);
                }
                at92.c(pt72.b);
            } else {
                at92.c(pt7.b);
            }
        }
        at9.b();
    }
}
