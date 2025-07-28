package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* renamed from: oie  reason: default package */
public final /* synthetic */ class oie implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadsStateViewerScreen b;

    public /* synthetic */ oie(ThreadsStateViewerScreen threadsStateViewerScreen, int i) {
        this.a = i;
        this.b = threadsStateViewerScreen;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.devmenu.threadsviewer.ThreadsStateViewerScreen] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ? r1 = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ThreadsStateViewerScreen.X;
                ex9 onBackPressedDispatcher = r1.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                k77[] k77Arr2 = ThreadsStateViewerScreen.X;
                mie mie = (mie) r1.c.getValue();
                mie.getClass();
                qod n = taf.n(mie, (hu3) null, ru3.b, new lie(mie, (Continuation) null), 1);
                mie.c.o1(mie, mie.X[0], n);
                return jue;
        }
    }
}
