package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: xud  reason: default package */
public final class xud extends jgd {
    public final Executor X;
    public final k87 Y;
    public er7 Z;
    public final lhd w0 = new lhd(29, (Object) new gvf(27, this));
    public final mod x0 = new mod(27, this);

    public xud(ExecutorService executorService, k87 k87) {
        super(executorService);
        this.X = executorService;
        this.Y = k87;
    }

    public final int l(int i) {
        return ((pg7) C(i)).l();
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        if (i == x5a.r) {
            Context context = viewGroup.getContext();
            e78 e78 = new e78(0, this.Y, k87.class, "onFakeSearchClick", "onFakeSearchClick()V", 0, 12);
            TextView textView = new TextView(context);
            textView.setId(x5a.e);
            int X2 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
            int X3 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            layoutParams.topMargin = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
            textView.setLayoutParams(layoutParams);
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 10.0f));
            textView.setText(context.getString(rhc.v0));
            Drawable b = gq3.b(context, l9a.s);
            ArrayList arrayList = tge.a;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
            textView.setPadding(X3, X2, X3, X2);
            nte.k.b(textView, yq4.b);
            urd.B(new y9(3, (Continuation) null, 25), textView);
            a24.a0(textView, new q6(26, e78));
            return new rx0(textView, 16);
        } else if (i == gaa.k) {
            return new fx1(viewGroup.getContext(), new e78(0, this.Y, k87.class, "onRecentClearClick", "onRecentClearClick()V", 0, 13));
        } else {
            if (i == gaa.l) {
                return new rq3(viewGroup.getContext(), this.Z, (ExecutorService) this.X, this.x0);
            }
            return lhd.o(this.w0, viewGroup.getContext(), i);
        }
    }
}
