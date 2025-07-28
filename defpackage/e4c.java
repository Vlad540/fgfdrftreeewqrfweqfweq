package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: e4c  reason: default package */
public final class e4c extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ pda Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4c(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                View view = (View) obj;
                e4c e4c = new e4c(this.Z, (Continuation) obj3, 0);
                e4c.Y = (pda) obj2;
                jue jue = jue.a;
                e4c.o(jue);
                return jue;
            case 1:
                View view2 = (View) obj;
                e4c e4c2 = new e4c(this.Z, (Continuation) obj3, 1);
                e4c2.Y = (pda) obj2;
                jue jue2 = jue.a;
                e4c2.o(jue2);
                return jue2;
            default:
                ImageView imageView = (ImageView) obj;
                e4c e4c3 = new e4c(this.Z, (Continuation) obj3, 2);
                e4c3.Y = (pda) obj2;
                jue jue3 = jue.a;
                e4c3.o(jue3);
                return jue3;
        }
    }

    public final Object o(Object obj) {
        jue jue = jue.a;
        RecordControlsWidget recordControlsWidget = this.Z;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                pda pda = this.Y;
                k77[] k77Arr = RecordControlsWidget.m1;
                ((GradientDrawable) recordControlsWidget.W0.getValue()).setColor(pda.getText().b);
                return jue;
            case 1:
                wx3.H(obj);
                pda pda2 = this.Y;
                k77[] k77Arr2 = RecordControlsWidget.m1;
                ((GradientDrawable) recordControlsWidget.W0.getValue()).setColor(pda2.getText().b);
                return jue;
            default:
                wx3.H(obj);
                pda pda3 = this.Y;
                k77[] k77Arr3 = RecordControlsWidget.m1;
                pda3.getIcon();
                js.D((Drawable) recordControlsWidget.P0.getValue(), -1);
                js.D((Drawable) recordControlsWidget.O0.getValue(), -1);
                return jue;
        }
    }
}
