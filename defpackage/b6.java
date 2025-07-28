package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: b6  reason: default package */
public final /* synthetic */ class b6 implements uw9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ b6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final nsf M(View view, nsf nsf) {
        switch (this.a) {
            case 0:
                ? r4 = this.b.j1;
                int b2 = nsf.b();
                int c = nsf.c();
                int a2 = nsf.a();
                View view2 = r4.M0;
                at7.D(view2, b2);
                View view3 = r4.L0;
                at7.D(view3, b2);
                at7.C(view2, c);
                at7.C(view3, c);
                at7.h(r4, 0);
                at7.e(r4, a2);
                return nsf;
            default:
                View view4 = this.b.i1;
                int a3 = nsf.a();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                if (marginLayoutParams.bottomMargin != a3) {
                    marginLayoutParams.bottomMargin = a3;
                    view4.setLayoutParams(marginLayoutParams);
                }
                return nsf;
        }
    }
}
