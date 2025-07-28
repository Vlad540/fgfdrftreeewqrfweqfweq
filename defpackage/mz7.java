package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: mz7  reason: default package */
public final class mz7 extends f6c {
    public final tg X;
    public final r10 Y;
    public final wk7 Z;
    public final nz7 o;
    public final bl7 w0;
    public final hbc x0;
    public boolean y0;

    public mz7(Context context, nz7 nz7, tg tgVar, r10 r10, wk7 wk7, bl7 bl7) {
        this.o = nz7;
        this.X = tgVar;
        this.Y = r10;
        this.Z = wk7;
        this.w0 = bl7;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mmb.compose_view_item_height);
        this.x0 = dimensionPixelSize <= 0 ? null : new hbc(0.0f, dimensionPixelSize, dimensionPixelSize, 12);
    }

    public final int j() {
        return this.Z.f.b();
    }

    public final long k(int i) {
        tk7 tk7;
        rwc i2 = this.Z.f.i(i);
        if (i2 == null || (tk7 = i2.a) == null) {
            return 0;
        }
        return tk7.b;
    }

    public final void r(b7c b7c, int i) {
        oz7 oz7 = (oz7) b7c;
        rwc i2 = this.Z.f.i(i);
        if (i2 != null) {
            boolean z = i2.e;
            boolean z2 = z != oz7.T0;
            oz7.T0 = z;
            oz7.P0 = i2;
            udd.q("oz7", "Dispose");
            SimpleDraweeView simpleDraweeView = oz7.Q0;
            simpleDraweeView.animate().cancel();
            cl7 cl7 = oz7.U0;
            if (cl7 != null) {
                cl7.a();
            }
            BitmapDrawable bitmapDrawable = null;
            oz7.U0 = null;
            bl7 bl7 = oz7.O0;
            tk7 tk7 = i2.a;
            cl7 a = bl7.a(oz7, tk7);
            a.c();
            oz7.U0 = a;
            if (oz7.M0) {
                tg tgVar = oz7.J0;
                boolean z3 = z2 && tgVar.h();
                rwc rwc = oz7.P0;
                if (rwc != null) {
                    simpleDraweeView.animate().cancel();
                    View view = oz7.S0;
                    if (z3) {
                        if (rwc.e) {
                            simpleDraweeView.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.5f).setDuration(100).setInterpolator(tgVar.a.p());
                            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100).setInterpolator(tgVar.a.p());
                        } else {
                            simpleDraweeView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100).setInterpolator(tgVar.a.p());
                            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(tgVar.a.p());
                        }
                    } else if (rwc.e) {
                        simpleDraweeView.setScaleX(0.8f);
                        simpleDraweeView.setScaleY(0.8f);
                        simpleDraweeView.setAlpha(0.5f);
                        view.setScaleX(0.8f);
                        view.setScaleY(0.8f);
                    } else {
                        simpleDraweeView.setScaleX(1.0f);
                        simpleDraweeView.setScaleY(1.0f);
                        simpleDraweeView.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                    }
                }
            }
            if ((tk7 instanceof mz) && !kpa.b(i2.c, tk7)) {
                bitmapDrawable = oz7.L0.b(((mz) tk7).y0, false);
            }
            simpleDraweeView.getHierarchy().i(bitmapDrawable, 1);
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        return new oz7(LayoutInflater.from(viewGroup.getContext()).inflate(zrb.row_media_bar_selected, viewGroup, false), this.X, this.o, this.Y, this.y0, this.x0, this.w0);
    }

    public final void x(b7c b7c) {
        ((oz7) b7c).Q0.animate().cancel();
    }
}
