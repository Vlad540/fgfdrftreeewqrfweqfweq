package defpackage;

/* renamed from: hz9  reason: default package */
public final class hz9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;

    public /* synthetic */ hz9(mz9 mz9, int i) {
        this.a = i;
        this.b = mz9;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                mz9 mz9 = this.b;
                s16 s16 = mz9.G0;
                if (s16 != null) {
                    s16.invoke();
                }
                mz9.invalidate();
                return;
            default:
                mz9 mz92 = this.b;
                s16 s162 = mz92.G0;
                if (s162 != null) {
                    s162.invoke();
                }
                mz92.invalidate();
                return;
        }
    }
}
