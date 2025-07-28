package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: j27  reason: default package */
public final class j27 extends n27 {
    public final h27 Y;

    public j27(h27 h27) {
        super(3, 0);
        this.Y = h27;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [zye, b7c] */
    public final void a(RecyclerView recyclerView, b7c b7c) {
        super.a(recyclerView, b7c);
        if (b7c instanceof p27) {
            ? r5 = (zye) ((p27) b7c);
            ((yye) r5.a).animate().translationZ(0.0f);
            za6 za6 = r5.J0;
            if (za6 != null) {
                os5 l0 = ((FoldersListScreen) za6.a).l0();
                int g = r5.g() - 1;
                String str = l0.w0;
                if (str != null && str.length() != 0) {
                    xs7.E(l0.a, l0.c.c().getImmediate(), (ru3) null, new ns5(l0, str, g, (Continuation) null), 2);
                    l0.w0 = null;
                }
            }
        }
    }

    public final boolean i(b7c b7c, b7c b7c2) {
        this.Y.V(b7c.h(), b7c2.h());
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [zye, b7c] */
    public final void j(b7c b7c, int i) {
        if (i != 0 && (b7c instanceof p27)) {
            ((yye) ((zye) ((p27) b7c)).a).animate().translationZ(dh4.c().getDisplayMetrics().density * 20.0f);
        }
    }
}
