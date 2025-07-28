package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: s4d  reason: default package */
public final class s4d extends l5e implements i26 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ v4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s4d(Intent intent, v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s4d(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        jue jue = jue.a;
        if (rectF == null) {
            return jue;
        }
        k77[] k77Arr = v4d.K0;
        v4d v4d = this.Y;
        String absolutePath = ((mg5) v4d.w0.getValue()).q((String) v4d.H0.get()).getAbsolutePath();
        xs7.E(v4d.a, v4d.r().b(), (ru3) null, new r4d(rectF, v4d, absolutePath, (Continuation) null), 2);
        return jue;
    }
}
