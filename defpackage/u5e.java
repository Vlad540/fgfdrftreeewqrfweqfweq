package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u5e  reason: default package */
public final class u5e extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h6e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u5e(h6e h6e, Continuation continuation) {
        super(2, continuation);
        this.Z = h6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wve) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u5e u5e = new u5e(this.Z, continuation);
        u5e.Y = obj;
        return u5e;
    }

    public final Object o(Object obj) {
        pj5 pj5;
        pj5 pj52 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wve wve = (wve) this.Y;
            if (wve.a()) {
                String str = this.Z.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str, "No need for uploading due it already finished", (Throwable) null);
                }
                return new tj5(3, wve);
            }
            String str2 = this.Z.b;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str2, "Requested upload to server", (Throwable) null);
            }
            h6e h6e = this.Z;
            this.X = 1;
            h6e.getClass();
            pj5 = ez3.y(new ck5(ez3.H(new ck5(new d6e(new ck5(new d6e(new d6e(new tj5(3, wve), h6e, 0), h6e, 1), new tg9(2, h6e, h6e.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), h6e, 2), new tg9(2, h6e, h6e.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 5), new kbb(2, h6e, h6e.class, "uploadFile", "uploadFile(Lone/me/sdk/transfer/domain/Upload;)Lkotlinx/coroutines/flow/Flow;", 4, 19)), new g6e(h6e, (Continuation) null), 5), new vg0(27));
            if (pj5 == pj52) {
                return pj52;
            }
        } else if (i == 1) {
            wx3.H(obj);
            pj5 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return pj5;
    }
}
