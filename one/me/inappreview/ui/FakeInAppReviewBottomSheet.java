package one.me.inappreview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "in-app-review_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] L0;
    public final n0c C0 = viewBinding(k5a.a);
    public final n0c D0 = viewBinding(k5a.h);
    public final ShapeDrawable E0;
    public final ShapeDrawable F0;
    public final ShapeDrawable G0;
    public final ShapeDrawable H0;
    public final r7e I0;
    public final oc4 J0;
    public boolean K0;

    static {
        Class<FakeInAppReviewBottomSheet> cls = FakeInAppReviewBottomSheet.class;
        L0 = new k77[]{new khb(cls, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wn6.e(m7c.a, cls, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    }

    public FakeInAppReviewBottomSheet() {
        super((Bundle) null, 1, (x54) null);
        float[] fArr = {dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f, dh4.c().getDisplayMetrics().density * 50.0f};
        this.E0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(dh4.c().getDisplayMetrics().density * 1.0f);
        this.F0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.G0 = shapeDrawable2;
        this.H0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        this.I0 = new r7e(new gz3(8, this));
        this.J0 = new oc4(18, this);
        this.K0 = true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.inappreview.ui.FakeInAppReviewBottomSheet, rr3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v2, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, java.lang.Object, cyb, android.view.ViewGroup] */
    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(k5a.a);
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(k5a.b);
        appCompatImageView.setImageDrawable(appCompatImageView.getContext().getPackageManager().getApplicationIcon(appCompatImageView.getContext().getApplicationInfo()));
        float f = (float) 44;
        constraintLayout.addView(appCompatImageView, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(k5a.g);
        nge.d(nte.c, appCompatTextView);
        appCompatTextView.setText(cic.b3);
        s59 s59 = km4.y0;
        appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
        constraintLayout.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(k5a.f);
        nge.d(nte.j, appCompatTextView2);
        appCompatTextView2.setText(m5a.d);
        appCompatTextView2.setTextColor(s59.r(appCompatTextView2).getText().h);
        constraintLayout.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView3.setId(k5a.c);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(new RippleDrawable(ColorStateList.valueOf(s59.r(appCompatTextView3).c().a.b), this.F0, this.E0));
        appCompatTextView3.setText(m5a.b);
        appCompatTextView3.setTextColor(-16611745);
        a24.Z(appCompatTextView3, 300, new d85(this, 0));
        constraintLayout.addView(appCompatTextView3, 0, a24.X(dh4.c().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView4.setId(k5a.e);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.H0);
        appCompatTextView4.setTextColor(s59.r(appCompatTextView4).getText().h);
        appCompatTextView4.setText(m5a.c);
        constraintLayout.addView(appCompatTextView4, 0, a24.X(f * dh4.c().getDisplayMetrics().density));
        Context context = constraintLayout.getContext();
        ? constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.K0 = -1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 5) {
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i2 = i + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(l5a.b, i2, new Object[]{Integer.valueOf(i2)}));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, j5a.c));
            imageView.setOnClickListener(new ic3(i, 2, constraintLayout2));
            urd.B(new ac2(3, (Continuation) null, 4), imageView);
            float f2 = (float) 28;
            constraintLayout2.addView(imageView, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
            arrayList.add(imageView);
            i = i2;
            appCompatTextView3 = appCompatTextView3;
        }
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        bf3 p = a06.p(constraintLayout2);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ImageView imageView2 = (ImageView) next;
                if (i3 == 0) {
                    int id = imageView2.getId();
                    p.d(id, 6, 0, 6);
                    p.d(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                    p.g(id).d.V = 1;
                } else if (i3 == arrayList.size() - 1) {
                    int id2 = imageView2.getId();
                    p.d(id2, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                    p.d(id2, 7, 0, 7);
                } else {
                    int id3 = imageView2.getId();
                    p.d(id3, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                    p.d(id3, 7, ((ImageView) arrayList.get(i4)).getId(), 6);
                }
                i3 = i4;
            } else {
                p23.G();
                throw null;
            }
        }
        p.a(constraintLayout2);
        constraintLayout2.setContentDescription(constraintLayout2.getResources().getQuantityString(l5a.a, 5, new Object[]{Integer.valueOf(constraintLayout2.getSelected()), 5}));
        constraintLayout2.setId(k5a.d);
        constraintLayout2.setOnSelectListener(new xz(appCompatTextView4, this, frameLayout2, 9));
        constraintLayout.addView(constraintLayout2, -1, -2);
        View view = constraintLayout2;
        urd.B(new e85(this, appCompatTextView, appCompatTextView2, appCompatTextView4, constraintLayout2, (Continuation) null), constraintLayout);
        bf3 p2 = a06.p(constraintLayout);
        int id4 = appCompatImageView.getId();
        p2.d(id4, 3, 0, 3);
        float f3 = (float) 24;
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p2, 3, id4, 4));
        p2.d(id4, 6, 0, 6);
        new hw9(p2, 6, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        int id5 = appCompatTextView.getId();
        p2.d(id5, 3, appCompatImageView.getId(), 3);
        p2.d(id5, 6, appCompatImageView.getId(), 7);
        hw9 hw9 = new hw9(p2, 6, id5, 4);
        float f4 = (float) 12;
        hw9.e(a24.X(dh4.c().getDisplayMetrics().density * f4));
        int id6 = appCompatTextView2.getId();
        p2.d(id6, 3, appCompatTextView.getId(), 4);
        new hw9(p2, 3, id6, 4).e(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
        p2.d(id6, 6, appCompatImageView.getId(), 7);
        new hw9(p2, 6, id6, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f4));
        int id7 = view.getId();
        p2.d(id7, 3, appCompatTextView2.getId(), 4);
        float f5 = (float) 40;
        hr1.q(f5, dh4.c().getDisplayMetrics().density, new hw9(p2, 3, id7, 4));
        p2.d(id7, 6, 0, 6);
        float f6 = (float) 20;
        hr1.q(f6, dh4.c().getDisplayMetrics().density, new hw9(p2, 6, id7, 4));
        p2.d(id7, 7, 0, 7);
        new hw9(p2, 7, id7, 4).e(a24.X(f6 * dh4.c().getDisplayMetrics().density));
        int id8 = appCompatTextView5.getId();
        p2.d(id8, 3, view.getId(), 4);
        hr1.q(f5, dh4.c().getDisplayMetrics().density, new hw9(p2, 3, id8, 4));
        p2.d(id8, 6, 0, 6);
        new hw9(p2, 6, id8, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f4));
        p2.d(id8, 7, appCompatTextView4.getId(), 6);
        float f7 = (float) 8;
        hr1.q(f7, dh4.c().getDisplayMetrics().density, new hw9(p2, 7, id8, 4));
        p2.d(id8, 4, 0, 4);
        new hw9(p2, 4, id8, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        int id9 = appCompatTextView4.getId();
        p2.d(id9, 3, view.getId(), 4);
        new hw9(p2, 3, id9, 4).e(a24.X(f5 * dh4.c().getDisplayMetrics().density));
        p2.d(id9, 6, appCompatTextView5.getId(), 7);
        hr1.q(f7, dh4.c().getDisplayMetrics().density, new hw9(p2, 6, id9, 4));
        p2.d(id9, 7, 0, 7);
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p2, 7, id9, 4));
        p2.d(id9, 4, 0, 4);
        new hw9(p2, 4, id9, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p2.a(constraintLayout);
        frameLayout2.addView(constraintLayout);
        hq0 hq0 = new hq0(this, new zu4(frameLayout2, 6, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 4));
        }
        return frameLayout2;
    }
}
