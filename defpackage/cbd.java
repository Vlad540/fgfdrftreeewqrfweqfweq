package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cbd  reason: default package */
public final class cbd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ flb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cbd(flb flb, Continuation continuation) {
        super(2, continuation);
        this.Y = flb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wad) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cbd cbd = new cbd(this.Y, continuation);
        cbd.X = obj;
        return cbd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wad wad = (wad) this.X;
        flb flb = this.Y;
        if (wad == null) {
            flb.setVisibility(8);
        } else {
            flb.setVisibility(0);
            CharSequence a = wad.a.a(flb.getContext());
            if (a != null) {
                flb.setTitle(a);
                mge mge = wad.b;
                flb.setBody(mge != null ? mge.a(flb.getContext()) : null);
                flb.a(wad.c, (Integer) null);
                flb.setCounter(wad.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return jue.a;
    }
}
