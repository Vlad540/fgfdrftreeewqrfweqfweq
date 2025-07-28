package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: pc2  reason: default package */
public final class pc2 extends jgd {
    public final oc2 X;

    public pc2(ExecutorService executorService, oc2 oc2) {
        super(executorService);
        this.X = oc2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View, nc2] */
    /* renamed from: J */
    public final void r(qc2 qc2, int i) {
        qc2 qc22 = qc2;
        rh8 rh8 = (rh8) ((pg7) C(i));
        if (rh8 instanceof oh8) {
            qc22.F(rh8, new f(1, this.X, oc2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 8), new zv(2, this.X, oc2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 3));
        } else if (rh8 instanceof ph8) {
            ca2 ca2 = qc22 instanceof ca2 ? (ca2) qc22 : null;
            if (ca2 != null) {
                ph8 ph8 = (ph8) rh8;
                f fVar = new f(1, this.X, oc2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 9);
                zv zvVar = new zv(2, this.X, oc2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 4);
                f fVar2 = new f(1, this.X, oc2.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0, 10);
                ? r0 = (nc2) ca2.a;
                ca2.A(ph8);
                a24.a0(r0, new aa2(fVar, ph8, 0));
                r0.setOnLongClickListener(new ba2(zvVar, ph8, ca2, 0));
                r0.setLinkOnLongClickListener(new eb1(fVar2, 1, ph8));
                r0.setOnLinkClickListener(new aa2(fVar2, ph8, 1));
            }
        } else if (rh8 instanceof qh8) {
            qc22.F(rh8, new f(1, this.X, oc2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 11), new zv(2, this.X, oc2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 5));
        } else if (rh8 instanceof jh8) {
            qc22.F(rh8, new f(1, this.X, oc2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 12), new zv(2, this.X, oc2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 6));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int l(int i) {
        return ((rh8) this.o.f.get(i)).l();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View, mc2] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View, nc2] */
    /* JADX WARNING: type inference failed for: r0v6, types: [ua2, android.view.View] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int ordinal = ((ie2) ie2.o.get(i)).ordinal();
        if (ordinal == 0) {
            return new e32(new td2(viewGroup.getContext(), (AttributeSet) null), 2);
        }
        if (ordinal == 1) {
            return new e32(new mc2(viewGroup.getContext(), (AttributeSet) null), 1);
        }
        if (ordinal == 2) {
            return new b7c(new nc2(viewGroup.getContext(), (AttributeSet) null));
        }
        if (ordinal == 3) {
            return new e32(new ua2(viewGroup.getContext(), (AttributeSet) null), 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
