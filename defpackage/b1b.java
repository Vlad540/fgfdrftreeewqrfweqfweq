package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: b1b  reason: default package */
public final class b1b extends LinearLayout {
    public final boolean a;

    public b1b(Context context, boolean z) {
        super(context);
        this.a = z;
        setElevation(dh4.c().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 12.0f));
        setOrientation(1);
        float f = (float) 4;
        setPadding(getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), getPaddingRight(), a24.X(f * dh4.c().getDisplayMetrics().density));
        urd.B(new wua(context, (Continuation) null, 5, false), this);
    }

    /* access modifiers changed from: private */
    public final pda getCurrentTheme() {
        return this.a ? qda.a : km4.y0.r(this);
    }
}
