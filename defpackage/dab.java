package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: dab  reason: default package */
public final class dab extends l5e implements i26 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dab(Intent intent, hab hab, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dab(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        jue jue = jue.a;
        if (rectF == null) {
            return jue;
        }
        k77[] k77Arr = hab.E0;
        hab hab = this.Y;
        String absolutePath = ((mg5) hab.Y.getValue()).q((String) hab.D0.get()).getAbsolutePath();
        xs7.E(hab.a, hab.q().b(), (ru3) null, new cab(hab, absolutePath, rectF, (Continuation) null), 2);
        return jue;
    }
}
