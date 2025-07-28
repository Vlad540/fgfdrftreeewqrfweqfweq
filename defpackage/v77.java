package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: v77  reason: default package */
public final class v77 extends gc6 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public v77(GridLayoutManager gridLayoutManager, f6c f6c) {
        this.d = gridLayoutManager;
        this.e = f6c;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [mr5, ig7] */
    public final int c(int i) {
        GridLayoutManager p;
        int l;
        switch (this.c) {
            case 0:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.d;
                if (i >= keyboardEmojiWidget.X.j() || keyboardEmojiWidget.X.l(i) != x5a.q || (p = gp0.p((RecyclerView) this.e)) == null) {
                    return 1;
                }
                return p.F;
            default:
                f6c f6c = (f6c) this.e;
                if (i >= f6c.j() || ((l = f6c.l(i)) != gaa.k && l != gaa.l && l != x5a.r)) {
                    return 1;
                }
                return ((GridLayoutManager) this.d).F;
        }
    }

    public v77(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
