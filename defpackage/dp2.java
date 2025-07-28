package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: dp2  reason: default package */
public final class dp2 extends l5e implements i26 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ gp2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp2(Intent intent, gp2 gp2, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = gp2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dp2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Rect rect;
        wx3.H(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        jue jue = jue.a;
        if (rectF == null || (rect = (Rect) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE")) == null) {
            return jue;
        }
        gp2 gp2 = this.Y;
        k77[] k77Arr = gp2.M0;
        this.Y.r(((mg5) gp2.w0.getValue()).q(this.Y.J0).getAbsolutePath(), rectF, rect);
        return jue;
    }
}
