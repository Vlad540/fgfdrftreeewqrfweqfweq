package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: xfb  reason: default package */
public final class xfb extends l5e implements i26 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xfb(Intent intent, fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xfb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        jue jue = jue.a;
        if (rectF == null) {
            return jue;
        }
        k77[] k77Arr = fgb.X0;
        fgb fgb = this.Y;
        String absolutePath = ((mg5) fgb.A0.getValue()).q((String) fgb.U0.get()).getAbsolutePath();
        xs7.E(fgb.a, fgb.u().b(), (ru3) null, new wfb(fgb, absolutePath, rectF, (Continuation) null), 2);
        return jue;
    }
}
