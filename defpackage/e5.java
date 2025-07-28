package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Collections;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: e5  reason: default package */
public final /* synthetic */ class e5 implements of3, uw9 {
    public final /* synthetic */ ActAttachesView a;

    public /* synthetic */ e5(ActAttachesView actAttachesView) {
        this.a = actAttachesView;
    }

    public nsf M(View view, nsf nsf) {
        ActAttachesView actAttachesView = this.a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actAttachesView.b1.getLayoutParams();
        layoutParams.bottomMargin = nsf.a();
        actAttachesView.b1.setLayoutParams(layoutParams);
        actAttachesView.b1.setPadding(nsf.b(), actAttachesView.b1.getPaddingTop(), nsf.c(), actAttachesView.b1.getPaddingBottom());
        FrameLayout frameLayout = actAttachesView.r1;
        int d = nsf.d();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.topMargin != d) {
            marginLayoutParams.topMargin = d;
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        at7.C(actAttachesView.r1, nsf.c());
        return nsf;
    }

    public void accept(Object obj) {
        ActAttachesView actAttachesView = this.a;
        v10 v10 = actAttachesView.a1;
        v10.k.clear();
        v10.j.clear();
        actAttachesView.a1.j(Collections.singletonList((xm8) obj), true);
        actAttachesView.p0(0);
    }
}
