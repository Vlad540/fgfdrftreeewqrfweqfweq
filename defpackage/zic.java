package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zic  reason: default package */
public final class zic extends er3 implements rj5 {
    public final hu3 X;
    public final int Y;
    public hu3 Z;
    public final rj5 o;
    public Continuation w0;

    public zic(rj5 rj5, hu3 hu3) {
        super(bw4.a, q73.c);
        this.o = rj5;
        this.X = hu3;
        this.Y = ((Number) hu3.fold(0, new vg0(23))).intValue();
    }

    public final Object a(Object obj, Continuation continuation) {
        try {
            Object r = r(continuation, obj);
            return r == pu3.a ? r : jue.a;
        } catch (Throwable th) {
            this.Z = new wl4(continuation.getContext(), th);
            throw th;
        }
    }

    public final qu3 getCallerFrame() {
        Continuation continuation = this.w0;
        if (continuation instanceof qu3) {
            return (qu3) continuation;
        }
        return null;
    }

    public final hu3 getContext() {
        hu3 hu3 = this.Z;
        return hu3 == null ? bw4.a : hu3;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object o(Object obj) {
        Throwable a = mcc.a(obj);
        if (a != null) {
            this.Z = new wl4(getContext(), a);
        }
        Continuation continuation = this.w0;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return pu3.a;
    }

    public final Object r(Continuation continuation, Object obj) {
        hu3 context = continuation.getContext();
        lp.m(context);
        hu3 hu3 = this.Z;
        if (hu3 != context) {
            if (hu3 instanceof wl4) {
                throw new IllegalStateException(i0e.D("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((wl4) hu3).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            } else if (((Number) context.fold(0, new bk(13, this))).intValue() == this.Y) {
                this.Z = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.w0 = continuation;
        Object invoke = bjc.a.invoke(this.o, obj, this);
        if (!hhd.f(invoke, pu3.a)) {
            this.w0 = null;
        }
        return invoke;
    }
}
