package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: gt8  reason: default package */
public abstract class gt8 extends chd implements io2 {
    public final int J0 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    public final int K0 = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    public ht8 L0;

    public gt8(View view) {
        super(view);
        urd.B(new z9((chd) this, (Object) view, (Continuation) null, 21), view);
    }

    public final void A(pg7 pg7) {
        F((MessageModel) pg7, hw4.a);
    }

    public abstract void F(MessageModel messageModel, List list);

    public final void G(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof rn8;
        rn8 rn8 = z ? (rn8) marginLayoutParams : null;
        boolean z2 = rn8 != null ? rn8.a : true;
        int i3 = messageModel.L0;
        int i4 = 2080374784 & i3;
        boolean c = ir0.c(i4);
        int i5 = this.J0;
        if (c) {
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.bottomMargin = i5;
        } else {
            boolean a = ir0.a(i4);
            int i6 = this.K0;
            if (a) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i6;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i5;
            } else if (ht8.a(i3, 0)) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i5;
            }
        }
        if (!ht8.a(i3, 0) && z) {
            ((rn8) marginLayoutParams).a = ir0.b(i4);
        }
        if (i != marginLayoutParams.topMargin || i2 != marginLayoutParams.bottomMargin || (z && z2 != ((rn8) marginLayoutParams).a)) {
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
