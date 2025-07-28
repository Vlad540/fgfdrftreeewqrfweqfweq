package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: c32  reason: default package */
public final class c32 extends LinearLayout implements mhe {
    public final tj2 a;
    public final AppCompatTextView b;
    public b32 c;
    public final mr5 o;

    /* JADX WARNING: type inference failed for: r5v0, types: [mr5, f6c] */
    public c32(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        tj2 tj2 = new tj2(context);
        this.a = tj2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setText(d8.u(appCompatTextView.getContext(), ky9.a));
        nge.d(nte.i, appCompatTextView);
        s59 s59 = km4.y0;
        appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
        this.b = appCompatTextView;
        ? mr5 = new mr5((Object) new a32(this), executorService, 4);
        this.o = mr5;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(mr5);
        recyclerView.setItemAnimator((k6c) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new iq(2));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        tj2.setClipToOutline(true);
        tj2.setOutlineProvider(new tp0(1, dh4.c().getDisplayMetrics().density * 16.0f));
        float f = (float) 16;
        setBackground(swb.L(Integer.valueOf(s59.r(this).b().f), (Integer) null, (Integer) null, a24.X(dh4.c().getDisplayMetrics().density * f)));
        setPaddingRelative(0, 0, 0, a24.X(dh4.c().getDisplayMetrics().density * f));
        addView(tj2, new LinearLayout.LayoutParams(-1, a24.X(((float) 220) * dh4.c().getDisplayMetrics().density)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.topMargin = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        layoutParams.bottomMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        addView(appCompatTextView, layoutParams);
        addView(recyclerView);
    }

    private final void setSelectedBackground(Drawable drawable) {
        this.a.setBackgroundPreview(drawable);
    }

    public final void a(sj2 sj2) {
        tj2 tj2 = this.a;
        tj2.getClass();
        sw8 sw8 = sj2.e;
        i22 i22 = sj2.a;
        xm8 xm8 = sj2.c;
        qs8 c2 = sw8.c(sw8, i22, xm8, true);
        xm8 xm82 = sj2.b;
        qs8 c3 = sw8.c(sw8, i22, xm82, true);
        vfe vfe = tj2.a;
        if (c3 != null) {
            vfe.setTextMessageLayout(c3);
        }
        on8 on8 = tj2.c;
        vfe.setBackground(on8);
        o1b o1b = xm82.X;
        o1b.f();
        vfe.g(o1b.k, false);
        vfe vfe2 = tj2.b;
        if (c2 != null) {
            vfe2.setTextMessageLayout(c2);
        }
        on8 on82 = tj2.o;
        vfe2.setBackground(on82);
        vfe2.setDateViewStatus(sj2.d);
        o1b o1b2 = xm8.X;
        o1b2.f();
        vfe2.g(o1b2.k, false);
        jo2 jo2 = sj2.f;
        int[] iArr = jo2.c().a.l;
        on8.getClass();
        k77[] k77Arr = on8.z;
        on8.u.o1(on8, k77Arr[0], iArr);
        vfe.setDateTextColor(jo2.c().b.f);
        vfe.setTextMessageColors(jo2.a(true));
        vfe.getBackground().invalidateSelf();
        vfe.requestLayout();
        int[] iArr2 = jo2.f().a.l;
        on82.getClass();
        on82.v.o1(on82, k77Arr[1], iArr2);
        vfe2.setDateTextColor(jo2.f().b.f);
        vfe2.setTextMessageColors(jo2.f());
        vfe2.getBackground().invalidateSelf();
        vfe2.requestLayout();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
    }

    public final void onThemeChanged(pda pda) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(pda.b().f);
        }
        this.b.setTextColor(pda.getText().e);
        km4.d(km4.y0.n(getContext()), this);
    }

    public final void setBackgroundSelectedListener(b32 b32) {
        this.c = b32;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mr5, ig7] */
    public final void setThemeItems(List<g32> list) {
        Drawable drawable;
        g32 g32;
        boolean z;
        this.o.E(list);
        Iterator<T> it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                g32 = null;
                break;
            }
            g32 = it.next();
            Boolean bool = g32.a;
            if (bool != null) {
                z = bool.booleanValue();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        g32 g322 = (g32) g32;
        if (g322 != null) {
            drawable = g322.c;
        }
        setSelectedBackground(drawable);
    }
}
