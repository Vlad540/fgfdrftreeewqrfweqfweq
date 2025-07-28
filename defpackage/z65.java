package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* renamed from: z65  reason: default package */
public final /* synthetic */ class z65 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z65(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((b75) this.c).a.findViewById(this.b);
            case 1:
                oj7 oj7 = (oj7) this.c;
                Drawable drawable = oj7.a.getDrawable(this.b);
                drawable.setColorFilter(new PorterDuffColorFilter(oj7.b, PorterDuff.Mode.SRC_IN));
                return drawable;
            case 2:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                View r = messagesLayoutManager.r(i);
                if (r != null) {
                    if (messagesLayoutManager.F) {
                        Rect rect = messagesLayoutManager.H;
                        RecyclerView.V(rect, r);
                        RecyclerView recyclerView = messagesLayoutManager.G;
                        messagesLayoutManager.n1(i, (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height());
                    } else {
                        messagesLayoutManager.n1(i, a24.X(((float) 30) * dh4.c().getDisplayMetrics().density));
                    }
                }
                return Boolean.FALSE;
            default:
                return new rw8(this.b, (t97) this.c);
        }
    }

    public /* synthetic */ z65(int i, t97 t97) {
        this.a = 3;
        this.b = i;
        this.c = t97;
    }
}
