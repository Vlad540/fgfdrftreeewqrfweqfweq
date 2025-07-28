package defpackage;

/* renamed from: cue  reason: default package */
public final class cue extends ju3 {
    public static final cue a = new ju3();

    public final void dispatch(hu3 hu3, Runnable runnable) {
        mvf mvf = (mvf) hu3.get(mvf.b);
        if (mvf != null) {
            mvf.a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final boolean isDispatchNeeded(hu3 hu3) {
        return false;
    }

    public final ju3 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
