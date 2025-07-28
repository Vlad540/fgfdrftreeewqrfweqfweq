package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: y92  reason: default package */
public final /* synthetic */ class y92 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ z92 c;

    public /* synthetic */ y92(Context context, z92 z92, int i) {
        this.a = i;
        this.b = context;
        this.c = z92;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [z92, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r4v3, types: [a9a, android.view.View, java.lang.Object] */
    public final Object invoke() {
        ? r0 = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView.setId(j8a.I);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                appCompatTextView.setTextAlignment(2);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setVisibility(8);
                nge nge = jp2.a;
                nte.i.b(appCompatTextView, yq4.b);
                km4.y0.r(appCompatTextView);
                appCompatTextView.setTextColor(-16745729);
                jjd.g(appCompatTextView, r0);
                return appCompatTextView;
            default:
                ? a9a = new a9a(context);
                a9a.setId(qhc.h);
                afa.a(a9a, new re(9, a9a, a9a));
                a9a.setSize(w8a.a);
                a9a.setVisibility(0);
                r0.addView(a9a);
                return a9a;
        }
    }
}
