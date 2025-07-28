package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: gi9  reason: default package */
public final class gi9 extends l5e implements i26 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ ii9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gi9(Intent intent, ii9 ii9, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = ii9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gi9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Rect rect;
        wx3.H(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        jue jue = jue.a;
        if (rectF == null || (rect = (Rect) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE")) == null) {
            return jue;
        }
        String absolutePath = ((mg5) this.Y.b.getValue()).q(this.Y.k).getAbsolutePath();
        ii9 ii9 = this.Y;
        ii9.getClass();
        xs7.E(ii9.f, (hu3) null, (ru3) null, new fi9(absolutePath, rect, ii9, rectF, 1, (Continuation) null), 3);
        return jue;
    }
}
