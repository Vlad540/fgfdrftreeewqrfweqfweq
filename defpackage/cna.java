package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cna  reason: default package */
public final class cna extends l5e implements i26 {
    public final /* synthetic */ dna X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cna(dna dna, Continuation continuation) {
        super(2, continuation);
        this.X = dna;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((rj5) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cna(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dna dna = this.X;
        dna.a.registerActivityLifecycleCallbacks(dna.c);
        return jue.a;
    }
}
