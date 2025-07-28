package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: dud  reason: default package */
public final class dud extends chd implements ftc, tm4 {
    public static final ShapeDrawable O0;
    public final SimpleDraweeView J0;
    public final TextView K0;
    public final TextView L0;
    public final View M0;
    public dtc N0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = dh4.c().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        O0 = shapeDrawable;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dud(android.content.Context r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r11)
            r3.setLayoutParams(r0)
            r11 = 14
            float r11 = (float) r11
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r11 = r11 * r0
            int r11 = a24.X(r11)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r0 = r0 * r4
            int r0 = a24.X(r0)
            r3.setPadding(r0, r11, r0, r11)
            com.facebook.drawee.view.SimpleDraweeView r11 = new com.facebook.drawee.view.SimpleDraweeView
            android.content.Context r0 = r3.getContext()
            r11.<init>(r0)
            r0 = 40
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r0
            int r4 = a24.X(r4)
            int r5 = defpackage.rca.o
            r11.setId(r5)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.<init>(r4, r4, r7)
            r11.setLayoutParams(r6)
            ln4 r4 = r11.getHierarchy()
            y66 r4 = (y66) r4
            jlc r6 = jlc.h
            r4.h(r6)
            r3.addView(r11)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r4 = 16
            r11.<init>(r1, r2, r4)
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = a24.X(r0)
            r1 = 10
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r0 = defpackage.me4.c(r1, r2, r0)
            r11.leftMargin = r0
            r0 = 24
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r0
            int r2 = a24.X(r2)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.me4.c(r1, r4, r2)
            r11.rightMargin = r1
            android.content.Context r1 = r3.getContext()
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r2.setLayoutParams(r11)
            r11 = 1
            r2.setOrientation(r11)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r1 = r2.getContext()
            r11.<init>(r1)
            int r1 = defpackage.rca.q
            r11.setId(r1)
            nge r4 = defpackage.nte.j
            r4.b(r11, defpackage.yq4.b)
            r2.addView(r11)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r6 = r2.getContext()
            r4.<init>(r6)
            int r6 = defpackage.rca.p
            r4.setId(r6)
            nge r7 = defpackage.nte.o
            r7.b(r4, defpackage.yq4.b)
            r2.addView(r4)
            fu5 r7 = new fu5
            r8 = 0
            r9 = 2
            r7.<init>(r11, r4, r8, r9)
            urd.B(r7, r2)
            r3.addView(r2)
            androidx.appcompat.widget.AppCompatImageView r11 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r2 = r3.getContext()
            r11.<init>(r2, r8)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = a24.X(r0)
            int r2 = defpackage.rca.n
            r11.setId(r2)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388629(0x800015, float:1.1754973E-38)
            r4.<init>(r0, r0, r7)
            r11.setLayoutParams(r4)
            int r0 = defpackage.qca.a
            r11.setImageResource(r0)
            wua r0 = new wua
            r4 = 3
            r7 = 16
            r0.<init>((int) r4, (kotlin.coroutines.Continuation) r8, (int) r7)
            urd.B(r0, r11)
            r3.addView(r11)
            ql2 r11 = new ql2
            r0 = 6
            r11.<init>(r4, r8, r0)
            urd.B(r11, r3)
            r10.<init>(r3)
            android.view.View r11 = r3.findViewById(r5)
            com.facebook.drawee.view.SimpleDraweeView r11 = (com.facebook.drawee.view.SimpleDraweeView) r11
            r10.J0 = r11
            android.view.View r11 = r3.findViewById(r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.K0 = r11
            android.view.View r11 = r3.findViewById(r6)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.L0 = r11
            android.view.View r11 = r3.findViewById(r2)
            r10.M0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dud.<init>(android.content.Context):void");
    }

    public final void A(pg7 pg7) {
        if (pg7 instanceof btc) {
            this.N0 = (dtc) pg7;
            btc btc = (btc) pg7;
            this.J0.setImageURI(btc.b);
            this.K0.setText(btc.c);
            this.L0.setText(btc.o);
        }
    }

    public final void d(u16 u16) {
        View view = this.a;
        if (u16 != null) {
            a24.a0(view, new p7d(this, 7, u16));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
