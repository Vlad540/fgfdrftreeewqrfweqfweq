package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: gra  reason: default package */
public final class gra extends jgd {
    public final fra X;
    public final int Y;

    public gra(fra fra, ExecutorService executorService, int i) {
        super(executorService);
        this.X = fra;
        this.Y = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gra, ig7] */
    /* JADX WARNING: type inference failed for: r1v0, types: [jra, b7c] */
    /* renamed from: J */
    public final void r(jra jra, int i) {
        ? r1 = jra;
        ira ira = (pg7) C(i);
        tg9 tg9 = new tg9(2, this.X, fra.class, "onItemClick", "onItemClick(JLone/me/chats/picker/PickerEntity$Type;)V", 0, 3);
        tg9 tg92 = new tg9(2, this.X, fra.class, "onItemLongClick", "onItemLongClick(JLone/me/chats/picker/PickerEntity$Type;)Z", 0, 4);
        r1.A(ira);
        xv5 xv5 = new xv5(tg9, 21, ira);
        View view = r1.a;
        a24.Z(view, 300, xv5);
        ((kh3) view).setOnLongClickListener(new eb1(tg92, 6, ira));
    }

    public final int l(int i) {
        int i2 = kra.a;
        return kra.a;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        kh3 kh3 = new kh3(viewGroup.getContext(), (AttributeSet) null);
        b7c b7c = new b7c(kh3);
        int i2 = this.Y;
        if (i2 > 0) {
            kh3.setPaddingRelative(a24.X(((float) i2) * dh4.c().getDisplayMetrics().density), kh3.getPaddingTop(), kh3.getPaddingEnd(), kh3.getPaddingBottom());
        }
        return b7c;
    }
}
