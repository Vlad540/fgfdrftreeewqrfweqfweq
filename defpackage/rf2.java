package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: rf2  reason: default package */
public final class rf2 implements s16 {
    public final /* synthetic */ ChatMediaViewerScreen a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ag2 c;

    public rf2(ChatMediaViewerScreen chatMediaViewerScreen, int i, ag2 ag2) {
        this.a = chatMediaViewerScreen;
        this.b = i;
        this.c = ag2;
    }

    public final Object invoke() {
        String name = this.a.getClass().getName();
        ag2 ag2 = this.c;
        int i = this.b;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            int i2 = ag2.b;
            int j = chatMediaViewerScreen.H0.j();
            int size = ag2.a.size();
            StringBuilder i3 = rf0.i("Media viewer. Pager, after submitList \n                        |initPos:", i2, ", \n                        |prevItemsA:", i, ", \n                        |itemsA:");
            i3.append(j);
            i3.append(", \n                        |items:");
            i3.append(size);
            fn6.d(tn7, name, i0e.E(i3.toString()), (Throwable) null);
        }
        if (this.b == 0 && (!this.c.a.isEmpty()) && this.c.b >= 0) {
            ChatMediaViewerScreen chatMediaViewerScreen2 = this.a;
            chatMediaViewerScreen2.getClass();
            ((ViewPager2) chatMediaViewerScreen2.B0.T0(chatMediaViewerScreen2, ChatMediaViewerScreen.O0[5])).e(this.c.b, false);
        }
        return jue.a;
    }
}
