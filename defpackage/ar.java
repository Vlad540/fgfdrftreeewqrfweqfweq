package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ar  reason: default package */
public final class ar extends l5e implements i26 {
    public int X;
    public final /* synthetic */ dr Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(dr drVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = drVar;
        this.Z = z;
        this.w0 = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ar) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ar(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        ud0 ud0 = null;
        if (i == 0) {
            wx3.H(obj);
            ni7 ni7 = (ni7) this.Y.G0.getValue();
            Context t = this.Y.t();
            boolean z = this.Z;
            this.X = 1;
            obj = xs7.U(((pae) ni7.b.getValue()).b(), new mi7(z, ni7, t, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ud0 ud02 = (ud0) entry.getKey();
            Drawable drawable = (Drawable) entry.getValue();
            rhe rhe = (Drawable) entry.getValue();
            if (rhe instanceof rhe) {
                rhe = rhe.a(0.45f);
            }
            linkedHashMap.put(key, new g32(Boolean.FALSE, ud02, drawable, rhe));
        }
        dr drVar = this.Y;
        k77[] k77Arr = dr.N0;
        String m = js.m(drVar.u().a, this.Z);
        if (m != null) {
            ud0 = new ud0(m);
        }
        if (this.Z) {
            this.Y.A0 = linkedHashMap;
            this.Y.D0 = ud0;
        } else {
            this.Y.B0 = linkedHashMap;
            this.Y.C0 = ud0;
        }
        if (this.w0) {
            this.Y.z();
        }
        return jue.a;
    }
}
