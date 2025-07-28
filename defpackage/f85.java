package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* renamed from: f85  reason: default package */
public final class f85 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatTextView Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f85(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                f85 f85 = new f85(this.Y, (Continuation) obj3);
                f85.Z = (pda) obj2;
                jue jue = jue.a;
                f85.o(jue);
                return jue;
            case 1:
                f85 f852 = new f85(3, (Continuation) obj3, 1);
                f852.Y = (AppCompatTextView) obj;
                f852.Z = (pda) obj2;
                jue jue2 = jue.a;
                f852.o(jue2);
                return jue2;
            case 2:
                f85 f853 = new f85(3, (Continuation) obj3, 2);
                f853.Y = (AppCompatTextView) obj;
                f853.Z = (pda) obj2;
                jue jue3 = jue.a;
                f853.o(jue3);
                return jue3;
            case 3:
                f85 f854 = new f85(3, (Continuation) obj3, 3);
                f854.Y = (AppCompatTextView) obj;
                f854.Z = (pda) obj2;
                jue jue4 = jue.a;
                f854.o(jue4);
                return jue4;
            case 4:
                f85 f855 = new f85(3, (Continuation) obj3, 4);
                f855.Y = (AppCompatTextView) obj;
                f855.Z = (pda) obj2;
                jue jue5 = jue.a;
                f855.o(jue5);
                return jue5;
            default:
                f85 f856 = new f85(3, (Continuation) obj3, 5);
                f856.Y = (AppCompatTextView) obj;
                f856.Z = (pda) obj2;
                jue jue6 = jue.a;
                f856.o(jue6);
                return jue6;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setTextColor(this.Z.getText().e);
                return jue.a;
            case 1:
                wx3.H(obj);
                this.Y.setTextColor(this.Z.getText().b);
                return jue.a;
            case 2:
                wx3.H(obj);
                this.Y.setTextColor(this.Z.getText().e);
                return jue.a;
            case 3:
                wx3.H(obj);
                this.Y.setTextColor(this.Z.getText().f);
                return jue.a;
            case 4:
                wx3.H(obj);
                this.Y.setTextColor(this.Z.getText().g);
                return jue.a;
            default:
                wx3.H(obj);
                AppCompatTextView appCompatTextView = this.Y;
                this.Z.getText();
                appCompatTextView.setTextColor(-16745729);
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f85(AppCompatTextView appCompatTextView, Continuation continuation) {
        super(3, continuation);
        this.X = 0;
        this.Y = appCompatTextView;
    }
}
