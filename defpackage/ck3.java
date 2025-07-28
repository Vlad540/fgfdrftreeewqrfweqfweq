package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ck3  reason: default package */
public final /* synthetic */ class ck3 implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ck3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        s2e q;
        wof wof = null;
        jue jue = jue.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                long longValue = ((Long) obj).longValue();
                View view = (View) obj2;
                dk3 dk3 = (dk3) ((cpf) obj3).Y;
                lk3 lk3 = (lk3) obj4;
                if (lk3.z0) {
                    dk3.M();
                } else if (lk3.Y != null) {
                    dk3.e(longValue);
                } else {
                    dk3.k(longValue, view);
                }
                return jue;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                k77[] k77Arr = MediaBarWidget.h1;
                if (list2.size() > list.size()) {
                    ((RecyclerView) obj4).x0(list2.size() - 1);
                }
                if (list.isEmpty() && (!list2.isEmpty())) {
                    MediaBarWidget mediaBarWidget = (MediaBarWidget) obj3;
                    LinearLayout q0 = mediaBarWidget.q0();
                    if (!q0.isLaidOut() || q0.isLayoutRequested()) {
                        q0.addOnLayoutChangeListener(new d18(mediaBarWidget, 0));
                    } else {
                        MediaBarWidget.n0(mediaBarWidget);
                    }
                }
                return jue;
            case 2:
                View view2 = (View) obj;
                x2e x2e = (x2e) obj2;
                k77[] k77Arr2 = MessageWriteWidget.J0;
                jq8 p0 = ((MessageWriteWidget) obj3).p0();
                e3e e3e = (e3e) obj4;
                e3e.o.getClass();
                CharSequence text = p0.getText();
                if (text != null) {
                    wof = SpannableString.valueOf(text);
                }
                int intValue = ((Number) p0.getMessagePosition().getValue()).intValue();
                if (!(wof == null || (q = nu7.q(wof, intValue, x2e)) == null)) {
                    k77[] k77Arr3 = MessageWriteWidget.J0;
                    e3e.O0.setValue(new r2e(view2, x2e));
                    p0.post(new n30(wof.getSpanEnd(q), 12, p0));
                }
                return jue;
            default:
                ((Long) obj).longValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                wof wof2 = ((apf) obj4).J0;
                if (wof2 instanceof wof) {
                    wof = wof2;
                }
                if (wof != null) {
                    ((zof) obj3).b(wof, booleanValue);
                }
                return jue;
        }
    }
}
