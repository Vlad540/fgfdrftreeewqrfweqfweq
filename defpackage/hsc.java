package defpackage;

import android.database.Cursor;

/* renamed from: hsc  reason: default package */
public final class hsc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tsc b;

    public /* synthetic */ hsc(tsc tsc, int i) {
        this.a = i;
        this.b = tsc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                dx3 dx3 = this.b.mSuggestionsAdapter;
                if (dx3 instanceof w2e) {
                    dx3.b((Cursor) null);
                    return;
                }
                return;
            default:
                this.b.updateFocusedState();
                return;
        }
    }
}
