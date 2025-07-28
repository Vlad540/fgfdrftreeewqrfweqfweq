package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: jw  reason: default package */
public final class jw extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ mw Z;
    public final /* synthetic */ i22 w0;
    public vo8 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw(Object obj, Continuation continuation, mw mwVar, i22 i22) {
        super(2, continuation);
        this.Y = obj;
        this.Z = mwVar;
        this.w0 = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jw(this.Y, continuation, this.Z, this.w0);
    }

    public final Object o(Object obj) {
        Throwable th;
        vo8 vo8;
        pu3 pu3 = pu3.a;
        int i = this.X;
        mw mwVar = this.Z;
        if (i == 0) {
            wx3.H(obj);
            vo8 vo82 = (vo8) this.Y;
            try {
                i22 i22 = this.w0;
                this.x0 = vo82;
                this.X = 1;
                Object h = ((l3a) ((t97) mwVar.h).getValue()).h(i22, vo82, this);
                if (h == pu3) {
                    return pu3;
                }
                vo8 vo83 = vo82;
                obj = h;
                vo8 = vo83;
            } catch (Throwable th2) {
                vo8 vo84 = vo82;
                th = th2;
                vo8 = vo84;
                ((g15) ((t97) mwVar.j).getValue()).c(new RuntimeException("Error during mapping message=" + vo8, th), true);
                return null;
            }
        } else if (i == 1) {
            vo8 = this.x0;
            try {
                wx3.H(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (MessageModel) obj;
    }
}
