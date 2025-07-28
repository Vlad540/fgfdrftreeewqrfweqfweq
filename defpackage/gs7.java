package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: gs7  reason: default package */
public final class gs7 extends l5e implements i26 {
    public final /* synthetic */ MainScreen X;
    public final /* synthetic */ fs7 Y;
    public final /* synthetic */ km4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs7(MainScreen mainScreen, fs7 fs7, km4 km4, Continuation continuation) {
        super(2, continuation);
        this.X = mainScreen;
        this.Y = fs7;
        this.Z = km4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((pda) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gs7(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        km4 km4;
        wx3.H(obj);
        Iterator it = this.X.c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            km4 = this.Z;
            if (!hasNext) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getValue();
            if (!viewGroup.isAttachedToWindow()) {
                km4.d(km4, viewGroup);
            }
        }
        fs7 fs7 = this.Y;
        if (!fs7.isAttachedToWindow()) {
            km4.d(km4, fs7);
        }
        return jue.a;
    }
}
