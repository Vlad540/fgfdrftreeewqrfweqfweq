package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: z3  reason: default package */
public final class z3 extends ClickableSpan {
    public final int a;
    public final l4 b;
    public final int c;

    public z3(int i, l4 l4Var, int i2) {
        this.a = i;
        this.b = l4Var;
        this.c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
