package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fr3  reason: default package */
public interface fr3 extends fu3 {
    public static final /* synthetic */ int n = 0;

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
