package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hr2  reason: default package */
public final /* synthetic */ class hr2 implements rj5, u26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object a2 = ((rj5) this.b).a((hq2) obj, continuation);
                return a2 == pu3.a ? a2 : jue.a;
            default:
                Object o = ((a5b) ((d5b) this.b)).a.o((wve) obj, continuation);
                return o == pu3.a ? o : jue.a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof rj5) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof rj5) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
        }
    }

    public final n26 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new w26(2, 0, rj5.class, (rj5) this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new w26(2, 0, d5b.class, (d5b) this.b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
