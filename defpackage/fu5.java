package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* renamed from: fu5  reason: default package */
public final class fu5 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ pda Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ TextView w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu5(TextView textView, TextView textView2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = textView;
        this.w0 = textView2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                fu5 fu5 = new fu5(this.Z, this.w0, (Continuation) obj3, 0);
                fu5.Y = (pda) obj2;
                jue jue = jue.a;
                fu5.o(jue);
                return jue;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                fu5 fu52 = new fu5(this.Z, this.w0, (Continuation) obj3, 1);
                fu52.Y = (pda) obj2;
                jue jue2 = jue.a;
                fu52.o(jue2);
                return jue2;
            default:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                fu5 fu53 = new fu5(this.Z, this.w0, (Continuation) obj3, 2);
                fu53.Y = (pda) obj2;
                jue jue3 = jue.a;
                fu53.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                pda pda = this.Y;
                this.Z.setTextColor(pda.getText().e);
                this.w0.setTextColor(pda.getText().e);
                return jue.a;
            case 1:
                wx3.H(obj);
                pda pda2 = this.Y;
                this.Z.setTextColor(pda2.getText().e);
                this.w0.setTextColor(pda2.getText().f);
                return jue.a;
            default:
                wx3.H(obj);
                pda pda3 = this.Y;
                this.Z.setTextColor(pda3.getText().e);
                this.w0.setTextColor(pda3.getText().h);
                return jue.a;
        }
    }
}
