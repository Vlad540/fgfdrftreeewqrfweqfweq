package defpackage;

import android.view.View;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: i87  reason: default package */
public final class i87 implements o6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i87(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void c(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    public final void b(View view) {
        int i = this.a;
    }

    public final void d(View view) {
        er7 er7;
        switch (this.a) {
            case 0:
                er7 er72 = ((KeyboardStickersWidget) this.b).c;
                if (er72 != null) {
                    cqf cqf = null;
                    gr7 gr7 = view instanceof gr7 ? (gr7) view : null;
                    if (gr7 != null) {
                        gr7.b(er72);
                    }
                    if (view instanceof cqf) {
                        cqf = (cqf) view;
                    }
                    if (cqf != null) {
                        cqf.b(er72);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = null;
                sn8 sn8 = view instanceof sn8 ? (sn8) view : null;
                if (sn8 != null) {
                    view2 = sn8.getContentView$message_list_release();
                }
                if ((view2 instanceof itd) && (er7 = ((MessagesListWidget) this.b).M0) != null) {
                    ((itd) view2).b(er7);
                    return;
                }
                return;
            case 2:
                er7 er73 = ((StickerSetBottomSheet) this.b).y0;
                if (er73 != null) {
                    cqf cqf2 = null;
                    gr7 gr72 = view instanceof gr7 ? (gr7) view : null;
                    if (gr72 != null) {
                        gr72.b(er73);
                    }
                    if (view instanceof cqf) {
                        cqf2 = (cqf) view;
                    }
                    if (cqf2 != null) {
                        cqf2.b(er73);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                cqf cqf3 = null;
                gr7 gr73 = view instanceof gr7 ? (gr7) view : null;
                StickersScreen stickersScreen = (StickersScreen) this.b;
                if (gr73 != null) {
                    gr73.b(stickersScreen.x0);
                }
                if (view instanceof cqf) {
                    cqf3 = (cqf) view;
                }
                if (cqf3 != null) {
                    cqf3.b(stickersScreen.x0);
                    return;
                }
                return;
            case 4:
                cqf cqf4 = null;
                gr7 gr74 = view instanceof gr7 ? (gr7) view : null;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
                if (gr74 != null) {
                    gr74.b(stickersSearchScreen.o);
                }
                if (view instanceof cqf) {
                    cqf4 = (cqf) view;
                }
                if (cqf4 != null) {
                    cqf4.b(stickersSearchScreen.o);
                    return;
                }
                return;
            default:
                cqf cqf5 = null;
                gr7 gr75 = view instanceof gr7 ? (gr7) view : null;
                er7 er74 = (er7) this.b;
                if (gr75 != null) {
                    gr75.b(er74);
                }
                if (view instanceof cqf) {
                    cqf5 = (cqf) view;
                }
                if (cqf5 != null) {
                    cqf5.b(er74);
                    return;
                }
                return;
        }
    }
}
