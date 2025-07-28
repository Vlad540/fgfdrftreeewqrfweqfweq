package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q73  reason: default package */
public final class q73 implements Continuation {
    public static final q73 b = new q73(0);
    public static final q73 c = new q73(1);
    public final /* synthetic */ int a;

    public /* synthetic */ q73(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    public final hu3 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return bw4.a;
        }
    }

    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
