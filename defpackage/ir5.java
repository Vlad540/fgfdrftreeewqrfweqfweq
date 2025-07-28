package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: ir5  reason: default package */
public final class ir5 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ TextView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextView textView = (TextView) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ir5 ir5 = new ir5(3, continuation, 0);
                ir5.Y = textView;
                jue jue = jue.a;
                ir5.o(jue);
                return jue;
            case 1:
                ir5 ir52 = new ir5(3, continuation, 1);
                ir52.Y = textView;
                jue jue2 = jue.a;
                ir52.o(jue2);
                return jue2;
            default:
                ir5 ir53 = new ir5(3, continuation, 2);
                ir53.Y = textView;
                jue jue3 = jue.a;
                ir53.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                TextView textView = this.Y;
                s59 s59 = km4.y0;
                textView.setTextColor(s59.r(textView).getText().e);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(s59.r(textView).c().a.f), (Drawable) null, new ColorDrawable(-1)));
                return jue.a;
            case 1:
                wx3.H(obj);
                TextView textView2 = this.Y;
                textView2.setTextColor(km4.y0.r(textView2).getText().e);
                return jue.a;
            default:
                wx3.H(obj);
                TextView textView3 = this.Y;
                textView3.setTextColor(km4.y0.r(textView3).getText().f);
                return jue.a;
        }
    }
}
