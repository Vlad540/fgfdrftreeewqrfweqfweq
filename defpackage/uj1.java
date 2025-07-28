package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: uj1  reason: default package */
public final class uj1 extends ConstraintLayout {
    public tj1 K0;
    public boolean L0;
    public final n7d M0;
    public final AppCompatTextView N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        qda qda = qda.a;
        setBackgroundColor(-15263716);
        kjd.J(this, dh4.c().getDisplayMetrics().density * 16.0f);
        ek8.g(this, new sy6(0, new up0(5, 2, false), 1), (u16) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setId(o1a.L);
        float f = (float) 48;
        appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(n1a.q0);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-855638017));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(o1a.q1);
        appCompatTextView.setLayoutParams(new re3(-1, -2));
        appCompatTextView.setGravity(17);
        nge.d(nte.c, appCompatTextView);
        appCompatTextView.setTextColor(-855638017);
        this.N0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(o1a.p1);
        appCompatTextView2.setLayoutParams(new re3(-1, -2));
        appCompatTextView2.setGravity(17);
        nge.d(nte.o, appCompatTextView2);
        appCompatTextView2.setTextColor(1895825407);
        appCompatTextView2.setText(r1a.Y);
        OneMeButton oneMeButton = new OneMeButton(context2, (AttributeSet) null);
        oneMeButton.setId(o1a.o1);
        oneMeButton.setLayoutParams(new re3(-2, -2));
        oneMeButton.setMode(u0a.a);
        oneMeButton.setSize(v0a.b);
        oneMeButton.setCustomTheme(qda);
        oneMeButton.setAppearance(s0a.X);
        oneMeButton.setText(r1a.X);
        a24.Z(oneMeButton, 300, new sj1(this, 0));
        n7d n7d = new n7d(context2, (AttributeSet) null);
        n7d.setId(o1a.r1);
        n7d.setStartIcon(n1a.r0);
        n7d.setTitle(new hge(r1a.Q));
        n7d.setType(d7d.b);
        n7d.setEndView(new z6d(this.L0, true));
        n7d.setOnSwitchCheckedListener(new bk(3, this));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = dh4.c().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(qda.c.a.g);
        n7d.setBackground(shapeDrawable);
        n7d.setThemeDepended(j7d.b);
        a24.Z(n7d, 300, new sj1(this, 1));
        this.M0 = n7d;
        addView(appCompatImageView);
        addView(this.N0);
        addView(appCompatTextView2);
        addView(oneMeButton);
        addView(n7d);
        bf3 p = a06.p(this);
        int id = appCompatImageView.getId();
        p.d(id, 3, 0, 3);
        float f2 = (float) 16;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
        p.d(id, 7, 0, 7);
        p.d(id, 6, 0, 6);
        p.d(id, 4, this.N0.getId(), 3);
        p.g(id).d.W = 2;
        int id2 = this.N0.getId();
        p.d(id2, 3, appCompatImageView.getId(), 4);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
        p.d(id2, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id2, 4));
        p.d(id2, 6, 0, 6);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id2, 4, appCompatTextView2.getId(), 3);
        int id3 = appCompatTextView2.getId();
        p.d(id3, 3, this.N0.getId(), 4);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id3, 4));
        p.d(id3, 7, 0, 7);
        new hw9(p, 7, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id3, 4, oneMeButton.getId(), 3);
        new hw9(p, 4, id3, 4).e(a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        p.d(id4, 3, appCompatTextView2.getId(), 4);
        hr1.q((float) 24, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id4, 4));
        p.d(id4, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id4, 4));
        p.d(id4, 4, 0, 4);
        new hw9(p, 4, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id5 = n7d.getId();
        p.d(id5, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id5, 4));
        p.d(id5, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id5, 4));
        p.d(id5, 4, 0, 4);
        new hw9(p, 4, id5, 4).e(a24.X(((float) 112) * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public final void setListener(tj1 tj1) {
        this.K0 = tj1;
    }

    public final void setTitle(mge mge) {
        this.N0.setText(mge.a(getContext()));
    }
}
