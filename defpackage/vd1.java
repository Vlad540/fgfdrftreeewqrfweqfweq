package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: vd1  reason: default package */
public final /* synthetic */ class vd1 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ vd1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, java.lang.Object, one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ? r5 = this.b;
        switch (this.a) {
            case 0:
                fm fmVar = (fm) obj;
                k77[] k77Arr = CallOpponentsListWidget.L0;
                n23 n23 = new n23(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n23.setLayoutParams(dmVar);
                n23.setTitleEnabled(false);
                Toolbar toolbar = new Toolbar(n23.getContext(), (AttributeSet) null);
                k23 k23 = new k23(-1, -2);
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                toolbar.addView(r5.o0());
                n23.addView(toolbar);
                vd1 vd1 = new vd1(r5, 3);
                LinearLayout m0 = r5.m0();
                vd1.invoke(m0);
                n23.addView(m0);
                fmVar.addView(n23);
                fmVar.addView(r5.n0());
                return jue;
            case 1:
                View view = (View) obj;
                k77[] k77Arr2 = CallOpponentsListWidget.L0;
                r5.getRouter().B(r5);
                return jue;
            case 2:
                View view2 = (View) obj;
                k77[] k77Arr3 = CallOpponentsListWidget.L0;
                td1 p0 = r5.p0();
                p0.getClass();
                oc1.c.getClass();
                taf.o(p0.G0, new a34(":call-admin-settings"));
                return jue;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr4 = CallOpponentsListWidget.L0;
                r5.getClass();
                k77[] k77Arr5 = CallOpponentsListWidget.L0;
                k77 k77 = k77Arr5[4];
                linearLayout.addView((TextView) r5.A0.getValue());
                k77 k772 = k77Arr5[5];
                linearLayout.addView((TextView) r5.B0.getValue());
                k77 k773 = k77Arr5[2];
                linearLayout.addView((f1a) r5.y0.getValue());
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(o1a.J0);
                nge.d(nte.t, textView);
                textView.setTextColor(1895825407);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(r1a.A);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f = (float) 12;
                layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                layoutParams.bottomMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(8);
                linearLayout.addView(textView);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(o1a.G0);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(r5.I0);
                recyclerView.setItemAnimator((k6c) null);
                linearLayout.addView(recyclerView);
                k77 k774 = k77Arr5[6];
                linearLayout.addView((TextView) r5.C0.getValue());
                return jue;
        }
    }
}
